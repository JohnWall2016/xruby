/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

class MethodBlockBase {
    protected int argc_;
    protected boolean has_asterisk_parameter_;
    protected int default_argc_;
    protected RubyValue[] default_values_ = null;

    protected MethodBlockBase(int argc, boolean has_asterisk_parameter, int default_argc) {
        argc_ = argc;
        has_asterisk_parameter_ = has_asterisk_parameter;
        default_argc_ = default_argc;
    }

    public int arity() {
        if (has_asterisk_parameter_ || default_argc_ > 0) {
            return -(argc_ - default_argc_) - 1;
        } else {
            return argc_;
        }
    }

}

public abstract class RubyBlock extends MethodBlockBase {

    // if run finished, and __break__ is not true, it indicated break happend
    //e.g.
    // loop do
    //      break 'xxx'
    // end
    protected boolean __break__ = false;
    protected boolean __return__ = false;
    protected boolean __redo__ = false;
    protected RubyBlock blockOfCurrentMethod_;

    //consider MethodValue: it has a 'receiver' field to remember the the receivre should be.
    //we we convert Method to Proc, need to keep the 'receiver' -- that what selfOfCurrentMethod_ is for.
    //TODO can we just remove the 'receiver' parameter of invoke() method???
    protected RubyValue selfOfCurrentMethod_;
    private RubyBlock ownerBlock_;//not null if defined in another block
    protected RubyModule scopeOfCurrentMethod_;

    private boolean created_by_lambda_ = false;

    public RubyBlock(int argc,
						boolean has_asterisk_parameter,
						int default_argc,
						RubyBlock block,
						RubyValue self,
						RubyBlock owner,
						RubyModule scope) {
        super(argc, has_asterisk_parameter, default_argc);
        blockOfCurrentMethod_ = block;
        selfOfCurrentMethod_ = self;
        ownerBlock_ = owner;
        scopeOfCurrentMethod_ = scope;
    }

	public void setScope(RubyModule m) {
        scopeOfCurrentMethod_ = m;
    }

	public RubyModule getScope() {
		return scopeOfCurrentMethod_;
	}
	
    public void setSelf(RubyValue v) {
        selfOfCurrentMethod_ = v;
    }

    public RubyValue getSelf() {
        return selfOfCurrentMethod_;
    }

    public boolean isDefinedInAnotherBlock() {
        return null != ownerBlock_;
    }

    public boolean breakedOrReturned() {
        return __break__ || __return__;
    }

    public boolean returned() {
        return __return__;
    }

    public boolean shouldRedo() {
        return __redo__;
    }

    public void setCreatedByLambda() {
        created_by_lambda_ = true;
    }

    public boolean createdByLambda() {
        return created_by_lambda_;
    }

    private void validateParameterForProcCall(RubyArray args) {
        if (argc_ >= 0 && !has_asterisk_parameter_) {
            int actual_args_length = (null == args) ? 0 : args.size();
            int required_args_length = argc_ - default_argc_;
            if (actual_args_length != required_args_length) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (" + actual_args_length + " for " + required_args_length + ")");
            }
        }
    }

    public RubyValue invoke(RubyValue receiver, RubyArray args) {
        if (created_by_lambda_) {
            validateParameterForProcCall(args);
        }

        __break__ = false;
        __return__ = false;
        __redo__ = false;

        RubyValue v = run(receiver, null != args ? args : new RubyArray(0));
        //TODO Maybe we can just use the fields in BlockCallStatus, remove the
        //__break__, __return__, __redo__ here
        if (v.returnedInBlock()) {
            __return__ = true;
        }
        return v;
    }

    protected abstract RubyValue run(RubyValue receiver, RubyArray args);
    
    // no arg invocation
    public RubyValue invoke(RubyValue receiver) {
        __break__ = false;
        __return__ = false;
        __redo__ = false;

        RubyValue v = run(receiver);
        //TODO Maybe we can just use the fields in BlockCallStatus, remove the
        //__break__, __return__, __redo__ here
        if (v.returnedInBlock()) {
            __return__ = true;
        }
        return v;
    }
    
    // no arg run
    protected RubyValue run(RubyValue receiver) {  
    	return this.run(receiver, new RubyArray(0));
    }
    
    // one arg invocation
    public RubyValue invoke(RubyValue receiver, RubyValue arg) {
    	__break__ = false;
        __return__ = false;
        __redo__ = false;

        RubyValue v = run(receiver, arg);
        //TODO Maybe we can just use the fields in BlockCallStatus, remove the
        //__break__, __return__, __redo__ here
        if (v.returnedInBlock()) {
            __return__ = true;
        }
        return v;
    }
    
    // one arg run
    protected RubyValue run(RubyValue receiver, RubyValue arg) {
    	return this.run(receiver, new RubyArray(arg));
    }
    
    // two args invocation
    public RubyValue invoke(RubyValue receiver, RubyValue arg1, RubyValue arg2) {
    	__break__ = false;
        __return__ = false;
        __redo__ = false;

        RubyValue v = run(receiver, arg1, arg2);
        //TODO Maybe we can just use the fields in BlockCallStatus, remove the
        //__break__, __return__, __redo__ here
        if (v.returnedInBlock()) {
            __return__ = true;
        }
        return v;
    }
    
    // two args run
    protected RubyValue run(RubyValue receiver, RubyValue arg0, RubyValue arg1) {
    	return this.run(receiver, new RubyArray(arg0, arg1));
    }
}


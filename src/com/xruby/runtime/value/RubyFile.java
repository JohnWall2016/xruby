/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;

import java.io.File;
import java.math.BigInteger;
import java.util.Date;

@RubyLevelClass(name="File", superclass="IO")
public class RubyFile extends RubyIO {

    public RubyFile(String filename, String mode) {
        super(new RubyIOFileExecutor(filename, mode));
        setRubyClass(RubyRuntime.FileClass);
    }

    @RubyLevelMethod(name="file?", singleton=true)
    public static RubyValue file_question(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = arg.toStr();
        File file = new File(fileName);
        return file.isFile() ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }

    @RubyLevelMethod(name="writable?", singleton=true)
    public static RubyValue writable_question(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = arg.toStr();
        File file = new File(fileName);
        return file.canWrite() ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }

    @RubyLevelMethod(name="readable?", singleton=true)
    public static RubyValue readable_question(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = arg.toStr();
        File file = new File(fileName);
        return file.canRead() ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }

    @RubyLevelMethod(name="exist?", singleton=true)
    public static RubyValue exist_question(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = arg.toStr();
        File file = new File(fileName);
        return file.exists() ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }

    @RubyLevelMethod(name="directory?", singleton=true)
    public static RubyValue directory_question(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = arg.toStr();
        File file = new File(fileName);
        return file.isFile() ? ObjectFactory.FALSE_VALUE : ObjectFactory.TRUE_VALUE;
    }

    @RubyLevelMethod(name="executable?", singleton=true)
    public static RubyValue executable_question(RubyValue receiver, RubyValue arg, RubyBlock block) {
        return ObjectFactory.TRUE_VALUE;
    }

    @RubyLevelMethod(name="expand_path", singleton=true)
    public static RubyValue expand_path(RubyValue receiver, RubyArray args, RubyBlock block) {
        if (null == args) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (0 for 1)");
        }

        String file_name = args.get(0).toStr();

        if (file_name.equals(".")) {
            file_name = "";
        }

        if (args.size() == 1) {
            File file = new File(file_name);
            return ObjectFactory.createString(file.getAbsolutePath().replace('\\', '/'));
        } else {
            if (file_name.startsWith("/")) {
                file_name = ".." + file_name;
            }
            StringBuilder dir_string = new StringBuilder(args.get(1).toStr());
            if (dir_string.toString().equals("/")) {
                dir_string = new StringBuilder((new File("/")).getAbsolutePath().replace('\\', '/'));
            }

            while (file_name.startsWith("../")) {
                int i = dir_string.lastIndexOf("/");
                if (i >= 0) {
                    dir_string.delete(i, dir_string.length());
                }
                file_name = file_name.substring(3, file_name.length());
            }
            if (file_name.length() > 0 || dir_string.toString().endsWith(":")) {
                if (!dir_string.toString().endsWith("/")) {
                    dir_string.append("/");
                }
                dir_string.append(file_name);
            }
            return ObjectFactory.createString(dir_string.toString().replace('\\', '/'));
        }
    }

    @RubyLevelMethod(name="dirname", singleton=true)
    public static RubyValue dirname(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = arg.toStr();
        File file = new File(fileName);
        String parent = file.getParent();
        if (parent == null) {
            return ObjectFactory.createString(fileName.matches("\\/+") ? "/" : ".");
        }

        //Java's File.getParent() always converts '/' to '\\' on windows. This is not
        //what we want, so here we hack the result with replace().
        return ObjectFactory.createString(parent.replace('\\', '/'));
    }

    @RubyLevelMethod(name="mtime", singleton=true)
    public static RubyValue mtime(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = arg.toStr();
        File file = new File(fileName);
        if (!file.isFile() && !file.isDirectory()) {
            throw new RubyException(RubyRuntime.RuntimeErrorClass, "No such file or directory - " + fileName);
        }
        return ObjectFactory.createTime(new Date(file.lastModified()));
    }

    @RubyLevelMethod(name="size", singleton=true)
    public static RubyValue size(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = arg.toStr();
        File file = new File(fileName);
        if (!file.isFile() && !file.isDirectory()) {
            throw new RubyException(RubyRuntime.RuntimeErrorClass, "No such file or directory - " + fileName);
        }
        return RubyBignum.bignorm(BigInteger.valueOf(file.length()));
    }

    @RubyLevelMethod(name="rename", singleton=true)
    public static RubyValue rename(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block) {
        String file1 = arg1.toStr();
        String file2 = arg2.toStr();
        File file = new File(file1);
        if (!file.isFile() && !file.isDirectory()) {
            throw new RubyException(RubyRuntime.RuntimeErrorClass, "No such file or directory - " + file1);
        }
        return ObjectFactory.createBoolean(file.renameTo(new File(file2)));
    }

    @RubyLevelMethod(name="utime", singleton=true)
    public static RubyValue utime(RubyValue receiver, RubyArray args, RubyBlock block) {
        if (args.size() < 3) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (" + args.length() + " for 2)");
        }

        //RubyTime atime = (RubyTime)args.get(0);
        RubyTime mtime = (RubyTime)args.get(1);
        for (int i = 2; i < args.size(); ++i) {
            String filename = args.get(i).toStr();
            File f = new File(filename);
            f.setLastModified(mtime.getTime());
        }

        return ObjectFactory.createFixnum(args.size() - 2);
    }

    @RubyLevelMethod(name="truncate")
    public RubyValue truncate(RubyValue arg) {
        truncate(arg.toInt());
        return ObjectFactory.FIXNUM0;
    }
}
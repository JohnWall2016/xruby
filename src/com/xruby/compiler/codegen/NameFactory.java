/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

public class NameFactory {

    private static AtomicInteger count_ = new AtomicInteger(0);
    private static final String DefaultName = "main";

    public static void reset() {
        count_.set(0);
    }

    public static String createClassName(String script_name, String method_name) {
        if (null == script_name) {
            script_name = "STDIN";
        }

        if (null == method_name) {
            return getNameWithoutSufix(script_name) + "/" + DefaultName;
        } else {
            return getNameWithoutSufix(script_name) + "/" + removeInvalidIdentifierPart(method_name) + "$" + count_.getAndIncrement();
        }
    }

    public static String removeInvalidIdentifierPart(String method_name) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < method_name.length(); ++i) {
            char current_char = method_name.charAt(i);
            if (Character.isJavaIdentifierPart(current_char)) {
                sb.append(current_char);
            } else {
                sb.append(translateCommonChar(current_char));
            }
        }
        return sb.toString();
    }

    private static String translateCommonChar(char v) {
        switch (v) {
            case '+':
                return "plus";
            case '-':
                return "minus";
            case '*':
                return "star";
            case '/':
                return "div";
            case '=':
                return "equal";
            case '?':
                return "question";
            case '!':
                return "danger";
            default:
                return "$";
        }
    }

    public static String createClassNameForBlock(String script_name, String method_name) {
        if (null == script_name) {
            script_name = "STDIN";
        }

        return getNameWithoutSufix(script_name) +
            "/BLOCK" +
            ((null == method_name) ? "" : "_" + removeInvalidIdentifierPart(method_name)) +
            "$" +
            count_.getAndIncrement();
    }

    public static String createMethodnameForClassBuilder(String class_name) {
        return class_name + "$" + count_.getAndIncrement();
    }

    public static String createMainClass(String script_name) {
        return getNameWithoutSufix(script_name) + "." + DefaultName;
    }

    public static String createClassFileName(String method_name) {
            return method_name + ".class";
    }

    public static File createJarFileName(String script_name) {
        if (null == script_name) {
            return new File("STDIN.jar");
        } else {
            return new File(getNameWithoutSufix(script_name) + ".jar");
        }
    }

    static String getNameWithoutSufix(String script_name) {
        File file = new File(script_name);
        String name = file.getName();
        int position_of_first_dot = name.indexOf('.');
        if (position_of_first_dot >= 0) {
            name = name.substring(0, position_of_first_dot);
        }

        return name.replace('-', '$');//'-' is not allowed for java
    }

    static File change_filename_suffix_to_jar(String filename) {
        File file = new File(filename.toString());
        String name = file.getName();
        int position_of_first_dot = name.indexOf('.');
        if (position_of_first_dot >= 0) {
            name = name.substring(0, position_of_first_dot);
        }
        name += ".jar";
        return new File(file.getParent(), name);
    }

    public static File find_corresponding_jar_file(String filename, final String searchpath) {
        File file = change_filename_suffix_to_jar(filename);
        if (file.isFile() && file.canRead()) {
            return file;
        }

        //TODO search searchpath
        return null;
    }

    /// @param name e.g. test/main.class
    public static String filename2classname(String name) {
        return convertSlashToDot(name.replace(".class", ""));
    }

    public static String convertSlashToDot(String name) {
        return name.replace('/', '.');
    }
}

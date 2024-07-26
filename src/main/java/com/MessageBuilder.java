package com;

/**
 * @author: ZJL
 * @description:
 * @date: 2024/7/27 2:39
 */
public class MessageBuilder {
    public String getMessage(String name) {
        StringBuilder result = new StringBuilder();
        if (name == null || name.trim().length() == 0) {
            result.append("empty!");
        } else {
            result.append("Hello " + name);
        }
        return result.toString();
    }
}
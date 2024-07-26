package com;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author: ZJL
 * @description:
 * @date: 2024/7/27 2:39
 */

public class MessageBuilderTest {

    @Test
    public void testGetMessage1() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello test", obj.getMessage("test"));
    }
}

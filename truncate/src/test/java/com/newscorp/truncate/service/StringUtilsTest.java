package com.newscorp.truncate.service;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Author: willzou
 * Created on 7/19/17.
 */
public class StringUtilsTest {

    @Test
    public void testTruncateValueLongerThanLimit(){
        String originalValue = "123456789012345678901234567890";
        int limit = 25;
        assertEquals("12 ... (truncated) ... 90",
            StringUtils.truncate(originalValue, limit));
    }

    @Test
    public void testTruncateLimitShorterThanInsertText(){
        String originalValue = "1234567890";
        int limit = 5;
        assertEquals("1234567890",
                StringUtils.truncate(originalValue, limit));
    }

    @Test
    public void testTruncateValueShorterThanLimit(){
        String originalValue = "123456789012345678901234567890";
        int limit = 31;
        assertEquals("123456789012345678901234567890",
                StringUtils.truncate(originalValue, limit));
    }
}

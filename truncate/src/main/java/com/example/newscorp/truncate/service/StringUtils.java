package com.example.newscorp.truncate.service;

/**
 *
 * Created by willzou on 7/19/17.
 */
public class StringUtils {

    public static final String TRUNCATE_INSERT_TEXT = " ... (truncated) ... ";

    /*
    Assumption, if the text length is longer then insert text and is even,
    then the part after insertion will be 1 letter longer than the part before insertion
     */

    public static String truncate(String originalValue, int limit){

        if(originalValue == null || originalValue.length() <= limit
        || limit < TRUNCATE_INSERT_TEXT.length() + 2) {
            return originalValue;
        }
        int remainderLength = limit - TRUNCATE_INSERT_TEXT.length();
        int headerLength = remainderLength / 2;
        int tailLength = remainderLength%2 == 0? headerLength:headerLength + 1;

        String header = originalValue.substring(0, headerLength);
        String tail = originalValue.substring(originalValue.length() - tailLength);
        StringBuilder truncated = new StringBuilder();
        return truncated.append(header).append(TRUNCATE_INSERT_TEXT).append(tail).toString();
    }
}

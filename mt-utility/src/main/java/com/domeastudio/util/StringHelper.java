package com.domeastudio.util;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

/**
 * Created by domea on 16-4-2.
 */
public class StringHelper {
    public static Boolean isEmptyAndBlank(String string){
        return StringUtils.isEmpty(string)&&StringUtils.isBlank(string);
    }

    public static Boolean isAllUpperCase(String string){
        return StringUtils.isAllUpperCase(string);
    }
}

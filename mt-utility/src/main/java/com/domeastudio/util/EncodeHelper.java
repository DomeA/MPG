package com.domeastudio.util;

import org.apache.commons.lang.StringUtils;

import java.security.MessageDigest;

/**
 * Created by domea on 16-4-2.
 */
public class EncodeHelper {
    private static final String ALGORITHM = "MD5";

    private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    /**
     * encode string
     *
     * @param algorithm
     * @param str
     * @return String
     */
    public static String encode(String algorithm, String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        return encodeCore(algorithm, str);
    }

    private static String encodeCore(String algorithm, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(str.getBytes());
            return getFormattedText(messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * encode By MD5
     *
     * @param str
     * @return String
     */
    public static String encodeByMD5(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        return encodeCore(ALGORITHM,str);
    }

    /**
     * Takes the raw bytes from the digest and formats them correct.
     *
     * @param bytes
     * the raw bytes from the digest.
     * @return the formatted bytes.
     */
    private static String getFormattedText(byte[] bytes) {
        int len = bytes.length;
        StringBuilder buf = new StringBuilder(len * 2);
        // 把密文转换成十六进制的字符串形式
        for (int j = 0; j < len; j++) {
            buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
            buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
        }
        return buf.toString();
    }
    //
    public static void main(String[] args) {
        System.out.println("空字符串 MD5  :"
                + EncodeHelper.encodeByMD5(""));
        System.out.println("空格 MD5  :"
                + EncodeHelper.encode("MD5", " "));
        System.out.println("空字符串 SHA1 :"
                + EncodeHelper.encode("SHA1", ""));
        System.out.println("空格 SHA1 :"
                + EncodeHelper.encode("SHA1", " "));
    }
}

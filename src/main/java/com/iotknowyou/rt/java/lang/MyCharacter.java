package com.iotknowyou.rt.java.lang;

/**
 * @title: MyCharacter
 * @projectName StudyJDK8
 * @author: RongHua Liu
 * @date: 2019/11/12  17:23
 * @description:
 *        Character 类用于对单个字符进行操作。
 *        Character 类在对象中包装一个基本类型 char 的值
 */
public class MyCharacter {

    /**
     * The maximum value of a
     * <a href="http://www.unicode.org/glossary/#code_point">
     * Unicode code point</a>, constant {@code U+10FFFF}.
     *
     * @since 1.5
     */
    public static final int MAX_CODE_POINT = 0X10FFFF;


    /**
     * The minimum value of a
     * <a href="http://www.unicode.org/glossary/#low_surrogate_code_unit">
     * Unicode low-surrogate code unit</a>
     * in the UTF-16 encoding, constant {@code '\u005CuDC00'}.
     * A low-surrogate is also known as a <i>trailing-surrogate</i>.
     *
     * @since 1.5
     */
    public static final char MIN_LOW_SURROGATE  = '\uDC00';

    /**
     * The minimum value of a
     * <a href="http://www.unicode.org/glossary/#high_surrogate_code_unit">
     * Unicode high-surrogate code unit</a>
     * in the UTF-16 encoding, constant {@code '\u005CuD800'}.
     * A high-surrogate is also known as a <i>leading-surrogate</i>.
     *
     * @since 1.5
     */
    public static final char MIN_HIGH_SURROGATE = '\uD800';

    /**
     * The minimum value of a
     * <a href="http://www.unicode.org/glossary/#supplementary_code_point">
     * Unicode supplementary code point</a>, constant {@code U+10000}.
     *
     * @since 1.5
     */
    public static final int MIN_SUPPLEMENTARY_CODE_POINT = 0x010000;

    /*=================================================================*/

    /**
     * Determines whether the specified character (Unicode code point)
     * is in the <a href="#BMP">Basic Multilingual Plane (BMP)</a>.
     * Such code points can be represented using a single {@code char}.
     *
     * @param  codePoint the character (Unicode code point) to be tested
     * @return {@code true} if the specified code point is between
     *         {@link #MIN_VALUE} and {@link #MAX_VALUE} inclusive;
     *         {@code false} otherwise.
     * @since  1.7
     */
    public static boolean isBmpCodePoint(int codePoint) {
        return codePoint >>> 16 == 0;
        // Optimized form of:
        //     codePoint >= MIN_VALUE && codePoint <= MAX_VALUE
        // We consistently use logical shift (>>>) to facilitate
        // additional runtime optimizations.
    }

    /**
     * Determines whether the specified code point is a valid
     * <a href="http://www.unicode.org/glossary/#code_point">
     * Unicode code point value</a>.
     *
     * @param  codePoint the Unicode code point to be tested
     * @return {@code true} if the specified code point value is between
     *         {@link #MIN_CODE_POINT} and
     *         {@link #MAX_CODE_POINT} inclusive;
     *         {@code false} otherwise.
     * @since  1.5
     */
    public static boolean isValidCodePoint(int codePoint) {
        // Optimized form of:
        //     codePoint >= MIN_CODE_POINT && codePoint <= MAX_CODE_POINT
        int plane = codePoint >>> 16;
        return plane < ((MAX_CODE_POINT + 1) >>> 16);
    }

     static void toSurrogates(int codePoint, char[] dst, int index) {
        // We write elements "backwards" to guarantee all-or-nothing
        dst[index+1] = lowSurrogate(codePoint);
        dst[index] = highSurrogate(codePoint);
    }

    /**
     * Returns the trailing surrogate (a
     * <a href="http://www.unicode.org/glossary/#low_surrogate_code_unit">
     * low surrogate code unit</a>) of the
     * <a href="http://www.unicode.org/glossary/#surrogate_pair">
     * surrogate pair</a>
     * representing the specified supplementary character (Unicode
     * code point) in the UTF-16 encoding.  If the specified character
     * is not a
     * <a href="Character.html#supplementary">supplementary character</a>,
     * an unspecified {@code char} is returned.
     *
     * <p>If
     * {@link #isSupplementaryCodePoint isSupplementaryCodePoint(x)}
     * is {@code true}, then
     * {@link #isLowSurrogate isLowSurrogate}{@code (lowSurrogate(x))} and
     * {@link #toCodePoint toCodePoint}{@code (}{@link #highSurrogate highSurrogate}{@code (x), lowSurrogate(x)) == x}
     * are also always {@code true}.
     *
     * @param   codePoint a supplementary character (Unicode code point)
     * @return  the trailing surrogate code unit used to represent the
     *          character in the UTF-16 encoding
     * @since   1.7
     */
    public static char lowSurrogate(int codePoint) {
        return (char) ((codePoint & 0x3ff) + MIN_LOW_SURROGATE);
    }

    /**
     * Returns the leading surrogate (a
     * <a href="http://www.unicode.org/glossary/#high_surrogate_code_unit">
     * high surrogate code unit</a>) of the
     * <a href="http://www.unicode.org/glossary/#surrogate_pair">
     * surrogate pair</a>
     * representing the specified supplementary character (Unicode
     * code point) in the UTF-16 encoding.  If the specified character
     * is not a
     * <a href="Character.html#supplementary">supplementary character</a>,
     * an unspecified {@code char} is returned.
     *
     * <p>If
     * {@link #isSupplementaryCodePoint isSupplementaryCodePoint(x)}
     * is {@code true}, then
     * {@link #isHighSurrogate isHighSurrogate}{@code (highSurrogate(x))} and
     * {@link #toCodePoint toCodePoint}{@code (highSurrogate(x), }{@link #lowSurrogate lowSurrogate}{@code (x)) == x}
     * are also always {@code true}.
     *
     * @param   codePoint a supplementary character (Unicode code point)
     * @return  the leading surrogate code unit used to represent the
     *          character in the UTF-16 encoding
     * @since   1.7
     */
    public static char highSurrogate(int codePoint) {
        return (char) ((codePoint >>> 10)
                + (MIN_HIGH_SURROGATE - (MIN_SUPPLEMENTARY_CODE_POINT >>> 10)));
    }
}

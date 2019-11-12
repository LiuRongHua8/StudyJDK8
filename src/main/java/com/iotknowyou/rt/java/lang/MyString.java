package com.iotknowyou.rt.java.lang;

import java.util.Arrays;


/**
 * @title: String
 * @projectName StudyJDK8
 * @author: RongHua Liu
 * @date: 2019/11/12  10:07
 * @description: 学习JDK8中 java.lang.String 类的源码和设计思想
 */
public final class MyString implements java.io.Serializable, Comparable<String>, CharSequence {
    /*
    *   JDK8中 String 被 final 修饰 ，所以String的值在定义后就不可以被修改
    *   Strings are constant; their values cannot be changed after they are created.
    *   JDK8中 String 被 final 修饰 ，所以String对象 immutable (永恒不变)
    *   Because String objects are immutable they can be shared.
    *
    *   JDK8  String  implements java.io.Serializable, Comparable<String>, CharSequence
    *   java.io.Serializable ： String对象可以实现序列化和反序列化。
    *   Comparable<String>  ：  实现了该接口的类，相当于默认定义了该类在集合里面的自然排序的方式。
    *   CharSequence ：是一个接口，表示一个char值的可读序列，此接口为多种char序列提供统一的、只读的通道。
    * */

    /** The value is used for character storage. */
    private final char value[];

    /** Cache the hash code for the string */
    private int hash; // Default to 0

    /** use serialVersionUID from JDK 1.0.2 for interoperability */
    private static final long serialVersionUID = -6849794470754662019L;

    /*构造方法*/
    public MyString(){
        this.value = "".toCharArray();
    }

    public MyString(MyString original) {
        this.value = original.value;
        this.hash = original.hash;
    }

    public MyString(char value[]) {
        this.value = Arrays.copyOf(value, value.length);
    }

    public MyString(char value[], int offset, int count) {
        if (offset < 0) {
            throw new StringIndexOutOfBoundsException(offset);
        }
        if (count <= 0) {
            if (count < 0) {
                throw new StringIndexOutOfBoundsException(count);
            }
            if (offset <= value.length) {
                this.value = "".toCharArray();
                return;
            }
        }
        // Note: offset or count might be near -1>>>1.
        if (offset > value.length - count) {
            throw new StringIndexOutOfBoundsException(offset + count);
        }
        this.value = Arrays.copyOfRange(value, offset, offset+count);
    }

    public MyString(int[] codePoints, int offset, int count) {
        if (offset < 0) {
            throw new StringIndexOutOfBoundsException(offset);
        }
        if (count <= 0) {
            if (count < 0) {
                throw new StringIndexOutOfBoundsException(count);
            }
            if (offset <= codePoints.length) {
                this.value = "".toCharArray();
                return;
            }
        }
        // Note: offset or count might be near -1>>>1.
        if (offset > codePoints.length - count) {
            throw new StringIndexOutOfBoundsException(offset + count);
        }

        final int end = offset + count;

        // Pass 1: Compute precise size of char[]
        int n = count;
        for (int i = offset; i < end; i++) {
            int c = codePoints[i];
            if (MyCharacter.isBmpCodePoint(c))
                continue;
            else if (MyCharacter.isValidCodePoint(c))
                n++;
            else throw new IllegalArgumentException(Integer.toString(c));
        }

        // Pass 2: Allocate and fill in char[]
        final char[] v = new char[n];

        for (int i = offset, j = 0; i < end; i++, j++) {
            int c = codePoints[i];
            if (MyCharacter.isBmpCodePoint(c))
                v[j] = (char)c;
            else
                MyCharacter.toSurrogates(c, v, j++);
        }

        this.value = v;
    }



    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }


    // main 方法
    // 测试
    public static void main(java.lang.String[] args) {
        /*
        *
        * */
        MyString myString = new MyString("1234".toCharArray(), 1, 3);
        System.out.println(myString);
    }
}

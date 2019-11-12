package com.iotknowyou.rt.java.lang;

import java.io.ObjectStreamField;
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

    /**
     * 该值用于字符存储。
     * */
    private final char value[];

    /**
     * 缓存字符串的哈希码
     * */
    private int hash; // Default to 0

    /**
     * 使用JDK 1.0.2中的serialVersionUID进行互操作
     * */
    private static final long serialVersionUID = -6849794470754667710L;


    /**
     * 类字符串在序列化流协议中是特殊情况。
     * 根据对象序列化规范第6.2节“流元素”，将String实例写入ObjectOutputStream中。
     * */
    private static final ObjectStreamField[] serialPersistentFields = new ObjectStreamField[0];


    /*========================================== 分割行 ===============================================*/


    /*构造方法*/
    /*
    * 初始化一个新创建的String对象，使其表示空字符序列。
    * 请注意，使用此构造函数是不需要，因为字符串是不可变的。
    * */
    public MyString(){
        this.value = "".toCharArray();
    }

    /*
    * 初始化一个新创建的String对象，使其表示与参数相同的字符序列；
    * 换句话说，新创建的字符串是参数字符串的副本。
    * 除非需要原始的显式副本，使用此构造函数是不需要，
    * 因为字符串是不可变的。
    * */
    public MyString(MyString original) {
        this.value = original.value;
        this.hash = original.hash;
    }

    /*
    *  分配新字符串，将参数字符序列复制到新的字符串
    *  将复制字符数组的内容，随后对字符数组的修改不会影响新创建的字符串。
    * */
    public MyString(char value[]) {
        this.value = Arrays.copyOf(value, value.length);
    }

    /*
    * 分配一个包含子数组中字符的新String
    *  字符数组参数：
    *    offset参数是子数组第一个字符的索引
    *    count参数指定子数组的长度
    * 从offset开始计数，往后count个字符的内容将会被复制到新String中
    * 字符数组的后续修改不会影响新创建的字符串。
    * */
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

    /*
    * 分配一个新字符串，其中包含来自Unicode代码点数组参数的子数组。
    * offset参数是子数组的第一个代码点的索引
    * count参数指定子数组的长度。
    * 子数组的内容转换为char对int数组的后续修改不会影响新创建的字符串。
    * */
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


    /* Common private utility method used to bounds check the byte array
     * and requested offset & length values used by the String(byte[],..)
     * constructors.
     */
    private static void checkBounds(byte[] bytes, int offset, int length) {
        if (length < 0)
            throw new StringIndexOutOfBoundsException(length);
        if (offset < 0)
            throw new StringIndexOutOfBoundsException(offset);
        if (offset > bytes.length - length)
            throw new StringIndexOutOfBoundsException(offset + length);
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

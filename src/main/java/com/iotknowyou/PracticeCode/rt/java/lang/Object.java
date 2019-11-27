package com.iotknowyou.PracticeCode.rt.java.lang;

/**
 * @title: Object
 * @projectName StudyJDK8
 * @author: RongHua Liu
 * @date: 2019/11/26  10:36
 * @description:
        Class Object是类Object结构的根。
        每个class都有Object作为超类。
        所有对象（包括数组）都实现了这个类的方法。

        Java.lang.Object 下面包含的方法

        protected Object	clone()
        创建并返回此对象的副本。 （浅拷贝）
        boolean	equals(Object obj)
        指示一些其他对象是否等于此。
        protected void	finalize()
        当垃圾收集确定不再有对该对象的引用时，垃圾收集器在对象上调用该对象。
        Class<?>	getClass()
        返回此 Object的运行时类。
        int	hashCode()
        返回对象的哈希码值。
        void	notify()
        唤醒正在等待对象监视器的单个线程。
        void	notifyAll()
        唤醒正在等待对象监视器的所有线程。
        String	toString()
        返回对象的字符串表示形式。
        void	wait()
        导致当前线程等待，直到另一个线程调用该对象的 notify()方法或 notifyAll()方法。
        void	wait(long timeout)
        导致当前线程等待，直到另一个线程调用 notify()方法或该对象的 notifyAll()方法，或者指定的时间已过。
        void	wait(long timeout, int nanos)
        导致当前线程等待，直到另一个线程调用该对象的 notify()方法或 notifyAll()方法，或者某些其他线程中断当前线程，或一定量的实时时间。
*/
public class Object {

}

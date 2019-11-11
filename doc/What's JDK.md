#JDK是什么
我们可以把Java程序设计语言、Java虚拟机、Java API类库这三部分统称为JDK(Java Development Kit)，JDK是用于支持Java程序开发的最小环境。

#JAR
dt.jar和tools.jar位于{JAVA_HOME}/lib/下，而rt.jar位于{JAVA_HOME}/jre/lib/下

rt.jar是JAVA基础类库，也就是你在java doc里面看到的所有的类的class文件
dt.jar是关于运行环境的类库,主要是swing的包
tools.jar是关于一些工具的类库，tools.jar中主要是jdk工具，包括javac，java，javap，javadoc等
在CLASSPATH设置这几个变量，是为了方便在程序中 import；Web系统都用到tool.jar

在配置CLASSPATH的时候，都会加上一个当前目录.，还有两个jar：dt.jar和tools.jar。

新建系统变量CLASSPATH：.;%JAVA_HOME%lib\dt.jar;%JAVA_HOME%\lib\tools.jar

#具体介绍
rt.jar
rt.jar 默认就在Root Classloader的加载路径里面的，而在Claspath配置该变量是不需要的；同时jre/lib目录下的

其他jar:jce.jar、jsse.jar、charsets.jar、resources.jar都在Root Classloader中

tools.jar

tools.jar 是系统用来编译一个类的时候用到的，即执行javac的时候用到

javac XXX.java

实际上就是运行

java -Calsspath=%JAVA_HOME%\lib\tools.jar xx.xxx.Main XXX.java

javac就是对上面命令的封装 所以tools.jar 也不用加到classpath里面

dt.jar
dt.jar是关于运行环境的类库,主要是swing的包 在用到swing时最好加上。

Java类库概念
Java的应用程序接口以包的形式来组织，每个包提供了大量的相关类、接口和异常处理类，这些包的集合就是Java的类库。

包名以 Java 开始的包是 Java 核心包 (Java Core Package)
包名以 Javax 开始的包是 Java 扩展包 (Java Extension Package)

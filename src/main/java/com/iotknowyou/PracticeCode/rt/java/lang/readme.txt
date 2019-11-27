Package java.lang

Description

提供对Java编程语言设计至关重要的类。
最重要的类是Object ，这是类层次的根，和类 ，它们的实例在运行时表示类。
通常需要表示原始类型的值，就像它是一个对象一样。
该包装类Boolean ， Character ， Integer ， Long ， Float和Double达到这个目的。
例如，类型为Double的对象包含一个类型为double的字段，表示该值可以将引用引用存储在引用类型的变量中。 这些类还提供了一些用于在原始值之间转换的方法，以及支持像equals和hashCode这样的标准方法。
Void类是一个不可实例化的类，它保存对代表类型为void的类对象的引用。
Math提供常用的数学函数，如正弦，余弦和平方根。
类String ， StringBuffer和StringBuilder同样提供字符串常用的操作。
类 ClassLoader ， Process ， ProcessBuilder ， Runtime ， SecurityManager和System提供了管理类的动态加载，创造外部进程中，主机环境查询，如一天中的时间，以及安全策略的执行“系统操作”。
类Throwable包括可以由抛出物throw声明。 Throwable的Throwable表示错误和异常。

字符编码
java.nio.charset.Charset类的规范描述了字符编码的命名约定以及Java平台的每个实现必须支持的一组标准编码。






接口摘要
 接口
 Appendable                             可附加 char序列和值的对象。
 AutoCloseable                          可以保存资源的对象（如文件或套接字句柄），直到它关闭。
 CharSequence                           A CharSequence是 char值的可读序列。
 Cloneable                              一个类实现 Cloneable接口，以指示 Object.clone()方法，该方法对于该类的实例进行字段 - 字段的复制是合法的。
 Comparable<T>                          该接口对实现它的每个类的对象强加一个整体排序。
 Iterable<T>                            实现此接口允许对象成为“for-each loop”语句的目标。
 Readable                               A Readable是一个 字符的来源。
 Runnable                               Runnable接口应由实例由线程执行的任何类实现。
 Thread.UncaughtExceptionHandler        接口，用于处理程序时调用 Thread突然终止由于未捕获的异常。


 类摘要
 类
 Boolean                                布尔类将对象中的基元类型 boolean的值包 boolean 。
 Byte                                   Byte类在一个对象中包含一个原始类型 byte的值。
 Character                              Character类包装一个对象中的基本类型 char的值。
 Character.Subset                       该类的实例表示Unicode字符集的特定子集。
 Character.UnicodeBlock                 一系列字符子集，表示Unicode规范中的字符块。
 Class<T>                               Class类的 类表示正在运行的Java应用程序中的类和接口。
 ClassLoader                            类加载器是负责加载类的对象。
 ClassValue<T>                          将计算的值与（潜在地）每种类型相关联。
 Compiler                               提供 Compiler类来支持Java到本地代码编译器和相关服务。
 Double                                 Double类包装一个对象中的基本类型 double的值。
 Enum<E extends Enum<E>>                这是所有Java语言枚举类型的公共基类。
 Float                                  Float类在一个对象中包含一个基本类型 float的值。
 InheritableThreadLocal<T>              该类扩展了 ThreadLocal以提供从父线程到子线程的值的继承：当子线程被创建时，子接收到父值具有值的所有可继承的线程局部变量的初始值。
 Integer                                Integer类包装一个对象中的原始类型 int的值。
 Long                                   Long类包装一个对象中的基本类型 long的值。
 Math                                   Math类包含执行基本数字运算的方法，如基本指数，对数，平方根和三角函数。
 Number                                 抽象类 Number是表示数字值可转换为基本数据类型平台类的超类 byte ， double ， float ， int ， long和 short 。
 Object                                 Class Object是类 Object结构的根。

 软件包
 软件包对象包含有关Java包的实现和规范的版本信息。
 Process                                ProcessBuilder.start()和 Runtime.exec方法创建一个本机进程并返回一个 Process子类的 Process ，可以用来控制进程并获取有关该进程的信息。
 ProcessBuilder                         此类用于创建操作系统进程。
 ProcessBuilder.Redirect                表示子进程输入的源或子进程输出的目的地。
 Runtime                                每个Java应用程序都有一个 Runtime类的 Runtime ，允许应用程序与运行应用程序的环境进行接口。
 RuntimePermission                      此类用于运行时权限。
 SecurityManager                        安全管理器是允许应用程序实施安全策略的类。
 Short                                  Short类在一个对象中包含一个基本类型 short的值。
 StackTraceElement                      堆栈跟踪中的一个元素，如 Throwable.getStackTrace()所示 。
 StrictMath                             StrictMath类包含执行基本数字运算的方法，如基本指数，对数，平方根和三角函数。
 String                                 String类代表字符串。
 StringBuffer                           线程安全，可变的字符序列。
 StringBuilder                          一个可变的字符序列。
 System                                 System类包含几个有用的类字段和方法。
 Thread                                 线程是程序中执行的线程。
 ThreadGroup                            线程组代表一组线程。
 ThreadLocal<T>                         这个类提供线程局部变量。
 Throwable                              Throwable类是Java语言中所有错误和异常的 Throwable类。
 Void                                   Void类是一个不可抗拒的占位符类，用于保存对表示Java关键字void的 类对象的引用。


 枚举摘要
 Enum	描述
 Character.UnicodeScript                一个家庭代表在定义的字符脚本字符子集的 Unicode Standard Annex #24: Script Names 。
 ProcessBuilder.Redirect.Type           一种ProcessBuilder.Redirect的类型。
 Thread.State                           线程状态。




 异常摘要
 异常
 ArithmeticException                    抛出异常算术条件时抛出。
 ArrayIndexOutOfBoundsException         抛出以表示使用非法索引访问数组。
 ArrayStoreException                    抛出以表示尝试将错误类型的对象存储到对象数组中。
 ClassCastException                     抛出表示代码尝试将对象转换为不属于实例的子类。
 ClassNotFoundException                 当Java虚拟机尝试读取类文件并确定文件格式不正确或不能解释为类文件时抛出。
 CloneNotSupportedException             抛出，表明该 clone类方法 Object被称为克隆对象，但该对象的类无法实现 Cloneable接口。
 EnumConstantNotPresentException        当应用程序尝试通过名称访问枚举常量时抛出，枚举类型不包含指定名称的常量。
 Exception                              Class异常及其子类是形式 Throwable指示合理的应用程序想要捕获的条件。
 IllegalAccessException                 当应用程序尝试反射创建实例（数组除外），设置或获取字段或调用方法时，会抛出IllegalAccessException，但是当前执行的方法无法访问指定类，字段的定义，方法或构造函数。
 IllegalArgumentException               抛出表示一种方法已经通过了非法或不正确的参数。
 IllegalMonitorStateException           抛出以表示线程已尝试在对象的监视器上等待或通知其他线程等待对象的监视器，而不拥有指定的监视器。
 IllegalStateException                  表示在非法或不适当的时间调用了一种方法。
 IllegalThreadStateException            抛出以指示线程不处于所请求操作的适当状态。
 IndexOutOfBoundsException              抛出以表示某种索引（例如数组，字符串或向量）的索引超出范围。
 InstantiationException                 当应用程序尝试使用类别 类中的 newInstance方法创建类的实例时抛出，但指定的类对象不能被实例化。
 InterruptedException                   线程在等待，睡眠或以其他方式占用时抛出，线程在活动之前或活动期间中断。
 NegativeArraySizeException             抛出一个应用程序尝试创建一个负数大小的数组。
 NoSuchFieldException                   表示该类没有指定名称的字段。
 NoSuchMethodException                  当无法找到特定方法时抛出。
 NullPointerException                   当应用 null在需要对象的情况下尝试使用 null时抛出。
 NumberFormatException                  抛出以表示应用程序已尝试将字符串转换为其中一个数字类型，但该字符串不具有相应的格式。
 ReflectiveOperationException           核心反射中的反射操作所引起的异常的常见超类。
 RuntimeException                       RuntimeException是在Java虚拟机的正常操作期间可以抛出的那些异常的超类。
 SecurityException                      由安全管理员抛出，表示安全违规。
 StringIndexOutOfBoundsException        抛出 String方法来指示索引为负或大于字符串的大小。
 TypeNotPresentException                当应用程序尝试使用表示类型名称的字符串访问类型时抛出，但没有找到具有指定名称的类型的定义。
 UnsupportedOperationException          抛出以表示不支持请求的操作。


 Error Summary
 Error	描述
 AbstractMethodError                    当应用程序尝试调用抽象方法时抛出。
 AssertionError                         抛出以表明断言失败。
 BootstrapMethodError                   抛出，表明一个invokedynamic指令未能找到它的引导方法，或引导方法未能提供call site用target正确的method type 。
 ClassCircularityError                  当Java虚拟机检测到正在加载的类的超类层次结构中的循环性时抛出。
 ClassFormatError                       当Java虚拟机尝试读取类文件并确定文件格式不正确或不能解释为类文件时抛出。
 Error                                  一个 Error是的子类 Throwable表示严重的问题，合理的应用程序不应该试图捕获。
 ExceptionInInitializerError            表示在静态初始化程序中发生意外异常。
 IllegalAccessError                     如果应用程序尝试访问或修改某个字段，或调用无法访问的方法，则抛出此异常。
 IncompatibleClassChangeError           当一些类定义发生不兼容的类更改时抛出。
 InstantiationError                     当应用程序尝试使用Java new构造来实例化抽象类或接口时抛出。
 InternalError                          在Java虚拟机中引发了一些意外的内部错误。
 LinkageError                           LinkageError的LinkageError类表示一个类对另一个类有一些依赖; 然而，后期课程在前班的汇编之后不配变。
 NoClassDefFoundError                   如果Java虚拟机或 ClassLoader实例尝试加载类的定义（作为普通方法调用的一部分或作为使用 new表达式创建新实例的一部分），则不会发现类的定义。
 NoSuchFieldError                       如果应用程序尝试访问或修改对象的指定字段，并且该对象不再具有该字段，则抛出。
 NoSuchMethodError                      如果应用程序尝试调用类（静态或实例）的指定方法，并且该类不再具有该方法的定义，则抛出。
 OutOfMemoryError                       当Java虚拟机由于内存不足而无法分配对象时抛出，并且垃圾收集器不再有可用的内存。
 StackOverflowError                     当堆栈溢出发生时抛出一个应用程序递归太深。
 ThreadDeath                            当调用（弃用） Thread.stop()方法时， ThreadDeath的实例被抛出在受害者线程中。
 UnknownError                           当Java虚拟机中出现未知但严重的异常时抛出。
 UnsatisfiedLinkError                   如果Java虚拟机找不到声明为 native的方法的适当的本地语言定义，则 native 。
 UnsupportedClassVersionError           当Java虚拟机尝试读取类文件并确定文件中的主要和次要版本号不受支持时抛出。
 VerifyError                            当“验证者”检测到一个类文件（尽管形成良好）包含某种内部不一致或安全问题时抛出。
 VirtualMachineError                    抛出以表明Java虚拟机已损坏或已耗尽资源以使其继续运行。


 注解类型摘要

 @Deprecated                            注释@Deprecated的程序元素是程序员不鼓励使用的程序元素，通常是因为它是危险的，或者因为存在更好的替代方法。
 @FunctionalInterface                  使用的信息注释类型，以指示在接口类型声明旨在是一个 功能接口由Java语言规范所定义的。
 @Override                              表示方法声明旨在覆盖超类型中的方法声明。
 @SafeVarargs                           程序员断言注释方法或构造函数的正文不会对其varargs参数执行潜在的不安全操作。
 @SuppressWarnings                      表示在注释元素（以及注释元素中包含的所有程序元素）中应该抑制命名的编译器警告。



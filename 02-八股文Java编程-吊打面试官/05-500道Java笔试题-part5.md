### 401、下面中哪两个可以在A的子类中使用：（）

```prettyprint
class A {
    protected int method1 (int a, int b) {
        return 0;
    }
}
```

A. public int method 1 (int a, int b) { return 0; }

B. private int method1 (int a, int b) { return 0; }

C. private int method1 (int a, long b) { return 0; }

D. public short method1 (int a, int b) { return 0; }



解答：A C

主要考查子类重写父类的方法的原则

B，子类重写父类的方法，访问权限不能降低
C，属于重载
D，子类重写父类的方法 返回值类型要相同或是父类方法返回值类型的子类



### 402、Abstract method cannot be static. True or False ?

A True

B False



解答：A

抽象方法可以在子类中被重写，但是静态方法不能在子类中被重写，静态方法和静态属性与对象是无关的，只与类有关，这与abstract是矛盾的，所以abstract是不能被修饰为static，否则就失去了abstract的意义了



### 403、What will be the output when you compile and execute the following program.

```prettyprint
class Base {

    void test() {

        System.out.println(“Base.test()”);

    }

}
public class Child extends Base {

    void test() {

        System.out.println(“Child.test()”);

    }

    static public void main(String[] a) {

        Child anObj = new Child();

        Base baseObj = (Base) anObj;

        baseObj.test();

    }

}
```

Select most appropriate answer.

A. Child.test()

Base.test()

B.Base.test()

Child.test()

C.Base.test()

D.Child.test()



解答：D

测试代码相当于：Base baseObj = new Child();父类的引用指向子类的实例，子类又重写了父类

的test方法，因此调用子类的test方法。



### 404、What will be the output when you compile and execute the following program.

```prettyprint
class Base {

    static void test() {

        System.out.println(“Base.test()”);

    }

}

public class Child extends Base {

    void test() {

        System.out.println(“Child.test()”);

        Base.test(); //Call the parent method

    }

    static public void main(String[] a) {

        new Child().test();

    }

}
```

Select most appropriate answer.

A Child.test()

Base.test()

B Child.test()

Child.test()

C Compilation error. Cannot override a static method by an instance method

D Runtime error. Cannot override a static method by an instance method



解答：C

静态方法不能在子类中被重写



### 405、What will be the output when you compile and execute the following program.

```prettyprint
public class Base {

    private void test() {

        System.out.println(6 + 6 + “ (Result)”);

    }

    static public void main(String[] a) {

        new Base().test();

    }

}
```


Select most appropriate answer.

A 66(Result)

B 12(Result)

C Runtime Error.Incompatible type for +. Can’t convert an int to a string.

D Compilation Error.Incompatible type for +. Can’t add a string to an int.



解答：B

字符串与基本数据类型链接的问题,如果第一个是字符串那么后续就都按字符串处理，比如上边例子要是System.out.println(“(Result)”+6 + 6 );那么结果就是(Result)66，如果第一个和第二个。。。第n个都是基本数据第n+1是字符串类型，那么前n个都按加法计算出结果在与字符串连接



### 406、What will be the output when you compile and execute the following program. The symbol ’ ?’ means space.

```prettyprint
1:public class Base{

2:

3: private void test() {

4:

5:      String aStr = “?One?”;

6:      String bStr = aStr;

7:      aStr.toUpperCase();

8:      aStr.trim();

9:      System.out.println(“[" + aStr + "," + bStr + "]“);

7: }

8:

9:  static public void main(String[] a) {

10:   new Base().test();

11: }

12:}
```

Select most appropriate answer.

A [ONE,?One?]

B [?One?,One]

C [ONE,One]

D [ONE,ONE]

E [?One?,?One?]



解答：E

通过String bStr = aStr;这句代码使bStr和aStr指向同一个地址空间，所以最后aStr和bStr的结果应该是一样，String类是定长字符串，调用一个字符串的方法以后会形成一个新的字符串。



### 407、下面关于变量及其范围的陈述哪些是不正确的（ ）：

A．实例变量是类的成员变量

B．实例变量用关键字static声明

C．在方法中定义的局部变量在该方法被执行时创建

D．局部变量在使用前必须被初始化



解答：BC

由static修饰的变量称为类变量或是静态变量

方法加载的时候创建局部变量



### 408、下列关于修饰符混用的说法，错误的是（ ）：

A．abstract不能与final并列修饰同一个类

B．abstract类中可以有private的成员

C．abstract方法必须在abstract类中

D．static方法中能处理非static的属性



解答 D

静态方法中不能引用非静态的成员



### 409、执行完以下代码int [ ] x = new int[25]；后，以下哪项说明是正确的（ ）：

A、 x[24]为0

B、 x[24]未定义

C、 x[25]为0

D、 x[0]为空



解答：A

x属于引用类型，该引用类型的每一个成员是int类型，默认值为：0



### 410、编译运行以下程序后，关于输出结果的说明正确的是 （ ）：

```prettyprint
public class Conditional {

    public static void main(String args[]) {

        int x = 4;

        System.out.println(“value is“ + ((x > 4) ? 99.9 : 9));

    }

}
```

A、 输出结果为：value is 99.99

B、 输出结果为：value is 9

C、 输出结果为：value is 9.0

D、 编译错误



解答：C

三目运算符中：第二个表达式和第三个表达式中如果都为基本数据类型，整个表达式的运算结果

由容量高的决定。99.9是double类型 而9是int类型，double容量高。



### 411、关于以下application的说明，正确的是（ ）：

```prettyprint
1． class StaticStuff

2． {

3．   static int x=10；

4．   static { x+=5；}

5．   public static void main（String args[ ]）

6．   {

7．     System.out.println(“x=” + x);

8．   }

9．    static { x/=3;}

10.}
```



A、 4行与9行不能通过编译，因为缺少方法名和返回类型

B、 9行不能通过编译，因为只能有一个静态初始化器

C、 编译通过，执行结果为：x=5

D、 编译通过，执行结果为：x=3



解答：C

自由块是类加载的时候就会被执行到的，自由块的执行顺序是按照在类中出现的先后顺序执行。



### 412、关于以下程序代码的说明正确的是（ ）：

```prettyprint
1．class HasStatic{

2．  private static int x=100；

3．  public static void main(String args[ ]){

4．    HasStatic hs1=new HasStatic( );

5．    hs1.x++;

6．    HasStatic hs2=new HasStatic( );

7．    hs2.x++;

8．    hs1=new HasStatic( );

9．    hs1.x++;

10．   HasStatic.x–;

11．   System.out.println(“x=”+x);

12．  }

13．}
```

A、5行不能通过编译，因为引用了私有静态变量

B、10行不能通过编译，因为x是私有静态变量

C、程序通过编译，输出结果为：x=103

D、程序通过编译，输出结果为：x=102



解答：D

静态变量是所有对象所共享的，所以上述代码中的几个对象操作是同一静态变量x， 静态变量可以通过类名调用。



### 413、下列说法正确的有（）

A． class中的constructor不可省略

B． constructor必须与class同名，但方法不能与class同名

C． constructor在一个对象被new时执行

D．一个class只能定义一个constructor



解答：C

构造方法的作用是在实例化对象的时候给数据成员进行初始化

A．类中如果没有显示的给出构造方法，系统会提供一个无参构造方法

B．构造方法与类同名，类中可以有和类名相同的方法

D．构造方法可以重载



### 414、下列哪种说法是正确的（）

A．实例方法可直接调用超类的实例方法

B．实例方法可直接调用超类的类方法

C．实例方法可直接调用其他类的实例方法

D．实例方法可直接调用本类的类方法



解答：D

A. 实例方法不可直接调用超类的私有实例方法

B. 实例方法不可直接调用超类的私有的类方法

C．要看访问权限



### 415、下列哪一种叙述是正确的（ ）

A． abstract修饰符可修饰字段、方法和类

B． 抽象方法的body部分必须用一对大括号{ }包住

C． 声明抽象方法，大括号可有可无

D． 声明抽象方法不可写出大括号



解答：D

abstract可以修饰方法和类，不能修饰属性。抽象方法没有方法体，即没有大括号{}



### 416、下面代码的执行结果是？

```prettyprint
import java.util. * ;

public class ShortSet {

    public static void main(String args[]){

        Set < Short > s = new HashSet < Short > ();

        for (Short i = 0; i < 100; i++){

            s.add(i);

            s.remove(i - 1);

        }

        System.out.println(s.size());

    }

}
```


A.1

B.100

C.Throws Exception

D.None of the Above



解答：B

i是Short类型 i-1是int类型,其包装类为Integer，所以s.remove(i-1);不能移除Set集合中Short类型对象。



### 417、链表具有的特点是：(选择3项)

A、不必事先估计存储空间

B、可随机访问任一元素

C、插入删除不需要移动元素

D、所需空间与线性表长度成正比



解答：ACD

A.采用动态存储分配，不会造成内存浪费和溢出。

B. 不能随机访问，查找时要从头指针开始遍历

C. 插入、删除时，只要找到对应前驱结点，修改指针即可，无需移动元素

D. 需要用额外空间存储线性表的关系，存储密度小



### 418、Java语言中，String类的IndexOf()方法返回的类型是？

A、Int16 

B、Int32 

C、int 

D、long



解答：C

indexOf方法的声明为：public int indexOf(int ch)
在此对象表示的字符序列中第一次出现该字符的索引；如果未出现该字符，则返回 -1。



### 419、以下关于面向对象概念的描述中，不正确的一项是（）。(选择1项)

A.在现实生活中，对象是指客观世界的实体

B.程序中的对象就是现实生活中的对象

C.在程序中，对象是通过一种抽象数据类型来描述的，这种抽象数据类型称为类（class）

D.在程序中，对象是一组变量和相关方法的集合



解答：B



### 420、执行下列代码后,哪个结论是正确的 String[] s=new String[10];

A． s[9] 为 null;

B． s[10] 为 “”;

C． s[0] 为 未定义

D． s.length 为10



解答：AD

s是引用类型，s中的每一个成员都是引用类型，即String类型，String类型默认的值为null

s数组的长度为10。



### 421、属性的可见性有。(选择3项)

A.公有的

B.私有的

C.私有保护的

D.保护的



解答：ABD

属性的可见性有四种：公有的（public） 保护的（protected） 默认的 私有的（private）



### 422、在字符串前面加上_____符号，则字符串中的转义字符将不被处理。(选择1项)

A @

B \

C #

D %



解答：B



### 423、下列代码哪行会出错: (选择1项)

```prettyprint
1) public void modify() { 
2)    int I, j, k; 
3)    I = 100; 
4)    while ( I > 0 ) { 
5)       j = I * 2; 
6)       System.out.println (” The value of j is ” + j ); 
7)       k = k + 1; 
8)       I–; 
9)     } 
10) }
```

A. 4

B. 6

C. 7

D. 8



解答：C

k没有初始化就使用了



### 24、对记录序列{314，298，508，123，486，145}按从小到大的顺序进行插入排序，经过两趟排序后的结果为：(选择1项)

A {314，298，508，123，145，486}

B {298，314，508，123，486，145}

C {298，123，314，508，486，145}

D {123、298，314，508，486，145}



解答：B

插入排序算法：

```prettyprint
public static void injectionSort(int[] number) {

    // 第一个元素作为一部分，对后面的部分进行循环
    for (int j = 1; j < number.length; j++) {

        int tmp = number[j];

        int i = j–1;

        while (tmp < number[i]) {

            number[i + 1] = number[i];

            i–;

            if (i == -1)

                break;

        }

        number[i + 1] = tmp;

    }

}
```



### 425、栈是一种。(选择1项)

A 存取受限的线性结构

B 存取不受限的线性结构

C 存取受限的非线性结构

D 存取不受限的非线性结构



解答：A

栈（stack）在计算机科学中是限定仅在表尾进行插入或删除操作的线性表。



### 426、下列哪些语句关于内存回收的说明是正确的。(选择1项)

A程序员必须创建一个线程来释放内存

B内存回收程序负责释放无用内存

C内存回收程序允许程序员直接释放内存

D内存回收程序可以在指定的时间释放内存对象



解答：B

垃圾收集器在一个Java程序中的执行是自动的，不能强制执行，即使程序员能明确地判断出有一块内存已经无用了，是应该回收的，程序员也不能强制垃圾收集器回收该内存块。程序员唯一能做的就是通过调用System. gc 方法来”建议”执行垃圾收集器，但其是否可以执行，什么时候执行却都是不可知的。



### 427、Which method must be defined by a class implementing the java.lang.Runnable interface?

A. void run()

B. public void run()

C. public void start()

D. void run(int priority)

E. public void run(int priority)

F. public void start(int priority)



解答：B

实现Runnable接口，接口中有一个抽象方法run，实现类中实现该方法。



### 428、Given:

```prettyprint
public static void main(String[] args) {

    Object obj = new Object() {

        public int hashCode() {

            return 42;

        };

    }

    System.out.println(obj.hashCode());

}
```

What is the result?

A. 42

B. An exception is thrown at runtime.

C. Compilation fails because of an error on line 12.

D. Compilation fails because of an error on line 16.

E. Compilation fails because of an error on line 17.



解答：A

匿名内部类覆盖hashCode方法。



### 429、Which two are reserved words in the Java programming language? (Choose two)

A. run

B. import

C. default

D. implements



解答：BD

import导入包的保留字，implements实现接口的保留字。



### 430、Which two statements are true regarding the return values of property written hashCodeand equals methods from two instances of the same class? (Choose two)

A. If the hashCode values are different, the objects might be equal.

B. If the hashCode values are the same, the object must be equal.

C. If the hashCode values are the same, the objects might be equal.

D. If the hashCode values are different, the objects must be unequal.



解答：CD

先通过 hashcode来判断某个对象是否存放某个桶里，但这个桶里可能有很多对象，那么我们就需要再通过 equals 来在这个桶里找到我们要的对象。



### 431、What is the numerical range of a char?

A. 0 … 32767

B. 0 … 65535

C. –256 … 255

D. –32768 … 32767

E. Range is platform dependent.



解答：B

在Java中，char是一个无符号16位类型，取值范围为0到65535。



### 432、Given:

```prettyprint
public class Test {

    private static float[] f = new float[2];

    public static void main(String args[]) {

        System.out.println(“f[0] = “ + f[0]);

    }

}
```

What is the result?

A. f[0] = 0

B. f[0] = 0.0

C. Compilation fails.

D. An exception is thrown at runtime.



解答：B



### 433、Given:

```prettyprint
public class Test {

    public static void main(String[] args) {

        String str = NULL;

        System.out.println(str);

    }

}
```

What is the result?

A. NULL

B. Compilation fails.

C. The code runs with no output.

D. An exception is thrown at runtime.



解答：B

null应该小写



### 434、Exhibit:

```prettyprint
1.public class X implements Runnable {

2.  private int x;

3.  private int y;

4.public static void main(String [] args) {

5.  X that = new X();

6.  (new Thread(that)).start();

7.  (new Thread(that)).start();

8.}

9.public synchronized void run( ){

10.   for (;;) {

11.   x++;

12.   y++;

13.   System.out.println(“x = “ + x + “, y = “ + y);

14.   }

15.   }

16.}
```

What is the result?

A. An error at line 11 causes compilation to fail.

B. Errors at lines 7 and 8 cause compilation to fail.

C. The program prints pairs of values for x and y that might not always be the same on the same line (for example, “x=2, y=1”)

D. The program prints pairs of values for x and y that are always the same on the same line (for example, “x=1, y=1”. In addition, each value appears twice (for example, “x=1, y=1” followed by “x=1, y=1”)

E. The program prints pairs of values for x and y that are always the same on the same line (for example, “x=1, y=1”. In addition, each value appears twice (for example, “x=1, y=1” followed by “x=2, y=2”)



解答：E

多线程共享相同的数据，使用synchronized实现数据同步。



### 435、Which two CANNOT directly cause a thread to stop executing? (Choose Two)

A. Existing from a synchronized block.

B. Calling the wait method on an object.

C. Calling notify method on an object.

D. Calling read method on an InputStream object.

E. Calling the SetPriority method on a Thread object.



解答：AD

stop方法.这个方法将终止所有未结束的方法，包括run方法。当一个线程停止时候，他会立即释

放 所有他锁住对象上的锁。这会导致对象处于不一致的状态。 当线程想终止另一个线程的时

候，它无法知道何时调用stop是安全的，何时会导致对象被破坏。所以这个方法被弃用了。你应

该中断一个线程而不是停止他。被中断的线程会在安全的时候停止。



### 436、Which two statements are true regarding the creation of a default constructor? (Choose Two)

A. The default constructor initializes method variables.

B. The default constructor invokes the no-parameter constructor of the superclass.

C. The default constructor initializes the instance variables declared in the class.

D. If a class lacks a no-parameter constructor,, but has other constructors, the compiler creates a default constructor.

E. The compiler creates a default constructor only when there are no other constructors for the class.



解答：CE

构造方法的作用是实例化对象的时候给数据成员初始化，如果类中没有显示的提供构造方法，系统会提供默认的无参构造方法，如果有了其它构造方法，默认的构造方法不再提供。



### 437、 Given:

```prettyprint
public class OuterClass {

    private double d1 = 1.0;

    //insert code here
}
```

You need to insert an inner class declaration at line2. Which two inner class declarations are valid? (Choose Two)

A. 

```prettyprint
static class InnerOne {
    public double methoda() {
        return d1;
    }
}
```

B. 

```prettyprint
static class InnerOne {
    static double methoda() {
        return d1;
    }
}
```

C.

```prettyprint
private class InnerOne {
    public double methoda() {
        return d1;
    }
}
```

D.

```prettyprint
protected class InnerOne {
    static double methoda() {
        return d1;
    }
}
```

E.

```prettyprint
public abstract class InnerOne {
    public abstract double methoda();
}
```



解答：CE

AB.内部类可以声明为static的，但此时就不能再使用外层封装类的非static的成员变量；

D.非static的内部类中的成员不能声明为static的，只有在顶层类或static的内部类中才可声明static成员



### 438、 Which two declarations prevent the overriding of a method? (Choose Two)

A. final void methoda() {}

B. void final methoda() {}

C. static void methoda() {}

D. static final void methoda() {}

E. final abstract void methoda() {}



解答：AD

final修饰方法，在子类中不能被重写。



### 439、Given:

```prettyprint
public class Test {

    public static void main(String args[]) {

        class Foo {

            public int i = 3;

        }

        Object o = (Object) new Foo();

        Foo foo = (Foo) o;

        System.out.println(foo.i);

    }

}
```

What is the result?

A. Compilation will fail.

B. Compilation will succeed and the program will print “3”

C. Compilation will succeed but the program will throw a ClassCastException at line 6.

D. Compilation will succeed but the program will throw a ClassCastException at line 7.



解答：B

局部内部类的使用



### 440、Given:

```prettyprint
public class Test {

    public static void main(String[] args) {

        String foo = “blue”;

        String bar = foo;

        foo = “green”;

        System.out.println(bar);

    }

}
```


What is the result?

A. An exception is thrown.

B. The code will not compile.

C. The program prints “null”

D. The program prints “blue”

E. The program prints “green”



解答：D

采用String foo = “blue”定义方式定义的字符串放在字符串池中，通过String bar = foo;

他们指向了同一地址空间，就是同一个池子，当执行foo = “green”; foo指向新的地址空间。



### 441、Which code determines the int value foo closest to a double value bar?

A. int foo = (int) Math.max(bar);

B. int foo = (int) Math.min(bar);

C. int foo = (int) Math.abs(bar);

D. int foo = (int) Math.ceil(bar);

E. int foo = (int) Math.floor(bar);

F. int foo = (int) Math.round(bar);



解答：DEF

A B两个选项方法是用错误，都是两个参数。

abs方法是取bar的绝对值，

ceil方法返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。

floor方法返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数。

round方法 返回最接近参数的 long。



### 442、 Exhibit:

```prettyprint
1.package foo;

2.import java.util.Vector;

3.private class MyVector extends Vector {

4.    int i = 1;

5.    public MyVector() {

6.          i = 2;

7.    }

8.}

9.public class MyNewVector extends MyVector {

10.    public MyNewVector () {

11.        i = 4;

12.    }

13.    public static void main (String args []) {

14.        MyVector v = new MyNewVector();

15.    }

16.}
```

The file MyNewVector.java is shown in the exhibit. What is the result?

A. Compilation will succeed.

B. Compilation will fail at line 3.

C. Compilation will fail at line 6.

D. Compilation will fail at line 9.

E. Compilation will fail at line 14.



解答：B

类MyVector不能是私有的



### 443、Given:

```prettyprint
public class Test {

    public static void main(String[] args) {

        String foo = args[1];

        String bar = args[2];

        String baz = args[3];

        System.out.println(“baz = ” + baz);

    }

}

And the output:

Baz = 2
```

Which command line invocation will produce the output?

A. java Test 2222

B. java Test 1 2 3 4

C. java Test 4 2 4 2

D. java Test 4 3 2 1



解答：C

数组下标从0开始



### 444、Given:

```prettyprint
1.public interface Foo{

2.  int k = 4;

3.}
```

Which three are equivalent to line 2? (Choose Three)

A. final int k = 4;

B. Public int k = 4;

C. static int k = 4;

D. Private int k = 4;

E. Abstract int k = 4;

F. Volatile int k = 4;

G. Transient int k = 4;

H. protected int k = 4;



解答：BDE

static：修饰的静态变量

final 修饰的是常量

abstract不能修饰变量

Volatile修饰的成员变量在每次被线程访问时，都强迫从共享内存中重读该成员变量的值。

而且，当成员变量发生变化时，强迫线程将变化值回写到共享内存。这样在任何时刻，

两个不同的线程总是看到某个成员变量的同一个值。
Transient：对不需序列化的类的域使用transient关键字,以减少序列化的数据量。

int k=4相当于public static final int k=4; 在接口中可以不写static final



### 445、 Given:

```prettyprint
public class foo {

    static String s;

    public static void main(String[] args) {

        System.out.println(“s = ” + s);

    }

}
```

What is the result?

A. The code compiles and “s=” is printed.

B. The code compiles and “s=null” is printed.

C. The code does not compile because string s is not initialized.

D. The code does not compile because string s cannot be referenced.

E. The code compiles, but a NullPointerException is thrown when toString is called.



解答：B

String为禁用数据类型，引用类型数据成员的默认值为null



### 446、Which two create an instance of an array? (Choose Two)

A. int[] ia = new int [15];

B. float fa = new float [20];

C. char[] ca = “Some String”;

D. Object oa = new float[20];

E. Int ia [][] = (4, 5, 6) (1, 2, 3)



解答：AD

任何类的父类都是Object，数组也数据引用类型，Object oa = new float[20];这种写法相当于父类的用指向之类的实例。



### 447、Given:

```prettyprint
public class ExceptionTest {

    class TestException extends Exception {}

    public void runTest() throws TestException {}

    public void test()
        /* Point X*/
    {

        runTest();

    }

}
```

At point X on line 4, which code can be added to make the code compile?

A. throws Exception

B. Catch (Exception e).

C. Throws RuntimeException.

D. Catch (TestException e).

E. No code is necessary.



解答：A

方法上使用throws抛出异常，Exception是异常类的超类。



### 448、Exhibit:

```prettyprint
public class SwitchTest {

    public static void main(String[] args) {

        System.out.println(“value = ” + switchIt(4));

    }

    public static int switchIt(int x) {

        int j = 1;

        switch (x) {

            case 1:
                j++;

            case 2:
                j++;

            case 3:
                j++;

            case 4:
                j++;

            case 5:
                j++;

            default:
                j++;

        }

        return j + x;

    }

}
```

What is the output from line 3?

A. Value =3

B. Value =4

C. Value =5

D. Value =6

E. Value =7

F. Value =8



解答：F

由于case块没有break语句，那么从case 4：向下的代码都会执行。



### 449、Which four types of objects can be thrown using the throw statement? (Choose Four)

A. Error

B. Event

C. Object

D. Exception

E. Throwable

F. RuntimeException



解答：ADEF

能够抛出的对象类型要是Throwable 或是Throwable的子类



### 450、在下面程序的第6行补充上下列哪个方法,会导致在编译过程中发生错误?

```prettyprint
1)class Super{

2)  public float getNum(){

3)    return 3.0f;

4)  }

  }

5)pubhc class Sub extends Super{

6)

7)}
```

A,public float getNum(){retun 4.0f;}

B.public void getNum(){}

C.public void getNum(double d){}

D.public double getNum(float d){ retun 4.0f ;} 



解答：B

方法重写的问题。子类中有和父类的方法名相同，但是参数不同，不会出编译错误，认为是子类

的特有的方法，但是如果子类中方法和父类的方法名，参数，访问权限，异常都相同，只有返回值

类型不同会编译不通过。



### 451、下面关于import, class和package的声明顺序哪个正确？( )

A. package, import, class

B. class, import, package

C. import, package, class

D. package, class, import



解答：A



### 452、下面哪个是正确的？( )

A. String temp [] = new String {“a” “b” “c”};

B. String temp [] = {“a” “b” “c”}

C. String temp = {“a”, “b”, “c”}

D. String temp [] = {“a”, “b”, “c”}



解答：D



### 453、关于java.lang.String类，以下描述正确的一项是（ ）

A. String类是final类故不可以继承；

B. String类是final类故可以继承；

C. String类不是final类故不可以继承；

D. String类不是final类故可以继承； 



解答：A

String类是final的，在java中final修饰类的不能被继承



### 454、关于实例方法和类方法，以下描述正确的是：( )

A. 实例方法只能访问实例变量

B. 类方法既可以访问类变量，也可以访问实例变量

C. 类方法只能通过类名来调用

D. 实例方法只能通过对象来调用



解答：D

A 实例方法可以访问类变量

B类方法只能访问类变量

C类方法可以通过对象调用



### 455、接口是Java面向对象的实现机制之一，以下说法正确的是：( )

A. Java支持多重继承，一个类可以实现多个接口；

B. Java只支持单重继承，一个类可以实现多个接口；

C. Java只支持单重继承，一个类只可以实现一个接口；

D. Java支持多重继承，但一个类只可以实现一个接口。



解答：B

Java支持单重继承，一个类只能继承自另外的一个类，但是一个类可以实现多个接口。



### 456、下列关于interface的说法正确的是：( )

A. interface中可以有private方法

B. interface中可以有final方法

C. interface中可以有function实现

D. interface可以继承其他interface



解答：D

A.接口中不可以有private的方法

B．接口中不可以有final的方法 接口中的方法默认是 public abstract的

C．接口中的方法不可以有实现



### 57、已知A类被打包在packageA , B类被打包在packageB ，且B类被声明为public ，且有一个成员变量x被声明为, protected控制方式 。C类也位于packageA包，且继承了B类 。则以下说话正确的是（ ）

A. A类的实例不能访问到B类的实例

B. A类的实例能够访问到B类一个实例的x成员

C. C类的实例可以访问到B类一个实例的x成员

D. C类的实例不能访问到B类的实例



解答：C

不同包子类的关系， 可以访问到父类B的protected成员



### 58、以下程序正确的输出是（ ）

```prettyprint
package test;

public class FatherClass {

    public FatherClass() {

        System.out.println(“FatherClass Create”);

    }

}

package test;

import test.FatherClass;

public class ChildClass extends FatherClass {

    public ChildClass() {

        System.out.println(“ChildClass Create”);

    }

    public static void main(String[] args) {

        FatherClass fc = new FatherClass();

        ChildClass cc = new ChildClass();

    }

}
```

A.

FatherClass Create

FatherClass Create

ChildClass Create

B.

FatherClass Create

ChildClass Create

FatherClass Create

C.

ChildClass Create

ChildClass Create

FatherClass Create

D.

ChildClass Create

FatherClass Create

FatherClass Create



解答：A

在子类构造方法的开始默认情况下有一句super();来调用父类的构造方法



### 459、给定如下代码，下面哪个可以作为该类的构造函数 ( )

```prettyprint
public class Test {

}
```

A. public void Test() {?}

B. public Test() {?}

C. public static Test() {?}

D. public static void Test() {?}



解答：B

构造方法：与类同名没有放回类型



### 460、题目:

```prettyprint
1.public class test (

2.public static void main (String args[]) {

3.  int i = 0xFFFFFFF1;

4.  int j = ~i;

5.

6.  }

7.  )
```



程序运行到第5行时,j的值为多少?( )

A. –15

B. 0

C. 1

D. 14

E. 在第三行的错误导致编译失败



解答：D

int i = 0xFFFFFFF1;相当于 int i=-15 然后对i进行取反即取绝对值再减一



### 461、关于sleep()和wait()，以下描述错误的一项是（ ）

A. sleep是线程类（Thread）的方法，wait是Object类的方法；

B. sleep不释放对象锁，wait放弃对象锁；

C. sleep暂停线程、但监控状态仍然保持，结束后会自动恢复；

D. wait后进入等待锁定池，只有针对此对象发出notify方法后获得对象锁进入运行状态。



解答：D

sleep是线程类（Thread）的方法，导致此线程暂停执行指定时间，给执行机会给其他线程，但是监控状态依然保持，到时后会自动恢复。调用sleep不会释放对象锁。

wait是Object类的方法，对此对象调用wait方法导致本线程放弃对象锁，进入等待此对象的等待锁定池，只有针对此对象发出notify方法（或notifyAll）后本线程才进入对象锁定池准备获得对象锁进入运行状态。



### 462、62.下面能让线程停止执行的有（多选）( )

A. sleep();

B. stop();

C. notify();

D. synchronized();

E. yield();

F. wait();

G. notifyAll();



解答：ABDEF

sleep：导致此线程暂停执行指定时间

stop: 这个方法将终止所有未结束的方法，包括run方法。

synchronized():对象锁

yield：当前正在被服务的线程可能觉得cpu的服务质量不够好，于是提前退出，这就是yield。

wait：当前正在被服务的线程需要睡一会，醒来后继续被服务



### 463、下面哪个可以改变容器的布局？( )

A. setLayout(aLayoutManager);

B. addLayout(aLayoutManager);

C. layout(aLayoutManager);

D. setLayoutManager(aLayoutManager);



解答：A

Java设置布局管理器setLayout()



### 464、下面哪个是applet传递参数的正确方式？（ ）

A. <applet code=Test.class age=33 width=1 height=1>

B. <param name=age value=33>

C. <applet code=Test.class name=age value=33 width=1 height=1>

D. <applet Test 33>



解答：B



### 465、提供Java存取数据库能力的包是（）

A．java.sql

B．java.awt

C．java.lang

D．java.swing



解答：A

java.sql是JDBC的编程接口

java.awt和java.swing是做图像界面的类库

java.lang: Java 编程语言进行程序设计的基础类



### 466、不能用来修饰interface的有（）

A．private

B．public

C．protected

D．static



解答：ACD

修饰接口可以是public和默认



### 467、下列说法错误的有（）

A． 在类方法中可用this来调用本类的类方法

B． 在类方法中调用本类的类方法时可直接调用

C． 在类方法中只能调用本类中的类方法

D． 在类方法中绝对不能调用实例方法



解答：ACD

A.在类方法中不能使用this关键字

C．在类方法中可以调用其它类中的类方法

D．在类方法中可以通过实例化对象调用实例方法



### 468、从下面四段（A，B，C，D）代码中选择出正确的代码段（）

A．

```prettyprint
abstract class Name {

    private String name;

    public abstract boolean isStupidName(String name) {}

}
```

B．

```prettyprint
public class Something {

    void doSomething() {

        private String s = ̶”;

        int l = s.length();
    }
}
```

C．

```prettyprint
public class Something {

    public static void main(String[] args) {

        Other o = new Other();

        new Something().addOne(o);

    }

    public void addOne(final Other o) {

        o.i++;

    }

}

class Other {

    public int i;

}
```

D．

```prettyprint
public class Something {

    public int addOne(final int x) {

        return++x;

    }

}
```



解答：C

A..抽象方法不能有方法体

B．方法中定义的是局部变量，不能用类成员变量修饰符private

D．final修饰为常量，常量的值不能被改变



### 469、选择下面代码的运行结果：（）。

```prettyprint
public class Test {

    public void method(){

        for (int i = ; i < 3; i++){

            System.out.print(i);

        }

        System.out.print(i);

    }

}
```

A．122

B．123

C．编译错误

D．没有任何输出



解答：C

i变量的作用范围是整个for循环



### 470、请看如下代码 下面哪些放在// point x?行是正确的？  

```prettyprint
i = m;

class Person {
    private int a;
    public int change(int m) {
        return m;
    }
}
public class Teacher extends Person {
    public int b;
    public static void main(String arg[]) {
        Person p = new Person();
        Teacher t = new Teacher();
        int i;
        // point x 
    }
}
```

A， i = m;

B， i = b;

C， i = p.a; 

D， i = p.change(3);

E， i = t.b;



解答：DE

A.不同的作用域

B．静态方法中不能直接使用非静态成员变量

C．类外不能访问其它类私有的成员

D，E．在类方法中可以通过实例化对象调用类中的实例成员。 



### 471、下面那几个函数是public void method(){̷}的重载函数？（）

A.public void method( int m){̷}

B.public int method(){̷}

C.public void method2(){̷}

D.public int method(int m，float f ){̷}



解答：A

重载：方法名相同，参数列表不同



### 472、给出如下声明：

String s = “Example”;

合法的代码由哪些？

A）s>>>=3 

B）s[3]= “X” 

C）int i = s.iength() 

D）s = s +1



解答：D

A. 移位运算，要是整数类型。

B．s不是数组

C．String类取长度的方法为：length()

D. 字符串相加



### 473、如下哪些不是java的关键字？（ ）

A.const

B.NULL

C.false

D.this

E.native



解答：BC

虽然null false 还有true不是java的关键字，但是都有特殊用途，不建议作为标识符。



### 474、已知表达式 int m [ ] = {，1，2，3，4，5，6}；

下面哪个表达式的值与数组下标量总数相等？（ ）

A .m.length()

B.m.length

C.m.length()+1

D.m.length+1



解答：B

解答：数组下标是从零开始的，但是数据下标的总量和数据长度相同。



### 475、方法resume()负责恢复哪些线程的执行（ ）

A.通过调用stop()方法而停止的线程。

B.通过调用sleep()方法而停止的线程。

C.通过调用wait()方法而停止的线程。

D.通过调用suspend()方法而停止的线程。



解答：D

Suspend可以挂起一个线程，就是把这个线程暂停了，它占着资源，但不运行，用Resume是恢复挂起的线程，

让这个线程继续执行下去。



### 476、有关线程的哪些叙述是对的（ ）

A一旦一个线程被创建，它就立即开始运行。

B使用start()方法可以使一个线程成为可运行的，但是它不一定立即开始运行。

C当一个线程因为抢先机制而停止运行，它被放在可运行队列的前面。

D一个线程可能因为不同的原因停止并进入就绪状态。



解答： BCD

在抢占式线程模型中，操作系统可以在任何时候打断线程。通常会在它运行了一段时间（就是所谓的一个

时间片）后才打断它。这样的结果自然是没有线程能够不公平地长时间霸占处理器。



### 477、已知如下代码：执行后的输出是什么？（ ）

```prettyprint
public class Test{

    public static void main(String arg[]){

        int i = 5;

        do {

            System.out.print(i);

        } while (– i > 5 );

        System.out.print(“finished”);

    }

}
```



A 5

B 4

C 6

D finished



解答：AD

输出5finished，do„while循环中循环体一定会执行一次



### 478、下面的哪些声明是合法的？（ ）

A.long 1 = 499

B.int i = 4L

C.float f =1.1

D.double d = 34.4



解答：AD

B.4L应该是long类型的写法，

C.1.1是double类型 ，float f=1.1f是正确写法



### 479、给出如下代码：（ ）

```prettyprint
class Test {

    private int m;

    public static void fun() {

        //some code„

    }

}
```

如何使成员变量m被函数fun()直接访问？（）

A.将private int m改为 protected int m

B.将private int m改为 public int m

C.将private int m改为 static int m

D.将private int m改为int m



解答：C

静态的方法中可以直接调用静态数据成员



### 480、以下哪个方法用于定义线程的执行体？（）

A.start()

B.init()

C.run()

D.main()

E.synchronized()



解答：C 

run方法是线程的执行体



### 481、给出下面的代码段：在代码说明//assignment x=a， y=b处写下如下哪几个代码是正确的？（ ）

```prettyprint
public class Base {

    int w，x，y，z;

    public Base(int a，int b) {
        x = a;
        y = b;
    }

    public Base(int a，int b，int c，int d){
        //assignment x=a， y=b
        w = d;
        z = c;
    }
}
```



A.Base(a， b)；

B.x=a， y=b；

C.x=a； y=b；

D.this(a，b)；



解答：CD

C是直接给x，y赋值

D是使用this调用本类中其它的构造方法



### 482、关于运算符>>和>>>描述正确的是

A.>>执行移动

B.>>执行翻转

C.>>执行有符号左移，>>>执行无符号左移

D.>>执行无符号左移，>>>执行有符号左移



解答：C



### 483、选择Java语言中的基本数据类型（多选）

A.byte

B.Integer

C.String

D.char

E.long



答案：ADE

基本数据类型总共有8个：byte，short，int，long，char，boolean，float，double





### 484、从下列选项中选择正确的Java表达式

A.int k=new String(“aa”)

B.String str=String(“bb”)

C.char c=74;

D.long j=8888;



解答：BCD



### 485、Java I/O程序设计中，下列描述正确的是

A. OutputStream用于写操作

B. InputStream用于写操作

C. I/O库不支持对文件可读可写API



解答：A

B.InputStream用于读操作

C．I/O支持对文件的读写



### 486、下述代码的执行结果是

```prettyprint
class Super {
    public int getLength() {
        return 4;
    }
}

public class Sub extends Super {
    public long getLength() {
        return 5;
    }

    public static void main(String[] args) {
        Super sooper = new Super();
        Super sub = new Sub();
        System.out.printIn(sooper.getLength() + “，” + sub.getLength();
    }
}
```

A. 4， 4 

B. 4， 5 

C. 5， 4

D. 5， 5 

E. 代码不能被编译



解答：E

方法重写返回值类型与父类的一致



### 487、Which two demonstrate a ̶has a” relationship(Choose two)?

A. public interface Person { }

public class Employee extends Person{ }

B. public interface Shape { }

public interface Rectandle extends Shape { }

C. public interface Colorable { }

public class Shape implements Colorable

{ }

D. public class Species{ }

public class Animal{private Species species;}

E. interface Component{ }

class Container implements Component{

private Component[] children;

}



解答：D

“has a”是关联关系，关联分双向关联和单向关联，双向关联是A，B类分别持有对方的引用(有是对方的属性).

单向关联是一方持另一方的引用.



### 488、Given the folowing classes which of the following will compile without error?

```prettyprint
interface IFace {}

class CFace implements IFace {}

class Base {}

public class ObRef extends Base {

    public static void main(String argv[]) {

        ObRef ob = new ObRef();

        Base b = new Base();

        Object o1 = new Object();

        IFace o2 = new CFace();

    }

}
```

A. o1=o2;

B. b=ob;

C. ob=b;

D. o1=b;



解答：B

b和ob对应的类之间没有任何关系，要想b=ob成立要么是父子关系，要么是接口实现类的关系



### 489、关于Java语言，下列描述正确的是（多选）

A. switch 不能够作用在String类型上

B. List， Set， Map都继承自Collection接口

C. Java语言支持goto语句

D. GC是垃圾收集器，程序员不用担心内存管理



解答：AD

B. Map没有继承Collection接口

C．java不支持goto语句



### 490、指出下列程序运行的结果 

```prettyprint
public class Example {
    String str = new String(̶good”);
    char[] ch = {'a'，'b'，'c'};

    public static void main(String args[]) {
        Example ex = new Example();
        ex.change(ex.str，ex.ch);
        System.out.print(ex.str + ”and̶);
        System.out.print(ex.ch);
    }
    public void change(String str，char ch[]) {
        str = ”test ok”;
        ch[] = ’g '; 
    } 
}
```

A good and abc

B good and gbc

C test ok and abc

D test ok and gbc



解答：B

数组和字符串都是引用类型。



### 491、下列描述中，哪些符合Java语言的特征

A. 支持跨平台(Windows，Linux，Unix等)

B. GC(自动垃圾回收)，提高了代码安全性

C. 支持类C的指针运算操作

D. 不支持与其它语言书写的程序进行通讯



解答：AB



### 492、关于异常(Exception)，下列描述正确的是

A. 异常的基类为Exception，所有异常都必须直接或者间接继承它

B. 异常可以用try{ . . .}catch(Exception e){ . . .}来捕获并进行处理

C. 如果某异常继承RuntimeException，则该异常可以不被声明

D. 异常可以随便处理，而不是抛给外层的程序进行处理 



解答：ABC



### 493、下面的代码实现了设计模式中的什么模式

```prettyprint
public class A {
    private A instance;
    private A() {}
    public static A getInstance {
        if (A == null) instance = new A();
        return instance;
    }
}
```

A. Factory

B. Abstract Factory

C. Singleton

D. Builder



解答：C

Singleton单例模式：该设计模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例



### 494、MAX_LENGTH 是int 型public 成员变量，变量值保持为常量1，用简短语句定义这个变量。

A.public int MAX_LENGTH=1;

B. final int MAX_LENGTH=1;

C. final public int MAX_LENGTH=1;

D. public final int MAX_LENGTH=1.



解答：D 

通过题的描述就是定义常量，在java中常量命名规范是所有字母都大写用下划线分割每个单词



### 495、

```prettyprint
String s=new String(“hello”);

String t =new String(“hello”);

char c [ ] ={‘h’，’e’，’l’，’l’，’o’};
```

下列哪些表达式返回true ?

A．s.equals(t);

B．t.equals(c);

C．s= =t ；

D．t.equals (new String(“hello”));

E．t= = c；



解答：AD 

String类的equals方法已经覆盖了Object类的equals方法，比较的是两个字符串的内容是否相等，双等号比较的是两个对象的内存地址是否相等



### 496、类 Teacher 和 Student 是类 Person 的子类;

```prettyprint
Teacher t;

Student s;

// t and s are all non-null.
if (t instanceof Person) {
    s = (Student) t;
}
```

最后一条语句的结果是:

A．将构造一个Student 对象;

B．表达式是合法的；

C．表达式是错误的；

D．编译时正确， 但运行时错误。



解答：D

instanceof是Java的一个二元操作符，它的作用是测试它左边的对象是否是它右边的类的实例，返回boolean类型的数据。

Teahcer和Student之间没有继承关系不能做强制类型转换。 



### 497、关于线程设计，下列描述正确的是

A. 线程对象必须实现Runnable接口

B. 启动一个线程直接调用线程对象的run()方法

C. Java提供对多线程同步提供语言级的支持

D. 一个线程可以包含多个进程



解答：C



### 498、欲构造ArrayList类得一个实例，此类继承了List接口，下列哪个方法是正确的：

A ArrayList myList = new Object();

B List myList = new ArrayList();

C ArraylList myList = new List();

D List myList = new List();



解答：B



### 499、关于线程设计，下列描述正确的是

A. 线程对象必须实现Runnable接口

B. 启动一个线程直接调用线程对象的run()方法

C. Java提供对多线程同步提供语言级的支持

D. 一个线程可以包含多个进程



解答：C



### 500、以下各DOS命令能够显示出本机DNS服务器地址的是：( )

A．ping -a

B．ipconfig -all

C．netstat

D．telnet



解答：DOS命令的使用

ping命令：利用它可以检查网络是否能够连通，用好它可以很好地帮助我们分析判定网络故障

ifconfig all ：显示或设置网络设备

netstat: 用于查看当前基于 NETBIOS 的 TCP/IP 连接状态，通过该工具你可以 获得远程或本地

的组名和机器名。

telnet: 使用telnet命令访问远程计算机



### 501、在使用匿名登录ftp时，用户名为( )？ (选择1项)

A、login users

B、anonymous

C、root

D、guest



解答：B



### 502、管理计算机通信的规则称为

A.协议

B.介质

C.服务

D.网络操作系统



解答：A



### 503、TCP通信建立在连接的基础上，TCP连接的建立要使用几次握手的过程。

A.2

B.3

C.4

D.5



解答:B



### 504、路由器工作在ISO/OSI参考模型的

A. 数据链路层

B.网络层

C. 传输层



解答：B

网络层属于OSI中的较高层次了，从它的名字可以看出，它解决的是网络与网络之间，即网际的通信问题，而不是同一网段内部的事。网络层的主要功能即是提供路由，即选择到达目标主机的最佳路径，并沿该路径传送数据包。除此之外，网络层还要能够消除网络拥挤，具有流量控制和拥挤控制的能力。网络边界中的路由器就工作在这个层次上，现在较高档的交换机也可直接工作在这个层次上，因此它们也提供了路由功能，俗称“第三层交换机”.



### 505、OSI体系结构定义了一个几层模型。

A.6

B.7

C.8



解答:B

OSI-RM ISO／OSI Reference Model

该模型是国际标准化组织（ISO）为网络通信制定的协议，根据网络通信的功能要求，它把通信过程分为七层，分别为物理层、数据链路层、网络层、传输层、会话层、表示层和应用层，每层都规定了完成的功能及相应的协议。



### 506、以下哪个命令用于测试网络连通。

A.telnet

B. netstat

C. ping

D. ftp



解答：C



### 507、在一个办公室内，将6台计算机用交换机连接成网络，该网络的屋里拓扑结构为

A 星型

B 总线型

C 树型

D 环型



解答：C

选项A：星型拓扑结构 是一种以中央节点为中心，把若干外围节点连接起来的辐射式互联结构。这种结构适用于局域网，特别是近年来连接的局域网大都采用这种连接方式。这种连接方式以双绞线或同轴电缆作连接线路。

优点：结构简单、容易实现、便于管理，通常以集线器（Hub）作为中央节点，便于维护和管理。缺点：中心结点是全网络的可靠瓶颈，中心结点出现故障会导致网络的瘫痪。

选项B：总线拓扑结构 是将网络中的所有设备通过相应的硬件接口直接连接到公共总线上，结点之间按广播方式通信，一个结点发出的信息，总线上的其它结点均可“收听”到。

优点：结构简单、布线容易、可靠性较高，易于扩充，节点的故障不会殃及系统，是局域网常采用的

拓扑结构。

缺点：所有的数据都需经过总线传送，总线成为整个网络的瓶颈；出现故障诊断较为困难。另外，由于信道共享，连接的节点不宜过多，总线自身的故障可以导致系统的崩溃。最著名的总线拓扑结构是以太网（Ethernet）。

选项C ：树型拓扑结构 是一种层次结构，结点按层次连结，信息交换主要在上下结点之间进行，相邻结点或同层结点之间一般不进行数据交换。

优点：连结简单，维护方便，适用于汇集信息的应用要求。

缺点：资源共享能力较低，可靠性不高，任何一个工作站或链路的故障都会影响整个网络的运行。

选项D： 环形拓扑结构 各结点通过通信线路组成闭合回路，环中数据只能单向传输，信息在每台设备上的延时时间是固定的。特别适合实时控制的局域网系统。

优点：结构简单，适合使用光纤，传输距离远，传输延迟确定。

缺点：环网中的每个结点均成为网络可靠性的瓶颈，任意结点出现故障都会造成网络瘫痪，另外故障诊断也较困难。最著名的环形拓扑结构网络是令牌环网（Token Ring）



### 508、下列既可用作输入设备又可用作输出设备的是。

A.鼠标器

B.磁盘

C.键盘

D.显示器



解答：B



### 509、计算机的电源切断之后，存储内容全部消失的存储器是。

A.软磁盘

B.只读存储器

C.硬盘

D.随机存储器



解答:D



### 510、中央处理单元（CPU）的两个主要组成部分是运算器和什么。

A.寄存器

B.主存储器

C.控制器

D.辅助存储器



解答：C

控制器:由程序计数器、指令寄存器、指令译码器、时序产生器和操作控制器组成，它是发布命令的“决策机构”，即完成协调和指挥整个计算机系统的操作。

运算器：arithmetic unit，计算机中执行各种算术和逻辑运算操作的部件。运算器由：算术逻辑单元（ALU）、累加器、状态寄存器、通用寄存器组等组成。主要功能：执行所有的算术运算；执行所有的逻辑运算，并进行逻辑测试，如零值测试或两个值的比较。



### 511、网上“黑客”是指什么样的用户。

A.匿名上网;

B.总在晚上上网;

C.在网上私闯他人计算机系统;

D.不花钱上网;



解答：C



### 512、防火墙系统的主要作用是。

A. 防止系统崩溃

B．防病毒

C．保护内部网络安全

D．预防火灾



解答：C



### 513、下列说法中哪项是错误的是。

A. 不同CPU的计算机有不同的机器语言和汇编语言；

B. 回收站是硬盘中的一块区域，而剪贴板是内存中的一块区域；

C. 在Dos中可以用的文件名在windows 98中一定可用；

D. 计算机病毒不可能会驻留在BIOS中。



解答：D

BIOS是英文”Basic Input Output System”的缩略语，直译过来后中文名称就是”基本输入输出系统”。其实，它是一组固化到计算机内主板上一个ROM芯片上的程序，它保存着计算机最重要的基本输入输出的程序、系统设置信息、开机后自检程序和系统自启动程序。 其主要功能是为计算机提供最底层的、最直接的硬件设置和控制。



### 514、用于电子邮件的协议是。

A．IP

B．TCP

C. SNMP

D．SMTP



解答：D



### 515、Java网络程序设计中，下列正确的描述是

A. Java网络编程API建立在Socket基础之上

B. Java网络接口只支持TCP以及其上层协议

C. Java网络接口只支持UDP以及其上层协议

D. Java网络接口支持IP以上的所有高层协议



解答:AD



### 516、序列图描述对象是如何交互的并且将重点放在消息序列上。

A、正确

B、不正确



解答：B

序列图主要用于按照交互发生的一系列顺序，显示对象之间的这些交互



### 517、一个XML必须有DTD或Schemas。

A、正确 

B、不正确



解答：B

DTD和Schemas都可以定义XML文档中出现的元素，这些元素出现的次序，它们如何相互 嵌套以及 XML 文档结构的其它详细信息。但不是必须的



### 518、下列哪些是J2EE的体系。

A、JSP

B、JAVA

C、Servlet

D、WebService



解答：ACD

J2EE现在更多使用的名字是Java EE JSP是JavaEE设计模式MVC中的显示部分，Servlet是控制部分，WebService是JavaEE的服务器。



### 519.在Struts中实现页面跳转主要通过什么方法来实现？

A、server.transfer

B、response.redirect

C、mapping.findForward

D、response.sendRedirect



解答：C
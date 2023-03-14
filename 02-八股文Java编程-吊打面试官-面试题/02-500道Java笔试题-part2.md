###  101、类Test1定义如下:

```prettyprint
public class Test1{//1
    public float aMethod(float a,float b){}//2 
    //3
}//4
```

将以下哪种方法插入行3是不合法的。

A.public int aMethod(int a,int b){}

B.private float aMethod(int a,int b,int c){}

C.public float aMethod(float a,float b){}

D.public float aMethod(float a,float b,float c){}



正确答案: C    

 关于方法的重载： 方法重载是指在一个类中定义多个同名的方法，但要求每个方法具有不同的参数的类型或参数的个数。调用重载方法时，Java编译器能通过检查调用的方法的参数类型和个数选择一个恰当的方法。方法重载通常用于创建完成一组任务相似但参数的类型或参数的个数不同的方法。

方法重载具体规范
 一.方法名一定要相同。
二.方法的参数表必须不同，包括参数的类型或个数，以此区分不同的方法体。
三.方法的返回类型、修饰符可以相同，也可不同。



### 102、一个文件中的数据要在控制台上显示，首先需要（ ）。

A.System.out.print (buffer[i]);

B.FileOutputStream fout = new FileOutputStream(this.filename);

C.FileInputStream fin = new FileInputStream(this.filename);。

D.System.in.read(buffer)。



正确答案: C 



### 103、若有下列定义，下列哪个表达式返回false？

```prettyprint
String s = "hello";
String t = "hello";
char c[] = {'h', 'e', 'l', 'l', 'o'} ;
```

A.s.equals(t);

B.t.equals(c);

C.s==t;

D.t.equals(new String("hello"));



正确答案: B   

Java又不是C++，什么时候字符数组等于字符串了(对这句话我不负责任)？
而常量池中的字符串，只有变量名不同是可以用双等号判断是否相等的，内存都是常量池中的字符串。
但是new出来的字符串，只能用equals，用双等号是不相等的，因为是两个内存对象。

```prettyprint
public class HelloWorld {
    public static void main(String []args) {
        String s = "hello";
        String t = "hello";
        char c[] = {'h','e','l','l','o'} ;
        System.out.println(s.equals(t));
        //c++中定义的东西，不要在java中混为一谈。(对这句话我不负责任)
        System.out.println(t.equals(c));
        System.out.println(s==t);
        System.out.println(t.equals(new String("hello")));
        //这个不相等，因为语句中new的字符串不在常量池，是在堆
        System.out.println(t==new String("hello"));
        //这样可以判断字符数组与字符串是否包含同样的字符序列
        System.out.println(t.equals(new String(c)));
    }
}
```



### 104、内部类（也叫成员内部类）可以有4种访问权限。（  ）

A.正确

B.错误



正确答案: A



### 105、如果一个接口Cow有个public方法drink()，有个类Calf实现接口Cow，则在类Calf中正确的是？  ( )

A.void drink() { …}

B.protected void drink() { …}

C.public void drink() { …}

D.以上语句都可以用在类Calf中



正确答案: C 



### 106、关于 Socket 通信编程，以下描述错误的是：（ ）

A.服务器端通过new ServerSocket()创建TCP连接对象

B.服务器端通过TCP连接对象调用accept()方法创建通信的Socket对象

C.客户端通过new Socket()方法创建通信的Socket对象

D.客户端通过new ServerSocket()创建TCP连接对象



正确答案: D  



### 107、下面哪个修饰符修饰的变量是所有同一个类生成的对象共享的（ ）

A.public

B.private

C.static

D.final



正确答案: C



### 108、关于Java中参数传递的说法，哪个是错误的？

A.在方法中，修改一个基础类型的参数不会影响原始参数值

B.在方法中，改变一个对象参数的引用不会影响到原始引用

C.在方法中，修改一个对象的属性会影响原始对象参数

D.在方法中，修改集合和Maps的元素不会影响原始集合参数



正确答案: D 



### 109、关于访问权限说法正确 的是 ？ ( )

A.外部类前面可以修饰public,protected和private

B.成员内部类前面可以修饰public,protected和private

C.局部内部类前面可以修饰public,protected和private

D.以上说法都不正确



正确答案: B



### 110、关于ASCII码和ANSI码，以下说法不正确的是（）

A.标准ASCII只使用7个bit

B.在简体中文的Windows系统中，ANSI就是GB2312

C.ASCII码是ANSI码的子集

D.ASCII码都是可打印字符



正确答案: D 




111、下面代码输出结果是？

```prettyprint
class C {
    C() {
        System.out.print("C");
    }
}

class A {
    C c = new C();

    A() {
        this("A");
        System.out.print("A");
    }

    A(String s) {
        System.out.print(s);
    }

}

class Test extends A {
    Test() {
        super("B");
        System.out.print("B");
    }

    public static void main(String[] args) {
        new Test();
    }
}
```

A.BB

B.CBB

C.BAB

D.None of the above



正确答案: B            

 初始化过程是这样的： 
1.首先，初始化父类中的静态成员变量和静态代码块，按照在程序中出现的顺序初始化； 
2.然后，初始化子类中的静态成员变量和静态代码块，按照在程序中出现的顺序初始化； 
3.其次，初始化父类的普通成员变量和代码块，在执行父类的构造方法；
4.最后，初始化子类的普通成员变量和代码块，在执行子类的构造方法； 
（1）初始化父类的普通成员变量和代码块，执行 C c = new C(); 输出C 
（2）super("B"); 表示调用父类的构造方法，不调用父类的无参构造函数，输出B 
（3） System.out.print("B"); 
 所以输出CBB



### 112、以下程序段执行后将有（）个字节被写入到文件afile.txt中。

```prettyprint
try {
    FileOutputStream fos = new FileOutputStream("afile.txt");
    DataOutputStream dos = new DataOutputStream(fos);
    dos.writeInt(3);
    dos.writeChar(1);
    dos.close();
    fos.close();
} catch (IOException e) {}
```

A.3

B.5

C.6

D.不确定，与软硬件环境相关



正确答案: C  



### 113、已知 boolean result = false，则下面哪个选项是合法的：

A.result=1

B.result=true;

C.if(result!=0) {//so something…}

D.if(result) {//do something…}



正确答案: B D



### 114、下面哪些类实现或继承了 Collection 接口？

A.HashMap

B.ArrayList

C.Vector

D.Iterator



正确答案: B C



### 115、ArrayLists和LinkedList的区别，下述说法正确的有？

A.ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。

B.对于随机访问get和set，ArrayList绝对优于LinkedList，因为LinkedList要迭代器。

C.对于新增和删除操作add和remove，LinkedList比较占优势，因为ArrayList要移动数据。

D.ArrayList的空间浪费主要体现在在list列表的结尾预留一定的容量空间，而LinkedList的空间花费则体现在它的每一个元素都需要消耗相当的空间。



正确答案: A B C D



### 116、以下说法中正确的有？

A.StringBuilder是 线程不安全的

B.Java类可以同时用 abstract和final声明

C.HashMap中，使用 get(key)==null可以 判断这个Hasmap是否包含这个key

D.volatile关键字不保证对变量操作的原子性



正确答案: A D



### 117、String s=null;下面哪个代码片段可能会抛出NullPointerException？

A.if((s!=null)&(s.length()>0))

B.if((s!=null)&&(s.length()>0))

C.if((s==null)|(s.length()==0))

D.if((s==null)||(s.length()==0))



正确答案: A C      

 s为null，因此只要调用了s.length()都会抛出空指针异常。因此这个题目就是考察if语句的后半部分会不会执行。
A，单个与操作的符号& 用在整数上是按位与，用在布尔型变量上跟&&功能类似，但是区别是无论前面是否为真，后面必定执行，因此抛出异常
B，与操作，前半部分判断为假，后面不再执行
C，这里跟 & 和&& 的区别类似，后面必定执行，因此抛出异常
D，或语句，前面为真，整个结果必定为真，后面不执行



### 118、关于Java中的数组，下面的一些描述，哪些描述是准确的：（    ）

A.数组是一个对象，不同类型的数组具有不同的类

B.数组长度是可以动态调整的

C.数组是一个连续的存储结构

D.一个固定长度的数组可类似这样定义: int array[100]

E.两个数组用equals方法比较时，会逐个遍历其中的元素，对每个元素进行比较

F.可以二维数组，且可以有多维数组，都是在Java中合法的



正确答案: A C F      

当数组的初始化完成后数组在内存中所占用的空间将会被固定，即使我们清空这个数组中的元素，它所占用的空间依然会被保留。这造成了Java数组长度的不可变，选项B错误。

Java语言中，数组是一种引用类型的变量，使用它定义变量时，这个引用变量还没有指向任何有效的内存空间，因此定义数组时不能指定数组的长度。而由于这个引用变量并没有指向任何有效的内存空间，所以没有空间来存储任何元素，只有当对数组初始化后，才可以使用这个数组。D选项正确的定义方式为int[] array =new int[100]。

本题易错点是E选项，数组是一种引用数据类型，继承自Object类的，所以其中也包含了未被重写的equals()方法，所有的引用变量都能调用equals()方法来判断他是否与其他引用变量相等，使用这个方法来判断两个引用对象是否相等的判断标准与使用==运算符没有区别，只有在两个引用变量指向同一个对象才会返回true。如果想达到E选项描述的效果，需要使用Arrays.equals()方法。



### 119、Hashtable 和 HashMap 的区别是：  

A.Hashtable 是一个哈希表，该类继承了 AbstractMap，实现了 Map 接口

B.HashMap 是内部基于哈希表实现，该类继承AbstractMap，实现Map接口

C.Hashtable 线程安全的，而 HashMap 是线程不安全的

D.Properties 类 继承了 Hashtable 类，而 Hashtable 类则继承Dictionary 类

E.HashMap允许将 null 作为一个 entry 的 key 或者 value，而 Hashtable 不允许。



正确答案: B 

C D E     Hashtable：
（1）Hashtable 是一个散列表，它存储的内容是键值对(key-value)映射。
（2）Hashtable 的函数都是同步的，这意味着它是线程安全的。它的key、value都不可以为null。
（3）HashTable直接使用对象的hashCode。
HashMap：
（1）由数组+链表组成的，基于哈希表的Map实现，数组是HashMap的主体，链表则是主要为了解决哈希冲突而存在的。
（2）不是线程安全的，HashMap可以接受为null的键(key)和值(value)。
（3）HashMap重新计算hash值      
Hashtable,HashMap,Properties继承关系如下：

```prettyprint
public class Hashtable<K,V> extends Dictionary<K,V>
    implements Map<K,V>, Cloneable, java.io.Serializable

public class HashMap<K,V>extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
java.lang.Objecct
  java.util.Dictionary<K,V>
    java.util.Hashtable<Object,Object>
      java.util.Properties 
```



### 120、下列哪些方法是针对循环优化进行的

A.强度削弱

B.删除归纳变量

C.删除多余运算

D.代码外提



正确答案: A B D  



### 121、下列关于继承的哪项叙述是正确的？

A.在java中类允许多继承

B.在java中一个类只能实现一个接口

C.在java中一个类不能同时继承一个类和实现一个接口

D.java的单一继承使代码更可靠



正确答案: D        

 java为单继承，但可以实现多个接口



### 122、 在Java中，一个类可同时定义许多同名的方法，这些方法的形式参数个数、类型或顺序各不相同，传回的值也可以不相同。这种面向对象程序的特性称为

A.隐藏

B.覆盖

C.重载

D.Java不支持此特性



正确答案: C 



### 123、为Test类的一个无形式参数无返回值的方法method书写方法头，使得使用类名Test作为前缀就可以调用它，该方法头的形式为( )

A.static  void  method（）

B.public void  method

C.protected  void  method（）

D.abstract  void method（）



正确答案: A 



### 124、设A为已知定义的类名，下列创建A类的对象a的语句正确的是( )

A.float  A  a

B.public  a=A（）

C.A a=new  int ()

D.A  a=new  A()



正确答案: D  



### 125、以下语句输出的结果是（）

```prettyprint
int value;
value=2;
System.out.print(value);
System.out.print(value++);
System.out.print(value);
```

A.233

B.223

C.221

D.222



正确答案: B 



### 126、以下类定义中的错误是什么？（）

```prettyprint
abstract class xy{
    abstract sum (int x, int y) { }
}
```


A.没有错误

B.类标题未正确定义

C.方法没有正确定义

D.没有定义构造函数



正确答案: C




127、有以下代码:

```prettyprint
class A{
    public A(String str){
    }
}
public class Test{
    public static void main(String[] args) {
        A classa=new A("he");
        A classb=new A("he");
        System.out.println(classa==classb);
    }
}
```

请问输出的结果是:

A.false

B.true

C.报错

D.以上选项都不正确



正确答案: A 



### 128、为了将包ch4导入到当前程序，可以使用的语句是（）

A.import ch4.*;

B.package ch4.*;

C.ch4 import;

D.ch4 package;



正确答案: A 



### 129、abstract和final可以同时作为一个类的修饰符。（  ）

A.正确

B.错误



正确答案: B 



### 130、下面论述正确的是（）？

A.如果两个对象的hashcode相同，那么它们作为同一个HashMap的key时，必然返回同样的值

B.如果a,b的hashcode相同，那么a.equals(b)必须返回true

C.对于一个类，其所有对象的hashcode必须不同

D.如果a.equals(b)返回true，那么a,b两个对象的hashcode必须相同



正确答案: D         

hashCode方法本质就是一个哈希函数，这是Object类的作者说明的。Object类的作者在注释的最后一段的括号中写道：将对象的地址值映射为integer类型的哈希值。但hashCode()并不完全可靠的，有时候不同的对象他们生成的hashcode也会一样，因此hashCode()只能说是大部分时候可靠。
因此我们也需要重写equals()方法，但因为重写的equals()比较全面比较复杂，会造成程序效率低下，而利用hashCode()进行对比，则只要生成一个hash值进行比较就可以了，效率很高。因此，正常的操作流程是先用hashCode()去对比两个对象，如果hashCode()不一样，则表示这两个对象肯定不相等，直接返回false,如果hashCode()相同，再对比他们的equals()。
综上所述：
equals()相等的两个对象hashCode()一定相等。
hashCode()相等的两个对象equal()不一定相等。
因此选项D正确。



### 131、类A1和类A2在同一包中，类A2有个protected的方法testA2，类A1不是类A2的子类（或子类的子类），类A1可以访问类A2的方法testA2。（  ）

A.正确

B.错误



正确答案: A 



### 132、如果一个接口Cow有个public方法drink()，有个类Calf实现接口Cow，则在类Calf中正确的是？  ( )

A.void drink() { …}

B.protected void drink() { …}

C.public void drink() { …}

D.以上语句都可以用在类Calf中



正确答案: C  



### 133、instanceof运算符能够用来判断一个对象是否为:

A.一个类的实例

B.一个实现指定接口的类的实例

C.全部正确

D.一个子类的实例



正确答案: C 



### 134、关于以下代码的说明，正确的是（ ）

```prettyprint
class StaticStuff{
    static int x=10;
    static {
        x+=5;
    }
    public static void main（String args[ ]）{
        System.out.println(“x=” + x);
    }
    static { x/=3;}
}
```

A.3行与9行不能通过编译，因为缺少方法名和返回类型

B.9行不能通过编译，因为只能有一个静态初始化器

C.编译通过，执行结果为：x=5

D.编译通过，执行结果为：x=3



正确答案: C 



### 135、Java 中，以下不是修饰符 final 作用的是( )。

A.修饰常量

B.修饰不可被继承的类

C.修饰不可变类

D.修饰不可覆盖的方法



正确答案: C



### 136、以下是java concurrent包下的4个类，选出差别最大的一个

A.Semaphone

B.ReentrantLock

C.Future

D.CountDownLatch



正确答案: C  



### 137、ArrayList和Vector主要区别是什么？

A.Vector与ArrayList一样，也是通过数组实现的，不同的是Vector支持线程的同步

B.Vector与ArrayList一样，也是通过数组实现的，不同的是ArrayList支持线程的同步

C.Vector是通过链表结构存储数据，ArrayList是通过数组存储数据

D.上述说法都不正确



正确答案: A         

Vector支持线程的同步，也就是内部加锁的
但是效率低，因此在新版jdk中加入线程不安全的Arraylist



### 138、下列哪种异常是检查型异常，需要在编写程序时声明？

A.NullPointerException

B.ClassCastException

C.FileNotFoundException

D.IndexOutOfBoundsException



正确答案: C        

 java中的异常通常分为编译时异常和运行异常。编译时异常需要我们手动的进行捕捉处理，也就是我们用try....catch块进行捕捉处理。对于运行时异常只有在编译器在编译运行时才会出现，这些不需要我们手动进行处理。对于A、 B、 D来说都是运行时异常，因此答案为C



### 139、下面代码运行结果是？

```prettyprint
public class Test{
    static boolean foo(char c){
        System.out.print(c);
        return true;
    }

    public static void main( String[] argv ){
        int i = 0;
        for ( foo('A'); foo('B') && (i < 2); foo('C')){
            i++ ;
            foo('D');
        }
    }
}
```

A.ABDCBDCB

B.ABCDABCD

C.Compilation fails.

D.An exception is thrown at runtime.



正确答案: A           

```prettyprint
for(条件1;条件2;条件3) {
    //语句
}
```

执行顺序是条件1->条件2->语句->条件3->条件2->语句->条件3->条件2........
如果条件2为true，则一直执行。如果条件2位false，则for循环结束



### 140、关于下面的程序，说法正确的是：

1. ```prettyprint
   1. class StaticStuff
   2. {
   3. static int x = 10;
   4.
   5. static { x += 5; }
   6.
   7. public static void main(String args[])
   8. {
   9. System.out.println(“x = ” + StaticStuff .x);
   10. }
   11. static
   12. {x /= 3; }
   13.}
   ```

   


A.第5行和12行不能编译，因为该方法没有方法名和返回值。

B.第12 行不能编译，因为只能有一个static初始化块。

C.代码编译并执行，输出结果x = 10.

D.代码编译并执行，输出结果 x = 5.

E.代码编译并执行，输出结果 x = 15.



正确答案: D             

考察的是代码执行的顺序。
第5、12行属于static修饰的静态代码块。所以A、B说法错误。
静态代码块以及静态变量自上而下的顺序依次随着类加载而执行，所以依据题目的变量初始化：
x初始为10
x+5赋值x，结果为15
x/3赋值给x，结果为5



### 141、以下哪个类包含方法flush()？（）

A.InputStream

B.OutputStream

C.A 和B 选项都包含

D.A  和B 选项都不包含



正确答案: B   



### 142、URL u =new URL("http://www.123.com");。如果www.123.com不存在，则返回______。

A.http://www.123.com

B.””

C.null

D.抛出异常



正确答案: A  



### 143、一般有两种用于创建线程的方法,一是(),二是()。

A.从Java.lang.Thread类派生一个新的线程类，重写它的runnable()方法

B.从Java.lang.Thread类派生一个新的线程类，重写它的run()方法

C.实现Thread接口，重写Thread接口中的run()方法

D.实现Runnable接口，重写Runnable接口中的run()方法



正确答案: B D       

创建线程对象两种方式：
1.继承Thread类，重载run方法；
2.实现Runnable接口，实现run方法 



### 144、对于jdk1.8,以下为 java 语法保留不能作为类名和方法名使用的是

A.default

B.int

C.implements

D.throws



正确答案: A B C D  



### 145、Java多线程有几种实现方法？

A.继承Thread类

B.实现Runnable接口

C.实现Thread接口

D.以上都不正确



正确答案: A B               

两种。
1、继承Thread类，Override它的run方法；
2、实现Runnable接口，实现run方法；
由于Java只有单继承，所以，第一种方法只能继承一个Thread；第二种则可以实现多继承。



### 146、Java1.8版本之前的前提，Java特性中,abstract class和interface有什么区别（）

A.抽象类可以有构造方法，接口中不能有构造方法

B.抽象类中可以有普通成员变量，接口中没有普通成员变量

C.抽象类中不可以包含静态方法，接口中可以包含静态方法

D.一个类可以实现多个接口，但只能继承一个抽象类。



正确答案: A B D 



### 147、在JAVA中，下列哪些是Object类的方法（）

A.synchronized()

B.wait()

C.notify()

D.notifyAll()

E.sleep()



正确答案: B C D           

 A    synchronized     Java语言的关键字，当它用来修饰一个方法或者一个代码块的时候，能够保证在同一时刻最多只有一个线程执行该段代码。
B C D 都是Object类中的方法    
notify():  是唤醒一个正在等待该对象的线程。  
notifyAll(): 唤醒所有正在等待该对象的线程。
E sleep 是Thread类中的方法
wait 和 sleep的区别：
wait指线程处于进入等待状态，形象地说明为“等待使用CPU”，此时线程不占用任何资源，不增加时间限制。
sleep指线程被调用时，占着CPU不工作，形象地说明为“占着CPU睡觉”，此时，系统的CPU部分资源被占用，其他线程无法进入，会增加时间限制。



### 148、以下那些代码段能正确执行

A

```prettyprint
public static void main(String args[]) {
    byte a = 3;
    byte b = 2;
    b = a + b;
    System.out.println(b);
}
```

B.

```prettyprint
public static void main(String args[]) {
    byte a = 127;
    byte b = 126;
    b = a + b;
    System.out.println(b);
}
```

C.

```prettyprint
public static void main(String args[]) {
    byte a = 3;
    byte b = 2;
    a+=b;
    System.out.println(b);
}
```

D.

```prettyprint
public static void main(String args[]) {
    byte a = 127;
    byte b = 127;
    a+=b;
    System.out.println(b);
}
```

正确答案: C D 



### 149、下面HttpServletResponse方法调用，那些给客户端回应了一个定制的HTTP回应头：(          )

A.response.setHeader("X-MyHeader", "34");

B.response.addHeader("X-MyHeader", "34");

C.response.setHeader(new HttpHeader("X-MyHeader", "34"));

D.response.addHeader(new HttpHeader("X-MyHeader", "34"));

E.response.addHeader(new ServletHeader("X-MyHeader", "34"));

F.response.setHeader(new ServletHeader("X-MyHeader", "34"));



正确答案: A B 



### 150、java中 String str = "hello world"下列语句错误的是？

A.str+='      a'

B.int strlen = str.length

C.str=100

D.str=str+100



正确答案: A B C



### 151、编译 Java 源程序文件产生的字节码文件的扩展名为（）

A.java

B.class

C.html

D.exe



正确答案: B



### 152、Java Application 中的主类需包含main方法，以下哪项是main方法的正确形参？（    ）

A.String  args

B.String[] args

C.Char  arg

D.StringBuffer[] args



正确答案: B  



### 153、关于Java语言的内存回收机制，下列选项中最正确的一项是

A.Java程序要求用户必须手工创建一个线程来释放内存

B.Java程序允许用户使用指针来释放内存

C.内存回收线程负责释放无用内存

D.内存回收线程不能释放内存对象



正确答案: C

A，java的内存回收是自动的，Gc在后台运行，不需要用户手动操作
B，java中不允许使用指针
D，内存回收线程可以释放无用的对象内存



### 154、下面语句正确的是（）

A.x+1=5

B.i++=1

C.a++b=1

D.x+=1



正确答案: D  



### 155、下面关于 new 关键字的表述错误的是（）

A.new关键字在生成一个对象时会为对象开辟内存空间

B.new关键字在生成一个对象时会调用类的构造方法

C.new关键字在生成一个对象时会将生成的对象的地址返回

D.Java中只能通过new关键字来生成一个对象



正确答案: D  



### 156、如果类的方法没有返回值，该方法的返回值类型应当是abstract。（）

A.正确

B.错误



正确答案: B            

如果类的方法没有返回值，该方法的返回值类型应当是void。
被abstract修饰的类是抽象类，抽象类不能被实例化，但是可以被继承，也可以继承。



### 157、定义一个 接口 必须使用的关键字是 ？ （ ）

A.public

B.class

C.interface

D.static



正确答案: C



### 158、以下（）不是合法的标识符？

A.STRING

B.x3x

C.void

D.deSf



正确答案: C         

void属于java中的关键字
[1]Java标识符只能由数字、字母、下划线“_”或“$”符号以及Unicode字符集组成
[2]Java标识符必须以字母、下划线“_”或“$”符号以及Unicode字符集开头
[3]Java标识符不可以是Java关键字、保留字（const、goto）和字面量（true、false、null）
[4]Java标识符区分大小写，是大小写敏感的



### 159、一个类可以有多个不同名的构造函数 （不考虑内部类的情况）。（ ）

A.正确

B.错误



正确答案: B



### 160、以下代码的循环次数是

```prettyprint
public class Test {
    public static void main(String args[]) {
        int i = 7;
        do {
            System.out.println(--i);
            --i;
        } while (i != 0);
        System.out.println(i);
    }
}
```

A.0

B.1

C.7

D.无限次



正确答案: D



### 161、下列哪个类的声明是正确的？

A.abstract final class HI{}

B.abstract private move(){}

C.protected private number;

D.public abstract class Car



正确答案: D                      

A只能有final和abstract的一个，因为final是最终类，不能继承，必须可以创建实例，而abstract是抽象类，只能继承，不有实例。冲突了，所以不对。
B是抽象方法，不能有方法体。所以末尾不是{}而是；才对
C中 访问修饰符只能有一个，而且对象没有类型。
D正确，这是抽象类。



### 162、如果int x=20, y=5，则语句System.out.println(x+y +""+(x+y)+y);  的输出结果是（）

A.2530

B.55

C.2052055

D.25255



正确答案: D 



### 163、指出下列程序运行的结果：

```prettyprint
public class Example{
    String str=new String("tarena");
    char[]ch={'a','b','c'};
    public static void main(String args[]){
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
        //引用类型变量，传递的是地址，属于引用传递。
        str="test ok";
        ch[0]='g';
    }
}
```

A.tarena and abc

B.tarena and gbc

C.test ok and abc

D.test ok and gbc



正确答案: B



### 164、java中将ISO8859-1字符串转成GB2312编码，语句为 ？  

A.new String("字符串".getBytes("ISO8859-1"),"GB2312")

B.new String(String.getBytes("GB2312"）, ISO8859-1)

C.new String(String.getBytes("ISO8859-1"))

D.new String(String.getBytes("GB2312"))



正确答案: A 



### 165、假设 A 类有如下定义，设 a 是 A 类同一个包下的一个实例，下列语句调用哪个是正确的？

```prettyprint
class A{
    int  i;

    static  String  s;

    void  method1() {   }

    static  void  method2()  {   }
}
```

A.System.out.println(a.i)；

B.a.method1();

C.A.method1();

D.A.method2()



正确答案: C  

 

### 166、下列代码的执行结果是（）

```prettyprint
public class Test {
    public static int a = 1;
    public static void main(String[] args) {
        int a = 10;
        a++; Test.a++;
        Test t=new Test();
        System.out.println("a=" + a + " t.a=" + t.a);
    }
}
```

A.a=10 t.a=3

B.a=11 t.a=2

C.a=12 t.a=1

D.a=11 t.a=1



正确答案: B



### 167、语句：char foo='中'，是否正确？（假设源文件以GB2312编码存储，并且以javac – encoding GB2312命令编译）

A.正确

B.错误



正确答案: A 



### 168、JDK1.8版本之前，抽象类和接口的区别，以下说法错误的是

A.接口是公开的，里面不能有私有的方法或变量，是用于让别人使用的，而抽象类是可以有私有方法或私有变量的。

B.abstract class 在 Java 语言中表示的是一种继承关系，一个类只能使用一次继承关系。但是，一个类却可以实现多个interface，实现多重继承。接口还有标识（里面没有任何方法，如Remote接口）和数据共享（里面的变量全是常量）的作用。

C.在abstract class中可以有自己的数据成员，也可以有非abstarct的成员方法，而在interface中，只能够有静态的不能被修改的数据成员（也就是必须是 static final的，不过在 interface中一般不定义数据成员），所有的成员方法默认都是 public abstract 类型的。

D.abstract class和interface所反映出的设计理念不同。其实abstract class表示的是"has-a"关系，interface表示的是"is-a"关系。



正确答案: D   



### 169、设有下面两个赋值语句：

a = Integer.parseInt("1024");

b = Integer.valueOf("1024").intValue();

下述说法正确的是（）

A.a是整数类型变量，b是整数类对象。

B.a是整数类对象，b是整数类型变量。

C.a和b都是整数类对象并且它们的值相等。

D.a和b都是整数类型变量并且它们的值相等。



正确答案: D  



### 170、下面代码输出是？

```prettyprint
double d1=-0.5;
System.out.println("Ceil d1="+Math.ceil(d1));
System.out.println("floor d1="+Math.floor(d1));
```


A.Ceil d1=-0.0
floor d1=-1.0

B.Ceil d1=0.0
floor d1=-1.0

C.Ceil d1=-0.0
floor d1=-0.0

D.Ceil d1=0.0
floor d1=0.0

E.Ceil d1=0
floor d1=-1



正确答案: A        

ceil：大于等于 x，并且与它最接近的整数。
floor：小于等于 x，且与 x 最接近的整数。



### 171、以下哪些语言是面向对象的是（）

A.C

B.C++

C.JAVA

D.汇编



正确答案: B C  



### 172、有关线程的哪些叙述是对的（）

A.一旦一个线程被创建，它就立即开始运行。

B.使用start()方法可以使一个线程成为可运行的，但是它不一定立即开始运行。

C.当一个线程因为抢先机制而停止运行，它可能被放在可运行队列的前面。

D.一个线程可能因为不同的原因停止并进入就绪状态。



正确答案: B C D



### 173、java中Hashtable, Vector, TreeSet, LinkedList哪些线程是安全的？

A.Hashtable

B.Vector

C.TreeSet

D.LinkedList



正确答案: A B               

HashTable是线程安全的
Vector是线程安全的ArrayList
TreeSet和LinkedList都不是线程安全的



### 174、以下选项中，switch语句判断条件可以接受的数据类型有哪些？（多选）

A.int

B.byte

C.char

D.short



正确答案: A B C D 



### 175、以下关于final关键字说法错误的是（）

A.final是java中的修饰符，可以修饰类、接口、抽象类、方法和属性

B.final修饰的类肯定不能被继承

C.final修饰的方法不能被重载

D.final修饰的变量不允许被再次赋值



正确答案: A C             

被final关键字修饰的类不能被继承，但抽象类存在的意义在于被其它类继承然后实现其内部方法的，这样final和抽象类之间就产生了矛盾。因此，final并不能修饰抽象类，选项A错误，选项B正确。
C选项，重载的实现是编译器根据函数的不同的参数表，对同名函数的名称做修饰，那么对于编译器而言，这些同名函数就成了不同的函数。但重写则是子类方法对父类的方法的延申，即子类不仅继承了父类的方法，还向父类的方法中添加了属于自己的内容，改变了父类方法原本的内容，而final代表了一种不可变，这明显与重写形成了冲突。因此被final修饰的类可以被重载但不能被重写，选项C错误。
当final用来修饰变量时，代表该变量不可被改变，一旦获得了初始值，该final变量就不能被重新赋值，选项D正确。故答案为AC。



### 176、ArrayLists和LinkedList的区别，下述说法正确的有？

A.ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。

B.对于随机访问get和set，ArrayList绝对优于LinkedList，因为LinkedList要迭代器。

C.对于新增和删除操作add和remove，LinkedList比较占优势，因为ArrayList要移动数据。

D.ArrayList的空间浪费主要体现在在list列表的结尾预留一定的容量空间，而LinkedList的空间花费则体现在它的每一个元素都需要消耗相当的空间。



正确答案: A B C D  



### 177、下列可作为java语言标识符的是（）

A.a1

B.$1

C._1

D.11



正确答案: A B C   



### 178、在Java中下面Class的声明哪些是错误的？

A.

```prettyprint
public abstract final class Test {
    abstract void method();
}
```

B

```prettyprint
public abstract class Test {
    abstract final void method();
}
```

C.

```prettyprint
public abstract class Test {
    abstract void method() {
    }
}
```

D.

```prettyprint
public class Test {
    final void method() {
    }
}
```

正确答案: A B C



### 179、下列哪些方法是针对循环优化进行的

A.强度削弱

B.删除归纳变量

C.删除多余运算

D.代码外提



正确答案: A B D 



### 180、执行如下程序代码

```prettyprint
char chr = 127;
int sum = 200;
chr += 1;
sum += chr;
```


后，sum的值是（）
备注：同时考虑c/c++和Java的情况的话

A.72

B.99

C.328

D.327



正确答案: A C   



### 181、区分类中重载方法的依据是(    )。

A.不同的形参名称

B.不同的返回值类型

C.不同的形参列表

D.不同的访问权限



正确答案: C



### 182、以下不属于构造方法特征的是（）

A.构造方法名与类名相同

B.构造方法不返回任何值，也没有返回类型

C.构造方法在创建对象时调用，其他地方不能显式地直接调用

D.每一个类只能有一个构造方法



正确答案: D            

 选项描述错误，一个类可以有多个构造方法，形成重载关系。



### 183、类声明中，声明抽象类的关键字是 ( )

A.public

B.abstract

C.final

D.class



正确答案: B         

public 共有类，可以在包外使用，此时，源文件名必须和类名相同。
abstract 抽象类，抽象类位于继承树的抽象层，抽象类不能被实例化。
final  不能被继承，没有子类，final类中的方法默认是final的。
class 只能在包内使用的类



### 184、代码String str=”123456a”；int i=Integer.parseInt(str);会报异常的是（）

A.java.lang.NullPoninterException

B.java.lang.NumberFormatException

C.java.lang.RuntimeException

D.java.lang.ArrayindexOutOfBoundsException



正确答案: B 



### 185、final方法等同于private方法。（  ）

A.正确

B.错误



正确答案: B 



### 186、下列关于修饰符混用的说法，错误的是( )

A.abstract不能与final并列修饰同一个类

B.abstract 类中不建议有private的成员

C.abstract 方法必须在abstract类或接口中

D.static方法中能直接处理非static的属性



正确答案: D

  

### 187、有以下程序片段，下列哪个选项不能插入到第一行 。（ ）。

```prettyprint
1.

2.public  class  A{

3.//do sth

4.}
```

A.public class  MainClass{ }

B.package  mine;

C.class ANotherClass{   }

D.import  java.util.*;



正确答案: A 



### 188、下面哪个不是Java基本类型？

A.short

B.Boolean

C.byte

D.float



正确答案: B       

 java规定类名首字母必须大写，这里可以直观的看出来Boolean是一个引用类型，不是基本数据类型。
java中的基本数据类型都对应一个引用类型，如Float是float的引用类型，Integer是int的引用类型



### 189、分析以下代码，说法正确的是（）

```prettyprint
public static void main(String[] args) {
    System.out.println(val());
}

public static int val() {
    int num = 5;
    try {
        num = num / 0;
    } catch (Exception e) {
        num = 10;
    } finally {
        num = 15;
    }
    return num;
}
```


A.运行时报错

B.程序正常运行，输出值为5

C.程序正常运行，输出值为10

D.程序正常运行，输出值为15



正确答案: D



### 190、类 ABC 定义如下：

```prettyprint
1 ． public  class  ABC{

2 ． public  int  max( int  a, int  b) {   }

3 ．

4 ． }
```

将以下哪个方法插入行 3 是不合法的。（ ）

A.public  float  max(float  a, float  b, float  c){  }

B.public  int  max (int  c,  int  d){  }

C.public  float  max(float  a,  float  b){  }

D.private  int  max(int a, int b, int c){  }



正确答案: B



### 191、下列叙述错误的是（ ）

A.在接口中定义的方法除了default和static关键字修饰的方法拥有方法体，其他方法都应是没有方法体的抽象方法（JDK1.8以后）

B.一个java类只能有一个父类,但可以实现多个接口

C.在类声明中,用implements关键字声明该类实现的接口

D.定义接口时使用implements关键字。



正确答案: D   



### 192、下列哪种异常是检查型异常，需要在编写程序时声明？

A.NullPointerException

B.ClassCastException

C.FileNotFoundException

D.IndexOutOfBoundsException



正确答案: C         

java中的异常通常分为编译时异常和运行异常。编译时异常需要我们手动的进行捕捉处理，也就是我们用try....catch块进行捕捉处理。对于运行时异常只有在编译器在编译运行时才会出现，这些不需要我们手动进行处理。对于A、 B、 D来说都是运行时异常，因此答案为C



### 193、下列循环语句序列执行完成后，i的值是（）

```prettyprint
int i;
for(i=2;i<=10;i++){
    System.out.println(i);
}
```

A.2

B.10

C.11

D.不确定 



正确答案: C   



### 194、以下程序的运行结果是？

```prettyprint
public class TestThread{
    public static void main(String args[]){
        Runnable runner = new Runnable(){
            @Override
            public void run(){
                System.out.print("foo");
            }
        };
        Thread t = new Thread(runner);
        t.run();
        System.out.print("bar");
    }
}
```

A.foobar

B.barfoo

C.foobar或者barfoo都有可能

D.Bar

E.Foo

F.程序无法正常运行



正确答案: A 



### 195、有如下代码：请写出程序的输出结果。

```prettyprint
public class Test{
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        int k = 0;
        for (int z = 0; z < 5; z++) {
            if ((++x > 2) && (++y > 2) && (k++ > 2)) {
                x++;
                ++y;
                k++;
            }
        }
        System.out.println(x + ”” +y + ”” +k);
    }
}
```

A.432

B.531

C.421

D.523



正确答案: B   

每次循环z,x,y,k对应数值为：
0,1,0,0
1,2,0,0
2,3,1,0
3,4,2,0
4,5,3,1
执行完这次以后，z++为5，不再进入for循环。



### 196、以下程序运行的结果为 (   )

```prettyprint
public class Example extends Thread {   
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("run");
    }

    public static void main(String[] args) {

        Example example = new Example();
        example.run();
        System.out.print("main");
    }
    
}
```


A.run main

B.main run

C.main 

D.run

E.不能确定



正确答案: A    

此题的争议点只可能是runmain或mainrun
因为Example的run方法里面休眠了100ms，在当今电脑计算性能过剩的时代，如果是多线程启动，main方法肯定会打印出了main。
为啥是runmain而不是mainrun呢？
因为启动线程是调用start方法。
把线程的run方法当普通方法，就直接用实例.run()执行就好了。
没有看到start。所以是普通方法调用。
所以选A。



### 197、JVM内存不包含如下哪个部分( )

A.Stacks

B.PC寄存器

C.Heap

D.Heap Frame



正确答案: D 



### 198、若有下列定义，下列哪个表达式返回false？

```prettyprint
String s = "hello";
String t = "hello";
char c[] = {'h', 'e', 'l', 'l', 'o'} ;
```

A.s.equals(t);

B.t.equals(c);

C.s==t;

D.t.equals(new String("hello"));



正确答案: B  



### 199、下面有关jdbc statement的说法错误的是？

A.JDBC提供了Statement、PreparedStatement 和 CallableStatement三种方式来执行查询语句，其中 Statement 用于通用查询， PreparedStatement 用于执行参数化查询，而 CallableStatement则是用于存储过程

B.对于PreparedStatement来说，数据库可以使用已经编译过及定义好的执行计划，由于 PreparedStatement 对象已预编译过，所以其执行速度要快于 Statement 对象”

C.PreparedStatement中，“?” 叫做占位符，一个占位符可以有一个或者多个值

D.PreparedStatement可以阻止常见的SQL注入式攻击



正确答案: C



### 200、下面关于垃圾收集的说法正确的是

A.一旦一个对象成为垃圾，就立刻被收集掉。

B.对象空间被收集掉之后，会执行该对象的finalize方法

C.finalize方法和C++的析构函数是完全一回事情

D.一个对象成为垃圾是因为不再有引用指着它，但是线程并非如此



正确答案: D
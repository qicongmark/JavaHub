### 1、关于finally,下面哪个描述正确? （）

A.在catch块之前但在try块之后执行finally块

B.finally块会被执行无论是否抛出异常

C.只有在执行catch块之后才执行finally块

D.都不是



正确答案: B 



### 2、现有一变量声明为 boolean aa; 下面赋值语句中正确的是（ ）

A.aa=false;

B.aa=False;

C.aa="true";

D.aa=0;



正确答案: A   



### 3、覆盖（重写）与重载的关系是（）

A.覆盖（重写）只有出现在父类与子类之间，而重载可以出现在同一个类中

B.覆盖（重写）方法可以有不同的方法名，而重载方法必须是相同的方法名

C.final修饰的方法可以被覆盖（重写），但不能被重载

D.覆盖（重写）与重载是同一回事



正确答案: A  



### 4、下列语句序列执行后，输出结果是（）

```prettyprint
public class ex {
    public static void main(String[] args) {
        int a = 13;
        a = a / 5；
        System.out.println(a);
    }
}
```

A.1

B.2

C.3

D.4



正确答案: B



### 5、Java Applet在被浏览器加载的时候首先被执行且在applet整个生命周期中被运行一次的方法是（）

A.init（）

B.stop（）

C.opreationcrawl()

D.reader()



正确答案: A   



### 6、对抽象类的描述正确的是()

A.抽象类的方法都是抽象方法

B.一个类可以继承多个抽象类

C.抽象类不能有构造方法

D.抽象类不能被实例化



正确答案: D 



### 7、类 ABC 定义如下：

```prettyprint
1 ． public  class  ABC{

2 ． public  int  max( int  a, int  b) {   }

3 ．

4 ． }
```

将以下哪个方法插入行 3 是不合法的。（ ）。

A.public  float  max(float  a, float  b, float  c){  }

B.public  int  max (int  c,  int  d){  }

C.public  float  max(float  a,  float  b){  }

D.private  int  max(int a, int b, int c){  }



正确答案: B 



### 8、在异常处理中，如释放资源，关闭数据库、关闭文件应由（ ）语句来完成。

A.try子句

B.catch子句

C.finally子句

D.throw子句



正确答案: C   

finally子句一般是用来清理这些资源的。



### 9、以下代码段执行后的输出结果为

```prettyprint
public class Test {
    public static void main(String args[]) {
        int x = -5;
        int y = -12;
        System.out.println(y % x);
    }
}
```

A.-1

B.2

C.1

D.-2



正确答案: D   

模运算余数的符号跟被除数符号相同，本题中：-12=(-5)*2+(-2)，余数为-2，答案选D



### 10、下列说法正确的是（）

A.在类方法中可用this来调用本类的类方法

B.在类方法中调用本类的类方法时可直接调用

C.在类方法中只能调用本类中的类方法

D.在类方法中绝对不能调用实例方法



正确答案: B 

在类方法中不能有this关键字，直接调用类方法即可，A错误，B正确，在类方法中可以通过创建实例对象调用类的实例方法，C\D错误



### 11、在Java中，HashMap中是用哪些方法来解决哈希冲突的？

A.开放地址法

B.二次哈希法

C.链地址法

D.建立一个公共溢出区



正确答案: C



### 12、下面有关List接口、Set接口和Map接口的描述，错误的是？

A.他们都继承自Collection接口

B.List是有序的Collection，使用此接口能够精确的控制每个元素插入的位置

C.Set是一种不包含重复的元素的Collection

D.Map提供key到value的映射。一个Map中不能包含相同的key，每个key只能映射一个value



正确答案: A  

 Map接口和Collection接口是同一等级的



### 13、设int x=1,float y=2,则表达式x/y的值是：（）

A.0

B.1

C.2

D.以上都不是



正确答案: D 



### 14、命令javac-d参数的用途是？（）

A.指定编译后类层次的根目录

B.指定编译时需要依赖类的路径

C.指定编译时的编码

D.没有这一个参数



正确答案: A  



### 15、关于Float，下列说法错误的是()

A.Float是一个类

B.Float在java.lang包中

C.Float a=1.0是正确的赋值方法

D.Float a= new Float(1.0)是正确的赋值方法



正确答案: C



### 16、How should servlet developers handle the HttpServlet’s service() methond when extending HttpServlet?

A.They should override the service()method in most cases;

B.They should call the service()method from doGet()or doPost();

C.They should call the service()method from the init()method;

D.They should override at least one doXXX()method(such as doPost())



正确答案: D 

题目的意思是开发者在开发servlet继承HttpServlet时如何处理父类的service方法，一般我们都是不对service方法进行重载(没有特殊需求的话)，而只是重载doGet()之类的doXxx()方法，减少了开发工作量。但如果重载了service方法，doXXX()方法也是要重载的。即不论是否重载service方法，doXXX()方法都是需要重载的。D说至少需要重载doXXX(）方法是对的。



### 17、下面为true的是？

```prettyprint
1 Integer i = 42;
2 Long l = 42l;
3 Double d = 42.0;
```

A.(i == l)

B.(i == d)

C.(l == d)

D.i.equals(d)

E.d.equals(l)

F.i.equals(l)

G.l.equals(42L)



正确答案: G   

包装类的“==”运算在不遇到算术运算的情况下不会自动拆箱
包装类的equals()方法不处理数据转型



### 18、关于下面代码片段叙述正确的是（）

```prettyprint
1 byte b1=1,b2=2,b3,b6; 

2 final byte b4=4,b5=6; 

3 b6=b4+b5; 

4 b3=(b1+b2); 

5 System.out.println(b3+b6);
```

A.输出结果：13

B.语句：b6=b4+b5编译出错

C.语句：b3=b1+b2编译出错

D.运行期抛出异常



正确答案: C  

被final修饰的变量是常量，这里的b6=b4+b5可以看成是b6=10；在编译时就已经变为b6=10了
而b1和b2是byte类型，java中进行计算时候将他们提升为int类型，再进行计算，b1+b2计算后已经是int类型，赋值给b3，b3是byte类型，类型不匹配，编译不会通过，需要进行强制转换。
Java中的byte，short，char进行计算时都会提升为int类型。



### 19、以下程序的输出结果为

```prettyprint
class Base{
    public Base(String s){
        System.out.print("B");
    }
}
public class Derived extends Base{
    public Derived (String s) {
        System.out.print("D");
    }
    public static void main(String[] args){
        new Derived("C");
    }
}
```

A.BD

B.DB

C.C

D.编译错误



正确答案: D  

子类构造方法在调用时必须先调用父类的，由于父类没有无参构造，必须在子类中显式调用，修改子类构造方法如下即可：

```prettyprint
public Derived(String s){
    super("s");
    System.out.print("D");
}
```



### 20、下面属于java引用类型的有？

A.String

B.byte

C.char

D.Array



正确答案: A D   

 java语言是强类型语言，支持的类型分为两类：基本类型和引用类型。
基本类型包括boolean类型和数值类型，数值类型有整数类型和浮点类型。整数类型包括：byte、short、int、long和char；浮点类型包括：float和double
引用类型包括类、接口和数组类型以及特殊的null类型。



### 21、以下哪些继承自 Collection 接口（）

A.List

B.Set

C.Map

D.Array



正确答案: A B  

集合常考点： Collection接口：1.List接口：内容允许重复 {1.ArrayList 2.LinkedList，也实现了Queue接口 3.Vector}2.Set接口：内容不允许重复 3.Queue接口：队列接口 4.sortedSet接口：单值排序接口
Map接口：1.HashMap接口：无序存放，key不重复 2.HashTable接口：无序存放，key不重复 
3.TreeMap接口：按key排序，key不重复 4.IdentityHashMap接口：key可重复 5.WeakHashMap接口：弱引用Map集合



### 22、java中关于继承的描述正确的是（）

A.一个子类只能继承一个父类

B.子类可以继承父类的构造方法

C.继承具有传递性

D.父类一般具有通用性，子类更具体



正确答案: A C D  



### 23、下面有关java classloader说法正确的是（）？

A.ClassLoader就是用来动态加载class文件到内存当中用的

B.JVM在判定两个class是否相同时，只用判断类名相同即可，和类加载器无关

C.ClassLoader使用的是双亲委托模型来搜索类的

D.Java默认提供的三个ClassLoader是Boostrap ClassLoader，Extension ClassLoader，App ClassLoader

E.以上都不正确



正确答案: A C D  



### 24、下面描述属于java虚拟机功能的是？

A.通过 ClassLoader 寻找和装载 class 文件

B.解释字节码成为指令并执行，提供 class 文件的运行环境

C.进行运行期间垃圾回收

D.提供与硬件交互的平台



正确答案: A B C 



### 25、给出下面的代码段:

```prettyprint
public class Base {
    int w,
    x,
    y,
    z;
    public Base(int a, int b) {
        x = a;
        y = b;
    }
    public Base(int a, int b, int c, int d) {
        // assignment x=a, y=b
        w = d;
        z = c;
    }
}
```


在代码说明// assignment x=a, y=b处写入如下哪几个代码是正确的？（）

A.Base(a,b);

B.x=a, y=b;

C.x=a; y=b;

D.this(a,b);



正确答案: C D   



### 26、以下关于final关键字说法错误的是（）

A.final是java中的修饰符，可以修饰类、接口、抽象类、方法和属性

B.final修饰的类不能被继承

C.final修饰的方法不能被重载

D.final修饰的变量不允许被再次赋值



正确答案: A C 



### 27、如下哪些是 java 中有效的关键字（）

A.native

B.NULL

C.false

D.this



正确答案: A D



### 28、关于ThreadLocal类 以下说法正确的是

A.ThreadLocal继承自Thread

B.ThreadLocal实现了Runnable接口

C.ThreadLocal重要作用在于多线程间的数据共享

D.ThreadLocal是采用哈希表的方式来为每个线程都提供一个变量的副本

E.ThreadLocal保证各个线程间数据安全，每个线程的数据不会被另外线程访问和破坏



正确答案: D E



### 29、java中 String str = "hello world"下列语句错误的是？

A.str+='      a'

B.int strlen = str.length

C.str=100

D.str=str+100



正确答案: A B C  



### 30、Java是一门支持反射的语言,基于反射为Java提供了丰富的动态性支持，下面关于Java反射的描述，哪些是错误的：()

A.Java反射主要涉及的类如Class, Method, Filed,等，他们都在java.lang.reflet包下

B.通过反射可以动态的实现一个接口，形成一个新的类，并可以用这个类创建对象，调用对象方法

C.通过反射，可以突破Java语言提供的对象成员、类成员的保护机制，访问一般方式不能访问的成员

D.Java反射机制提供了字节码修改的技术，可以动态的修剪一个类

E.Java的反射机制会给内存带来额外的开销。例如对永生堆的要求比不通过反射要求的更多

F.Java反射机制一般会带来效率问题，效率问题主要发生在查找类的方法和字段对象，因此通过缓存需要反射类的字段和方法就能达到与之间调用类的方法和访问类的字段一样的效率
屏蔽本



正确答案: A D F



### 31、若有定义：byte[]x={11,22,33,﹣66}；其中0≤k≤3，则对x数组元素错误的引用是（）

A.x[5-3]

B.x[k]

C.x[k+5]

D.x[0]



正确答案: C 



### 32、以下不属于构造方法特征的是（）

A.构造方法名与类名相同

B.构造方法不返回任何值，也没有返回类型

C.构造方法在创建对象时调用，其他地方不能显式地直接调用

D.每一个类只能有一个构造方法



正确答案: D   

D选项描述错误，一个类可以有多个构造方法，形成重载关系。



### 33、java7后关键字 switch 支不支持字符串作为条件：（）

A.支持

B.不支持



正确答案: A  

在Java7之前，switch只能支持 byte、short、char、int或者其对应的封装类以及Enum类型。在Java7中，呼吁很久的String支持也终于被加上了。

在switch语句中，表达式的值不能是null，否则会在运行时抛出NullPointerException。在case子句中也不能使用null，否则会出现编译错误。

同时，case字句的值是不能重复的。对于字符串类型的也一样，但是字符串中可以包含Unicode转义字符。重复值的检查是在Java编译器对Java源代码进行相关的词法转换之后才进行的。也就是说，有些case字句的值虽然在源代码中看起来是不同的，但是经词法转换之后是一样的，就会在成编译错误。比如：“男”和“\u7537”就是一个意思。

然后看一个源代码及反编译后的代码：

```prettyprint
public class StringForSwitch {
    public void test_string_switch() {
        String result="";  
        switch ("doctor") {
            case "doctor":
                result = "doctor";
                break;
            default:
                break;
        }
    }
}
```


反编译后的，还原成大致的Java的代码如下：

```prettyprint
public class StringForSwitch {
    public StringForSwitch() {
    }
    public void test_string_switch() {
        String result = "";
        String var2 = "doctor";
        switch("doctor".hashCode()) {
            case -1326477025:
                if(var2.equals("doctor")) {
                    result = "doctor";
                }
            default:
                break;
        }
    }
}
```


可以看出，字符串类型在switch语句中利用hashcode的值与字符串内容的比较来实现的；但是在case字句中对应的语句块中仍然需要使用String的equals方法来进一步比较字符串的内容，这是因为哈希函数在映射的时候可能存在冲突。



### 34、下列对接口的说法，正确的是( )

A.接口与抽象类是相同的概念

B.若要实现一个接口为普通类则必须实现接口的所有抽象方法

C.接口之间不能有继承关系

D.一个类只能实现一个接口



正确答案: B



### 35、下面哪个选项是main方法的返回类型？

A.int

B.void

C.Boolean

D.static



正确答案: B 

java中类的主方法定义如下

```prettyprint
class Demo{
    public static void main(String args[]){
        //代码段
    }
}
```



### 36、编译 Java 源程序文件产生的字节码文件的扩展名为（）

A.java

B.class

C.html

D.exe



正确答案: B



### 37、以下代码执行后输出结果为（ ）

```prettyprint
public class ExceptionTest{
    public void method(){
        try{
            System.out.println("进入到try块");
        }
        catch (Exception e){
            System.out.println("异常发生了！");
        }
        finally{
            System.out.println("进入到finally块");
        }
        System.out.println("后续代码");
    }
    
    public static void main(String[] args){
        ExceptionTest test = new ExceptionTest();
        test.method();
    }
}
```

A.进入到try块  异常发生了！  进入到finally块  后续代码

B.进入到try块  进入到finally块  后续代码

C.进入到try块  后续代码

D.异常发生了！  后续代码



正确答案: B   



### 38、以下程序的运行结果是（）

```prettyprint
public class Increment{
    public static void main(String args[]){
        int a;
        a = 6;
        System.out.print(a);
        System.out.print(a++);
        System.out.print(a);
    }
}
```

A.666

B.667

C.677

D.676



正确答案: B  

a++可以理解为当访问a之后再对a进行加一操作



### 39、关于抽象类叙述正确的是？ ( )

A.抽象类不能实现接口

B.抽象类必须有“abstract class”修饰

C.抽象类必须包含抽象方法

D.抽象类也有类的特性，可以被实例化



正确答案: B 



### 40、以下说法错误的是（）

A.数组是一个对象

B.数组不是一种原生类

C.数组的大小可以任意改变

D.在Java中，数组存储在堆中连续内存空间里



正确答案: C  

在java中,数组是一个对象, 不是一种原生类,对象所以存放在堆中,又因为数组特性,是连续的,只有C不对



### 41、以下关于Object类的说法正确的是（）

A.Java中所有的类都直接或间接继承自Object，无论是否明确的指明，无论其是否是抽象类。

B.Java中的接口(interface)也继承了Object类

C.利用“==”比较两个对象时，Java调用继承自Object的equals方法，判断是否相等。

D.如果类的定义中没有重新定义toString()方法，则该类创建的对象无法使用toStrig()方法。



正确答案: A  



### 42、下面代码运行结果是？

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



### 43、以下程序运行的结果为 (   )

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

D.不能确定



正确答案: A    

此题的争议点只可能是runmain或mainrun

因为Example的run方法里面休眠了100ms，在当今电脑计算性能过剩的时代，如果是多线程启动，main方法肯定会打印出了main。
为啥是runmain而不是mainrun呢？
因为启动线程是调用start方法。
把线程的run方法当普通方法，就直接用实例.run()执行就好了。
没有看到start。所以是普通方法调用。
所以选A。



### 44、How should servlet developers handle the HttpServlet’s service() methond when extending HttpServlet?

A.They should override the service()method in most cases;

B.They should call the service()method from doGet()or doPost();

C.They should call the service()method from the init()method;

D.They should override at least one doXXX()method(such as doPost())



正确答案: D  

题目的意思是开发者在开发servlet继承HttpServlet时如何处理父类的service方法，一般我们都是不对service方法进行重载(没有特殊需求的话)，而只是重载doGet()之类的doXxx()方法，减少了开发工作量。但如果重载了service方法，doXXX()方法也是要重载的。即不论是否重载service方法，doXXX()方法都是需要重载的。D说至少需要重载doXXX(）方法是对的。



### 45、下列哪个说法是正确的（）

A.ConcurrentHashMap使用synchronized关键字保证线程安全

B.HashMap实现了Collction接口

C.Array.asList方法返回java.util.ArrayList对象

D.SimpleDateFormat是线程不安全的



正确答案: D



### 46、下面哪种情况会导致持久区jvm堆内存溢出？

A.循环上万次的字符串处理

B.在一段代码内申请上百M甚至上G的内存

C.使用CGLib技术直接操作字节码运行，生成大量的动态类

D.不断创建对象



正确答案: C   

Java中堆内存分为两部分，分别是permantspace和heap space。permantspace（持久区）主要存放的是Java类定义信息，与垃圾收集器要收集的Java对象关系不大。持久代溢出通常由于持久代设置过小，动态加载了大量Java类，因此C选项正确。

heap space分为年轻代和年老代， 年老代常见的内存溢出原因有循环上万次的字符串处理、在一段代码内申请上百M甚至上G的内存和创建成千上万的对象，也就是题目中的ABD选项。



### 47、如下代码，执行test()函数后，屏幕打印结果为（）

```prettyprint
public class Test2{
    public void add(Byte b){
        b = b++;
    }
    public void test(){
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }
}
```

A.127 127

B.128 127

C.129 128

D.以上都不对



正确答案: D   

public void add(Byte b){ b=b++; } 这里涉及java的自动装包/自动拆包(AutoBoxing/UnBoxing) Byte的首字母为大写，是类，看似是引用传递，但是在add函数内实现++操作，会自动拆包成byte值传递类型，所以add函数还是不能实现自增功能。也就是说add函数只是个摆设，没有任何作用。 Byte类型值大小为-128~127之间。 add(++a);这里++a会越界，a的值变为-128 add(b); 前面说了，add不起任何作用，b还是127



### 48、对于文件的描述正确的是（ ）

A.文本文件是以“.txt”为后缀名的文件，其他后缀名的文件是二进制文件。

B.File类是Java中对文件进行读写操作的基本类。

C.无论文本文件还是二进制文件，读到文件末尾都会抛出EOFException异常。

D.Java中对于文本文件和二进制文件，都可以当作二进制文件进行操作。



正确答案: D

 

### 49、下列代码执行结果为（）

```prettyprint
public static void main(String args[])throws InterruptedException{
    Thread t=new Thread(new Runnable() {
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("2");
        }
    });
    t.start();

    t.join();
    System.out.print("1");
}
```

A.21

B.12

C.可能为12，也可能为21

D.以上答案都不对



正确答案: A   

thread.Join把指定的线程加入到当前线程，可以将两个交替执行的线程合并为顺序执行的线程。比如在线程B中调用了线程A的Join()方法，直到线程A执行完毕后，才会继续执行线程B。
t.join();      //使调用线程 t 在此之前执行完毕。
t.join(1000);  //等待 t 线程，等待时间是1000毫秒



### 50、下面代码输出是？

```prettyprint
enum AccountType{
    SAVING, FIXED, CURRENT;
    private AccountType(){
        System.out.println("It is a account type");
    }
}

class EnumOne{
    public static void main(String[]args){
        System.out.println(AccountType.FIXED);
    }
}
```

A.编译正确，输出”It is a account type”once followed by”FIXED”

B.编译正确，输出”It is a account type”twice followed by”FIXED”

C.编译正确，输出”It is a account type”thrice followed by”FIXED”

D.编译正确，输出”It is a account type”four times followed by”FIXED”

E.编译错误



正确答案: C   

枚举类有三个实例，故调用三次构造方法，打印三次It is a account type



### 51、阅读如下代码。 请问，对语句行 test.hello(). 描述正确的有（）

```prettyprint
package NowCoder;

class Test {
    public static void hello() {
        System.out.println("hello");
    }
}

public class MyApplication {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test test=null;
        test.hello();
    }
}
```

A.能编译通过，并正确运行

B.因为使用了未初始化的变量，所以不能编译通过

C.以错误的方式访问了静态方法

D.能编译通过，但因变量为null，不能正常运行



正确答案: A    

因为Test类的hello方法是静态的，所以是属于类的，当实例化该类的时候，静态会被优先加载而且只加载一次，所以不受实例化new Test();影响，只要是使用到了Test类，都会加载静态hello方法！
另外，在其他类的静态方法中也是可以调用公开的静态方法，此题hello方法是使用public修饰的所以在MyApplication中调用hello也是可以的。
总结：即使Test test=null;这里也会加载静态方法，所以test数据中包含Test类的初始化数据。（静态的，构造的，成员属性）因此test.hello是会调用到hello方法的。



### 52、存根（Stub）与以下哪种技术有关

A.交换

B.动态链接

C.动态加载

D.磁盘调度



正确答案: B  



### 53、（）运算符和（）运算符分别把一个值的位向左和向右移动

A.<<

B.>>

C.&&

D.||



正确答案: A B   



### 54、对于jdk1.8,以下为 java 语法保留不能作为类名和方法名使用的是

A.default

B.int

C.implements

D.throws



正确答案: A B C D



### 55、下列选项中属于面向对象程序设计语言特征的是（）

A.继承性

B.多态性

C.相似性

D.封装性



正确答案: A B D 



### 56、下面哪些类实现或继承了 Collection 接口？

A.HashMap

B.ArrayList

C.Vector

D.Iterator



正确答案: B C



### 57、对Collection和Collections描述正确的是

A.Collection是java.util下的类，它包含有各种有关集合操作的静态方法

B.Collection是java.util下的接口，它是各种集合结构的父接口

C.Collections是java.util下的接口，它是各种集合结构的父接口

D.Collections是java.util下的类，它包含有各种有关集合操作的静态方法



正确答案: B D 

java.util.Collection 是一个集合接口。它提供了对集合对象进行基本操作的通用接口方法。Collection接口在Java 类库中有很多具体的实现。Collection接口的意义是为各种具体的集合提供了最大化的统一操作方式。
java.util.Collections 是一个包装类。它包含有各种有关集合操作的静态多态方法。此类不能实例化，就像一个工具类，服务于Java的Collection框架。



### 58、下面有关java类加载器，说法正确的是？

A.引导类加载器（bootstrap class loader）：它用来加载 Java 的核心库，是用原生代码来实现的

B.扩展类加载器（extensions class loader）：它用来加载 Java 的扩展库。

C.系统类加载器（system class loader）：它根据 Java 应用的类路径（CLASSPATH）来加载 Java 类

D.tomcat为每个App创建一个Loader，里面保存着此WebApp的ClassLoader。需要加载WebApp下的类时，就取出ClassLoader来使用



正确答案: A B C D   

 jvm classLoader architecture :

a、Bootstrap ClassLoader/启动类加载器
主要负责jdk_home/lib目录下的核心 api 或 -Xbootclasspath 选项指定的jar包装入工作.

B、Extension ClassLoader/扩展类加载器
主要负责jdk_home/lib/ext目录下的jar包或 -Djava.ext.dirs 指定目录下的jar包装入工作

C、System ClassLoader/系统类加载器
主要负责java -classpath/-Djava.class.path所指的目录下的类与jar包装入工作.

B、 User Custom ClassLoader/用户自定义类加载器(java.lang.ClassLoader的子类)
在程序运行期间, 通过java.lang.ClassLoader的子类动态加载class文件, 体现java动态实时类装入特性.



### 59、在你面前有一个n阶的楼梯，你一步只能上1阶或2阶。请问，当N=11时，你可以采用多少种不同的方式爬完这个楼梯（）,当N=9时呢呢（）？

A.11

B.144

C.55

D.89



正确答案: B C  



### 60、关于Java中的数组，下面的一些描述，哪些描述是准确的：（    ）

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



### 61、

```prettyprint
int i = 3;
String result = new String();
switch (i) {
    case 1:
        result = result + "him ";
    case 2:
        result = result + "her ";
    case 3:
        result = result + "it ";
    default:
        result = result + "me ";
}
System.out.println(result);
```


请给出最终输出内容。

A.it me

B.him her it me

C.him her

D.me



正确答案: A  



### 62、只有实现了()接口的类，其对象才能序列化。

A.Serializable

B.Cloneable

C.Comparable

D.Writeable



正确答案: A   

Serializable要实现序列化对象必须要实现的接口



### 63、下列叙述错误的是（ ）

A.java程序的输入输出功能是通过流来实现的

B.java中的流按照处理单位可分成两种：字节流和字符流

C.InputStream是一个基本的输出流类。

D.通过调用相应的close（）方法关闭输入输出流



正确答案: C 



### 64、下列选项中，用于在定义子类时声明父类名的关键字是：( )

A.interface

B.package

C.extends

D.class



正确答案: C 



### 65、java有8种基本类型，请问byte、int、long、char、float、double、boolean各占多少个字节？

A.1 2 8 2 4 8 1

B.1 4 8 2 4 8 1

C.1 4 4 2 4 4 2

D.1 4 4 2 4 8 2



正确答案: B



### 66、现有一变量声明为 boolean aa; 下面赋值语句中正确的是 （ ）

A.aa=false;

B.aa=False;

C.aa="true";

D.aa=0;



正确答案: A 



### 67、执行如下代码后输出结果为（ ）

```prettyprint
public class Test {

    public static void main(String[] args) {
        System.out.println("return value of getValue(): " + getValue());
    }
    public static int getValue() {
        int i = 1;
        try {
            i = 4;
        } finally{
            i++;
            return i;
        }
    }
}
```

A.return value of getValue(): 1

B.return value of getValue(): 4

C.return value of getValue(): 5

D.其他几项都不对



正确答案: C   

当Java程序执行try块、catch块时遇到了return或throw语句，这两个语句都会导致该方法立即结束，但是系统执行这两个语句并不会结束该方法，而是去寻找该异常处理流程中是否包含finally块，如果没有finally块，程序立即执行return或throw语句，方法终止；如果有finally块，系统立即开始执行finally块。只有当finally块执行完成后，系统才会再次跳回来执行try块、catch块里的return或throw语句；如果finally块里也使用了return或throw等语句，finally块会终止方法，系统将不会跳回去执行try块、catch块里的任何代码。综上所述，答案选择C。



### 68、以下（）不是合法的标识符？

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



### 69、以下定义一维数组的语句中，正确的是：（）

A.int a [10];

B.int a []=new [10];

C.int a []=new int [5]{1,2,3,4,5};

D.int a []={1,2,3,4,5};



正确答案: D



### 70、以下关于 abstract 关键字的说法，正确的是（）

A.abstract 可以与final 并列修饰同一个类。

B.abstract 类中不可以有private的成员。

C.abstract 类中必须全部是abstract方法。

D.abstract 方法必须在abstract类或接口中。



正确答案: D 



### 71、下列外部类定义中，不正确的是：（ ）

A.class x { .... }

B.class x extends y { .... }

C.static class x implements y1,y2 { .... }

D.public class x extends Applet { .... }



正确答案: C



### 72、 判断对错。List，Set，Map都继承自继承Collection接口。

A.对

B.错



正确答案: B   

List，Set等集合对象都继承自Collection接口
Map是一个顶层结果，不继承自Collection接口



### 73、假设num已经被创建为一个ArrayList对象，并且最初包含以下整数值：[0，0，4，2，5，0，3，0]。 执行下面的方法numQuest()，数组num会变成？

```prettyprint
private List<Integer> nums;

public void numQuest() {
    int k = 0;
    Integer zero = new Integer(0);
    while (k < nums.size()) {
        if (nums.get(k).equals(zero))
            nums.remove(k);
        k++;
    }
}
```

A.[3, 5, 2, 4, 0, 0, 0, 0]

B.[0, 0, 0, 0, 4, 2, 5, 3]

C.[0, 0, 4, 2, 5, 0, 3, 0]

D.[0, 4, 2, 5, 3]



正确答案：D



### 74、以下叙述正确的是

A.实例方法可直接调用超类的实例方法

B.实例方法可直接调用超类的类方法

C.实例方法可直接调用子类的实例方法

D.实例方法可直接调用本类的实例方法



正确答案: D     

A错误，类的实例方法是与该类的实例对象相关联的，不能直接调用，只能通过创建超类的一个实例对象，再进行调用
B错误，当父类的类方法定义为private时，对子类是不可见的，所以子类无法调用
C错误，子类具体的实例方法对父类是不可见的，所以无法直接调用， 只能通过创建子类的一个实例对象，再进行调用
D正确，实例方法可以调用自己类中的实例方法



### 75、以下代码段执行后的输出结果为

```prettyprint
public class Test {
    public static void main(String args[]) {
        int x = -5;
        int y = -12;
        System.out.println(y % x);
    }
}
```

A.-1

B.2

C.1

D.-2



正确答案: D 



### 76、当你编译和运行下面的代码时，会出现下面选项中的哪种情况？

```prettyprint
public class Pvf{
    static boolean Paddy;
    public static void main(String args[]){
        System.out.println(Paddy);
    }
}
```


A.编译时错误

B.编译通过并输出结果false

C.编译通过并输出结果true

D.编译通过并输出结果null



正确答案: B  

类中声明的变量有默认初始值；方法中声明的变量没有默认初始值，必须在定义时初始化，否则在访问该变量时会出错。
boolean类型默认值是false



### 77、关于下列程序段的输出结果，说法正确的是：（ ）

```prettyprint
public class MyClass{
    static int i;
    public static void main(String argv[]){
        System.out.println(i);
    }
}
```

A.有错误，变量i没有初始化。

B.null

C.1

D.0



正确答案: D



### 78、检查程序，是否存在问题，如果存在指出问题所在，如果不存在，说明输出结果。

```prettyprint
public class HelloB extends HelloA {
    public HelloB(){}
    
    {
        System.out.println("I’m B class");
    }

    static{
        System.out.println("static B");
    }

    public static void main(String[] args){
        new HelloB();
    }
}

class HelloA{
    public HelloA(){}
    
    {
        System.out.println("I’m A class");
    }

    static
    {
        System.out.println("static A");
    }
}
```

A.static A
I’m A class
static B
I’m B class

B.I’m A class
I’m B class
static A
static B

C.static A
static B
I’m A class
I’m B class

D.I’m A class
static A
I’m B class
static B



正确答案: C   

其中涉及：静态初始化代码块、构造代码块、构造方法
当涉及到继承时，按照如下顺序执行：
1、执行父类的静态代码块

```prettyprint
static {
    System.out.println("static A");
}
```

输出:static A

2、执行子类的静态代码块

```prettyprint
static {
    System.out.println("static B");
}
```

输出:static B
3、执行父类的构造代码块

```prettyprint
{
    System.out.println("I’m A class");
}
```

输出:I'm A class
4、执行父类的构造函数

```prettyprint
public HelloA() {
}
```

输出：无
5、执行子类的构造代码块

```prettyprint
{
    System.out.println("I’m B class");
}
```

输出:I'm B class
6、执行子类的构造函数

```prettyprint
public HelloB() {
}
```

输出：无

那么，最后的输出为：
static A
static B
I'm A class
I'm B class
正确答案：C



###  79、以下代码的运行结果是什么(  )

```prettyprint
class Supper{     
    public int get()    {          
        System.out.println("Supper");         
        return 5;     
    }    
}     

public class Sub{ 
    public int get(){         
        System.out.println("Sub");        
        return new Integer("5");          
    }      
    public static void main(String args[]) {          
        new Supper().get();        
        new Sub().get();          
    }   
}
```

A.Supper Sub

B.Supper 5 Sub

C.Supper 5 5 Sub

D.Supper Sub 5 5



正确答案: A   



### 80、设有下面两个赋值语句：

a = Integer.parseInt("1024");

b = Integer.valueOf("1024").intValue();

下述说法正确的是（）

A.a是整数类型变量，b是整数类对象。

B.a是整数类对象，b是整数类型变量。

C.a和b都是整数类对象并且它们的值相等。

D.a和b都是整数类型变量并且它们的值相等。



正确答案: D



### 81、非抽象类实现接口后，必须实现接口中的所有抽象方法，除了abstract外，方法头必须完全一致.

A.正确

B.错误



正确答案: B  



### 82、Java1.8之后，Java接口的修饰符可以为（）

A.private

B.protected

C.final

D.abstract



正确答案: D 



### 83、以下哪项陈述是正确的？

A.垃圾回收线程的优先级很高，以保证不再使用的内存将被及时回收

B.垃圾收集允许程序开发者明确指定释放哪一个对象

C.垃圾回收机制保证了JAVA程序不会出现内存溢出

D.进入”Dead”状态的线程将被垃圾回收器回收

E.以上都不对



正确答案: E    

A: 垃圾回收在jvm中优先级相当相当低。
B：垃圾收集器（GC）程序开发者只能推荐JVM进行回收，但何时回收，回收哪些，程序员不能控制。
C：垃圾回收机制只是回收不再使用的JVM内存，如果程序有严重BUG，照样内存溢出。
D：进入DEAD的线程，它还可以恢复，GC不会回收



### 84、下面叙述那个是正确的？（）

A. java中的集合类（如Vector）可以用来存储任何类型的对象，且大小可以自动调整。但需要事先知道所存储对象的类型，
才能正常使用。

B.在java中，我们可以用违例（Exception）来抛出一些并非错误的消息，但这样比直接从函数返回一个结果要更大的系统开销。

C.java接口包含函数声明和变量声明。

D.java中，子类不可以访问父类的私有成员和受保护的成员。



正确答案: B



### 85、Which statement is true for the class java.util.ArrayList?

A.The elements in the collection are ordered.

B.The collection is guaranteed to be immutable.

C.The elements in the collection are guaranteed to be unique.

D.The elements in the collection are accessed using a unique key.

E.The elements in the collections are guaranteed to be synchronized.



正确答案: A   

Serializable, Cloneable , Iterable <E>, Collection <E>, List <E>, RandomAccess List接口是有序的，通常允许重复，因此可以确定A对，C错；ArrayList是实现List 接口的大小可变数组，所以B错；D是Map的特性，所以D错；查看手册： Note that this implementation is not synchronized.  ArrayList的实现是不是线程同步的，所以E错。



### 86、java关于异常处理机制的叙述哪些正确

A.catch部分捕捉到异常情况时，才会执行finally部分

B.当try区段的程序发生异常时，才会执行catch区段的程序

C.在try区段不论程序是否发生异常及捕获到异常，都会执行finally部分

D.以上都是



正确答案: B C     

Java处理异常的语句由try、catch、finally三部分组成。try块用于包裹业务代码，catch块用于捕获并处理某个类型的异常，finally块则用于回收资源。finally块能够成功回收资源的原因就是无论是否发生异常，finally块一定会执行（一般情况下）。选项A错误，D错误



### 87、以下关于final关键字说法错误的是（）

A.final是java中的修饰符，可以修饰类、接口、抽象类、方法和属性

B.final修饰的类不能被继承

C.final修饰的方法不能被重载

D.final修饰的变量不允许被再次赋值



正确答案: A C



### 88、下列描述正确的是（ ）？

A.类不可以多继承而接口可以多实现

B.抽象类自身可以定义成员而接口不可以

C.抽象类和接口都不能被实例化

D.一个类可以有多个直接基类和多个基接口



正确答案: A C



### 89、在Java中下面Class的声明哪些是错误的？

```prettyprint
A.public abstract final class Test {
    abstract void method();
}

B.public abstract class Test {
    abstract final void method();
}

C.public abstract class Test {
    abstract void method() {
	}
}

D.public class Test {
    final void method() {
	
	}
}
```

正确答案: A B C



### 90、以下各类中哪几个是线程安全的？( )

A.ArrayList

B.Vector

C.Hashtable

D.Stack



正确答案: B C D 



### 91、关于容器下面说法正确的是？ ( )

A.列表(List)和集合(Set)存放的元素都是可重复的。

B.列表(List)和集合(Set)存放的元素都是不可重复的。

C.映射(Map)<key,value>中key是可以重复的。

D.映射(Map)<key,value>中value是可以重复的。



正确答案: D 



### 92、“先进先出”的容器是：( )

A.堆栈(Stack)

B.队列（Queue）

C.字符串(String)

D.迭代器(Iterator)



正确答案: B



### 93、HashSet子类依靠()方法区分重复元素。

A.toString(),equals()

B.clone(),equals()

C.hashCode(),equals()

D.getClass(),clone()



正确答案: C     

HashSet内部使用Map保存数据，即将HashSet的数据作为Map的key值保存，这也是HashSet中元素不能重复的原因。而Map中保存key值前，会去判断当前Map中是否含有该key对象，内部是先通过key的hashCode，确定有相同的hashCode之后，再通过equals方法判断是否相同。



### 94、下列不属于访问控制符的是（）

A.public

B.private

C.protected

D.static



正确答案: D  



### 95、类中的数据域使用private修饰为私有变量，所以任何方法均不能访问它。

A.正确

B.错误  



正确答案: B 



### 96、Java 语言中创建一个对象使用的关键字是（）

A.class

B.interface

C.new

D.create



正确答案: C  



### 97、下面哪个选项是main方法的返回类型？

A.int

B.void

C.Boolean

D.static



正确答案: B   

java中类的主方法定义如下

```prettyprint
class Demo{
    public static void main(String args[]){
    //代码段
    }
}
```



### 98、一个类中，有两个方法名、形参类型、顺序和个数都完全一样，返回值不一样的方法,这种现象叫覆盖。（  ）

A.正确

B.错误



正确答案: B 



### 99、以下类定义中的错误是什么？（）

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



### 100、定义类中成员变量时不可能用到的修饰是（）

A.final

B.void

C.protected

D.static


正确答案: B
### 301、以下关于继承的叙述正确的是

A.在Java中类只允许单一继承

B.在Java中一个类不能同时继承一个类和实现一个接口

C.在Java中接口只允许单一继承

D.在Java中一个类只能实现一个接口



正确答案: A



### 302、编译java程序的命令文件是( )

A.java.exe

B.javac.exe

C.applet.exe



正确答案: B  



### 303.“先进先出”的容器是：( )

A.堆栈(Stack)

B.队列（Queue）

C.字符串(String)

D.迭代器(Iterator)



正确答案: B 



### 304、在java中，在同一包内，非私有类Cat里面有个公有方法sleep()，该方法前有static修饰，则可以直接用Cat.sleep()。（ ）

A.正确

B.错误



正确答案: A 



### 305、输入流将数据从文件，标准输入或其他外部输入设备中加载道内存，在 java 中其对应于抽象类（）及其子类。

A.java.io.InputStream

B.java.io.OutputStream

C.java.os.InputStream

D.java.os.OutputStream



正确答案: A  



### 306、以下语句输出的结果是（）

```prettyprint
int value：
value=2；
System.out.print(value);
System.out.print(value++);
System.out.print(value);
```

A.233

B.223

C.221

D.222



正确答案: B 



### 307、下列哪个语句语法正确？（ ）

A.byte y = 11; byte x = y +y;

B.String x = new Object();

C.Object x = new String(“Hellow”);

D.int a [11] = new int [11];



正确答案: C     

对于A，前一半语句赋值是没有问题的，问题是后半句，在对byte型的变量进行相加时，会先自动转换为int型进行计算，所以计算结果也是int型的，int型赋值给byte需要强制转换，所以A会出错
对于B，因为object是String的父类，所以不能这样使用，不能把父类对象赋值给子类，只能是Object x = new String();
对于C，因为String是Object的子类，所以可以将子类赋值给父类。
对于D，因为在声明变量时不需要指定容量，例如int  a[] = new int[11];这样是正确的，但是像D选项这样是错误的



### 308、在上下文和头文件正常的情况下，代码将打印？

```prettyprint
System.out.println(10%3*2);
```

A.1

B.2

C.4

D.6



正确答案: B     

 %和*是同一个优先级，从左到右运算



### 309、装箱、拆箱操作发生在: ()

A.类与对象之间

B.对象与对象之间

C.引用类型与值类型之间

D.引用类型与引用类型之间



正确答案: C 



### 310、有时为了避免某些未识别的异常抛给更高的上层应用，在某些接口实现中我们通常需要捕获编译运行期所有的异常， catch 下述哪个类的实例才能达到目的：（）

A.Error

B.Exception

C.RuntimeException

D.Throwable



正确答案: B



### 311、以下程序段的输出结果为：

```prettyprint
public class EqualsMethod{
    public static void main(String[] args){
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.print(n1 == n2);
        System.out.print(",");
        System.out.println(n1 != n2);
    }
}
```

A.false，false

B.false，true

C.true，false

D.true，true



正确答案: B



### 312、AccessViolationException异常触发后，下列程序的输出结果为（      ）

```prettyprint
static void Main(string[] args)  {  
    try  {  
        throw new AccessViolationException();  
        Console.WriteLine("error1");  
    }  
    catch (Exception e)  {  
        Console.WriteLine("error2");  
    }  
    Console.WriteLine("error3");  
} 
```

A.error2
error3

B.error3

C.error2

D.error1



正确答案: A    

 try..catch，catch捕获到异常，如果没有抛出异常语句(throw)，不影响后续程序，本题答案选A。



### 313、语句：char foo='中'，是否正确？（假设源文件以GB2312编码存储，并且以javac – encoding GB2312命令编译）

A.正确

B.错误



正确答案: A



### 314、观察下列代码，分析结果()

```prettyprint
String s1 = "coder";     
String s2 = "coder";     
String s3 = "coder" + s2;     
String s4 = "coder" + "coder";     
String s5 = s1 + s2;            
System.out.println(s3 == s4); 
System.out.println(s3 == s5);    
System.out.println(s4 == "codercoder");
```

A.false；false； true；

B.false；true； true；

C.false；false； false；

D.true；false； true；



正确答案: A 



### 315、java中下面哪个能创建并启动线程（）

```prettyprint
public class MyRunnable implements Runnable { 
    public void run() { 
        //some code here 
    } 
}
```

A.new Runnable(MyRunnable).start()

B.new Thread(MyRunnable).run()

C.new Thread(new MyRunnable()).start()

D.new MyRunnable().start()



正确答案: C      

首先：创建并启动线程的过程为：定义线程—》实例化线程—》启动线程。
一 、定义线程： 1、扩展java.lang.Thread类。 2、实现java.lang.Runnable接口。
二、实例化线程： 1、如果是扩展java.lang.Thread类的线程，则直接new即可。
                 2、如果是实现了java.lang.Runnable接口的类，则用Thread的构造方法：
        Thread(Runnable target) 
        Thread(Runnable target, String name) 
        Thread(ThreadGroup group, Runnable target) 
        Thread(ThreadGroup group, Runnable target, String name) 
        Thread(ThreadGroup group, Runnable target, String name, long stackSize)
所以A、D的实例化线程错误。
三、启动线程： 在线程的Thread对象上调用start()方法，而不是run()或者别的方法。
所以B的启动线程方法错误。



### 316、下列循环语句序列执行完成后，i的值是（）

```prettyprint
int i;
for(i=2;i<=10;i++){
    System.out.println(i);
}
```

A.2

B.11

C.10

D.不确定



正确答案: C 



### 317、关于如下程序的描述哪个是正确的？（ ）

```prettyprint
public class Person{
    static int arr[] = new int[5];
    public static void main(String a[]){
        System.out.println(arr[0]);
    }
}
```

A.编译将产生错误

B.编译时正确，但运行时将产生错误

C.正确，输出0

D.正确，输出 null



正确答案: C



### 318、try括号里有return语句， finally执行顺序

A.不执行finally代码

B.return前执行

C.return后执行



正确答案: B      



###  319、下列关于包（package）的描述，正确的是（）

A.包（package）是Java中描述操作系统对多个源代码文件组织的一种方式。

B.import语句将所对应的Java源文件拷贝到此处执行。

C.包（package）是Eclipse组织Java项目特有的一种方式。

D.定义在同一个包（package）内的类可以不经过import而直接相互使用。



正确答案: D



### 320、（）运算符把其操作数中所有值为0和所有值为1的位分别在结果的相应中设置1和0

A.&

B.|

C.！

D.~



正确答案: D  



### 321、关于Java以下描述正确的有(      )

A.native关键字表名修饰的方法是由其它非Java语言编写的

B.能够出现在import语句前的只有注释语句

C.接口中定义的方法只能是public

D.接口中定义的方法只能是public



正确答案: A 



### 322、以下代码可以使用的修饰符是：（）

```prettyprint
public interface Status {
    /*INSERT CODE HERE*/  int MY_VALUE=10;
}
```

A.final

B.static

C.abstract

D. public



正确答案: A B D 



### 323、 java中Hashtable, Vector, TreeSet, LinkedList哪些线程是安全的？

A.Hashtable

B.Vector

C.TreeSet

D.LinkedList



正确答案: A B      

 HashTable是线程安全的
Vector是线程安全的ArrayList
TreeSet和LinkedList都不是线程安全的



### 324、线程安全的map在JDK 1.5及其更高版本环境 有哪几种方法可以实现?

A.Map map = new HashMap()

B.Map map = new TreeMap()

C.Map map = new ConcurrentHashMap();

D.Map map = Collections.synchronizedMap(new HashMap());



正确答案: C D        

1. HashMap,TreeMap 未进行同步考虑，是线程不安全的。

2. HashTable 和 ConcurrentHashMap 都是线程安全的。区别在于他们对加锁的范围不同，HashTable 对整张Hash表进行加锁，而ConcurrentHashMap将Hash表分为16桶(segment)，每次只对需要的桶进行加锁。

3. Collections 类提供了synchronizedXxx()方法，可以将指定的集合包装成线程同步的集合。比如，
   List  list = Collections.synchronizedList(new ArrayList());
   Set  set = Collections.synchronizedSet(new HashSet());

   

### 325、下列选项中是正确的方法声明的是？（）

A.protected abstract void f1();

B.public final void f1() {}

C.static final void fq(){}

D.private void f1() {}



正确答案: A B C D  



### 326、常用的servlet包的名称是？

A.java.servlet

B.javax.servlet

C.servlet.http

D.javax.servlet.http



正确答案: B D  



### 327、下列哪些方法是针对循环优化进行的

A.强度削弱

B.删除归纳变量

C.删除多余运算

D.代码外提



正确答案: A B D



### 328、CMS垃圾回收器在那些阶段是没用用户线程参与的

A.初始标记

B.并发标记

C.重新标记

D.并发清理



正确答案: A C          

 CMS收集器是一种以获取最短回收停顿时间为目标的收集器，它是基于标记清除算法实现的，它的运作过程相对于其他收集器来说要更复杂一些，整个过程分为四个步骤，包括：初始标记、并发标记、重新标记、并发清除。其中初始标记、重新标记这两个步骤需要暂停整个JVM。
初始标记仅仅只是标记一下GC Roots能直接关联到的对象，速度很快。
并发标记阶段就是从GC Roots的直接关联对象开始遍历整个对象图的过程，这个过程耗时较长但是不需要停顿用户线程，可以与垃圾收集线程一起并发运行。
重新标记阶段则是为了修正并发标记期间，因用户程序继续运作而导致标记产生变动的那一部分对象的标记记录，这个阶段的停顿时间通常会比初始标记阶段稍长一些，但也远比并发标记阶段的时间短。
并发清除阶段，清理删除掉标记阶段判断的已经死亡的对象，由于不需要移动存活对象，所以这个阶段也是可以与用户线程同时并发的。



### 329、下列哪些操作会使线程释放锁资源？

A.sleep()

B.wait()

C.join()

D.yield()



正确答案: B C  



### 330、Java语言中，下面哪个语句是创建数组的正确语句？(     )

A.float f[][] = new float[6][6];

B.float []f[] = new float[6][6];

C.float f[][] = new float[][6];

D.float [][]f = new float[6][6];

E.float [][]f = new float[6][];



正确答案: A B D E  



###331、现有一变量声明为 boolean aa; 下面赋值语句中正确的是 （ ）

A.aa=false;

B.aa=False;

C.aa="true";

D.aa=0;



正确答案: A 



### 332、下列代码中的错误原因是（）

```prettyprint
(1)public class Test

(2){

(3)       public static void main(String [] args)

(4)       {

(5)           int i;

(6)           i+=1;

(7)       }
    
(8) }
```

A.非法的表达式 i+=1

B.找不到符号i

C.类不应为public

D.尚未初始化变量i



正确答案: D

 

### 333、HashSet子类依靠()方法区分重复元素。

A.toString(),equals()

B.clone(),equals()

C.hashCode(),equals()

D.getClass(),clone()



正确答案: C    

HashSet内部使用Map保存数据，即将HashSet的数据作为Map的key值保存，这也是HashSet中元素不能重复的原因。而Map中保存key值前，会去判断当前Map中是否含有该key对象，内部是先通过key的hashCode，确定有相同的hashCode之后，再通过equals方法判断是否相同。



### 334、为Test类的一个无形式参数无返回值的方法method书写方法头，使得使用类名Test作为前缀就可以调用它，该方法头的形式为( )

A.static  void  method（）

B.public void  method

C.protected  void  method（）

D.abstract  void method（）



正确答案: A



### 335、下列InputStream类中哪个方法可以用于关闭流？

A.skip()

B.close()

C.mark()

D.reset()



正确答案: B    

inputstream的close方法用来关闭流
skip()用来跳过一些字节
mark（）用来标记流
reset（）复位流



### 336、下列叙述错误的是（ ）

A.java程序的输入输出功能是通过流来实现的

B.java中的流按照处理单位可分成两种：字节流和字符流

C.InputStream是一个基本的输出流类。

D.通过调用相应的close（）方法关闭输入输出流



正确答案: C  



### 337、正则表达式语法中 \d 匹配的是？（）

A.数字

B.非数字

C.字母

D.空白字符



正确答案: A 



### 338、在java中，已定义两个接口B和C，要定义一个实现这两个接口的类，以下语句正确的是（）

A.interface  A extends B，C

B.interface  A eimplements  B，C

C.class  A implements  B，C

D.class  A implements  B，implements C



正确答案: C



### 339、以下那个数据结构是适用于"数据必须以相反的顺序存储然后检索" ? （）

A.Stack

B.Queue

C.List

D.Liink List



正确答案: A  

 

### 340、下面哪个不是Java基本类型？

A.short

B.Boolean

C.byte

D.float



正确答案: B    

 java规定类名首字母必须大写，这里可以直观的看出来Boolean是一个引用类型，不是基本数据类型。
java中的基本数据类型都对应一个引用类型，如Float是float的引用类型，Integer是int的引用类型



341、已知如下类定义：

```prettyprint
class Base {  
    public Base (){ 
        //... 
    }  
    public Base ( int m ){ 
        //... 
    }  
    public void fun( int n ){ 
        //... 
    } 
}  
public class Child extends Base{  
    // member methods  
}  
```

如下哪句可以正确地加入子类中？

A.private void fun( int n ){ //...}

B.void fun ( int n ){ //... }

C.protected void fun ( int n ) { //... }

D.public void fun ( int n ) { //... }



正确答案: D  



### 342、与未加访问控制符的缺省情况相比，public和protected修饰符扩大了属性和方法的被访问范围，private修饰符则缩小了这种范围。

A.正确

B.错误 



正确答案: A



### 343、下面论述正确的是（）？

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



### 344、选项中哪一行代码可以替换 //add code here 而不产生编译错误

```prettyprint
public abstract class MyClass {
    public int constInt = 5;
    //add code here
    public void method() {
    } 
}
```

A.public abstract void method(int a);

B.consInt=constInt+5;

C.public int method();

D.public abstract void anotherMethod(){}



正确答案: A     

A是抽象方法，抽象类可以包含抽象方法，也可以不包含，实现重载。（√）
B 在类中不能constInt = constInt + 5（×）
C 返回值不能作为重载的依据（×）
D 有方法体的不能作为抽象函数（×）



### 345、语句：char foo='中'，是否正确？（假设源文件以GB2312编码存储，并且以javac – encoding GB2312命令编译）

A.正确

B.错误



正确答案: A 



### 346、根据以下代码段,执行new Child("John", 10); 要使数据域data得到10，则子类空白处应该填写(    )。

```prettyprint
class Parent {

    private int data;

    public Parent(int d){ data = d; }

}

class Child extends Parent{

    String name;

    public Child(String s, int d){

        ___________________

        name = s;

    }
}
```

A.data = d;

B.super.data = d;

C.Parent(d);

D.super(d);



正确答案: D    

1.子父类存在同名成员时，子类中默认访问子类的成员，可通过super指定访问父类的成员，格式：super.xx  (注：xx是成员名)；
2.创建子类对象时，默认会调用父类的无参构造方法，可通过super指定调用父类其他构造方法，格式：s uper(yy) (注：yy是父类构造方法需要传递的参数)



### 347、下面代码的执行结果是 :

```prettyprint
class Chinese {
    private static Chinese objref = new Chinese();
    private Chinese() {}
    public static Chinese getInstance() {
        return objref;
    }
}

public class TestChinese {
    public static void main(String[] args) {
        Chinese obj1 = Chinese.getInstance();
        Chinese obj2 = Chinese.getInstance();
        System.out.println(obj1 == obj2);
    }
}
```


A.true

B.false

C.TRUE

D.FALSE



正确答案: A



### 348、下列关于计算机系统和Java编程语言的说法，正确的是（）

A.计算机是由硬件、操作系统和软件组成，操作系统是缺一不可的组成部分。

B.Java语言编写的程序源代码可以不需要编译直接在硬件上运行。

C.在程序中书写注释不会影响程序的执行，可以在必要的地方多写一些注释。

D.Java的集成开发环境（IDE），如Eclipse，是开发Java语言必需的软件工具。



正确答案: C  



### 349、对于文件的描述正确的是（ ）

A.文本文件是以“.txt”为后缀名的文件，其他后缀名的文件是二进制文件。

B.File类是Java中对文件进行读写操作的基本类。

C.无论文本文件还是二进制文件，读到文件末尾都会抛出EOFException异常。

D.Java中对于文本文件和二进制文件，都可以当作二进制文件进行操作。



正确答案: D 



### 350、以下代码执行后输出结果为（ ）

```prettyprint
public class Test{
    public static Test t1 = new Test();
    {
        System.out.println("blockA");
    }
    
    static
    {
        System.out.println("blockB");
    }
    public static void main(String[] args) {
        Test t2 = new Test();
    }
}
```

A.blockAblockBblockA

B.blockAblockAblockB

C.blockBblockBblockA

D.blockBblockAblockB



正确答案: A 



### 351、下面有关JAVA异常类的描述，说法错误的是？

A.异常的继承结构：基类为Throwable，Error和Exception继承Throwable，RuntimeException和IOException等继承Exception

B.非RuntimeException一般是外部错误(非Error)，其一般被 try{}catch语句块所捕获

C.Error类体系描述了Java运行系统中的内部错误以及资源耗尽的情形，Error不需要捕捉

D.RuntimeException体系包括错误的类型转换、数组越界访问和试图访问空指针等等，必须被 try{}catch语句块所捕获



正确答案: D     

RuntimeException并不必须被捕获。不管异常代表的是可预见的异常条件还是编程错误，如果用try{}catch语句捕获它，会让程序在已经出现错误的情况下继续执行下去，也就是说我们不会及时的察觉到程序出现的问题。如果我们不去处理RuntimeException，让程序在测试阶段把异常传播给外界，这时系统打印出来的调用堆栈路径可以帮助我们更快的找出并修改错误，避免出现更大的损失。



### 352、下面字段声明中哪一个在interface主体内是合法的? （）

A.private final static int answer = 42;

B.public static int answer = 42;

C.final static answer = 42;

D.int answer;



正确答案: B



### 353、int，String，*point，union哪些不是 Java 的数据类型？

A.int

B.String

C.*point

D.union



正确答案: C D   



### 354、（）运算符和（）运算符分别把一个值的位向左和向右移动

A.<<

B.>>

C.&&

D.||



正确答案: A B



### 355、以下表达式中，正确的是（）

A.byte i=128

B.boolean i=null

C.long i=0xfffL

D.double i=0.9239d



正确答案: C D

  

### 356、下面属于JSP内置对象的是？

A.out对象

B.response对象

C.application对象

D.page对象



正确答案: A B C D    这些都是JSP内置对象
JSP内置对象有：
1.request对象
     客户端的请求信息被封装在request对象中，通过它才能了解到客户的需求，然后做出响应。它是HttpServletRequest类的实例。
2.response对象
     response对象包含了响应客户请求的有关信息，但在JSP中很少直接用到它。它是HttpServletResponse类的实例。
3.session对象
     session对象指的是客户端与服务器的一次会话，从客户连到服务器的一个WebApplication开始，直到客户端与服务器断开连接为止。它是HttpSession类的实例.
4.out对象
     out对象是JspWriter类的实例,是向客户端输出内容常用的对象
5.page对象
     page对象就是指向当前JSP页面本身，有点象类中的this指针，它是java.lang.Object类的实例
6.application对象
     application对象实现了用户间数据的共享，可存放全局变量。它开始于服务器的启动，直到服务器的关闭，在此期间，此对象将一直存在；这样在用户的前后连接或不同用户之间的连接中，可以对此对象的同一属性进行操作；在任何地方对此对象属性的操作，都将影响到其他用户对此的访问。服务器的启动和关闭决定了application对象的生命。它是ServletContext类的实例。
7.exception对象
   exception对象是一个例外对象，当一个页面在运行过程中发生了例外，就产生这个对象。如果一个JSP页面要应用此对象，就必须把isErrorPage设为true，否则无法编译。他实际上是java.lang.Throwable的对象
8.pageContext对象
pageContext对象提供了对JSP页面内所有的对象及名字空间的访问，也就是说他可以访问到本页所在的SESSION，也可以取本页面所在的application的某一属性值，他相当于页面中所有功能的集大成者，它的本 类名也叫pageContext。
9.config对象
config对象是在一个Servlet初始化时，JSP引擎向它传递信息用的，此信息包括Servlet初始化时所要用到的参数（通过属性名和属性值构成）以及服务器的有关信息（通过传递一个ServletContext对象）



### 357、下列哪些情况下会导致线程中断或停止运行（      ）

A.抛出InterruptedException异常

B.线程调用了wait方法

C.当前线程创建了一个新的线程

D.高优先级线程进入就绪状态



正确答案: B  



### 358、Java1.8版本之前的前提，Java特性中,abstract class和interface有什么区别（）

A.抽象类可以有构造方法，接口中不能有构造方法

B.抽象类中可以有普通成员变量，接口中没有普通成员变量

C.抽象类中不可以包含静态方法，接口中可以包含静态方法

D.一个类可以实现多个接口，但只能继承一个抽象类。



正确答案: A B D 



### 359、下面有关Java的说法正确的是（         ）

A.一个类可以实现多个接口

B.抽象类必须有抽象方法

C.protected成员在子类可见性可以修改

D.通过super可以调用父类构造函数

E.final的成员方法实现中只能读取类的成员变量

F.String是不可修改的，且java运行环境中对string对象有一个常量池保存



正确答案: A C D E F



### 360、下列流当中，属于处理流的是：（） 

A.FilelnputStream

B.lnputStream

C.DatalnputStream

D.BufferedlnputStream



正确答案: C D

 

### 361、不考虑反射机制，一个子类显式调用父类的构造器必须用super关键字。（  ）

A.正确

B.错误



正确答案: A



### 362、设有定义： int a[] = {4, 2, -7, 5, 1, 6, 3}; 则 a[a[4]] 的值为 。

A.4

B.2

C.-7

D.5



正确答案: B  



### 363、下列叙述错误的是（ ）

A.java程序的输入输出功能是通过流来实现的

B.java中的流按照处理单位可分成两种：字节流和字符流

C.InputStream是一个基本的输出流类。

D.通过调用相应的close（）方法关闭输入输出流



正确答案: C 



### 364、下面程序段执行完成后，则变量sum的值是(    )。

```prettyprint
int b[][]={{1}, {2, 2}, {2, 2, 2}};
int sum = 0;

for(int i = 0; i < b.length; i++) {
    for(int j = 0; j < b[i].length; j++) {
        sum += b[i][j];
    }
}
```

A.32

B.11

C.2

D.3



正确答案: B



### 365、如果一个方法或变量是"private"访问级别，那么它的访问范围是:

A.在当前类，或者子类中

B.在当前类或者它的父类中

C.在当前类，或者它所有的父类中

D.在当前类中

  

正确答案: D

Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限。

·   default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。

·   private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）

·   public : 对所有类可见。使用对象：类、接口、变量、方法

·   protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。

我们可以通过以下表来说明访问权限：

修饰符     当前类     同一包内    子孙类(同一包)        子孙类(不同包)        其他包

public          Y               Y                   Y                               Y                            Y

protected   Y            Y                   Y                              Y/N                       N

default       Y                Y                 Y                               N                        N

private       Y              N                 N                                 N                         N

综上所述，本题正确答案为D。



### 366、main 方法是 Java Application 程序执行的入口点，以下描述哪项是合法的（）。

A.public  static  void  main（ ）

B.public  static  void   main（ String []args ）

C.public static int  main（String  [] arg ）

D.public  void  main（String  arg[] ）



正确答案: B



### 367、有以下程序片段且Interesting不是内部类，下列哪个选项不能插入到行1。（    ）

```prettyprint
1.
2.public class Interesting{
3.// 省略代码
4.}
```

A.import java.awt.*;

B.package mypackage;

C.class OtherClass{   }

D.public class MyClass{ }



正确答案: D  



### 368、有程序片段如下，以下表达式结果为 true 的是（ ）

Float  s=new  Float(0.1f);

Float  t=new  Float(0.1f);

Double  u=new  Double(0.1);

A.s==t

B.s.equals(t)

C.u.equals(s)

D.t.equals(u)



正确答案: B  



### 369、能单独和finally语句一起使用的块是(  )

A.try

B.catch

C.throw

D.throws



正确答案: A



### 370、以下说法错误的是（）

A.数组是一个对象

B.数组不是一种原生类

C.数组的大小可以任意改变

D.在Java中，数组存储在堆中连续内存空间里



正确答案: C  

 在java中,数组是一个对象, 不是一种原生类,对象所以存放在堆中,又因为数组特性,是连续的,只有C不对



### 371、在java中，已定义两个接口B和C，要定义一个实现这两个接口的类，以下语句正确的是（）

A.interface  A extends B，C

B.interface  A eimplements  B，C

C.class  A implements  B，C

D.class  A implements  B，implements C



正确答案: C 



### 372、Java的Daemon线程，setDaemon( )设置必须要？

A.在start之前

B.在start之后

C.前后都可以



正确答案: A   

setDaemon()方法必须在线程启动之前调用，当线程正在运行时调用会产生异常。



### 373、//point X

```prettyprint
public class Foo {
    public static void main(String[] args) throws Exception {

        PrintWriter out = new PrintWriter(
            new java.io.OutputStreamWriter(System.out), true);
        
        out.println("Hello");
    }

}   
```


下面哪个选项放在point X这里可以正确执行？

A.import java.io.PrintWriter;

B.include java.io.PrintWriter;

C.import java.io.OutputStreamWriter;

D.include java.io.OutputStreamWriter;

E.no statement is needed.



正确答案: A          

 java中没有include关键字，导包用import
由于代码中使用了printWriter 类，所以要导入此类Import java.io.PrintWriter;



### 374、如果一个接口Cup有个方法use()，有个类SmallCup实现接口Cup，则在类SmallCup中正确的是？  ( )

A.void use() { …}

B.protected void use() { …}

C.public void use() { …}

D.以上语句都可以用在类SmallCup中



正确答案: C 



### 375、观察下列代码，分析结果()

```prettyprint
String s1 = "coder";     
String s2 = "coder";     
String s3 = "coder" + s2;     
String s4 = "coder" + "coder";     
String s5 = s1 + s2;            
System.out.println(s3 == s4); 
System.out.println(s3 == s5);    
System.out.println(s4 == "codercoder");
```

A.false；false； true；

B.false；true； true；

C.false；false； false；

D.true；false； true；



正确答案: A     

s1,s2都是保存在字符串常量池中的对象；s3是新创建的对象，在堆中；s4，s5指向的也是字符串常量池中的对象；
所以有s3！=s4，s3!=s5，s4=="codercoder"。即为false;false;true。



### 376、有如下一段程序：

### 请问最后打印出来的是什么？（）

```prettyprint
public class Test{
    private static int i=1;
    public int getNext(){
        return i++;
    }
    public static void main(String [] args){
        Test test=new Test();
        Test testObject=new Test();
        test.getNext();
        testObject.getNext();
        System.out.println(testObject.getNext());
    }
}
```

### 

A.2

B.3

C.4

D.5



正确答案: B      

 return i++, 先返回i，然后i+1；
第一次调用getNext()方法时，返回的是1，但此时i=2；
第二次调用 getNext()方法时，返回的是2，但此时i=3；
第三次调用 getNext()方法时，返回的是3，但此时i=4；



### 377、下面有关servlet中init,service,destroy方法描述错误的是？

A.init()方法是servlet生命的起点。一旦加载了某个servlet，服务器将立即调用它的init()方法

B.service()方法处理客户机发出的所有请求

C.destroy()方法标志servlet生命周期的结束

D.servlet在多线程下使用了同步机制，因此，在并发编程下servlet是线程安全的



正确答案: D   

servlet在多线程下其本身并不是线程安全的。
如果在类中定义成员变量，而在service中根据不同的线程对该成员变量进行更改，那么在并发的时候就会引起错误。最好是在方法中，定义局部变量，而不是类变量或者对象的成员变量。由于方法中的局部变量是在栈中，彼此各自都拥有独立的运行空间而不会互相干扰，因此才做到线程安全。



### 378、根据以下接口和类的定义，要使代码没有语法错误，则类Hero中应该定义方法(    )。

```prettyprint
interface Action{  
    void fly();  
}
class Hero implements Action{  //……  }
```

A.private void fly(){}

B.void fly(){}

C.protected void fly(){}

D.public void fly(){}



正确答案: D



### 379、以下java程序代码，执行后的结果是（）

```prettyprint
java.util.HashMap map=new java.util.HashMap(); 
map.put("name",null);      
map.put("name","Jack");
System.out.println(map.size());
```

A.0

B.null

C.1

D.2



正确答案: C         

HashMap可以插入null的key或value，插入的时候，检查是否已经存在相同的key，如果不存在，则直接插入，如果存在，则用新的value替换旧的value，在本题中，第一条put语句，会将key/value对插入HashMap，而第二条put，因为已经存在一个key为name的项，所以会用新的value替换旧的vaue，因此，两条put之后，HashMap中只有一个key/value键值对。那就是（name，jack）。所以，size为1.



### 380、对下面Spring声明式事务的配置含义的说明错误的是（）

```prettyprint
<bean id="txProxyTemplate" abstract="true"
class=
"org.springframework.transaction.interceptor.TransactionProxyFactoryBean">
    <property name="transactionManager" ref="myTransactionManager" />
<property name="transactionAttributes">      
 <props>
        <prop key="get*">PROPAGATION_REQUIRED,readOnly</prop>
         <prop key="*">PROPAGATION_REQUIRED</prop>
     </props>
</property> 
</bean>
```

A.定义了声明式事务的配置模板

B.对get方法采用只读事务

C.缺少sessionFactory属性的注入

D.配置需要事务管理的bean的代理时，通过parent引用这个配置模板，代码如下：
<bean id="petBiz" parent="txProxyTemplate">
         <property name="target" ref="petTarget"/>
</bean>



正确答案: C   



### 381、java程序内存泄露的最直接表现是（ ）

A.频繁FullGc

B.jvm崩溃

C.程序抛内存溢出的Exception

D.java进程异常消失



正确答案: C    

 java是自动管理内存的，通常情况下程序运行到稳定状态，内存大小也达到一个 基本稳定的值
但是内存泄露导致Gc不能回收泄露的垃圾，内存不断变大.
最终超出内存界限，抛出OutOfMemoryExpection



### 382、关于中间件特点的描述.不正确的是（）

A.中间件运行于客户机/服务器的操作系统内核中，提高内核运行效率

B.中间件应支持标准的协议和接口

C.中间件可运行于多种硬件和操作系统平台上

D.跨越网络,硬件，操作系统平台的应用或服务可通过中间件透明交互



正确答案: A

  

### 383、下面哪个不属于HttpServletResponse接口完成的功能？

A.设置HTTP头标

B.设置cookie

C.读取路径信息

D.输出返回数据



正确答案: C



### 384、已知x >= y and y >= z 为真，那么x > z or y = z 值为

A.真

B.假

C.无法确定

D.x y z同为正数时为真



正确答案: C   

条件可以简单分析为数学不等式  x>=y>=z，那么x>z不一定为true
当x>z为true，后面的条件忽略，结果为真；
当x==z，x>z为fslae，继续判断后一个条件
    如果z==0，则y=z为false，结果为假；
    如果z!=0，则y=z为true，结果为真；
所以，最后的结果是不确定的。



### 385、Java多线程有几种实现方法？

A.继承Thread类

B.实现Runnable接口

C.实现Thread接口

D.以上都不正确



正确答案: A B   

两种。
1、继承Thread类，Override它的run方法；
2、实现Runnable接口，实现run方法；

由于Java只有单继承，所以，第一种方法只能继承一个Thread；第二种则可以实现多继承。



### 386、如果进栈序列为e1，e2，e3，e4，则可能的出栈序列是()

注：一个元素进栈后可以马上出栈，不用等全部进栈

A.e3，e1，e4，e2

B.e2，e4，e3，e1

C.e2，e3，e4，e1

D.任意顺序都有可能



正确答案: B C   



### 387、java中提供了哪两种用于多态的机制

A.通过子类对父类方法的覆盖实现多态

B.利用重载来实现多态.即在同一个类中定义多个同名的不同方法来实现多态。

C.利用覆盖来实现多态.即在同一个类中定义多个同名的不同方法来实现多态。

D.通过子类对父类方法的重载实现多态



正确答案: A B  

 Java通过方法重写和方法重载实现多态
方法重写是指子类重写了父类的同名方法
方法重载是指在同一个类中，方法的名字相同，但是参数列表不同



### 388、下列说法正确的是（）？

A.我们直接调用Thread对象的run方法会报异常，所以我们应该使用start方法来开启一个线程

B.一个进程是一个独立的运行环境，可以被看做一个程序或者一个应用。而线程是在进程中执行的一个任务。Java运行环境是一个包含了不同的类和程序的单一进程。线程可以被称为轻量级进程。线程需要较少的资源来创建和驻留在进程中，并且可以共享进程中的资源

C.synchronized可以解决可见性问题，volatile可以解决原子性问题

D.ThreadLocal用于创建线程的本地变量，该变量是线程之间不共享的



正确答案: B D 



### 389、JDK提供的用于并发编程的同步器有哪些？

A.Semaphore

B.CyclicBarrier

C.CountDownLatch

D.Counter



正确答案: A B C    

A，Java 并发库 的Semaphore 可以很轻松完成信号量控制，Semaphore可以控制某个资源可被同时访问的个数，通过 acquire() 获取一个许可，如果没有就等待，而 release() 释放一个许可。
B，CyclicBarrier 主要的方法就是一个：await()。await() 方法没被调用一次，计数便会减少1，并阻塞住当前线程。当计数减至0时，阻塞解除，所有在此 CyclicBarrier 上面阻塞的线程开始运行。
C，直译过来就是倒计数(CountDown)门闩(Latch)。倒计数不用说，门闩的意思顾名思义就是阻止前进。在这里就是指 CountDownLatch.await() 方法在倒计数为0之前会阻塞当前线程。
D，Counter不是并发编程的同步器



## 390、下列流当中，属于处理流的是：（）

A.FilelnputStream

B.lnputStream

C.DatalnputStream

D.BufferedlnputStream



正确答案: C D  

 

### 391、类中的数据域使用private修饰为私有变量，所以任何方法均不能访问它。

A.正确

B.错误



正确答案: B 

 

### 392、当点击鼠标或者拖动鼠标时，触发的事件是下列的哪一个？（）

A.KeyEvent

B.AxtionEvent

C.ItemEvent

D.MouseEvent



正确答案: D  



### 393、在java中，在同一包内，非私有类Cat里面有个公有方法sleep()，该方法前有static修饰，则可以直接用Cat.sleep()。（ ）

A.正确

B.错误



正确答案: A  



### 394、Java中只有整型才能使用的运算符为？

A.*

B./

C.%

D.+



正确答案: C    

ABD选项的操作符都可用于float和double
只有%取余操作，只适用于整型



### 395、数学表达式|x|<10 对应的java表达式为 。

A.|x|<10

B.x<10&&x>-10

C.x<10||x>-10

D.10>x>-10



正确答案: B 

 

### 396、下面有关java classloader说法错误的是?

A.Java默认提供的三个ClassLoader是BootStrap ClassLoader，Extension ClassLoader，App ClassLoader

B.ClassLoader使用的是双亲委托模型来搜索类的

C.JVM在判定两个class是否相同时，只用判断类名相同即可，和类加载器无关

D.ClassLoader就是用来动态加载class文件到内存当中用的



正确答案: C    

 JVM在判定两个class是否相同时，不仅要判断两个类名是否相同，而且要判断是否由同一个类加载器实例加载的。



### 397、

```prettyprint
public class Test { 
    public static void main(String[] args) {
        Father a = new Father();
        Father b = new Child();
    }
} 
class Father { 
    public Father() {
        System.out.println("我是父类");
    }
} 
class Child extends Father { 
    public Child() {
        System.out.println("我是子类");
    }
}
```

A.我是父类
我是父类
我是子类

B.我是父类
我是子类
我是子类

C.我是父类
我是父类

D.我是父类
我是父类
我是父类



正确答案: A 



### 398、在上下文和头文件正常的情况下，代码将打印？

```prettyprint
System.out.println(10%3*2);
```

A.1

B.2

C.4

D.6



正确答案: B    

%和*是同一个优先级，从左到右运算



### 399、以下表达式的类型和值（注意整数除法）是（）

-5 + 1/4 + 2*-3 + 5.0

A.int -3

B.int -4

C.double -5.5

D.double -6.0



正确答案: D

  

### 400、java中将ISO8859-1字符串转成GB2312编码，语句为 ？  

A.new String("字符串".getBytes("ISO8859-1"),"GB2312")

B.new String(String.getBytes("GB2312"）, ISO8859-1)

C.new String(String.getBytes("ISO8859-1"))

D.new String(String.getBytes("GB2312"))



正确答案: A
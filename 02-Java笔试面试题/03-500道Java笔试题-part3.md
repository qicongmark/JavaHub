### 201、Which statement is true for the class java.util.ArrayList?

A.The elements in the collection are ordered.

B.The collection is guaranteed to be immutable.

C.The elements in the collection are guaranteed to be unique.

D.The elements in the collection are accessed using a unique key.

E.The elements in the collections are guaranteed to be synchronized.



正确答案: A      

Serializable, Cloneable , Iterable <E>, Collection <E>, List <E>, RandomAccess List接口是有序的，通常允许重复，因此可以确定A对，C错；ArrayList是实现List 接口的大小可变数组，所以B错；D是Map的特性，所以D错；查看手册： Note that this implementation is not synchronized.  ArrayList的实现是不是线程同步的，所以E错。



### 202、在Java中，对于不再使用的内存资源，如调用完成的方法，“垃圾回收器”会自动将其释放。（  ）

A.正确

B.错误



正确答案: B



### 203、以下代码执行的结果显示是多少（）？

```prettyprint
public class Demo {
    public static void main(String args[]){
        int count =0;
        int num =0;
        for(int i = 0;i <= 100;i++){
            num = num + i;
            count = count++;
        }
        System.out.println("num*count="+(num*count));
    }
}
```

A.num * count = 505000

B.num * count = 0

C.运行时错误

D.num * count = 5050



正确答案: B



### 204、已知 boolean result = false，则下面哪个选项是合法的：

A.result=1

B.result=true;

C.if(result!=0) {//so something…}

D.if(result) {//do something…}



正确答案: B D  



### 205、下列关于JAVA多线程的叙述正确的是（）

A.调用start()方法和run()都可以启动一个线程

B.CyclicBarrier和CountDownLatch都可以让一组线程等待其他线程

C.Callable类的call()方法可以返回值和抛出异常

D.新建的线程调用start()方法就能立即进行运行状态



正确答案: B C  



### 206、在J2EE中，使用Servlet过滤器，需要在web.xml中配置（）元素

A.<filter>

B.<filter-mapping>

C.<servlet-filter>

D.<filter-config>



正确答案: A B           

Servlet过滤器的配置包括两部分：
第一部分是过滤器在Web应用中的定义，由<filter>元素表示，包括<filter-name>和<filter-class>两个必需的子元素
第二部分是过滤器映射的定义，由<filter-mapping>元素表示,可以将一个过滤器映射到一个或者多个Servlet或JSP文件，也可以采用url-pattern将过滤器映射到任意特征的URL。



### 207、线程安全的map在JDK 1.5及其更高版本环境 有哪几种方法可以实现?

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

   

### 208、下面有关java classloader说法正确的是（）？

A.ClassLoader就是用来动态加载class文件到内存当中用的

B.JVM在判定两个class是否相同时，只用判断类名相同即可，和类加载器无关

C.ClassLoader使用的是双亲委托模型来搜索类的

D.Java默认提供的三个ClassLoader是Boostrap ClassLoader，Extension ClassLoader，App ClassLoader

E.以上都不正确



正确答案: A C D



### 209、下列流当中，属于处理流的是：（）   

A.FilelnputStream

B.lnputStream

C.DatalnputStream

D.BufferedlnputStream



正确答案: C D  



### 210、Java是一门支持反射的语言,基于反射为Java提供了丰富的动态性支持，下面关于Java反射的描述，哪些是错误的：(    )

A.Java反射主要涉及的类如Class, Method, Filed,等，他们都在java.lang.reflet包下

B.通过反射可以动态的实现一个接口，形成一个新的类，并可以用这个类创建对象，调用对象方法

C.通过反射，可以突破Java语言提供的对象成员、类成员的保护机制，访问一般方式不能访问的成员

D.Java反射机制提供了字节码修改的技术，可以动态的修剪一个类

E.Java的反射机制会给内存带来额外的开销。例如对永生堆的要求比不通过反射要求的更多

F.Java反射机制一般会带来效率问题，效率问题主要发生在查找类的方法和字段对象，因此通过缓存需要反射类的字段和方法就能达到与之间调用类的方法和访问类的字段一样的效率



正确答案: A D F  

 

### 211、下列关于Java类中方法的定义，正确的是（）

A.若代码执行到return语句，则将当前值返回，而且继续执行return语句后面的语句。

B.只需要对使用基本数据类型定义的属性使用getter和setter，体现类的封装性。

C.方法的返回值只能是基本数据类型。

D.在同一个类中定义的方法，允许方法名称相同而形参列表不同。



正确答案: D



### 212、接口不能扩展（继承）多个接口。（ ）

A.正确

B.错误



正确答案: B 



### 213、Which of the following statements are valid array declaration?

(A) int number();
(B) float average[];
(C) double[] marks;
(D) counter int[];



A.(B) & (C)

B.(A)

C.(A) & (C)

D.(D)



正确答案: A    

java里面有两种数组声明方式



### 214、在java中，要表示10个学生的成绩，下列声明并初始化数组正确的是（）

A.int[] score=new int[ ]

B.int score[10]

C.int score[]=new int[9]

D.int score[]=new int[10]



正确答案: D    

以下两种写法都可以：
int score[] = new int[10];
int[] score = new int[10];



### 215、后端获取数据，向前端输出过程中，以下描述正确的是

A.对于前端过滤过的参数，属于可信数据，可以直接输出到前端页面

B.对于从数据库获得的数据，属于可信数据，可以直接输出到前端页面

C.对于从用户上传的Excel等文件解析出的数据，属于可信数据，可以直接输出到前端页面

D.其它选项都不属于可信数据，输出前应该采用信息安全部发布的XSSFilter做进行相应编码



正确答案: D



### 216、正则表达式语法中 \d 匹配的是？（）

A.数字

B.非数字

C.字母

D.空白字符



正确答案: A   



### 217、分析以下代码，说法正确的是（）

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



### 218、以下代码的循环次数是

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



### 219、下面代码的执行结果是 :

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



### 220、指出下列程序运行的结果（）

```prettyprint
public class Example{
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main(String args[]){
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';
    }
}
```

A.good and  abc

B.good and gbc

C.test ok and abc

D.test ok and gbc



正确答案: B 



### 221、给定以下JAVA代码，这段代码运行后输出的结果是（）

```prettyprint
public class Test{  
    public static int aMethod(int i)throws Exception{
        try{
            return i/10;
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a aMethod");
        }finally{
            System.out.printf("finally");
        }
    } 
    
    public static void main(String[] args){
        try
        {
            aMethod(0);
        }
        catch (Exception ex)
        {
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
    }
}
```

A.exception in main finished

B.finallyfinished

C.exception in main finally

D.finally exception in main finally



正确答案: B



### 222、使用mvc模式设计的web应用程序具有以下优点,除了？

A.可维护行强

B.可扩展性强

C.代码重复少

D.大大减少代码量



正确答案: D       

MVC全名是Model View Controller，是模型(model)－视图(view)－控制器(controller)的缩写，一种软件设计典范，用一种业务逻辑、数据、界面显示分离的方法组织代码，将业务逻辑聚集到一个部件里面，在改进和个性化定制界面及用户交互的同时，不需要重新编写业务逻辑。MVC被独特的发展起来用于映射传统的输入、处理和输出功能在一个逻辑的图形化用户界面的结构中。
MVC只是将分管不同功能的逻辑代码进行了隔离，增强了可维护和可扩展性，增强代码复用性，因此可以减少代码重复。但是不保证减少代码量，多层次的调用模式还有可能增加代码量



### 223、以下哪个事件会导致线程销毁？（）

A.调用方法sleep()

B.调用方法wait()

C.start()方法的执行结束

D.run()方法的执行结束



正确答案: D 



### 224、对于非运行时异常，程序中一般可不做处理，由java虚拟机自动进行处理。

A.正确

B.错误 



正确答案: B



### 225、如果一个接口Glass有个公有方法setColor()，有个类BlueGlass实现接口Glass，则在类BlueGlass中正确的是？  ( )

A.protected void setColor() { …}

B.void setColor() { …}

C.public void setColor() { …}

D.以上语句都可以用在类BlueGlass中



正确答案: C  



### 226、以下叙述正确的是

A.实例方法可直接调用超类的实例方法

B.实例方法可直接调用超类的类方法

C.实例方法可直接调用子类的实例方法

D.实例方法可直接调用本类的实例方法



正确答案: D             

A错误，类的实例方法是与该类的实例对象相关联的，不能直接调用，只能通过创建超类的一个实例对象，再进行调用
B错误，当父类的类方法定义为private时，对子类是不可见的，所以子类无法调用
C错误，子类具体的实例方法对父类是不可见的，所以无法直接调用， 只能通过创建子类的一个实例对象，再进行调用
D正确，实例方法可以调用自己类中的实例方法



### 227、下面论述正确的是（）？

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



### 228、面向对象方法的多态性是指（）

A.一个类可以派生出多个特殊类

B.一个对象在不同的运行环境中可以有不同的变体

C.针对一消息，不同的对象可以以适合自身的方式加以响应

D.一个对象可以是由多个其他对象组合而成的



正确答案: C



### 229、判断对错。在java的多态调用中，new的是哪一个类就是调用的哪个类的方法。

A.对

B.错



正确答案: B       

 Java多态有两种情况：重载和覆写
在覆写中，运用的是动态单分配，是根据new的类型确定对象，从而确定调用的方法；
在重载中，运用的是静态多分派，即根据静态类型确定对象，因此不是根据new的类型确定调用的方法



### 230、以下哪些语言是面向对象的是（）

A.C

B.C++

C.JAVA

D.汇编



正确答案: B C   



### 231、下面属于java引用类型的有？

A.String

B.byte

C.char

D.Array



正确答案: A D               

java语言是强类型语言，支持的类型分为两类：基本类型和引用类型。
基本类型包括boolean类型和数值类型，数值类型有整数类型和浮点类型。整数类型包括：byte、short、int、long和char；浮点类型包括：float和double
引用类型包括类、接口和数组类型以及特殊的null类型。



### 232、下列哪个选项是合法的标识符？（）

A.123

B._name

C.class

D.first



正确答案: B D



### 233、下面哪些接口直接继承自Collection接口（）

A.List

B.Map

C.Set

D.Iterator



正确答案: A C



### 234、若需要定义一个类，下列哪些修饰符是允许被使用的？（ ）

A.static

B.package

C.private

D.public



正确答案: A C D 



### 235、下面有关 java 类加载器,说法正确的是?()

A.引导类加载器(bootstrap class loader):它用来加载 Java 的核心库,是用C++来实现的

B.扩展类加载器(extensions class loader):它用来加载 Java 的扩展库。

C.系统类加载器(system class loader):它根据 Java 应用的类路径(CLASSPATH)来加载 Java 类

D.tomcat 为每个 App 创建一个 Loader,里面保存着此 WebApp 的 ClassLoader。需要加载 WebApp 下的类时,就取出 ClassLoader 来使用



正确答案: B C D



### 236、下面的类哪些可以处理Unicode字符?

A.InputStreamReader

B.BufferedReader

C.Writer

D.PipedInputStream



正确答案: A B C 



### 237、以下哪种JAVA的变量表达式使得变量a和变量b具有相同的内存引用地址(  )

A.String a = "hello"; String b = "hello";

B.Integer a; Integer b = a;

C.int a = 1; Integer b = new Integer(1);

D.int a = 1; Integer b = 1;



正确答案: A B 



### 238、下列有关java构造函数叙述正确的是（）

A.构造器的返回值为void类型

B.如果一个源文件中有多个类，那么构造器必须与公共类同名

C.构造器可以有0个，1个或一个以上的参数

D.每个类可以有一个以上的构造器



正确答案: C D  



### 239、A,B,C,D 中哪些是 setvar的重载？

```prettyprint
public class methodover{
    public void setVar(int a, int b, float c) {}
}
```

A.private void setVar(int a， float c， int b){}

B.protected void setVar(int a， int b， float c){}

C.public int setVar(int a， float c， int b){return a;}

D.public int setVar(int a， float c){return a;}



正确答案: A C D         

重载是在同一个类中，有多个方法名相同，参数列表不同(参数个数不同，参数类型不同),与方法的返回值无关，与权限修饰符无关，B中的参数列表和题目的方法完全一样了。



### 240、下面正确的2项是？

```prettyprint
public class NameList{
    private List names = new ArrayList();
    public synchronized void add(String name){
        names.add(name);
    }
    public synchronized void printAll() {
        for (int i = 0; i < names.size(); i++){
            System.out.print(names.get(i) + "");
        }
    }

    public static void main(String[]args){
        final NameList sl = new NameList();
        for (int i = 0; i < 2; i++){
            new Thread(){
                public void run(){
                    sl.add("A");
                    sl.add("B");
                    sl.add("C");
                    sl.printAll();
                }
            } .start();
        }
    }
}
```



A.运行的时候可能抛异常

B.运行的时候可能没有输出，也没有正常退出

C.代码运行的时候可能没有输出，但是正常退出

D.代码输出"A B A B C C "

E.代码输出"A B C A B C A B C "

F.代码输出"A A A B C A B C C "

G.代码输出"A B C A A B C A B C "



正确答案: E G 



### 241、以下语句的执行结果是什么？

1+”10”+3+”2”

A.”11032”

B.“16”

C.16

D.“32101”



正确答案: A 

```prettyprint
System.out.println(1+"10"+3+"2");//11032
System.out.println(1+2+"10"+3+"2");//31032
System.out.println(1+"10"+3+1+"2");//110312
```

注意“+”的两边的类型



### 242、下面哪个描述正确? 

A.程序中的注释越多，程序运行得越快。

B.int是java.lang包中可用的类的名称

C.类总是有一个构造函数（可能由java编译器自动提供）

D.实例变量名称只能包含字母和数字



正确答案: C 



### 243、设A为已知定义的类名，下列创建A类的对象a的语句正确的是( )

A.float  A  a

B.public  a=A（）

C.A a=new  int ()

D.A  a=new  A()



正确答案: D  



### 244、覆盖（重写）与重载的关系是（）。

A.覆盖（重写）只有出现在父类与子类之间，而重载可以出现在同一个类中

B.覆盖（重写）方法可以有不同的方法名，而重载方法必须是相同的方法名

C.final修饰的方法可以被覆盖（重写），但不能被重载

D.覆盖（重写）与重载是同一回事



正确答案: A



### 245、有以下代码片段：

```prettyprint
String str1="hello";

String str2="he"+ new String("llo");

System.out.println(str1==str2);
```

请问输出的结果是：

A.true

B.都不对

C.null

D.false



正确答案: D  



### 246、ArrayList和LinkList的描述，下面说法错误的是？

A.LinkedeList和ArrayList都实现了List接口

B.ArrayList是可改变大小的数组，而LinkedList是双向链接串列

C.LinkedList不支持高效的随机元素访问

D.在LinkedList的中间插入或删除一个元素意味着这个列表中剩余的元素都会被移动；而在ArrayList的中间插入或删除一个元素的开销是固定的



正确答案: D      

这个说法说反了
Arraylist的内存结构是数组，当超出数组大小时创建一个新的数组，吧原数组中元素拷贝过去。其本质是顺序存储的线性表，插入和删除操作会引发后续元素移动，效率低，但是随机访问效率高
LinkedList的内存结构是用双向链表存储的，链式存储结构插入和删除效率高，不需要移动。但是随机访问效率低，需要从头开始向后依次访问



### 247、在基本JAVA类型中，如果不明确指定，整数型的默认是什么类型？带小数的默认是什么类型？

A.int float

B.int double

C.long float

D.long double



正确答案: B   

整数类型 默认为 int
带小数的默认为 double



### 248、在Web应用程序的文件与目录结构中，web.xml是放置在(    )中。

A.WEB-INF目录

B.conf目录

C.lib目录

D.classes目录



正确答案: A   
web.xml文件是用来初始化配置信息，web.xml是放置在WEB-INF目录中



### 249、下面所示的java代码，运行时，会产生（）类型的异常

int Arry_a[] = new int[10];
System.out.println(Arry_a[10]);

A.ArithmeticException

B.NullPointException

C.IOException

D.ArrayIndexOutOfBoundsException



正确答案: D 



### 250、导出类调用基类的构造器必须用到的关键字： ( )

A.this

B.final

C.super

D.static



正确答案: C



### 251、若所用变量都已正确定义，以下选项中，非法的表达式是（）

A.a!= 4||b==1

B.’a’ % 3

C.’a’ = 1/3

D.’A’ + 32



正确答案: C 



### 252、Java的Daemon线程，setDaemon( )设置必须要？

A.在start之前

B.在start之后

C.前后都可以



正确答案: A  



### 253、javac的作用是（    ）。

A.将源程序编译成字节码

B.将字节码编译成源程序

C.解释执行Java字节码

D.调试Java代码



正确答案: A 



### 254、以下代码的输出的正确结果是

```prettyprint
public class Test {
    public static void main(String args[]) {
        String s = "祝你考出好成绩！";
        System.out.println(s.length());
    }
}
```

A.24

B.16

C.15

D.8



正确答案: D



### 255、以下程序段的输出结果为：

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



### 256、列表(List)和集合(Set)下面说法正确的是？  ( )

A.Set中至多只能有一个空元素

B.List中至多只能有一个空元素

C.List和Set都可以包含重复元素的有序集合

D.List和Set都是有序集合



正确答案: A  



### 257、下面代码的执行结果是 :

```prettyprint
public class Chinese {
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



### 258、 对于abstract声明的类，下面说法正确的是

A.可以实例化

B.不可以被继承

C.子类为abstract

D.只能被继承

E.可以被抽象类继承



正确答案: E        

A,抽象类不能实例化，因为有抽象方法未实现
B,可以被继承。派生类可以实现抽象方法
C，子类可以是抽象的，也可以非抽象的
D，只能被继承说法太肯定，不正确
E，可以被抽象类继承，也可以被非抽象类继承



### 259、下面哪个方法是 public void  example(){...} 的重载方法？ ( )

A.public void Example( int m){...}

B.public int example(){...}

C.public void example2(){...}

D.public int example ( int m, float f){...}



正确答案: D         

考察的是方法重载的定义。
方法名相同------------------排除AC选项。
方法的参数类型，参数个不一样。-----------------B选项和题目中的都没有参数，所以排除B选项。
方法的返回类型可以不相同
方法的修饰符可以不相同



### 260、建立Statement对象的作用是？

A.连接数据库

B.声明数据库

C.执行SQL语句

D.保存查询结果



正确答案: C  



### 261、类方法中可以直接调用对象变量？

A.正确

B.错误



正确答案: B



### 262、关于继承和实现说法正确的 是 ？ (    )

A.类可以实现多个接口，接口可以继承（或扩展）多个接口

B.类可以实现多个接口，接口不能继承（或扩展）多个接口

C.类和接口都可以实现多个接口

D.类和接口都不可以实现多个接口



正确答案: A 



### 263、下列不属于Java语言性特点的是

A.Java致力于检查程序在编译和运行时的错误

B.Java能运行虚拟机实现跨平台

C.Java自己操纵内存减少了内存出错的可能性

D.Java还实现了真数组，避免了覆盖数据的可能



正确答案: D   

 Java致力于检查程序在编译和运行时的错误。
Java虚拟机实现了跨平台接口
类型检查帮助检查出许多开发早期出现的错误。
Java自己操纵内存减少了内存出错的可能性。
Java还实现了真数组，避免了覆盖数据的可能。
注意，是避免数据覆盖的可能，而不是数据覆盖类型



### 264、以下哪个类包含方法flush()？

A.InputStream

B.OutputStream

C.A 和B 选项都包含

D.A  和B 选项都不包含



正确答案: B  



### 265、关于Java中参数传递的说法，哪个是错误的？

A.在方法中，修改一个基础类型的参数不会影响原始参数值

B.在方法中，改变一个对象参数的引用不会影响到原始引用

C.在方法中，修改一个对象的属性会影响原始对象参数

D.在方法中，修改集合和Maps的元素不会影响原始集合参数



正确答案: D



### 266、 下列哪个说法是正确的（）       

A.ConcurrentHashMap使用synchronized关键字保证线程安全

B.HashMap实现了Collction接口

C.Array.asList方法返回java.util.ArrayList对象

D.SimpleDateFormat是线程不安全的



正确答案: D 



### 267、给定includel.isp文件代码片段，如下：

```jsp
<% pageContext.setAttribute(“User”,”HAHA”);%>
______ // 此处填写代码
给定include2.jsp文件代码片段如下：
<%=pageContext.getAttribute(“User”)%>
要求运行include1.jsp时，浏览器上输出：HAHA
```

A.<jsp:include page=”include2.jsp” flash=”true”>

B.<%@include file=”include2.jsp”%>

C.<jsp:forward page=”include2.jsp”>

D. <% response.sendRedirect(“include2.jsp”); %> 



正确答案: B         

B选项是静态包含，相当于不include2.jsp页面内容拷贝到此处，因此可以输出User属性值
D选项是转发重定向，转发的时候pageContent内的属性值不能被传递，因此得不到User属性值



### 268、下面属于java引用类型的有？

A.String

B.byte

C.char

D.Array



正确答案: A D          

 java语言是强类型语言，支持的类型分为两类：基本类型和引用类型。
基本类型包括boolean类型和数值类型，数值类型有整数类型和浮点类型。整数类型包括：byte、short、int、long和char；浮点类型包括：float和double
引用类型包括类、接口和数组类型以及特殊的null类型。



### 269、int，String，*point，union哪些不是 Java 的数据类型？

A.int

B.String

C.*point

D.union



正确答案: C D 



### 270、下面有关java类加载器，说法正确的是？

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



### 271、下列程序执行后结果为( )

```prettyprint
class A {
    public int func1(int a, int b) {
        return a - b;
    }
}
class B extends A {
    public int func1(int a, int b) {
        return a + b;
    }
}
public class ChildClass {
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        System.out.println("Result=" + a.func1(100, 50));
        System.out.println("Result=" + b.func1(100, 50));
    }
}
```

A.Result=150
Result=150

B.Result=100
Result=100

C.Result=100
Result=150

D.Result=150
Result=100



正确答案: A  



### 272、输入流将数据从文件，标准输入或其他外部输入设备中加载道内存，在 java 中其对应于抽象类（）及其子类。

A.java.io.InputStream

B.java.io.OutputStream

C.java.os.InputStream

D.java.os.OutputStream



正确答案: A  



### 273、将类的成员的访问权限设置为默认的，则该成员能被( )

A.同一包中的类访问

B.其它包中的类访问

C.所有的类访问

D.所有的类的子类访问



正确答案: A 



### 274、关于Java语言的内存回收机制，下列选项中最正确的一项是

A.Java程序要求用户必须手工创建一个线程来释放内存

B.Java程序允许用户使用指针来释放内存

C.内存回收线程负责释放无用内存

D.内存回收线程不能释放内存对象



正确答案: C          

A，java的内存回收是自动的，Gc在后台运行，不需要用户手动操作
B，java中不允许使用指针
D，内存回收线程可以释放无用的对象内存



### 275、下面哪个选项没有实现 java.util.Map 接口?

A.Hashtable

B.HashMap

C.Vector

D.IdentityHashMap



正确答案: C    

A，B，D都实现了Map接口，其中A与B的区别是一个是线程安全的，一个是线程不安全的
C中Vector是实现了List接口，是一个线程安全的List



### 276、下列哪个语句语法正确？（ ）

A.byte y = 11; byte x = y +y;

B.String x = new Object();

C.Object x = new String(“Hellow”);

D.int a [11] = new int [11];



正确答案: C         

对于A，前一半语句赋值是没有问题的，问题是后半句，在对byte型的变量进行相加时，会先自动转换为int型进行计算，所以计算结果也是int型的，int型赋值给byte需要强制转换，所以A会出错
对于B，因为object是String的父类，所以不能这样使用，不能把父类对象赋值给子类，只能是Object x = new String();
对于C，因为String是Object的子类，所以可以将子类赋值给父类。
对于D，因为在声明变量时不需要指定容量，例如int  a[] = new int[11];这样是正确的，但是像D选项这样是错误的



### 277、对于java类型变量char c,short s,float f,double d,表达式c*s+f+d的结果类型为（）

A.float

B.char

C.short

D.double



正确答案: D   

自动类型转换遵循下面的规则：
1.若参与运算的数据类型不同，则先转换成同一类型，然后进行运算。
2.转换按数据长度增加的方向进行，以保证精度不降低。例如int型和long型运算时，先把int量转成long型后再进行运算。
3.所有的浮点运算都是以双精度进行的，即使仅含float单精度量运算的表达式，也要先转换成double型，再作运算。
4.char型和short型参与运算时，必须先转换成int型。
5.在赋值运算中，赋值号两边的数据类型不同时，需要把右边表达式的类型将转换为左边变量的类型。如果右边表达式的数据类型长度比左边长时，将丢失一部分数据，这样会降低精度。



### 278、以下哪个方法用于定义线程的执行体？

A.start()

B.init()

C.run()

D.synchronized()



正确答案: C 



### 279、程序文件名必须与公共外部类的名称完全一致（包括大小写）.

A.正确

B.错误



正确答案: A 



### 280、能单独和finally语句一起使用的块是(  )

A.try

B.catch

C.throw

D.throws



正确答案: A



### 281、局部变量能否和成员变量重名？

A.可以，局部变量可以与成员变量重名，这时可用“this”来指向成员变量

B.可以，这时可用“local”关键字来指向局部变量

C.不能，局部变量不能与成员变量重名

D.不能，在一个类中不能有重名变量，不管是成员变量还是函数中的局部变量



正确答案: A



### 282、在Java中，什么是Garbage Collection?（）

A.自动删除在程序中导入但未使用的任何包

B.JVM检查任何Java程序的输出并删除任何没有意义的东西

C.当对象的所有引用都消失后，对象使用的内存将自动回收

D.操作系统定期删除系统上可用的所有java文件



正确答案: C



### 283、下列叙述错误的是（ ）

A.在接口中定义的方法除了default和static关键字修饰的方法拥有方法体，其他方法都应是没有方法体的抽象方法（JDK1.8以后）

B.一个java类只能有一个父类,但可以实现多个接口

C.在类声明中,用implements关键字声明该类实现的接口

D.定义接口时使用implements关键字。



正确答案: D 



### 284、在异常处理中，以下描述不正确的有

A.try块不可以省略

B.可以使用多重catch块

C.finally块可以省略

D.catch块和finally块可以同时省略



正确答案: D     

假如try中有异常抛出，则会去执行catch块，再去执行finally块；假如没有catch 块，可以直接执行finally 块，方法就以抛出异常的方式结束，而finally 后的内容也不会被执行，所以catch 和 finally 不能同时省略。



### 285、以下代码的循环次数是

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



### 286、要在控制台界面下接收用户从键盘输入，需要import的包是：（ ）

A.java.lang包

B.java.awt包

C.java.io包

D.java.applet包



正确答案: C



### 287、给定以下JAVA代码，这段代码运行后输出的结果是（）

```prettyprint
public class Test{  
    public static int aMethod(int i)throws Exception{
        try{
            return i/10;
        }catch (Exception ex){
            throw new Exception("exception in a aMethod");
        }finally{
            System.out.printf("finally");
        }
    } 
    
    public static void main(String[] args){
        try{
            aMethod(0);
        }catch (Exception ex){
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
    }
}
```

A.exception in main finished

B.finallyfinished

C.exception in main finally

D.finally exception in main finally



正确答案: B



### 288、下面的程序输出的结果是( )

```prettyprint
public class A implements B{
    public static void main(String args[]){
        int i;
        A a1 = new A();
        i =a1.k;
        System.out.println("i="+i);
    }
}
interface B{
    int k=10；
}
```

A.i=0

B.i=10

C.程序有编译错误

D.i=true



正确答案: B   



### 289、如果一个接口Cow有个public方法drink()，有个类Calf实现接口Cow，则在类Calf中正确的是？  ( )

A.void drink() { …}

B.protected void drink() { …}

C.public void drink() { …}

D.以上语句都可以用在类Calf中



正确答案: C  



### 290、有以下类定义：

```prettyprint
abstract class Animal{
    abstract void say();
}
public class Cat extends Animal{
    public Cat(){
        System.out.printf("I am a cat");
    }
    public static void main(String[] args) {
        Cat cat=new Cat();
    }
}
```

运行后：

A.I am a cat

B.Animal能编译，Cat不能编译

C.Animal不能编译，Cat能编译

D.编译能通过，但是没有输出结果



正确答案: B   

当一个实体类集成一个抽象类，必须实现抽象类中的抽象方法，抽象类本身没有错误，但是cat类编译通不过



### 291、以下java程序代码，执行后的结果是（）

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



### 292、关于访问权限，说法正确的是？ ( )

A.类A和类B在同一包中，类B有个protected的方法testB，类A不是类B的子类（或子类的子类），类A可以访问类B的方法testB

B.类A和类B在同一包中，类B有个protected的方法testB，类A不是类B的子类（或子类的子类），类A不可以访问类B的方法testB

C.访问权限大小范围：public > 包权限 > protected > private

D.访问权限大小范围：public > 包权限 > private > protected



正确答案: A 



### 293、假如某个JAVA进程的JVM参数配置如下：

-Xms1G -Xmx2G -Xmn500M -XX:MaxPermSize=64M -XX:+UseConcMarkSweepGC -XX:SurvivorRatio=3,
请问eden区最终分配的大小是多少？

A.64M

B.500M

C.300M

D.100M



正确答案: C         

先分析一下里面各个参数的含义： 
-Xms：1G ， 就是说初始堆大小为1G 
-Xmx：2G ， 就是说最大堆大小为2G 
-Xmn：500M ，就是说年轻代大小是500M（包括一个Eden和两个Survivor） 
-XX:MaxPermSize：64M ， 就是说设置持久代最大值为64M 
-XX:+UseConcMarkSweepGC ， 就是说使用使用CMS内存收集算法 
-XX:SurvivorRatio=3 ， 就是说Eden区与Survivor区的大小比值为3：1：1
题目中所问的Eden区的大小是指年轻代的大小，直接根据-Xmn：500M和-XX:SurvivorRatio=3可以直接计算得出
500M*(3/(3+1+1)) 
=500M*（3/5） 
=500M*0.6 
=300M  
所以Eden区域的大小为300M。



### 294、下面有关JAVA异常类的描述，说法错误的是？

A.异常的继承结构：基类为Throwable，Error和Exception继承Throwable，RuntimeException和IOException等继承Exception

B.非RuntimeException一般是外部错误(非Error)，其一般被 try{}catch语句块所捕获

C.Error类体系描述了Java运行系统中的内部错误以及资源耗尽的情形，Error不需要捕捉

D.RuntimeException体系包括错误的类型转换、数组越界访问和试图访问空指针等等，必须被 try{}catch语句块所捕获



正确答案: D      

RuntimeException并不必须被捕获。不管异常代表的是可预见的异常条件还是编程错误，如果用try{}catch语句捕获它，会让程序在已经出现错误的情况下继续执行下去，也就是说我们不会及时的察觉到程序出现的问题。如果我们不去处理RuntimeException，让程序在测试阶段把异常传播给外界，这时系统打印出来的调用堆栈路径可以帮助我们更快的找出并修改错误，避免出现更大的损失。



### 295、URL u =new URL("http://www.123.com");。如果www.123.com不存在，则返回______。

A.http://www.123.com

B.””

C.null

D.抛出异常



正确答案: A 



### 296、String与StringBuffer的区别是？

A.String是不可变的对象，StringBuffer是可以再编辑的

B.字符串是常量，StringBuffer是变量

C.String是可变的对象，StringBuffer是不可以再编辑的

D.以上说法都不正确



正确答案: A B   

String类是不可变类，一旦一个String对象被创建以后，包含在这个对象中的字符序列是不可改变的，直至这个对象被销毁。
StringBuffer对象则代表一个字符序列可变的字符串，当一个StringBuffer被创建以后，通过StringBuffer提供的append()、insert()、reverse()、setCharAt()、setLength()等方法可以改变这个字符串对象的字符序列。一旦通过StringBuffer生成了最终想要的字符串，就可以调用它的toString()方法将其转换为一个String对象。
因此选项A、B正确。



### 297、java中下面哪些是Object类的方法（）

A.notify()

B.notifyAll()

C.sleep()

D.wait()



正确答案: A B D



### 298、java中提供了哪两种用于多态的机制

A.通过子类对父类方法的覆盖实现多态

B.利用重载来实现多态.即在同一个类中定义多个同名的不同方法来实现多态。

C.利用覆盖来实现多态.即在同一个类中定义多个同名的不同方法来实现多态。

D.通过子类对父类方法的重载实现多态



正确答案: A B   

 Java通过方法重写和方法重载实现多态
方法重写是指子类重写了父类的同名方法
方法重载是指在同一个类中，方法的名字相同，但是参数列表不同



### 299、jdk1.8版本之前的前提下，接口和抽象类描述正确的有（ ）

A.抽象类没有构造函数

B.接口没有构造函数

C.抽象类不允许多继承

D.接口中的方法可以有方法体



正确答案: B C



### 300、在JAVA中，下列哪些是Object类的方法（）

A.synchronized()

B.wait()

C.notify()

D.notifyAll()

E.sleep() 



正确答案: B C D     

A    synchronized     

Java语言的关键字，当它用来修饰一个方法或者一个代码块的时候，能够保证在同一时刻最多只有一个线程执行该段代码。

B  C   D 都是Object类中的方法    

notify():  是唤醒一个正在等待该对象的线程。

notifyAll(): 唤醒所有正在等待该对象的线程。

E   sleep 是Thread类中的方法

wait 和 sleep的区别：

wait指线程处于进入等待状态，形象地说明为“等待使用CPU”，此时线程不占用任何资源，不增加时间限制。

sleep指线程被调用时，占着CPU不工作，形象地说明为“占着CPU睡觉”，此时，系统的CPU部分资源被占用，其他线程无法进入，会增加时间限制。
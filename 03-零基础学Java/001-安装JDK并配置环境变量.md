#  安装JDK并配置环境变量



> 作者：祁大聪
>
> 实战课程：多动手写代码、多记笔记、多做项目，进步会很快



### 1、安装JDK并配置环境变量

#### 安装JDK

双击上一步下载的JDK11，直接安装即可。

安装的时候，最好不要有中文目录，比如我习惯目录在 ` D:\\work\\java\\jdk11`。

因为一个电脑是可以安装多个 jdk 的，所以最好把所有 的jdk 都安装在同一个 java 目录下，方便管理。



#### 配置环境变量

1、电脑上右键，属性 

2、打开高级系统配置，找到环境变量

<img src="https://jeeweixin.com/static/upload/1496428528533536.png" alt="img" style="width:600px;float:left" />

3、配置环境变量 Path 

<img src="https://jeeweixin.com/static/upload/1496428595642400.png" alt="img" style="width:600px;float:left" />



#### 安装成功

打开 CMD 控制台（可以用 win + r 打开）；

输入 `java -version` ，如果能看到 java 的版本就代表安装成功了；

<img src="https://jeeweixin.com/static/upload/1496428992004128.png" alt="img" style="width:600px;float:left" />





### 2、安装Java开发工具



IDEA 或 Eclipse 



#### 2.1、安装IDEA

IDEA可以选择专业版或社区版。

我们这个系列内容，主要使用IDEA开发工具（专业版）讲解。

专业版只能免费试用1个月。社区版可以一直试用，学习Java编程是没问题的，但是没办法创建JavaWeb等项目。

IDEA的安装非常简单，双击安装即可，这里就不演示了。安装完成后，会在桌面创建一个`IDEA的快捷图标`，直接双击打开就表示安装成功。



#### 2.2、安装Eclipse

Eclipse是免费的，可以创建Java项目、JavaWeb等项目，所以企业开发使用完全没问题。

Eclipse是不需要安装的，直接解压zip包就可以使用了。解压完成后，在解压包里有 `Eclipse.exe`文件，直接双击打开表示安装成功。





### 3、编写并运行第一个Java程序



使用`IDEA`开发工具进行演示。



#### 5.1，创建Java项目

如果IDEA、JDK已经安装完成了，就可以创建Java项目并编写和运行Java程序了。

	打开IDEA，选择菜单 File ——》New ——》Project ——》即可打开如下窗口

<img src="https://jeeweixin.com/static/upload/1504743356629024.png" alt="img" style="width:600px;float:left" />

按照上图的步骤，可以完成Java项目`learnJava`的创建



#### 5.2、创建Java文件

<img src="https://jeeweixin.com/static/upload/1504743432126496.png" alt="img" style="width:600px;float:left" />

	在learn Java项目的 src 目录上右键——》选择New ——》选择 Java Class 

在弹出的窗口中输入 `HelloWorld`。依据Java的开发规范，我们的`H`要大写，`W`也要大写。

<img src="https://jeeweixin.com/static/upload/1504743811711008.png" alt="img" style="width:600px;float:left" />

然后，直接按下键盘的回车键，即可完成创建。

完成创建后的文件是`HelloWorld.java`，里面有简单的Java程序。




#### 5.3、运行Java程序

将下方的代码拷贝进 HelloWorld.java 文件中，如下图操作，即可运行出效果。

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
<img src="https://jeeweixin.com/static/upload/1504744382136352.png" alt="img" style="width:600px;float:left" />



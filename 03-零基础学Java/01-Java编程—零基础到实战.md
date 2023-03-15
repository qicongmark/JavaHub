##  Java编程—零基础到实战

趁着年轻生猛

我要和生活再死磕几年，

要么毁灭，要么铸就辉煌，

如果有一天你发现，

我在平庸的面前低了头，

请向我开炮。

——《在路上》 杰克·凯鲁亚克



> 公众号：祁大聪，坦诚极客、知行合一
>
> 文档下载到电脑，用Typora通过大纲阅读更方便
>
> GitHub：https://github.com/qicongmark/javahub/
>
> 网站版：https://jeeweixin.com/wiki/1413240718360608 



## 第1章，启程

🏆 通过本章的学习可以达到以下目标：

- [x] 认识 Java
- [x] 下载Java相关软件获取
- [x] 安装JDK并配置环境变量
- [x] 安装Java开发工具
- [x] 编写并运行第一个Java程序
- [x] 本章小节



此系列课程偏实战为主，在实战中学会Java编程技能。

如果你也想学Java编程，不妨跟着我把上面这5步完成。



### 1，认识Java

Java在1995年5月诞生，作者是詹姆斯·高斯林， 隶属于Sun Microsystems，后来被甲骨文（Oracle）收购。

```
https://www.oracle.com/java/
```

Java是面向对象的一门编程语言、具有跨平台性、高性能、健壮且安全、Java也有很好的异常处理机制。

Java程序员的就业率常年第一，薪资高，是很多互联网公司的主力编程语言。



### 2，下载Java相关软件获取

#### 2.1，JDK

学习Java编程，需要先在电脑安装JDK（Java Development Kit），就是Java的开发工具包和运行环境。

举个例子，你写的Java代码就像鱼，而JDK就像水，如果Java代码想运行起来，必须有JDK的环境才可以。

JDK的版本有很多，可以选择1.8以上版本安装或最新版本安装。

**JDK11下载**

```
官网下载：
https://www.oracle.com/java/technologies/javase-downloads.html#JDK11

百度网盘下载：
链接: https://pan.baidu.com/s/1-a_P4cJXxdKxeS96LxUj7w 
提取码: wstv 
```



#### 2.2，IDEA或Eclipse

就像你写文档要用Office一样，我们写Java程序也需要工具。

Java的开发工具主要就是两个 IDEA 和 Eclipse：

- IDEA功能强大、复杂，有免费的社区版和付费的专业版
- Eclipse功能简介，可以免费使用



**IDEA 2020.1版本下载**

根据自己的需要选择社区版或专业版

```
官网下载：
https://www.jetbrains.com/idea/

百度网盘下载：
链接：https://pan.baidu.com/s/1fRaT0S84NYct433ketZSkg 
提取码：7x01 
使用方法：https://cloud.tencent.com/developer/article/1651800
```



**Eclipse 2020-12版本**

无需安装，解压即可使用

```
官网下载：https://eclipseide.org/

百度网盘下载：
链接：https://pan.baidu.com/s/1oPgazQyScYAtOK9bfQoncQ
提取码：ecli 
```



### 3，安装JDK并配置环境变量

#### 3.1，安装JDK

双击上一步下载的JDK11，直接安装即可。

安装的时候，最好不要有中文目录，比如我习惯目录在 ` D:\\work\\java\\jdk11`。

因为一个电脑是可以安装多个 jdk 的，所以最好把所有 的jdk 都安装在同一个 java 目录下，方便管理。



#### 3.2，配置环境变量

1、电脑上右键，属性 

2、打开高级系统配置，找到环境变量

<img src="https://jeeweixin.com/static/upload/1496428528533536.png" alt="img" style="width:600px;float:left" />

3、配置环境变量 Path 

<img src="https://jeeweixin.com/static/upload/1496428595642400.png" alt="img" style="width:600px;float:left" />



#### 3.3，安装成功

打开 CMD 控制台（可以用 win + r 打开）；

输入 `java -version` ，如果能看到 java 的版本就代表安装成功了；

<img src="https://jeeweixin.com/static/upload/1496428992004128.png" alt="img" style="width:600px;float:left" />



### 4，安装Java开发工具

通过`2.2，IDEA或Eclipse`已经将软件下载到了本地电脑。

#### 4.1，安装IDEA

IDEA可以选择专业版或社区版。

我们这个系列内容，主要使用IDEA开发工具（专业版）讲解。

专业版只能免费试用1个月。社区版可以一直试用，学习Java编程是没问题的，但是没办法创建JavaWeb等项目。

IDEA的安装非常简单，双击安装即可，这里就不演示了。安装完成后，会在桌面创建一个`IDEA的快捷图标`，直接双击打开就表示安装成功。



#### 4.2，安装Eclipse

Eclipse是免费的，可以创建Java项目、JavaWeb等项目，所以企业开发使用完全没问题。

Eclipse是不需要安装的，直接解压zip包就可以使用了。解压完成后，在解压包里有 `Eclipse.exe`文件，直接双击打开表示安装成功。



#### 4.3，视频教程

如果不会安装，可以参考视频教程

```
安装IDEA并配置JDK：
https://www.bilibili.com/video/BV1kg411M7Nr?p=2

安装Eclipse并配置JDK：
https://www.bilibili.com/video/BV1kg411M7Nr?p=3
```





### 5，编写并运行第一个Java程序

我们这里主要使用的IDEA这个开发工具演示。

如果你想用Eclipse，可以参考`4.3，视频教程`中的Eclipse教程。

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





### 6，本章小节和作业

本章内容主要带着小伙伴把Java的环境、开发工具安装成功了，并且运行了第一个Java程序，是不是非常有成就感。

#### 6.1，作业

将你学习到的内容找一个博客网站记录下来，就像你教别人一样。

记笔记是非常好的编程习惯，不仅方便以后查阅，还能帮助你提升编程技术，编程大佬基本都会记笔记的。

> 学编程记笔记的好处：
>
> https://mp.weixin.qq.com/s/Iog4Hbx0i2BgKZBY9koryg



推荐几个写博客的网站

> GitHub：https://github.com/
>
> 博客园：https://www.cnblogs.com/
>
> CSDN：https://csdn.net/
>
> 开源中国：https://www.oschina.net/
>
> 其他：公众号、头条号、印象笔记、网易云笔记



好记性不如烂笔头，坚持记笔记绝对是有百利而无一害。





## 第2章，准备

恭喜你！通过前一章的学习，你已经可以运行Java程序了，这时候是不是就可以直接学Java编程了呢？我个人的建议是，先把准备工作做好，再开始学习也不迟。

> 在《礼记·中庸》中有这么一句话：
>
> **“凡事豫则立，不豫则废。言前定则不跲，事前定则不困，行前定则不疚，道前定则不穷”**
>
> 翻译过来就是：
>
> 做任何事情，事前有准备就可以成功，没有准备就会失败。说话先有准备，就不会词穷理屈站不住脚；行事前计划先有定夺，就不会发生错误或后悔的事。
>

所以在正式学Java之前，一定要做好准备。



🏆 通过本章的学习可以达到以下目标：

- [x] 初学者必备网站
- [x] Java的API文档
- [x] 如何阅读JDK的源码
- [x] Java编程规范
- [x] 初学者怎么才能快速的学会Java编程
- [x] Java编程路线图



对于初学者，这些内容现在可以不看，但是以后肯定用的到，所以整理在这里供大家学习。












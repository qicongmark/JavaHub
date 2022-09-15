## Java编程规范

新手平时写代码要遵循Java编程规范，让你的代码更美观易读、好维护。

`1. 类的首字母必须大写`

`2. 禁止使用拼音+英文格式`

`3. 禁止复数（s）、美元符号 ($)、除了常量 禁止下划线（_）`

`4. 尽量少写无用注释，最好见码识意`

### 类的命名

- 类名必须使用 `驼峰命名法`，UpperCamelCase。不同单词的第一个字母必须大写

- 抽象类，必须加 Abstract 开头；异常类以 Exception 结尾；测试用例以 Test 结尾

- 业务相关类，推荐：xxxController、xxxService、xxxManager、xxxDao、xxxServiceImpl 

- 如果是POJO类，可以使用 DO / VO / PO / DTO 

```prettyprint
// 案例
HelloWorld / AbstractMap / OrderController 

// xxxService 可以是接口，xxxServiceImpl为实现类

// 反例
helloWorld  / AbsMap / DingDanController  / OrdersController

```

### 属性名

- 变量名必须使用 驼峰命名法，lowerCamelCase。首字母必须小写

- 常量名必须全部大写，不同单词之间用下划线（_）分开

- 禁止复数（s），可以用 xxxList、xxxArray、xxxSet 等代替

- 禁止 is 开通，如 isDeleted

```prettyprint
// 案例
username / numArray / cityList / CACHE_EXPIRED_TIME 

```

### 方法名

- 变量名必须使用 驼峰命名法，lowerCamelCase。首字母必须小写

- 禁止复数（s），可以用 xxxList、xxxMap、xxxSet 等代替

- 数据库操作时：单数用 get 、列表用 getXxxList 、查询 query 、创建 create、更新 update、创建或更新merge、删除 delete

```prettyprint
// 案例
getUserById / getUserList / queryUserPage / createUser

```

### 接口

- 接口中的方法和属性不加任何修饰符号（public也不要加）

- 必须加 Javadoc 注释

- 接口中不要定义变量

```prettyprint
/**
* 获取根据id获取用户
*/
User getUserById(Long id);

```


### 枚举类

- 必须以 Enum 结尾

- 成员名称必须全部大写，多个单词之间用下划线（_）隔开

```prettyprint
public enum ProcessStatusEnum {
    SUCCESS,
    UNKNOWN_REASON;
}
```

### 变量规约

- 禁止使用魔法值（未预先定义的常量）直接出现在代码中

- long 或 Long 赋值时，书之后用大写 L 结尾，如 `Long a = 2L;`

- 成员变量使用包装类型

- 货币金额禁止使用 double、float ，可以使用 BigDecimal 

- 阿里巴巴规约：对于任何货币金额，均以最小货币单位且整型类型存储

- `new BigDecimal（"0.1"）` 使用字符串参数，或者使用 `BigDecimal.valueOf(0.1)`


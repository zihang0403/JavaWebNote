变量类型：
	数值型：Number 
	字符串类型：String
	对象类型：Object
	布尔类型：Boolean
	函数类型：function
	
	特殊类型：
		undefined:未定义类型，所有js变量未赋初值时的类型的默认值
		null：空值
		NAN :全称 not a Number,即非数值，数值和字符串运算结果为这个值

变量名可以是中文
var 变量="变量";

关系运算：
	等于：==				字面值的比较
	全等于：===			字面值和数据类型都比较

逻辑运算：
	且运算：&&
		表达式全为真，返回最后一个表达式的值
		表达式有一个为假，返回第一个为假的值
	或运算：||
		表达式全为假，返回最后一个表达式的值
		表达式有一个为真，返回第一个为真的表达式的值
	取反运算：！
	短路：当&&，||有结果了之后，后面的表达式不再执行
	
	
在JavaScript中，所有变量都可以作为boolean类型去使用
null，undefined，""空字符串，都是false
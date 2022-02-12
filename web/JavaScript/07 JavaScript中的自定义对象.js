// 对象的定义：
// 1.
// 	var 变量名 = new Object();//对象实例
// 	变量名.属性名=值;//定义一个属性
// 	变量名.函数名=function(){}//定义一个函数

// 2.
// var 变量名={};//空对象
// 	var 变量名 ={
// 		属性名:值,//定义一个变量
// 		属性名:值,//定义一个变量
// 		属性名:值,//定义一个变量
// 		函数名:function (){//定义一个函数
// 			alert(typeof(alert()));
// 		}
// 	}

var obj = new Object();
obj.name="增长三";
obj.age=18;
obj.fun=function(){
	alert("姓名："+this.name+"\n年龄 ："+this.age);
}


// 对象的访问：
// 	变量名.属性/函数名();
alert(obj.name);
obj.fun();
alert(typeof(alert(typeof(alert()))));

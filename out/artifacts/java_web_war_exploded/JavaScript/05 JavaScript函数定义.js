// 函数调用才会执行
// 函数不允许重载，重载会覆盖掉上一次的定义

// 1.使用function关键字定义函数

	
	// function 函数名(形参){
	// 	// 函数体
	// }
	
	function 无参函数(){
		alert("无参函数被调用了");
	}
	//参数为弱类型，不写变量类型
	function 有参函数(a,b){
		// 函数体
		alert("有参数函数被调用，a="+a+"\nb="+b);
	}
	
	// 定义带返回值类型的函数，直接写return
	function sum(num1,num2){
		var result=num1+num2;
		return result;
	}
	
	// 调用函数
	无参函数();
	有参函数("a","12");
	alert(sum(1,3));
	
// 2.var 函数名 = function(形参列表){
// 	函数体
// }

	var fun =function(a,b){
		alert("有参数函数被调用，a="+a+"\nb="+b);
	}
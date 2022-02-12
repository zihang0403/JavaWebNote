// 在function函数中不需要定义，但却可以直接用来获取所有参数的变量，叫做隐形参数
// 和数组的操作类似

	function 无参函数(){
		alert(arguments.length);//查看参数个数
		alert("无参函数被调用了");
		
		for(var i=0;i<arguments.length;i++){
			alert(arguments[i])//输出所有参数
		}
	}

	无参函数(1,2,3,4,5,6);
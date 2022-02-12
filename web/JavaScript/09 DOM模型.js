// DOM:Document Object Model 文档对象模型
// 将文档中的标签，属性，文本，转换为对象来管理

// 1.Document对象
//     特点：
//     1.document管理了所有的HTML文档内容
//     2.document是一种树结构的文档，有层级关系
//     3.它把所有的标签都对象化
//     4.可通过document访问所有的标签对象
//     document对象常用方法：
        document.getElementById("");//通过标签ID查找标签dom对象
        document.getElementsByName("");//通过标签name查找标签dom对象
        document.getElementsByClassName("");//通过标签class查找标签dom对象
        document.getElementsByTagName("");//通过标签名查找标签dom对象
        document.createElement("");//通过给定的标签名创建一个标签对象
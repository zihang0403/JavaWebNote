// 如果有id属性，优先用 getElementById方法查询
// 如果没有id属性，优先用 getElementByName方法查询
// 如果没有id属性和name属性， 最后用getElementByTagName方法查询，按标签名查询

//以上三种查询方法一定在页面加载完成之后执行，才能查询到标签对象
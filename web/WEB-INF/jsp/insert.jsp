<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/23
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/book/insert.html">
    <h1>新增书籍</h1>
    <p>书名<input name="bookName"></p>
    <p>作者<input name="bookAuthor"></p>
    <p>出版社<input name="bookPublish"></p>
    <p>页数<input name="bookPage"></p>
    <p>价格<input name="bookPrive"></p>
    <input type="submit" value="提交" >
    <input type="reset" value="重置" >
</form>
</body>
</html>
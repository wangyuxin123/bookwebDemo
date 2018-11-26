<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/23
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        /* 给一个大致的位置 */
        div {
            width: 1000px;
            margin: auto;
            color: chartreuse;
        }
        /* 给标题居中 */
        div h1 {
            width: 250px;
            margin: auto;
            text-align: center;
        }
        /* 给表格一个区中的位置 */
        table {
            width: 1000px;
            text-align: center;
            border:1px solid black;
        }
        /* 表格文字居中 */
        td {
            border:1px solid black;
            text-align: center;
        }
        form  {
            height:45px;
            text-align: center;
        }
        p{
            color: aqua;
            font-size: 18px;
        }
    </style>
</head>
<body>
<div>
    <form method="post" action="/book/list.html">
        <select name="book">
            <option value="">全部</option>
            <option value="bookName">书名</option>
            <option value="bookAuthor">作者</option>
            <option value="bookPublish">出版社</option>
        </select>
        <input name="bookmo">
        <input	value="提交" type="submit">
    </form>
    <a href="/book/inn.html">新增书籍</a>
    <table>
        <tr>
            <th>书名</th>
            <th>作者</th>
            <th>出版社</th>
            <th>页数</th>
            <th>价格</th>
        </tr>
        <c:forEach items="${list }" var="item">
            <tr>
                <input type="hidden" value="${item.bookId}">
                <td>${item.bookName }</td>
                <td>${item.bookAuthor }</td>
                <td>${item.bookPublish }</td>
                <td>${item.bookPage }</td>
                <td>${item.bookPrive }</td>
            </tr>
        </c:forEach>
    </table>
    <p>${mess}</p>
</div>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: xiaoyang
  Date: 2020/1/5
  Time: 8:38 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="file/testFileUpload">点击跳转</a>
    <form action="file/testFileUpload" method="post" enctype="multipart/form-data">
        <input name="upload" type="file"/>
        <input type="submit" value="上传"/>
    </form>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>操作成功</title>
    <meta name="author" content="pan_junbiao的博客">
</head>
<body>
<h1>恭喜，操作成功！</h1>
<span style="color:red"><%=request.getAttribute("message") == null ? "" : request.getAttribute("message")%></span>
</body>
</html>
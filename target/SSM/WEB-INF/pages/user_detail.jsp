<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户详情</title>
    <meta name="author" content="pan_junbiao的博客">
    <style>
        table { border-collapse: collapse;}
        table,table tr th, table tr td { border:1px solid #000000; padding: 5px 10px;}
    </style>
</head>
<body>

<body>
<table align="center">
    <caption>用户信息</caption>
    <tr>
        <th>用户编号</th>
        <td>${userModel.userId}</td>
    </tr>
    <tr>
        <th>用户姓名</th>
        <td>${userModel.userName}</td>
    </tr>
    <tr>
        <th>博客地址</th>
        <td>${userModel.blogUrl}</td>
    </tr>
    <tr>
        <th>性别</th>
        <td>${userModel.sex==1?"男":"女"}</td>
    </tr>
    <tr>
        <th>省份</th>
        <td>${userModel.provinceName}</td>
    </tr>
    <tr>
        <th>兴趣爱好</th>
        <td>${userModel.hobbyStr}</td>
    </tr>
    <tr>
        <th>备注信息</th>
        <td>${userModel.remark}</td>
    </tr>
</table>
</body>
</body>
</html>

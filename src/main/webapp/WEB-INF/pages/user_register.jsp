<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <meta name="author" content="pan_junbiao的博客">
</head>
<body>
<style>
    table{border-top: 1px solid #000000; border-left: 1px solid #000000; border-collapse: collapse;}
    th, td{border-bottom: 1px solid #000000; border-right: 1px solid #000000; padding: 5px 10px;}
    select{width: 100px; padding: 3px;}
    .txtBox{padding: 3px;width: 300px;font-size: 16px;}
</style>
<form action="${pageContext.request.contextPath}/user/addUser.action" method="post" name="myForm">
    <table align="center">
        <caption>用户注册</caption>
        <tr>
            <th>用户姓名：</th>
            <td>
                <input class="txtBox" type="text" name="userName" value="pan_junbiao的博客"/>
            </td>
        </tr>
        <tr>
            <th>博客地址：</th>
            <td>
                <input class="txtBox" type="text" name="blogUrl" value="https://blog.csdn.net/pan_junbiao"/>
            </td>
        </tr>
        <tr>
            <th>性别：</th>
            <td>
                <input id="male" name="sex" type="radio" value="1" checked="checked"/>
                <label for="male">男</label>
                <input id="female" name="sex" type="radio" value="2"/>
                <label for="female">女</label>
            </td>
        </tr>
        <tr>
            <th>省份：</th>
            <td>
                <select name="provinceName">
                    <option value="">请选择</option>
                    <option value="广东省">广东省</option>
                    <option value="江苏省">江苏省</option>
                    <option value="安徽省">安徽省</option>
                </select>
            </td>
        </tr>
        <tr>
            <th>兴趣爱好：</th>
            <td>
                <input id="lq" name="hobbyArray" type="checkbox" value="篮球">
                <label for="lq">篮球</label>
                <input id="zq" name="hobbyArray" type="checkbox" value="足球">
                <label for="zq">足球</label>
                <input id="ymq" name="hobbyArray" type="checkbox" value="羽毛球">
                <label for="ymq">羽毛球</label>
                <input id="ppq" name="hobbyArray" type="checkbox" value="乒乓球">
                <label for="ppq">乒乓球</label>
                <input id="yy" name="hobbyArray" type="checkbox" value="游泳">
                <label for="yy">游泳</label>
            </td>
        </tr>
        <tr>
            <th>备注信息：</th>
            <td>
                <input class="txtBox" type="text" name="remark" value="您好，欢迎访问 pan_junbiao的博客"/>
            </td>
        </tr>
        <!-- 以下是提交、取消按钮 -->
        <tr>
            <td colspan="2" style="text-align: center; padding: 5px;">
                <input type="submit" value="提交" />
                <input type="reset" value="重置" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>

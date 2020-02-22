<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SSM</title>
</head>
<body>
    <a href="user/uController">查询所有</a>
    <form action="user/uController2" method="post">
        姓名:<input type="text" name="username"><br>
        性别:<input type="text" name="sex"><br>
        地址:<input type="text" name="address"><br>
        生日:<input type="date" name="bir"><br>
        <input type="submit" value="保存">
    </form>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功</title>
</head>
<body>

    <table>
        <tr><th>ID</th><th>姓名</th><th>性别</th><th>地址</th><th>生日</th></tr>
        <c:forEach items="${user}" var="user">
            <tr><td>${user.id}</td><td>${user.username}</td>
                <td>${user.sex}</td><td>${user.address}</td><td>${user.birthday}</td></tr>
        </c:forEach>
    </table>

</body>
</html>

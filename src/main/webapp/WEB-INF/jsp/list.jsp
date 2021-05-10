<%--
  Created by IntelliJ IDEA.
  User: 张伟捷
  Date: 2020/12/22
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



<form action="${pageContext.request.contextPath}/list">
<table border="1">
    <tr>
        <td colspan="6"><h1>考勤记录信息表</h1></td>
    </tr>
    <tr>
        <th>员工姓名</th>
        <th>所属部门</th>
        <th>考勤日期</th>
        <th>考勤状态</th>
    </tr>
    <c:forEach items="${attenceList}" var="att">
        <tr>
            <td>${att.empname}</td>
            <td>${att.dept}</td>
            <td><fmt:formatDate value="${att.chkdate}" pattern="yyyy-MM-dd"/></td>
            <td>${att.status1}</td>
        </tr>
    </c:forEach>
</table>
</form>

<div>
    <a href="getadd"><input  type="button" value="考勤登记"></a>
</div>
</body>
</html>

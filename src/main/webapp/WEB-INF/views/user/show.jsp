<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <table width="60%" border="1" cellpadding="2" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>JOB</th>
            <th>EMAIL</th>
        </tr>
        <tr>
            <td>${user.userID }</td>
            <td>${user.userName }</td>
            <td>${user.userJob }</td>
            <td>${user.userEmail }</td>
        </tr>
    </table><br>
    
    <a href="../user/index">返回</a>
</body>
</html>
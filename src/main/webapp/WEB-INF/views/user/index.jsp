<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
查询所有：<br>
<a href="userList">List All</a><br><br>
    
    新增：<br><form action="add">
        ID:<input type="text" name="userID"><br>
        NAME:<input type="text" name="userName"><br>
        JOB:<input type="text" name="userJob"><br>
        Email:<input type="text" name="userEmail"><br>
        <input type="submit" value="提交">
    </form><br>
    
    删除：<br><form action="delete">
        输入要删除的ID：<input type="text" name="id"><input type="submit" value="提交"><br>
    </form><br>
    
    查询：<br><form action="get">
        输入要查询的ID：<input type="text" name="id"><input type="submit" value="提交"><br>
    </form><br>
    
    修改：<br><form action="update">
        根据ID来改，不支持修改ID，输入的名字，工作为修改值：<br>
        ID:<input type="text" name="userID"><br>
        NAME:<input type="text" name="userName"><br>
        JOB:<input type="text" name="userJob"><br>
        <input type="submit" value="提交">
    </form><br>
</body>
</html>
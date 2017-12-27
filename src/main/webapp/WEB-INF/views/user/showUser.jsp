<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<c:url value="/static/lib/jquery/jquery-1.8.1.min.js"/>"></script>
<title>用户中心</title>
<script type="text/javascript">
	function addNewUser(){
		 var name = $.trim($("#txtName").val());
         var password = $.trim($("#txtPassword").val());
         var email = $.trim($("#txtEmail").val());
         var job = $.trim($("#txtJob").val());
         console.log({"userName": name, "userJob": job, "userEmail": email});
         $.post("/sharing/addUser", {userID:10,"userName": name, "userJob": job, "userEmail": email}, function(){
             alert("添加成功！")
         });
	}
	$(function(){
		$("#add").on("click", addNewUser);  
	});
</script>
</head>
<body>
	<div>
        <p>姓名：<input type="text" id="txtName"></p>
        <p>密码：<input type="password" id="txtPassword"></p>
        <p>邮箱：<input type="text" id="txtEmail"></p>
        <p>工作：<input type="text" id="txtJob"></p>
        <p><button id="add">添加</button></p>
    </div>
    <hr style="height:1px;border:none;border-top:1px dashed #0066CC;" />
    <div>
        <p>输入用户id:<input type="text" id="deleteid"></p>
        <p><button id="delete">删除</button></p>
    </div>
    
    <hr style="height:1px;border:none;border-top:1px dashed #0066CC;" />
    
    <div><p><button id="findalluser">查询所有</button></p></div>
    <div>
        <table width="300" border="1" >
            <thead id="findall">
                <tr>
                    <th width="50">id</th>
                    <th width="50">姓名</th>
                    <th width="50">密码</th>
                    <th width="50">年龄</th>
                </tr>
            </thead>
        </table>
    </div>
    <hr style="height:1px;border:none;border-top:1px dashed #0066CC;" />
    
    <div>
        <p>输入用户id:<input type="text" id="findid"></p>
        <p><button id="find">查询</button></p>
    </div>
     <div>
        <table width="300" border="1" >
            <thead id="finduserbyid">
                <tr>
                    <th width="50">id</th>
                    <th width="50">姓名</th>
                    <th width="50">密码</th>
                    <th width="50">年龄</th>
                </tr>
            </thead>
        </table>
    </div>
    <hr style="height:1px;border:none;border-top:1px dashed #0066CC;" />
    <div>
        <p>输入用户id:<input type="text" id="updateid"></p>
        <p>输入用户姓名:<input type="text" id="updatename"></p>
        <p>输入密码：<input type="password" id="updatepassword"></p>
        <p>输入用户年龄:<input type="password" id="updateage"></p>
        <p><button id="update">修改</button></p>
    </div>
</body>
</html>
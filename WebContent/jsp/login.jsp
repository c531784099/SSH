<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b >欢迎来到极空间</b>
<form action="/ssh/user/userAction_doRun.action" method="post">
<div>ID:<input type="text" name="user.uid"/></div>
<div>NAME:<input type="text" name="user.uname"/></div>
<div>AGE:<input type="text" name="user.uage"/></div>
<div><input type="submit" value="提交"/></div>


</form>

</body>
</html>
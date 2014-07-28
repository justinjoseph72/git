<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login to myWorld</title>
</head>
<body>

<s:form action="loginAction">
<table>
<tr>
<td><h1>User Name</h1></td><td><s:textfield name="userName"/> </td>
</tr>
<tr>
<td><h1>Password</h1></td><td><s:password name="passWord"/> </td>
</tr>
</table>
<s:submit value="Login"/>
</s:form>
</body>
</html>
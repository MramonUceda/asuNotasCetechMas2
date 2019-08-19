<%@ page import="java.util.List,mx.com.Cetech.Clase7Tomee.model.UserType"%>
<html>
<head>
<title>result</title>
</head>

<body>
	<table>
		<%
			List<UserType> result = (List<UserType>)request.getAttribute("result");
			for(UserType iterator : result){
				out.print("<tr><td>"+iterator.getId()+"</td><td>"+iterator.getDescrition()+"</td></tr>");
			}
		%>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style2.css">
</head>
<body>
<section class="contenedor">
<div class="styleDiv">
	<h1>Bienvenido</h1>
	<form action="Meppeo" method="post">
		<p><input type="text" name="usuario" id="usuario" required="required" placeholder="user"></p>
		<p><input name="passwrod" id="usuario" type="password" required="required" placerholder="password"></p>
		<p>
			<input type="submit" value="entrar">
		</p>
		${msg}
	
	</form>
</div>	
</section>

</body>
</html>
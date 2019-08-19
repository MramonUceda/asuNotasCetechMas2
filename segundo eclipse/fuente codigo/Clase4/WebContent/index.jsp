<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
	dody{
		background-color: lime;
		text-align: center;
		text-decoration: blink;
	}
	h2{
		font: italic,bold;
		color: green;
		text-align: right;
		position: absolute;
	}
	h2.error{
		font: bold;
		color: red;
		background-color: red;
		margin: 20px 20px 20px 20px;
		border-style:solid;
		border-color: red; 
	}
	#Label1{
		font:larger;
		color:aqua;
		text-align: center;
	}
</style>
<title>Insert title here</title>
</head>
<body>

<h2>Esto es texto h2</h2>

texto en el body <br />

	<form action="Clase4" method="get">
		<input type="text" name="user" required="true"
			placeholder="Usuario..." /> <input type="submit" value="Iniciar.">
	</form>
</body>
</html>
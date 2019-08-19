
<html>
<!-- //es un java servlet page que puede contener codigo html -->
<head>
	<title>Save</title>
</head>
<body>
	<form action="saveUserType.do" method="get">
		<label>ID</label><input type="text" name="id" placeholder="Id..."/><br/>
		<label>Description</label><input type="text" name="description" placeholder="Description..." required="required"/>
		<input type="submit" value="Save"/>
	</form>
</body>

</html>
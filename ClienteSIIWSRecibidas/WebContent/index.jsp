<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Emitidas</title>
</head>
<body>

<form action="./InvocaSIIemitidas" enctype="multipart/form-data" method="post">
		<input type="file" name="fileupload" > Selección de fichero 
		<input type="submit" value="EnviarEmitidas">
	</form>
<form action="./InvocaSIIrecibidas" enctype="multipart/form-data" method="post">
		<input type="file" name="fileupload" > Selección de fichero 
		<input type="submit" value="EnviarEmitidas">
	</form>	
	</body>
</html>
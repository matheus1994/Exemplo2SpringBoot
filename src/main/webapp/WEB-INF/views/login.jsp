<%@ page language="java" contentType="text/html" charset=ISO-8859-1
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
${nome}
    
    <span style="color: red">${msg}</span>
	<form>
	   Login: <input type="text" name="Login"><br>
	   Senha: <input type="password" name="senha"><br> 
	   <input type = submit value = "Logar">
	</form>
    <br><br>
    Data/Hora: ${data }

</body>
</html>
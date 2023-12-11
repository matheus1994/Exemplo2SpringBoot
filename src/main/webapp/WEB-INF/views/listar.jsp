<%@ page language="java" contentType="text/html" charset=ISO-8859-1
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Tasks List</title>
</head>
<body>
<table width="100%">
   <tr style="backgound-color: #CCC">
      <th>ID</th>
      <th>Descrição</th>
      <th>Status</th>
   </tr>
   
    <c: forEach var="tasks" items="${tasks_lists}">
       <tr>
         <td><c:out value="${tasks.id}"</c:out></td>
         <td><c:out value="${tasks.nome}"</c:out></td>
         <td>
            <c:choose>
                <c:when test="${tasks.status == false}">Aberto</c:when>
                <c:when test="${tasks.status == true}">Fechado</c:when>
            </c:choose>
         </td>
         
       </tr>
     
    </c:forEach>
   
  
   
<table>

 
</body>
</html>
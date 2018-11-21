<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="v1" class="javabean.VendorBean" scope="session" />
<c:forEach var="cat" items="${sessionScope.v1.AllVendors()}">
	${cat}<br>
</c:forEach>
</body>
</html>

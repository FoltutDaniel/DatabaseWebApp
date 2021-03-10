<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - CUSTOMER RELATIONSHIP MANAGER</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
				<table>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
					</tr>
					<!-- loop over and print our customers -->
					<c:forEach var="tempCustomer" items="${customers}">
						<span>${tempCustomer.lastName}</span>
						<tr>
							<td><c:out value="${tempCustomer.firstName}"/> </td>
							<td> ${tempCustomer.lastName} </td>
							<td> ${tempCustomer.email} </td>
						</tr>
					</c:forEach>
				</table>
		
			</div>
		</div>
	</div>
</body>
</html>
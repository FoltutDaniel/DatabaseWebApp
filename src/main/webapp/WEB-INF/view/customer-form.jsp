<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
	<title>Save Customer</title>
	<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css"/>
		
	<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<h3>Save Customer</h3>
		
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
			<label>First name: </label>
			<form:input path="firstName"/>
			<br>
			<label>Last name: </label>
			<form:input path="lastName"/>
			<br>
			<label>Email: </label>
			<form:input path="email"/>
			<br>
			<input type="submit" value="Save" class="save"/> 
		</form:form>
		
		<div style="clear; both"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	</div>
</body>
<h1>Placeholder</h1>

</html>
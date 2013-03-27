<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>

<body>


	<script type="text/javascript">
		var showVar = '<c:out value="${username}" />';
		var showUserRole = '<c:out value="${userRole}" />';
		humane.log('Welcome ' + showVar);
		humane.log('Hey ' + showUserRole);
	</script>

	<sec:authorize access="hasRole('ROLE_ADMIN')">
		<script type="text/javascript">
			humane.log('Welcome Admin');
		</script>
	</sec:authorize>
	<sec:authorize access="hasRole('ROLE_USER')">
		<script type="text/javascript">
			humane.log('Welcome User');
		</script>
	</sec:authorize>
		<sec:authorize access="hasRole('ROLE_MANAGER')">
		<script type="text/javascript">
			humane.log('Welcome Manager');
		</script>
	</sec:authorize>
	
	<form action="venueSearch" method="get">
	<button type="submit" class="btn btn-primary">Search</button>
	</form>

</body>
</html>
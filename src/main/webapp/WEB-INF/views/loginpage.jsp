<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>HR System</title>
</head>
<body onload='document.f.j_username.focus();'>
	<c:if test="${not empty param.error}">
		<font color="red"> Login error. <br /> Reason :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</font>
	</c:if>
	<div id="page" class="container">
		<div id="content">
			<div class="post"></div>
			<div id="menu-wrapper">
				<div id="menu" class="container" align="center">
					<ul>
						<li><a href="/2009030/searchEmployee">Search</a></li>
					</ul>
				</div>
			</div>
			<div style="clear: both;">&nbsp;</div>
			<div align="center">
				<h1>Sign In Here</h1>
			</div>

		</div>
	</div>
	<div align="center">
		<div>

			<c:if test="${not empty error}">
				<div class="errorblock">
					Login error : Please try again.<br />Root Cause:
					${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
				</div>
			</c:if>
			<div class="center">
				<form name='f' action="<c:url value='j_spring_security_check' />"
					method='POST'>

					<table>
						<tr>
							<td align="center">User:</td>
							<td><input type='text' name='j_username' value=''></td>
						</tr>
						<tr>
							<td align="center">Password:</td>
							<td><input type='password' name='j_password' /></td>
						</tr>
						<tr>
							<td></td>
							<td colspan='2' ><input name="submit"
								type="submit" value="submit" /></td>
							<td colspan='2' ><input name="reset"
								type="reset" /></td>
						</tr>
					</table>

				</form>
			</div>
		</div>
	</div>
	<div class="divider">&nbsp;</div>

	<div id="footer">
		<p>© 2012 Pubudu Dissanayake . All rights reserved.</p>
	</div>
</body>
</html>

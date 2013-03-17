<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body onload='document.f.j_username.focus();'>
	<c:if test="${not empty error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Caused :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
	<c:if test="${not empty param.succMsg }">
		<div class="successblock">${param.succMsg}</div>

	</c:if>
	${errorMsg}
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="row-fluid">
				<div class="login-box">
					<h2>Please Sign In to your account</h2>
					
					<form name="f" class="form-horizontal"
						action="<c:url value='j_spring_security_check' />" method='POST'>
						<div class="input-prepend" title="Username">
							<span class="add-on"><i class="halflings-icon user"></i> </span>
							<input class="input-large span10" name='j_username' id="username"
								type="text" placeholder="Type UserName" required="required"/>
						</div>
						<div class="clearfix"></div>

						<div class="input-prepend" title="Password">
							<span class="add-on"><i class="halflings-icon lock"></i> </span>
							<input class="input-large span10" name='j_password' id="password"
								type="password" placeholder="Type Password" required="required"/>
						</div>
						<div class="clearfix"></div>

						<label class="remember" for="remember"><input
							type="checkbox" id="remember" />Remember me</label>

						<div class="button-login">
							<button type="submit" class="btn btn-primary">Login</button>
						</div>
						<div class="clearfix"></div>
					</form>
					
					<hr>
				</div>
				<!--/span-->
			</div>
			<!--/row-->

		</div>
		<!--/fluid-row-->

	</div>
	<!--/.fluid-container-->
</body>
</html>

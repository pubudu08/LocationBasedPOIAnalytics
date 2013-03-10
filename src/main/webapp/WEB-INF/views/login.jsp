<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="row-fluid">
				<div class="login-box">
					<h2>Please Sign In to your account</h2>
					<form class="form-horizontal" action="welcome" method="post">
						<div class="input-prepend" title="Username">
							<span class="add-on"><i class="halflings-icon user"></i> </span>
							<input class="input-large span10" name="username" id="username"
								type="text" placeholder="type username" />
						</div>
						<div class="clearfix"></div>

						<div class="input-prepend" title="Password">
							<span class="add-on"><i class="halflings-icon lock"></i> </span>
							<input class="input-large span10" name="password" id="password"
								type="password" placeholder="type password" />
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
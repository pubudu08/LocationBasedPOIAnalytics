<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


</head>

<body>

	<!-- start: Content -->
	<div class="row-fluid sortable">
		<div class="box span12">
			<div class="box-header" data-original-title>
				<h2>
					<i class="halflings-icon user"></i><span class="break"></span>Members
				</h2>
				<div class="box-icon">
					<a href="#" class="btn-setting"><i
						class="halflings-icon wrench"></i> </a> <a href="#"
						class="btn-minimize"><i class="halflings-icon chevron-up"></i>
					</a> <a href="#" class="btn-close"><i class="halflings-icon remove"></i>
					</a>
				</div>
			</div>
			<div class="box-content">
				<table
					class="table table-striped table-bordered bootstrap-datatable datatable">
					<thead>
						<tr>
							<th>Username</th>
							<th>Date registered</th>
							<th>Role</th>
							<th>Status</th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Kuzma Edvard</td>
							<td class="center">2012/01/21</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-success">Active</span>
							</td>
							<td class="center"><a class="btn btn-success" href="#">
									<i class="halflings-icon zoom-in halflings-icon"></i> </a> <a
								class="btn btn-info" href="#"> <i
									class="halflings-icon edit halflings-icon"></i> </a> <a
								class="btn btn-danger" href="#"> <i
									class="halflings-icon trash halflings-icon"></i> </a>
							</td>
						</tr>
						<tr>
							<td>Crofton Arran</td>
							<td class="center">2012/08/23</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-important">Banned</span>
							</td>
							<td class="center"><a class="btn btn-success" href="#">
									<i class="halflings-icon zoom-in halflings-icon"></i> </a> <a
								class="btn btn-info" href="#"> <i
									class="halflings-icon edit halflings-icon"></i> </a> <a
								class="btn btn-danger" href="#"> <i
									class="halflings-icon trash halflings-icon"></i> </a>
							</td>
						</tr>
						<tr>
							<td>Bernhard Shelah</td>
							<td class="center">2012/06/01</td>
							<td class="center">Admin</td>
							<td class="center"><span class="label">Inactive</span>
							</td>
							<td class="center"><a class="btn btn-success" href="#">
									<i class="halflings-icon zoom-in halflings-icon"></i> </a> <a
								class="btn btn-info" href="#"> <i
									class="halflings-icon edit halflings-icon"></i> </a> <a
								class="btn btn-danger" href="#"> <i
									class="halflings-icon trash halflings-icon"></i> </a>
							</td>
						</tr>
						<tr>
							<td>Ajith Hristijan</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span>
							</td>
							<td class="center"><a class="btn btn-success" href="#">
									<i class="halflings-icon zoom-in halflings-icon"></i> </a> <a
								class="btn btn-info" href="#"> <i
									class="halflings-icon edit halflings-icon"></i> </a> <a
								class="btn btn-danger" href="#"> <i
									class="halflings-icon trash halflings-icon"></i> </a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<!--/span-->

	</div>
	<!--/row-->




</body>
</html>
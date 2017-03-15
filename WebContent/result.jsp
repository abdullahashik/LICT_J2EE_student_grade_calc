<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Result</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<div class="content">
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-4 col-md-offset-4">
					<div class="panel panel-info">
						<div class="panel-heading">
							<h5 class="panel-title">Student Result Processing....</h5>
						</div>
						<div class="panel-body">
							<table class="table table-responsive">
								<tr>
									<th>Name:</th>
									<td><%=request.getAttribute("name")%></td>
								</tr>
								<tr>
									<th>Student ID</th>
									<td><%=request.getAttribute("id")%></td>
								</tr>
								<tr>
									<th>Total Marks</th>
									<td><%=request.getAttribute("marks")%></td>
								</tr>
								<tr>
									<th>CGPA</th>
									<td><%=request.getAttribute("cgpa")%></td>
								</tr>
								<tr>
									<th>Grade</th>
									<td><%=request.getAttribute("grade")%></td>
								</tr>
							</table>
							<a href="index.html" class="btn btn-primary">Calculate
								Another</a>
						</div>
						<div class="panel-footer">
							<p style="text-align: center">
								<small>Copyright Reserved @ Abdullahil Ashik Md Arefin</small>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
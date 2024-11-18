<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
	<style>
		.container{
			display:flex;
			justify-conetent:center;
			align-items:center;
		}
	</style>
</head>
<body>
	<div class = "container">	
		<form action="verify" method="post">
			<div class="row g-3">
				<div class="col-sm-6">
					<label for="firstName" class="form-label">Name</label> <input
						type="text" class="form-control" name="name" id="name"
						placeholder="Enter the name" fdprocessedid="14maw">
				</div>
	
				<div class="col-sm-6">
					<label for="email" class="form-label">Email</label> <input
						type="text" class="form-control" name="email" id="email"
						placeholder="Enter the email" fdprocessedid="ewpl2a">
				</div>
	
				<div class="col-12">
					<label for="email" class="form-label">Phone Number</label> <input
						type="text" class="form-control" name="phNo" id="phNo"
						placeholder="Enter the phone number" fdprocessedid="lnpiz">
				</div>
	
				<div class="col-12">
					<label for="address" class="form-label">Age</label> <input
						type="text" class="form-control" name="age" id="address"
						placeholder="Enter the age" fdprocessedid="enp8ek">
				</div>
	
				<div class="col-md-3">
					<label for="addNo" class="form-label">Aadhar card number</label> <input
						type="text" class="form-control" name="addNo" id="addNo"
						placeholder="Enter the aadhar card number" fdprocessedid="teed5">
				</div>
	
				<div class="col-md-3">
					<label for="panNo" class="form-label">Pan Number</label> <input
						type="text" class="form-control" name="panNo" id="panNo"
						placeholder="Enter the pan card number" fdprocessedid="teed5">
				</div>
				
				<div>
					<input type = "submit" value = "Submit"/>
				</div>
			</div>
		</form>
	</div>	
</body>
</html>
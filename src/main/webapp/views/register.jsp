<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
<head>
	<meta charset="UTF-8">
    <title>Welcome Page</title>
	<link rel="stylesheet" href="CSS/style.css">
</head>
<body>
    <h3>Register Here!</h3>
		
		<c:if test="${not empty successMsg}">
		    <h4 style="color:green">${successMsg}</h4>
		</c:if>

		<c:if test="${not empty errorMsg}">
		    <h4 style="color:red">${errorMsg}</h4>
		</c:if>
	
	
	<form action = "/registrationForm" method = "post">
	Name : <input type= "text" name ="name"><br><br>
	Password : <input type= "password" name ="password"><br><br>
	Email : <input type= "email" name ="email"><br><br>
	Contact : <input type= "text" name ="contact"><br><br>
	City : <input type= "text" name ="city"><br><br>
	<input type="submit" value="Register"><br><br>

	</form>
   
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.box{display:inline;}
</style>
</head>
<body>
	 <div>
	 	<form action="guitarPost" method="post">
	 		<label>Builder:</label>
	 		<select name="builder">
	 			<option value=""></option>
	 			<option value="GIBSON">Gibson</option>
	 			<option value="OLSON">Olson</option>
	 			<option value="RYAN">Ryan</option>
	 		</select>
	 		
	 		<label>Type:</label>
	 		<select name="type">
	 			<option value=""></option>
	 			<option value="ACOUSTIC">Acoustic</option>
	 			<option value="ELECTRIC">Electric</option>
	 		</select>
	 		
	 		<label>BackWood:</label>
	 		<select name="backwood">
	 			<option value=""></option>
	 			<option value="INDIAN_ROSEWOOD">Indian_Rosewood</option>
				<option value="MAPLE">Maple</option>
				<option value="ALDER">Alder</option>
	 		</select>
	 		
	 		<label>TopWood:</label>
	 		<select name="topwood">
	 			<option value=""></option>
				<option value="BRAZILIAN_ROSEWOOD">Brazilian_Rosewood</option>
				<option value="MAHOGANY">Mahogany</option>
				<option value="ALDER">Alder</option>
	 		</select>
	 		<input type="submit" name="search" value="Search"/>	 		
	 	</form>
	 </div>
	 <!--
	 <div>
	 	<iframe name="show" src="guitarShow.jsp" style="width:90%;height:250px;"></iframe>
	 </div>
	 -->
</body>
</html>
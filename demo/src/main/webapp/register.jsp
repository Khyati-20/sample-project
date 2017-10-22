<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="<%=request.getContextPath() %>/Register"  method="post">
		<table border="1">
			<tr>
				<th colspan=2>
					<center>Student Registration form</center>

				</th>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="stdname" value="" /></td>
			</tr>
			<tr>
				<td>Student Id</td>
				<td><input type="text" name="stdid" value="" /></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><input type="text" name="stdemail" value="" /></td>
			</tr>
			<tr>
				<td>Class</td>
				<td><input type="text" name="stdclass" value="" /></td>
			</tr>
			
			<tr>
				<td>Penalty</td>
				<td><input type="text" name="penalty" value="0" /></td>
			</tr>
			
			<tr>
				<td>Status</td>
				<td><input type="text"  name="status" value="0" /></td>
			</tr>
			
			<tr>
				<td>BooksCount</td>
				<td><input type="text" name="bcount" value="5" /></td>
			</tr>
			
			<tr>

				<td><input type="submit" name="submit" /></td>
				<td><input type="reset" name="cancel"  /></td>
			</tr>
			<tr>


			</tr>

		</table>


	</form>



</body>
</html>
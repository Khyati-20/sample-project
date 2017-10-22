<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="<%=request.getContextPath() %>/BookDetails"  method="post">
		<table border="1">
			<tr>
				<th colspan=2>
					<center>book Details</center>

				</th>
			</tr>
			<tr>
				<td>book Name</td>
				<td><input type="text" name="bname" value="" /></td>
			</tr>
			<tr>
				<td>book Id</td>
				<td><input type="text" name="bid" value="" /></td>
			</tr>

			<tr>
				<td>Author</td>
				<td><input type="text" name="bauthor" value="" /></td>
			</tr>
			<tr>
				<td>MaxNo</td>
				<td><input type="text" name="max" value="" /></td>
			</tr>
			
			<tr>
				<td>Available</td>
				<td><input type="text" name="available" value="0" /></td>
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
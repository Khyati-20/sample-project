<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="<%=request.getContextPath() %>/Search"  method="post">
		<table border="1">
			<tr>
				<th colspan=2>
					<center>book Details</center>

				</th>
			</tr>
			<tr>
				<td>book id</td>
				<td><input type="text" name="bid" value="" /></td>
			</tr>


				<td><input type="submit" name="submit" /></td>
				<td><input type="reset" name="cancel"  /></td>
			</tr>
			<tr>


			</tr>

		</table>


	</form>


	<form action="<%=request.getContextPath() %>/Search"  method="get">
		<table border="1">
			<tr>
				<th colspan=2>
					<center>student Details</center>

				</th>
			</tr>
			<tr>
				<td>student id</td>
				<td><input type="text" name="sid" value="" /></td>
			</tr>


				<td><input type="submit" name="submit" /></td>
				<td><input type="reset" name="cancel"  /></td>
			</tr>
			<tr>


			</tr>

		</table>


	</form>


</body>
</html>
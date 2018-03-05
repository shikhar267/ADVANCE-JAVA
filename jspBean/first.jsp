<html>
<head>
<title>
demo of jsp param action tag</title>
<body>
<h1>jsp page:demo param along with forward</h1>
<jsp:forward page="second.jsp">
<jsp:param name="date" value="20-05-2010" />
<jsp:param name="time" value="10:15AM" />
<jsp:param name="data" value="ABC" />
</jsp:forward>
</body>
</html>

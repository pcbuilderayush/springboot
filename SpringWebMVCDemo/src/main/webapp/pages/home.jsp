<html>
<head>
<meta charset="ISO-8859-1">
<title>Web Application</title>
</head>
<body>
<h1>HOME</h1>
<h2>${pageTitle}</h2>
<ol>
	<c:forEach var="d" items="${developers}">
	<li>${d }</li>
	</c:forEach>
</ol>
</body>
</html>
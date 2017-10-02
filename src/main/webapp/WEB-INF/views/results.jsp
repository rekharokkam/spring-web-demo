<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page session="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Results</title>
</head>
<body>
	<h1>Locations found for title : ${title}</h1>
	
	<h3>Select a location:</h3>
	
		<c:forEach items="${titles}" var="title" varStatus="i">
			${i.index + 1}. <a href="rent/${title.mediaId }">${title.rentalLocation.name}</a>
			<br/> 
		</c:forEach>


</body>
</html>
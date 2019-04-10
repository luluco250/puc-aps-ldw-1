<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en-us">
<head>
	<meta charset="utf-8">
	<title>Mundo dos Vinhos</title>
</head>
<body>
	<main>
		<h1 align="center">JSP de recomendação de vinhos</h1>
		<p>
		Você escolheu a uva
		<%
			String grapeType = (String)request.getAttribute("grapeType");
			String[] grapeNames = {"", "roxa", "verde"};
			out.print(grapeNames[Integer.parseInt(grapeType)]);
		%>
		<br>
		<% 
			List styles = (List)request.getAttribute("styles");
			Iterator it = styles.iterator();
			while(it.hasNext()) {
			  out.print("<br>Experimente: " + it.next());
			}
		%>
		</p>
	</main>
</body>
</html>
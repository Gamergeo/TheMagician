<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<%@include file="/pages/head/head.jsp" %>
		
		<link href="<c:url value='/css/main/main.css' />" rel="stylesheet" media="all" type="text/css">

		<script type="text/javascript">
		
			$(document).ready(function() {
				$.refreshMainContent({'url' : "summary/view.do"});
			});
		</script>
	</head>
	
	<body>
	
		<div id="main">
			
			<div id="mainMenu">
				<jsp:include page="mainMenu.jsp" />
			</div>
			
			<div id="mainContent" class="content">
				<jsp:include page="mainContent.jsp" />
			</div>
		</div>
	
	</body>
</html>
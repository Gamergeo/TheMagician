<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@include file="/pages/head/headOnlyMetadata.jsp" %>

<link href="<c:url value='/css/main/mainMenu.css' />" rel="stylesheet" media="all" type="text/css">

<div id="applicationName">
	<span id="applicationLabel">The Magician</span>
</div>

<div id="menu">

	<span class="menuItem">
		<span class="menuButton" onclick="$.refreshMainContent({'url' : 'main/startContent.do'});">
			<span class="menulabel">
				Accueil
			</span>
		</span>
	</span>
	
	<span class="menuItem">
		<span class="menuButton" onclick="$.refreshMainContent({'url' : 'main/startContent.do'});">
			<span class="menulabel">
				Stock
			</span>
		</span>
	</span>
	
	<span class="menuItem">
		<span class="menuButton" onclick="$.refreshMainContent({'url' : 'main/startContent.do'});">
			<span class="menulabel">
				Souhait
			</span>
		</span>
	</span>
	
	<span class="menuItem">
		<span class="menuButton" onclick="$.refreshMainContent({'url' : 'main/startContent.do'});">
			<span class="menulabel">
				Recherche
			</span>
		</span>
	</span>
</div>
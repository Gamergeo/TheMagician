<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="/pages/head/headOnlyMetadata.jsp" %>

<link href="<c:url value='/css/main/mainMenu.css' />" rel="stylesheet" media="all" type="text/css">

<script type="text/javascript">

	function selectMenu(element, url) {
		$(".menuItem").removeClass("menuSelected")		
		$(element).addClass("menuSelected");
		$.refreshMainContent({'url' : url});
	}
		
</script>

<div id="menu">

	<span class="menuItem" onclick="selectMenu(this, 'summary/view.do');">
		<span class="menuLabel">
			Accueil
		</span>
	</span>
	
	<span class="menuItem" onclick="selectMenu(this, 'summary/view.do');">
		<span class="menuLabel">
			Stock
		</span>
	</span>
	
	<span class="menuItem" onclick="selectMenu(this, 'summary/view.do');">
		<span class="menuLabel">
			Souhait
		</span>
	</span>
	
	<span class="menuItem" onclick="selectMenu(this, 'summary/view.do');">
		<span class="menuLabel">
			Recherche
		</span>
	</span>
</div>
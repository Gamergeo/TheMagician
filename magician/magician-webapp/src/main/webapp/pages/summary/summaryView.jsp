<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="/pages/head/headOnlyMetadata.jsp" %>

<link href="<c:url value='/css/summary/summary.css' />" rel="stylesheet" media="all" type="text/css">

<div id="summaryTotal">
	Valeur totale : 1800€
</div>

<div id="bestCard">
	Liste des meilleures cartes :
		1 - ${card.cardInfos.name} - ${card.expansion.name}
</div>

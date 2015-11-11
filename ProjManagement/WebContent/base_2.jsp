<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<fmt:setBundle basename="com.i18n.app" />
<!doctype html>
<html  >
<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<META HTTP-EQUIV="refresh" CONTENT="<%= session.getMaxInactiveInterval() %>; URL=SessionTimeout" />
	<title>Project Management App</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0">

	<!-- Open Sans font from Google CDN -->
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,600,700,300&amp;subset=latin" rel="stylesheet" type="text/css">

	<!-- LanderApp's stylesheets -->
	<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="css/landerapp.min.css" rel="stylesheet" type="text/css">
	<link href="css/pages.min.css" rel="stylesheet" type="text/css">
	<link href="css/rtl.min.css" rel="stylesheet" type="text/css">
	<link href="css/themes.min.css" rel="stylesheet" type="text/css">
	<link href="css/widgets.min.css" rel="stylesheet" type="text/css">

</head>

<body class="theme-default page-signin-alt right-to-left">
<script>var init = [];</script>

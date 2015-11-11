<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<fmt:setBundle basename="com.pm.app.business.i18n.app_ar" />
<<jsp:useBean id="login" class="com.pm.app.dal.dto.Sysusers" scope="session"></jsp:useBean>
<div id="main-wrapper">
	<div id="main-navbar" class="navbar navbar-inverse" role="navigation">
	
		<button type="button" id="main-menu-toggle"><i class="navbar-icon fa fa-bars icon"></i><span class="hide-menu-text">HIDE MENU</span></button>
		<div class="navbar-inner">
			<!-- Main navbar header -->
			<div class="navbar-header">

				<!-- Logo -->
				<a href="Dashboard" class="navbar-brand">
					<img src="img/logo.png" class="logo" alt="EPM | ePlans Maker" data-src="img/imgo.jpg" data-src-retina="img/imgo.jpg" width="170" height="30">

				</a>
				
				
				<!-- Main navbar toggle -->
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#main-navbar-collapse"><i class="navbar-icon fa fa-bars"></i></button>

			</div> <!-- / .navbar-header -->

			<div id="main-navbar-collapse" class="collapse navbar-collapse main-navbar-collapse">
				<div>
<!-- 					<ul class="nav navbar-nav"> -->
<%-- 						<li ><a href="AddGeneralGoal" ><i class="dropdown-icon fa fa-plus"></i>&nbsp;&nbsp;<fmt:message key="dashboard.addgeneralgoal"></fmt:message></a></li> --%>
<%-- 						<li><a href="AddDetailedGoal" ><i class="dropdown-icon fa fa-plus"></i>&nbsp;&nbsp;<fmt:message key="dashboard.adddetailgoal"></fmt:message></a></li> --%>
<%-- 						<li><a href="AddMission"><i class="dropdown-icon fa fa-plus"></i>&nbsp;&nbsp;<fmt:message key="dashboard.addmission"></fmt:message></a></li> --%>
<%-- 						<li><a href="AddActivity"><i class="dropdown-icon fa fa-plus"></i>&nbsp;&nbsp;<fmt:message key="dashboard.addactivity"></fmt:message></a></li> --%>

<!-- 					</ul> -->
				
					<div class="right clearfix">
						<ul class="nav navbar-nav pull-right right-navbar-nav">
	
						
							<li class="dropdown">
								<a href="#" class="dropdown-toggle user-menu" data-toggle="dropdown">
									<img src='#'>${login.username }
									<span></span>
								</a>
								<ul class="dropdown-menu">
									<li><a href="Profile"><fmt:message key="privilage.profile"></fmt:message></a></li>
									<li class="divider"></li>
									<li><a href="Logout"><i class="dropdown-icon fa fa-power-off"></i>&nbsp;&nbsp;<fmt:message key="dashboard.logout"></fmt:message></a></li>
								</ul>
							</li>
						</ul> <!-- / .navbar-nav -->
					</div> <!-- / .right -->
				</div>
			</div> <!-- / #main-navbar-collapse -->
		</div> <!-- / .navbar-inner -->
	</div> <!-- / #main-navbar -->
<!-- /2. $END_MAIN_NAVIGATION -->

<jsp:include page="sidebar.jsp"></jsp:include>




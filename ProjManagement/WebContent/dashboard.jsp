<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<fmt:setBundle basename="com.pm.app.business.i18n.app_ar" />

<jsp:include page="base1.jsp"></jsp:include>
<jsp:include page="top-header.jsp"></jsp:include>

<div id="content-wrapper">
			
				<ul class="breadcrumb breadcrumb-page">
					<li ><a href="Dashboard"><fmt:message key="dashboard.name"></fmt:message></a></li>
					
				</ul>
				
				
				
				<div class="page-header">
				
					<div class="row">
						<!-- Page header, center on small screens -->
						<h1 class="col-xs-12 col-sm-4 text-center text-left-sm"><i class="fa fa-dashboard page-header-icon"></i>&nbsp;&nbsp;<fmt:message key="setting.fields"></fmt:message></h1>
					</div>
				
				</div>
				
			<!-- Init Notification -->
				
			<jsp:include page="notifications.jsp"></jsp:include>
			<div class="row">
				<div class="panel">
					<div class="panel-heading">
						<span class="panel-title"><fmt:message key="setting.fields"></fmt:message></span>
					</div>
				<div class="panel-body">
					<div class="table-primary">
							<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="jq-datatables-example">
								<thead>
									<tr>
										<th><fmt:message key="fields.order"></fmt:message></th>
										<th><fmt:message key="fields.name"></fmt:message></th>
										<th><fmt:message key="control"></fmt:message></th>
									</tr>
								</thead>
								<tbody>
									
									</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		
		</div> <!-- / #content-wrapper -->
	<div id="main-menu-bg"></div>
</div> <!-- / #main-wrapper -->
		
<script type="text/javascript"> window.jQuery || document.write('<script src="js/jquery.min.js">'+"<"+"/script>"); </script>
<script src="js/bootstrap.min.js"></script>
<script src="js/landerapp.min.js"></script>

<script type="text/javascript">


	init.push(function () {
		
	});
	
	window.LanderApp.start(init);
</script>

</body>
</html>
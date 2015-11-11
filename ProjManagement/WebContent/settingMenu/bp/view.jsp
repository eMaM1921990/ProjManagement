<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<fmt:setBundle basename="com.pm.app.business.i18n.app_ar" />
<jsp:include page="../../base1.jsp"></jsp:include>
<jsp:include page="../../top-header.jsp"></jsp:include>

<div id="content-wrapper">
			
				<ul class="breadcrumb breadcrumb-page">
					<li ><a href="Dashboard"><fmt:message key="menu.dashboard"></fmt:message></a></li>
					<li ><a href="#"><fmt:message key="menu.setting"></fmt:message></a></li>
					<li ><a href="#"><fmt:message key="menu.displayBp"></fmt:message></a></li>
				</ul>
				
				
				
				<div class="page-header">
				
					<div class="row">
						<!-- Page header, center on small screens -->
						<h1 class="col-xs-12 col-sm-4 text-center text-left-sm"><i class="fa fa-dashboard page-header-icon"></i>&nbsp;&nbsp;<fmt:message key="menu.displayBp"></fmt:message></h1>
					</div>
				
				</div>
				
			<!-- Init Notification -->
				
			<jsp:include page="../../notifications.jsp"></jsp:include>
			
				
				<div class="row">
				<div class="panel">
					<div class="panel-heading">
						<span class="panel-title"><fmt:message key="menu.displayBp"></fmt:message></span>
					</div>
					<div class="panel-body">
						<div class="table-primary">
							<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="jq-datatables-example">
								<thead>
									<tr>
										<th><fmt:message key="label.bpname"></fmt:message></th>
										<th><fmt:message key="label.phone"></fmt:message></th>
										<th><fmt:message key="label.address"></fmt:message></th>
										<th><fmt:message key="label.workingas"></fmt:message></th>
										<th class='hidden-1024'><fmt:message key="label.control"></fmt:message></th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${data}" var="d">

										<tr>
											<form method="POST" action="BPcontrol" id="grid">
											<td>${d.name}</td>
											<td>${d.phone}</td>
											<td>${d.address}</td>
											<td>${d.type}</td>
											<td class='hidden-350'>
											<input type="hidden" name="id" value="${d.idbusinessPartner}">
												<jsp:include page="../../control_grid.jsp"></jsp:include>
											</form>
										</tr>

									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
					
					<div class="row-fluid">
				<div class="span12">
					<form action="BPadd" method="GET">
						<input type="submit" value="<fmt:message key="label.add"></fmt:message>" class="btn btn-danger">
					</form>
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


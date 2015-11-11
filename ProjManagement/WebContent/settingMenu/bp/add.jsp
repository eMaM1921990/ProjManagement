<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<fmt:setBundle basename="com.pm.app.business.i18n.app_ar" />
<jsp:include page="../../base1.jsp"></jsp:include>
<jsp:include page="../../top-header.jsp"></jsp:include>

<div id="content-wrapper">
				<ul class="breadcrumb breadcrumb-page">
					<li ><a href="#"><fmt:message key="menu.dashboard"></fmt:message></a></li>
					<li ><a href="#"><fmt:message key="menu.setting"></fmt:message></a></li>
					<li ><a href="#"><fmt:message key="menu.addbp"></fmt:message></a></li>
				</ul>
				
				
				
				<div class="page-header">
				
					<div class="row">
						<!-- Page header, center on small screens -->
						<h1 class="col-xs-12 col-sm-4 text-center text-left-sm"><i class="fa fa-dashboard page-header-icon"></i>&nbsp;&nbsp;<fmt:message key="menu.addbp"></fmt:message></h1>
					</div>
				
				</div>
				
			<!-- Init Notification -->
				
			<jsp:include page="../../notifications.jsp"></jsp:include>
			<div class="panel">
				<div class="panel-heading">
						<span class="panel-title"><fmt:message key="menu.addbp"></fmt:message></span>
				</div>
				<div class="panel-body">
					<form class="form-horizontal" id="jq-validation-form" action="BPcontrol" method="POST">
						<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label"><fmt:message key="label.bpname"></fmt:message></label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="name" name="name" placeholder="<fmt:message key="label.bpname"></fmt:message>">
								</div>
						</div>
						<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label"><fmt:message key="label.address"></fmt:message></label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="address" name="address" placeholder="<fmt:message key="label.address"></fmt:message>">
								</div>
						</div>
						
						<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label"><fmt:message key="label.phone"></fmt:message></label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="phone" name="phone" placeholder="<fmt:message key="label.phone"></fmt:message>">
								</div>
						</div>
						
						<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label"><fmt:message key="label.workingas"></fmt:message></label>
								<div class="col-sm-9">
									<select name="working_as" id="working_as" class="form-control" >
													<option></option>
													<c:forEach items="${data}" var="d">
													<option value="${d.idbusinessPartnerType}">${d.type}</option>
													</c:forEach>
										
									</select>
								</div>
						</div>
						<div class="form-group">
								<div class="col-sm-offset-3 col-sm-9">
									<button type="submit" class="btn btn-warning" value="new" name="control"><fmt:message key="label.save"></fmt:message></button>
									<button type="button" class="btn" name="control"><fmt:message key="label.cancel" ></fmt:message></button>
								</div>
						</div>
					</form>
				</div>
			</div>
					

			
				 <!-- End Of Content -->
		
		</div> <!-- / #content-wrapper -->
	<div id="main-menu-bg"></div>
</div> <!-- / #main-wrapper -->
		
<script type="text/javascript"> window.jQuery || document.write('<script src="js/jquery.min.js">'+"<"+"/script>"); </script>
<script src="js/bootstrap.min.js"></script>
<script src="js/landerapp.min.js"></script>
<script type="text/javascript">


	init.push(function () {
		$("#working_as").select2({
			allowClear: true,
			placeholder: "<fmt:message key="label.workingas"></fmt:message>"
		});
		
		$("#jq-validation-form").validate({
			rules: {
				'name': {
				  required: true
				},
				'type': {
					required: true,
				},'phone':{
					required: true,
				}
				
			}
		});
	});
		
	window.LanderApp.start(init);
</script>

</body>
</html>
						

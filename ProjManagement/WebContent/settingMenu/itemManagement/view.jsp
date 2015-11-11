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
					
					<div class="panel-body">
						<ul id="uidemo-tabs-default-demo" class="nav nav-tabs">
							<li class="">
								<a href="#uidemo-tabs-default-demo-home" data-toggle="tab">Home <span class="label label-success">12</span></a>
							</li>
							<li class="active">
								<a href="#uidemo-tabs-default-demo-profile" data-toggle="tab">Profile <span class="badge badge-primary">12</span></a>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown&nbsp;&nbsp;<i class="fa fa-caret-down"></i></a>
								<ul class="dropdown-menu">
									<li><a href="#uidemo-tabs-default-demo-dropdown1" data-toggle="tab">@fat</a></li>
									<li><a href="#uidemo-tabs-default-demo-dropdown2" data-toggle="tab">@mdo</a></li>
								</ul>
							</li> <!-- / .dropdown -->
						</ul>

						<div class="tab-content tab-content-bordered">
							<div class="tab-pane fade" id="uidemo-tabs-default-demo-home">
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
																	</tbody>
							</table>
						</div>
					</div>
							</div> <!-- / .tab-pane -->
							<div class="tab-pane fade active in" id="uidemo-tabs-default-demo-profile">
								<p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo booth letterpress, commodo enim craft beer mlkshk aliquip jean shorts ullamco ad vinyl cillum PBR. Homo nostrud organic, assumenda labore aesthetic magna delectus mollit. Keytar helvetica VHS salvia yr, vero magna velit sapiente labore stumptown. Vegan fanny pack odio cillum wes anderson 8-bit, sustainable jean shorts beard ut DIY ethical culpa terry richardson biodiesel. Art party scenester stumptown, tumblr butcher vero sint qui sapiente accusamus tattooed echo park.</p>
							</div> <!-- / .tab-pane -->
							<div class="tab-pane fade" id="uidemo-tabs-default-demo-dropdown1">
								<p>Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade. Messenger bag gentrify pitchfork tattooed craft beer, iphone skateboard locavore carles etsy salvia banksy hoodie helvetica. DIY synth PBR banksy irony. Leggings gentrify squid 8-bit cred pitchfork. Williamsburg banh mi whatever gluten-free, carles pitchfork biodiesel fixie etsy retro mlkshk vice blog. Scenester cred you probably haven't heard of them, vinyl craft beer blog stumptown. Pitchfork sustainable tofu synth chambray yr.</p>
							</div> <!-- / .tab-pane -->
							<div class="tab-pane fade" id="uidemo-tabs-default-demo-dropdown2">
								<p>Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before they sold out farm-to-table VHS viral locavore cosby sweater. Lomo wolf viral, mustache readymade thundercats keffiyeh craft beer marfa ethical. Wolf salvia freegan, sartorial keffiyeh echo park vegan.</p>
							</div> <!-- / .tab-pane -->
						</div> <!-- / .tab-content -->
					
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


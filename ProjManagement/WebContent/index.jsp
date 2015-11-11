<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<fmt:setBundle basename="com.pm.app.business.i18n.app_ar" />
<jsp:include page="base_2.jsp"></jsp:include>

<!-- 	 <script src="js/demo.js"></script> -->



<!-- 2. $MAIN_NAVIGATION ===========================================================================

	Main navigation
-->
	<div class="signin-header">
		<a href="#" class="logo">
			<strong>Project Management</strong>App <fmt:message key="app.version"/>
		</a> <!-- / .logo -->
		<a href="#" class="btn btn-primary"><fmt:message key="app.register.button"></fmt:message></a>
	</div> <!-- / .header -->

	<h1 class="form-header"><fmt:message key="app.login"/><br></h1>


	<!-- Form -->
	<form action="doLogin" method="post" id="signin-form_id" class="panel">
		<jsp:include page="notifications.jsp"></jsp:include>
		<div class="form-group">
			<input type="text" id="username" name='username' class="form-control input-lg" placeholder="<fmt:message key="app.username"></fmt:message>">
		</div> <!-- / Username -->

		<div class="form-group signin-password">
			<input type="password" id="pwd" name="password" class="form-control input-lg" placeholder="<fmt:message key="app.password"></fmt:message>">
<%-- 			<a href="ResetPassword" class="forgot"><fmt:message key="login.forgetpassword"></fmt:message>؟</a> --%>
		</div> <!-- / Password -->

		<div class="form-actions">
			<input type="submit" id="signin-form_id" value="<fmt:message key="app.login.button"></fmt:message>" class="btn btn-primary btn-block btn-lg">
		</div> <!-- / .form-actions -->
	</form>
	<!-- / Form -->

	<script type="text/javascript"> window.jQuery || document.write('<script src="js/jquery.min.js">'+"<"+"/script>"); </script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/landerapp.min.js"></script>
	<script src="js/login.js"></script>
	<script src="js/custom.js"></script>
</body>

</html>
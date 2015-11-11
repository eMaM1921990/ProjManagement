<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setBundle basename="com.pm.app.business.i18n.app_ar" />

	<button class="btn btn-sm btn-labeled btn-success" name="control"
		value="edit_redirect">
		<span class="btn-label icon fa fa-pencil"></span>
	</button>
	<button class="btn btn-sm btn-labeled btn-danger" name="control"
		value="delete"  onclick="return confirm('<fmt:message key="label.confirm.delete"></fmt:message>');">
		<span class="btn-label icon fa fa-times"></span>
	</button>

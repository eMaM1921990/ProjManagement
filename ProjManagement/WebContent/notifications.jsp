<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<fmt:setBundle basename="com.pm.app.business.i18n.message_ar" />
<div class="row-fluid">
			<!-- UX Notification  -->
				<c:if test="${msg!=null}">
				<c:choose>
					<c:when test="${fn:indexOf(msg,'[')>-1}">
					<!-- UX Notification For Error -->
					<div class="span12">
						<div class="alert alert-danger alert-dark">
							<button type="button" class="close" data-dismiss="alert">×</button>
							<strong><fmt:message key="message.error"></fmt:message></strong> ${msg}
						</div>
					</div>
					</c:when>
					<c:otherwise>
					<!-- UX Notification For Success -->
					<div class="span12">
						<div class="alert alert-success alert-dark">
							<button type="button" class="close" data-dismiss="alert">×</button>
							<strong><fmt:message key="message.success"></fmt:message></strong> ${msg}
						</div>
					</div>
					</c:otherwise>
				</c:choose>
				</c:if>
			</div>
			
			<c:if test="false">
					<div class="span12">
						<div class="alert alert-warning alert-dark">
							<button type="button" class="close" data-dismiss="alert">×</button>
							<strong><fmt:message key="message.warning"></fmt:message> </strong> <fmt:message key="message.update"></fmt:message>
						</div>
					</div>
			</c:if>
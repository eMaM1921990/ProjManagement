<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setBundle basename="com.pm.app.business.i18n.app_ar" />
    
<div id="main-menu" role="navigation">
		<div id="main-menu-inner">
			<div class="menu-content top" id="menu-content-demo">
				<!-- Menu custom content demo
					 Javascript: html/assets/demo/demo.js
				 -->
			
			</div>
			<ul class="navigation">
				<li >
					<a href="Dashboard"><i class="menu-icon fa fa-dashboard"></i><span class="mm-text"><fmt:message key="dashboard.name"></fmt:message></span></a>
				</li>
				<li class="mm-dropdown">
					<a href="#"><i class="menu-icon fa fa-exchange"></i><span class="mm-text"><fmt:message key="dashboard.operation"></fmt:message></span></a>
					<ul>
								<li><a href="YearStratgyPlanView"><fmt:message key="menu.yearplanstratgy"></fmt:message></a></li>
								<li><a href="PlaningOperationYearView"><fmt:message key="setting.planing.operation.year"></fmt:message></a></li>
								<li><a href="CopyPlanningYearView"><fmt:message key="menu.copyplanningyear"></fmt:message></a></li>
								<li><a href="UsersView"><fmt:message key="menu.privilage"></fmt:message></a></li>

					</ul>
				</li>

	<li class="mm-dropdown">
					<a href="#"><i class="menu-icon fa fa-tags"></i><span class="mm-text"><fmt:message key="menu.maininfo"></fmt:message></span></a>
					<ul>
								<li><a href="SchoolDetailView"><fmt:message key="maininfo.schooldetails"></fmt:message></a></li>
								<li><a href="SchoolLocationView"><fmt:message key="menu.location"></fmt:message></a></li>
								<li><a href="WorkTeamView"><fmt:message key="menu.teamwork"></fmt:message></a></li>
								<li><a href="LeadersView"><fmt:message key="menu.leader"></fmt:message></a></li>
								<li><a href="PlanningTeamView"><fmt:message key="menu.planningteam"></fmt:message></a></li>
								<li><a href="AdminStaffView"><fmt:message key="menu.adminstaff"></fmt:message></a></li>
								<li><a href="TechStaffView"><fmt:message key="menu.techstaff"></fmt:message></a></li>
								<li><a href="ClassAnalysisView"><fmt:message key="menu.classanalysis"></fmt:message></a></li>
								<li><a href="SchoolBuildingView"><fmt:message key="menu.schoolbuilding"></fmt:message></a></li>
<%-- 								<li><a href="SchoolBudgetView"><fmt:message key="menu.budget"></fmt:message></a></li> --%>
								<li><a href="SchoolTimeSheetView"><fmt:message key="menu.schooltimesheet"></fmt:message></a></li>
								<li><a href="CoursePlanView"><fmt:message key="menu.coursetable"></fmt:message></a></li>
								<li><a href="AnnouncementView"><fmt:message key="menu.announcement"></fmt:message></a></li>

					</ul>
				</li>
				<li class="mm-dropdown">
					<a href="#"><i class="menu-icon fa fa-folder-open"></i><span class="mm-text"><fmt:message key="menu.strategy"></fmt:message></span></a>
					<ul>
								<li><a href="SchoolVMSView"><fmt:message key="menu.messageviewslogan"></fmt:message></a></li>
								<li><a href="SchoolIntroView"><fmt:message key="menu.schoolintro"></fmt:message></a></li>
								<li><a href="SchoolValueView"><fmt:message key="menu.schoolvalue"></fmt:message></a></li>
								<li class="mm-dropdown">
									<a href="#"><i class="menu-icon fa fa-folder-open"></i><span class="mm-text"><fmt:message key="swat"></fmt:message></span></a>
									<ul>
										<li><a href="SWATSymbolView"><fmt:message key="setting.swat"></fmt:message></a></li>
										<li><a href="SWATAnalysisView"><fmt:message key="menu.schoolswatanalysis"></fmt:message></a></li>
									</ul>
								</li>
								
								
					</ul>
				</li>
				
			
				
				
				
				<li class="mm-dropdown">
					<a href="#"><i class="menu-icon fa fa-cogs"></i><span class="mm-text"><fmt:message key="menu.setting"></fmt:message></span></a>
					<ul>
								<li><a href="BPview"><fmt:message key="menu.businesspartner"></fmt:message></a></li>
								<li><a href="FieldsView"><fmt:message key="menu.units"></fmt:message></a></li>
								<li><a href="FieldsView"><fmt:message key="menu.items"></fmt:message></a></li>
								<li><a href="FieldsView"><fmt:message key="menu.workingstatus"></fmt:message></a></li>
								<li><a href="FieldsView"><fmt:message key="menu.projecttype"></fmt:message></a></li>
								
								
					</ul>
				</li>
				
				<li class="mm-dropdown">
					<a href="#"><i class="menu-icon fa fa-bar-chart-o"></i><span class="mm-text"><fmt:message key="menu.reports"></fmt:message></span></a>
					<ul>
							<li><a href="RptSchoolBook"><fmt:message key="reports.rpt_school_book"></fmt:message></a></li>
									<li><a href="RptResponsibleView"><fmt:message key="reports.rpt_responsible"></fmt:message></a></li>
									<li><a href="RptMissionByClassification"><fmt:message key="reports.rpt_mission_classification"></fmt:message></a></li>
									<li><a href="RptSchoolBudget"><fmt:message key="reports.rpt_school_budget"></fmt:message></a></li>
									<li><a href="RptEvaluateWorkPlan"><fmt:message key="reports.rpt_eval_work_plan"></fmt:message></a></li>
									<li><a href="ReportPlanOperation"><fmt:message key="reports.rpt_planningoperation"></fmt:message></a></li>
									<li><a href="RptSwatAnalysis"><fmt:message key="reports.rpt_swat"></fmt:message></a></li>
					</ul>
				</li>
				
				
				
		
			</ul> <!-- / .navigation -->
			
		</div> <!-- / #main-menu-inner -->
	</div> <!-- / #main-menu -->
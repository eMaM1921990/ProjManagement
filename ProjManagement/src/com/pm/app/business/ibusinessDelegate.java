package com.pm.app.business;

import com.pm.app.dal.dto.BpView;
import com.pm.app.dal.dto.BusinessPartner;
import com.pm.app.dal.dto.BusinessPartnerPk;
import com.pm.app.dal.dto.BusinessPartnerType;
import com.pm.app.dal.dto.Items;
import com.pm.app.dal.dto.ItemsPk;
import com.pm.app.dal.dto.ProjectPhases;
import com.pm.app.dal.dto.ProjectType;
import com.pm.app.dal.dto.ProjectTypePk;
import com.pm.app.dal.dto.StaticProjectPhases;
import com.pm.app.dal.dto.StaticProjectPhasesPk;
import com.pm.app.dal.dto.Sysusers;
import com.pm.app.dal.dto.Units;
import com.pm.app.dal.dto.UnitsPk;
import com.pm.app.dal.dto.WorkingStatus;
import com.pm.app.dal.dto.WorkingStatusPk;

public interface ibusinessDelegate {
	
	public Sysusers appLogin(Sysusers dto);
	
	public BpView[] getBranchParnter(int branchId);
	public BusinessPartnerPk createBusinessPartner(BusinessPartner dto);
	public int updateBusinessPartner(BusinessPartnerPk pk,BusinessPartner dto);
	public int deleteBusinessPartner(BusinessPartnerPk pk);
	public BusinessPartnerType[] getBusinessPartnerType();
	public BusinessPartner getBusinessPartnerForUpdate(BusinessPartner dto);
	
	public Items[] getBranchItems(int branchId);
	public ItemsPk createItemsPerBranch(Items dto);
	public int updateItems(ItemsPk pk,Items dto);
	public int deleteItems(ItemsPk pk);
	
	public Units[] getBranchUnits(int branchId);
	public UnitsPk createUnits(Units dto);
	public int updateUnits(UnitsPk pk,Units dto);
	public int deleteUnits(UnitsPk pk);
	
	public WorkingStatus[] getWorkingStatusPerBranch(int branchId);
	public WorkingStatusPk createWorkingStatus(WorkingStatus dto);
	public int updateWorkingStatus(WorkingStatusPk pk,WorkingStatus dto);
	public int deleteWorkingStatus(WorkingStatusPk pk);
	
	public ProjectType[] getProjectType(int branchId);
	public ProjectTypePk createProjectType(ProjectType dto);
	public int updateProjectType(ProjectTypePk pk,ProjectType dto);
	public int deleteProjectType(ProjectTypePk pk);
	
	public StaticProjectPhases[] getStaticProjectPhase(int type);
	public StaticProjectPhasesPk createStaticProjectPhase(StaticProjectPhases dto);
	public int updateStaticProjectPhase(StaticProjectPhasesPk pk,StaticProjectPhases dto);
	public int deleteStaticProjectPhase(StaticProjectPhasesPk pk);
	
	
	
}

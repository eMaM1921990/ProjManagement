package com.pm.app.business;

import com.pm.app.dal.dao.BpViewDao;
import com.pm.app.dal.dao.BusinessPartnerDao;
import com.pm.app.dal.dao.BusinessPartnerTypeDao;
import com.pm.app.dal.dao.ItemsDao;
import com.pm.app.dal.dao.ProjectTypeDao;
import com.pm.app.dal.dao.StaticProjectPhasesDao;
import com.pm.app.dal.dao.SysusersDao;
import com.pm.app.dal.dao.UnitsDao;
import com.pm.app.dal.dao.WorkingStatusDao;
import com.pm.app.dal.dto.BpView;
import com.pm.app.dal.dto.BusinessPartner;
import com.pm.app.dal.dto.BusinessPartnerPk;
import com.pm.app.dal.dto.BusinessPartnerType;
import com.pm.app.dal.dto.Items;
import com.pm.app.dal.dto.ItemsPk;
import com.pm.app.dal.dto.ProjectType;
import com.pm.app.dal.dto.ProjectTypePk;
import com.pm.app.dal.dto.StaticProjectPhases;
import com.pm.app.dal.dto.StaticProjectPhasesPk;
import com.pm.app.dal.dto.Sysusers;
import com.pm.app.dal.dto.Units;
import com.pm.app.dal.dto.UnitsPk;
import com.pm.app.dal.dto.WorkingStatus;
import com.pm.app.dal.dto.WorkingStatusPk;
import com.pm.app.dal.exceptions.BpViewDaoException;
import com.pm.app.dal.exceptions.BusinessPartnerDaoException;
import com.pm.app.dal.exceptions.BusinessPartnerTypeDaoException;
import com.pm.app.dal.exceptions.ItemsDaoException;
import com.pm.app.dal.exceptions.ProjectTypeDaoException;
import com.pm.app.dal.exceptions.StaticProjectPhasesDaoException;
import com.pm.app.dal.exceptions.SysusersDaoException;
import com.pm.app.dal.exceptions.UnitsDaoException;
import com.pm.app.dal.exceptions.WorkingStatusDaoException;
import com.pm.app.dal.factory.BpViewDaoFactory;
import com.pm.app.dal.factory.BusinessPartnerDaoFactory;
import com.pm.app.dal.factory.BusinessPartnerTypeDaoFactory;
import com.pm.app.dal.factory.ItemsDaoFactory;
import com.pm.app.dal.factory.ProjectTypeDaoFactory;
import com.pm.app.dal.factory.StaticProjectPhasesDaoFactory;
import com.pm.app.dal.factory.SysusersDaoFactory;
import com.pm.app.dal.factory.UnitsDaoFactory;
import com.pm.app.dal.factory.WorkingStatusDaoFactory;

public class businessDelegate implements ibusinessDelegate{

	@Override
	public BpView[] getBranchParnter(int branchId) {
		// TODO Auto-generated method stub
		BpViewDao dao=BpViewDaoFactory.create();
		try {
			BpView[] data=dao.findWhereBranchIdEquals(branchId);
			return data;
		} catch (BpViewDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public BusinessPartnerPk createBusinessPartner(BusinessPartner dto) {
		// TODO Auto-generated method stub
		BusinessPartnerDao dao=BusinessPartnerDaoFactory.create();
		BusinessPartnerPk pk=null;
		try {
			 pk=dao.insert(dto);
			
		} catch (BusinessPartnerDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pk;
	}

	@Override
	public int updateBusinessPartner(BusinessPartnerPk pk, BusinessPartner dto) {
		// TODO Auto-generated method stub
		BusinessPartnerDao dao=BusinessPartnerDaoFactory.create();
		try {
			dao.update(pk, dto);
			return 1;
			
		} catch (BusinessPartnerDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int deleteBusinessPartner(BusinessPartnerPk pk) {
		// TODO Auto-generated method stub
		BusinessPartnerDao dao=BusinessPartnerDaoFactory.create();
		try {
			dao.delete(pk);
			return 1;
		} catch (BusinessPartnerDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public BusinessPartnerType[] getBusinessPartnerType() {
		// TODO Auto-generated method stub
		BusinessPartnerTypeDao dao=BusinessPartnerTypeDaoFactory.create();
		BusinessPartnerType[] data=null;
		try {
			data=dao.findAll();
		} catch (BusinessPartnerTypeDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public Items[] getBranchItems(int branchId) {
		// TODO Auto-generated method stub
		ItemsDao dao=ItemsDaoFactory.create();
		Items[] data=null;
		try {
			data=dao.findByBranches(branchId);
		} catch (ItemsDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public ItemsPk createItemsPerBranch(Items dto) {
		// TODO Auto-generated method stub
		ItemsDao dao=ItemsDaoFactory.create();
		ItemsPk pk=null;
		try {
			pk=dao.insert(dto);
		} catch (ItemsDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pk;
	}

	@Override
	public int updateItems(ItemsPk pk, Items dto) {
		// TODO Auto-generated method stub
		ItemsDao dao=ItemsDaoFactory.create();
		try {
			dao.update(pk, dto);
			return 1;
		} catch (ItemsDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
		
	}

	@Override
	public int deleteItems(ItemsPk pk) {
		// TODO Auto-generated method stub
		ItemsDao dao=ItemsDaoFactory.create();
		try {
			dao.delete(pk);
			return 1;
		} catch (ItemsDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public Units[] getBranchUnits(int branchId) {
		// TODO Auto-generated method stub
		UnitsDao dao=UnitsDaoFactory.create();
		Units[] data=null;
		try {
			data=dao.findWhereBranchIdEquals(branchId);
		} catch (UnitsDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public UnitsPk createUnits(Units dto) {
		// TODO Auto-generated method stub
		UnitsDao dao=UnitsDaoFactory.create();
		UnitsPk pk=null;
		try {
			pk=dao.insert(dto);
		} catch (UnitsDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pk;
	}

	@Override
	public int updateUnits(UnitsPk pk, Units dto) {
		// TODO Auto-generated method stub
		UnitsDao dao=UnitsDaoFactory.create();
		try {
			dao.update(pk, dto);
			return 0;
		} catch (UnitsDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 1;
		}
		
	}

	@Override
	public int deleteUnits(UnitsPk pk) {
		// TODO Auto-generated method stub
		UnitsDao dao=UnitsDaoFactory.create();
		try {
			dao.delete(pk);
			return 1;
		} catch (UnitsDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public WorkingStatus[] getWorkingStatusPerBranch(int branchId) {
		// TODO Auto-generated method stub
		WorkingStatusDao dao=WorkingStatusDaoFactory.create();
		WorkingStatus[] data=null;
		try {
			data=dao.findByBranches(branchId);
		} catch (WorkingStatusDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public WorkingStatusPk createWorkingStatus(WorkingStatus dto) {
		// TODO Auto-generated method stub
		WorkingStatusDao dao=WorkingStatusDaoFactory.create();
		WorkingStatusPk pk=null;
		try {
			pk=dao.insert(dto);
		} catch (WorkingStatusDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pk;
	}

	@Override
	public int updateWorkingStatus(WorkingStatusPk pk, WorkingStatus dto) {
		// TODO Auto-generated method stub
		WorkingStatusDao dao=WorkingStatusDaoFactory.create();
		try {
			dao.update(pk, dto);
			return 1;
		} catch (WorkingStatusDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int deleteWorkingStatus(WorkingStatusPk pk) {
		// TODO Auto-generated method stub
		WorkingStatusDao dao=WorkingStatusDaoFactory.create();
		try {
			dao.delete(pk);
			return 1;
		} catch (WorkingStatusDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public ProjectType[] getProjectType(int branchId) {
		// TODO Auto-generated method stub
		ProjectTypeDao dao=ProjectTypeDaoFactory.create();
		ProjectType[] data=null;
		try {
			data=dao.findWhereBranchIdEquals(branchId);
		} catch (ProjectTypeDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public ProjectTypePk createProjectType(ProjectType dto) {
		// TODO Auto-generated method stub
		ProjectTypeDao dao=ProjectTypeDaoFactory.create();
		ProjectTypePk pk=null;
		try {
			pk=dao.insert(dto);
		} catch (ProjectTypeDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pk;
	}

	@Override
	public int updateProjectType(ProjectTypePk pk, ProjectType dto) {
		// TODO Auto-generated method stub
		ProjectTypeDao dao=ProjectTypeDaoFactory.create();
		try {
			dao.update(pk, dto);
			return 1;
		} catch (ProjectTypeDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int deleteProjectType(ProjectTypePk pk) {
		// TODO Auto-generated method stub
		ProjectTypeDao dao=ProjectTypeDaoFactory.create();
		try {
			dao.delete(pk);
			return 1;
		} catch (ProjectTypeDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
		
	}

	@Override
	public StaticProjectPhases[] getStaticProjectPhase(int type) {
		// TODO Auto-generated method stub
		StaticProjectPhasesDao dao=StaticProjectPhasesDaoFactory.create();
		StaticProjectPhases[] data=null;
		try {
			data=dao.findByProjectType(type);
		} catch (StaticProjectPhasesDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public StaticProjectPhasesPk createStaticProjectPhase(StaticProjectPhases dto) {
		// TODO Auto-generated method stub
		StaticProjectPhasesDao dao=StaticProjectPhasesDaoFactory.create();
		StaticProjectPhasesPk pk=null;
		try {
			pk=dao.insert(dto);
		} catch (StaticProjectPhasesDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pk;
	}

	@Override
	public int updateStaticProjectPhase(StaticProjectPhasesPk pk,
			StaticProjectPhases dto) {
		// TODO Auto-generated method stub
		StaticProjectPhasesDao dao=StaticProjectPhasesDaoFactory.create();
		try {
			dao.update(pk, dto);
			return 1;
		} catch (StaticProjectPhasesDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int deleteStaticProjectPhase(StaticProjectPhasesPk pk) {
		// TODO Auto-generated method stub
		StaticProjectPhasesDao dao=StaticProjectPhasesDaoFactory.create();
		try {
			dao.delete(pk);
			return 1;
		} catch (StaticProjectPhasesDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
		
	}

	@Override
	public Sysusers appLogin(Sysusers dto) {
		// TODO Auto-generated method stub
		SysusersDao dao=SysusersDaoFactory.create();
		Sysusers[] data=null;
		Sysusers user=null;
		try {
			data =dao.findByDynamicWhere("username=? and password=?", new Object[]{new String(dto.getUsername()),new String(dto.getPassword())});
		} catch (SysusersDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(data.length>0){
			 user=data[0];
			 System.out.println("BranchId "+user.getBranchId());
			 
		}else{
			 user=null;
		}
		
		return user;
	}

	@Override
	public BusinessPartner getBusinessPartnerForUpdate(BusinessPartner dto) {
		// TODO Auto-generated method stub
		BusinessPartnerDao dao=BusinessPartnerDaoFactory.create();
		BusinessPartner data=null;
		try {
			data=dao.findByPrimaryKey(dto.getIdbusinessPartner());
		} catch (BusinessPartnerDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}

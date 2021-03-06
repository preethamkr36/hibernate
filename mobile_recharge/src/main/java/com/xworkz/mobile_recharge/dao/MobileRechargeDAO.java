package com.xworkz.mobile_recharge.dao;

import com.xworkz.mobile_recharge.dto.MobileRechargeDTO;
import com.xworkz.mobile_recharge.enums.ServicesProvider;
import com.xworkz.mobile_recharge.enums.Type;

public interface MobileRechargeDAO {
	public boolean createMobileRecharge(MobileRechargeDTO dto);
	
	public MobileRechargeDTO getMobileRechargeInfo(int id);
	
	public boolean deleteMobileRechargeById(int id);
	
	public boolean updateServiceProviderById(Integer id,ServicesProvider ser);
	
	public ServicesProvider getServiceProvideByType(int id,Type type);
	
	public Integer getPlanByServiceProvider(int id,ServicesProvider provider);
	
	public Long getNumberById(int id);
	
	public void updatePlanById(int id,Integer plan);
	
	public void updatePlanByServiceProvider(int id,ServicesProvider provider,Integer plan);
	
	public boolean deleteByServiceProvider(int id, ServicesProvider provider);
	
	public boolean deleteByType(int id,Type type);
}

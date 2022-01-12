package com.xworkz.mobile_recharge.dao;

import com.xworkz.mobile_recharge.dto.MobileRechargeDTO;
import com.xworkz.mobile_recharge.enums.ServicesProvider;

public interface MobileRechargeDAO {
	public boolean createMobileRecharge(MobileRechargeDTO dto);
	
	public MobileRechargeDTO getMobileRechargeInfo(int id);
	
	public boolean deleteMobileRechargeById(int id);
	
	public boolean updateServiceProviderById(Integer id,ServicesProvider ser);
}

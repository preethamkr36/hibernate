package com.xworkz.mobile_recharge;

import com.xworkz.mobile_recharge.dao.MobileRechargeDAO;
import com.xworkz.mobile_recharge.dao.MobileRechargeDAOImpl;
import com.xworkz.mobile_recharge.dto.MobileRechargeDTO;
import com.xworkz.mobile_recharge.enums.ServicesProvider;
import com.xworkz.mobile_recharge.enums.Type;

public class Trigger {
	public static void main(String[] args) {
		MobileRechargeDTO dto1 = new MobileRechargeDTO(1, ServicesProvider.JIO, Type.POSTPAID, 555, 8217566973L);
		MobileRechargeDTO dto2 = new MobileRechargeDTO(2, ServicesProvider.AIRTEL, Type.PREPAID, 500, 9945925532L);
		MobileRechargeDTO dto3 = new MobileRechargeDTO(3, ServicesProvider.VI, Type.PREPAID, 655, 9611132484L);
		MobileRechargeDTO dto4 = new MobileRechargeDTO(4, ServicesProvider.JIO, Type.PREPAID, 555, 8217566973L);
		MobileRechargeDAO dao = new MobileRechargeDAOImpl();
//		dao.createMobileRecharge(dto1);
//		dao.createMobileRecharge(dto2);
//		dao.createMobileRecharge(dto3);
//		dao.createMobileRecharge(dto4);

//		System.out.println(dao.getMobileRechargeInfo(1));
//		System.out.println(dao.deleteMobileRechargeById(4));
		
		dao.updateServiceProviderById(1, ServicesProvider.VI);
		
	}
}
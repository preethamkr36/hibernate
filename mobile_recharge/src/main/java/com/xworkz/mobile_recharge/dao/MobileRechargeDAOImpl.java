package com.xworkz.mobile_recharge.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.mobile_recharge.dto.MobileRechargeDTO;
import com.xworkz.mobile_recharge.enums.ServicesProvider;

public class MobileRechargeDAOImpl implements MobileRechargeDAO {

	@Override
	public boolean createMobileRecharge(MobileRechargeDTO dto) {
		if (dto != null) {
			System.out.println("Inside create recharge method");
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(dto);
			transaction.commit();
			session.close();
			factory.close();
			return true;
		} else {
			System.out.println("Mobile Recharge dto can't be empty");
			return false;
		}
	}

	@Override
	public MobileRechargeDTO getMobileRechargeInfo(int id) {
		Configuration configuration = new Configuration();
		configuration.configure("resources/hibernate.cfg.xml");
		configuration.addAnnotatedClass(MobileRechargeDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		MobileRechargeDTO dto = session.get(MobileRechargeDTO.class, id);
		session.close();
		factory.close();
		return dto;
	}

	@Override
	public boolean deleteMobileRechargeById(int id) {
		if(id!=0) {
			System.out.println("Inside delete recharge method");
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			MobileRechargeDTO object=session.get(MobileRechargeDTO.class, id);
			if(object!=null) {
				session.delete(object);
			}else {
				System.out.println("Object is null");
			}
			transaction.commit();
			session.close();
			factory.close();
			return true;
		}
		return false;
	}

	@Override
	public boolean updateServiceProviderById(Integer id, ServicesProvider ser) {
		if(id!=0) {
			Configuration configuration=new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory=configuration.buildSessionFactory();
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			MobileRechargeDTO dto= session.get(MobileRechargeDTO.class, id);
			dto.setServiceProvider(ser);
			session.update(dto);
			transaction.commit();
			session.close();
			factory.close();
			return true;
		}
		return false;
	}
}
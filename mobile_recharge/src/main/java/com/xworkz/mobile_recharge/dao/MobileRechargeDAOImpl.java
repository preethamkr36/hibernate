package com.xworkz.mobile_recharge.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.mobile_recharge.dto.MobileRechargeDTO;
import com.xworkz.mobile_recharge.enums.ServicesProvider;
import com.xworkz.mobile_recharge.enums.Type;

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
		if (id != 0) {
			System.out.println("Inside delete recharge method");
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			MobileRechargeDTO object = session.get(MobileRechargeDTO.class, id);
			if (object != null) {
				session.delete(object);
			} else {
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
		if (id != 0) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			MobileRechargeDTO dto = session.get(MobileRechargeDTO.class, id);
			dto.setServiceProvider(ser);
			session.update(dto);
			transaction.commit();
			session.close();
			factory.close();
			return true;
		}
		return false;
	}

	@Override
	public ServicesProvider getServiceProvideByType(int id, Type type) {
		ServicesProvider mdto = null;
		if (id != 0 && type != null) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			MobileRechargeDTO dto = session.get(MobileRechargeDTO.class, id);
			if (dto != null && dto.getType().equals(type)) {
				mdto = dto.getServiceProvider();
			}
			session.close();
			factory.close();
		}
		return mdto;
	}

	@Override
	public Integer getPlanByServiceProvider(int id, ServicesProvider provider) {
		Integer plan = null;
		if (id != 0 && provider != null) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			MobileRechargeDTO dto = session.get(MobileRechargeDTO.class, id);
			if (dto != null && dto.getServiceProvider().equals(provider)) {
				plan = dto.getPlan();
			}
			session.close();
			factory.close();
		}
		return plan;
	}

	@Override
	public Long getNumberById(int id) {
		Long num = null;
		if (id != 0) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			MobileRechargeDTO dto = session.get(MobileRechargeDTO.class, id);
			if (dto != null) {
				num = dto.getNumber();
			}
			session.close();
			factory.close();
		}
		return num;
	}

	@Override
	public void updatePlanById(int id, Integer plan) {
		if (id != 0) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			MobileRechargeDTO dto = session.get(MobileRechargeDTO.class, id);
			System.out.println("before update -> " + dto);
			if (dto != null) {
				dto.setPlan(plan);
				session.update(dto);
				System.out.println("after update -> " + dto);
			}
			transaction.commit();
			session.close();
			factory.close();
		}
	}

	@Override
	public void updatePlanByServiceProvider(int id, ServicesProvider provider, Integer plan) {
		if (id != 0 && provider != null) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			MobileRechargeDTO dto = session.get(MobileRechargeDTO.class, id);
			System.out.println("before update -> " + dto);
			if (dto != null && dto.getServiceProvider().equals(provider)) {
				dto.setPlan(plan);
				session.update(dto);
				System.out.println("after update -> " + dto);
			}
			transaction.commit();
			session.close();
			factory.close();
		}
	}

	@Override
	public boolean deleteByServiceProvider(int id, ServicesProvider provider) {
		boolean f = false;
		if (id != 0 && provider != null) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			MobileRechargeDTO dto = session.get(MobileRechargeDTO.class, id);
			if (dto != null && dto.getServiceProvider().equals(provider)) {
				session.delete(dto);
				f = true;
			}
			transaction.commit();
			session.close();
			factory.close();
		}
		return f;
	}

	@Override
	public boolean deleteByType(int id, Type type) {

		boolean f = false;
		if (id != 0 && type != null) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(MobileRechargeDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			MobileRechargeDTO dto = session.get(MobileRechargeDTO.class, id);
			if (dto != null && dto.getType().equals(type)) {
				session.delete(dto);
				f = true;
			}
			transaction.commit();
			session.close();
			factory.close();
		}
		return f;
	}
}
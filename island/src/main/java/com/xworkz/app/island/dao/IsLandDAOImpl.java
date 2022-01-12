package com.xworkz.app.island.dao;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.xworkz.app.island.dto.IsLandDTO;

public class IsLandDAOImpl implements IsLandDAO {

	@Override
	public boolean createIsLand(IsLandDTO dto) {
		if (dto != null) {
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(IsLandDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(dto);
			transaction.commit();
			session.close();

			factory.close();
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean deleteIslandById(int id) {
		if (id != 0) {
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(IsLandDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			Object object = session.get(IsLandDTO.class, id);
			transaction.commit();
			session.delete(object);
			session.close();
			factory.close();
		}
		return false;
	}

	@Override
	public IsLandDTO getIslandById(int id) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(IsLandDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		IsLandDTO dto = session.get(IsLandDTO.class, id);
		session.close();
		factory.close();
		return dto;
	}

	@Override
	public void updateLocationById(int id, String location) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(IsLandDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		IsLandDTO object=session.get(IsLandDTO.class, id);
		if(object!=null) {
			object.setIsLanflocation(location);
			session.update(object);
			transaction.commit();
		}
		session.close();
		factory.close();
		
	}

}

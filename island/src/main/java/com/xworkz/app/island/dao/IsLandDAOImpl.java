package com.xworkz.app.island.dao;

import java.util.Collection;

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
			configuration.configure("resources/hibernate.cfg.xml");
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
		configuration.configure("resources/hibernate.cfg.xml");
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
		configuration.configure("resources/hibernate.cfg.xml");
		configuration.addAnnotatedClass(IsLandDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		IsLandDTO object = session.get(IsLandDTO.class, id);
		if (object != null) {
			object.setIsLanflocation(location);
			session.update(object);
			transaction.commit();
		}
		session.close();
		factory.close();

	}

	@Override
	public String getIsLandCountryById(int id) {
		if (id != 0) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(IsLandDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			IsLandDTO dto = session.get(IsLandDTO.class, id);
			String country = dto.getCountry();
			session.close();
			factory.close();
			return country;
		}

		return null;
	}

	@Override
	public String getislandNameByCountry(int id, String country) {
		String name = null;
		if (id != 0 && country != null) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(IsLandDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			IsLandDTO dto = session.get(IsLandDTO.class, id);
			if (dto.getCountry().equals(country)) {
				name = dto.getIsLandName();
			}
			session.close();
			factory.close();
		}
		return name;
	}

	@Override
	public Collection<IsLandDTO> getAllIsLand() {

		return null;
	}

	@Override
	public void updateIsLandNameById(int id, String name) {
		if (id != 0) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(IsLandDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			IsLandDTO dto = session.get(IsLandDTO.class, id);
			if (dto != null) {
				dto.setIsLandName(name);
			}
			session.update(dto);
			transaction.commit();
			session.close();
			factory.close();
		}
	}

	@Override
	public void updateIsLandNameByCountry(int id, String name, String country) {
		if (id != 0 && country != null) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(IsLandDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			IsLandDTO dto = session.get(IsLandDTO.class, id);
			if (dto != null) {
				if (dto.getCountry().equals(country)) {
					dto.setIsLandName(name);
				}
			}
			session.update(dto);
			transaction.commit();
			session.close();
			factory.close();
		}
	}

	@Override
	public boolean deleteIsLandByName(int id, String name) {
		if (id != 0 && name != null) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(IsLandDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			IsLandDTO dto = session.get(IsLandDTO.class, id);
			if (dto != null) {
				if (dto.getIsLandName().equals(name)) {
					session.delete(dto);
				}
			}
			session.update(dto);
			transaction.commit();
			session.close();
			factory.close();
			return true;
		}
		return false;
	}

}

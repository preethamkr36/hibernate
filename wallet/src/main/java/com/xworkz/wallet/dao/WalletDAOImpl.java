package com.xworkz.wallet.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.wallet.dto.WalletDTO;

public class WalletDAOImpl implements WalletDAO {

	@Override
	public boolean createWallet(WalletDTO dto) {
		if (dto != null) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(WalletDTO.class);
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
	public WalletDTO getWalletById(Integer id) {
		if (id != 0) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(WalletDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			WalletDTO dto = session.get(WalletDTO.class, id);
			return dto;
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		if (id != 0) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(WalletDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			Object obj = session.get(WalletDTO.class, id);
			session.delete(obj);
			transaction.commit();
			session.close();
			factory.close();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateAmountById(Integer amount, Integer id) {
		if (id != 0) {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			configuration.addAnnotatedClass(WalletDTO.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			WalletDTO dto = session.get(WalletDTO.class, id);
			dto.setAmount(amount);
			session.update(dto);
			transaction.commit();
			session.close();
			factory.close();
			return true;
		} else {
			return false;
		}
	}

}

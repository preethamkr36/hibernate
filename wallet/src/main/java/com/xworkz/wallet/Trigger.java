package com.xworkz.wallet;

import com.xworkz.wallet.dao.WalletDAO;
import com.xworkz.wallet.dao.WalletDAOImpl;
import com.xworkz.wallet.dto.WalletDTO;

public class Trigger {
	public static void main(String[] args) {
		WalletDTO dto1=new WalletDTO(1, "Preetham", "preethamkr36@okaxis", 3560);
		WalletDTO dto2=new WalletDTO(2, "Ramesh", "rameshkp@okaxis", 5500);
		WalletDTO dto3=new WalletDTO(3, "Sheethal", "sheethal142336@okaxis", 3560);
		WalletDTO dto4=new WalletDTO(4, "Pallavi", "pallavikr@okaxis", 3560);
		
		WalletDAO dao=new WalletDAOImpl();
		
//		dao.createWallet(dto4);
//		dao.createWallet(dto2);
//		dao.createWallet(dto1);
//		dao.createWallet(dto3);
		
		System.out.println(dao.getWalletById(4));
		
		dao.updateAmountById(4500, 1);
		
		dao.deleteById(4);
		
		
	}
}

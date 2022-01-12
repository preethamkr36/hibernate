package com.xworkz.wallet.dao;

import com.xworkz.wallet.dto.WalletDTO;

public interface WalletDAO {
	public boolean createWallet(WalletDTO dto);
	public WalletDTO getWalletById(Integer id);
	public boolean deleteById(int id);
	public boolean updateAmountById(Integer amount,Integer id);
}

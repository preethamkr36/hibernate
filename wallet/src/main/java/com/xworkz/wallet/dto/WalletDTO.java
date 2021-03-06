package com.xworkz.wallet.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wallet", schema = "hibernate")
public class WalletDTO {
	@Id
	@Column(name = "wallet_id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "upi")
	private String upi;
	@Column(name = "amount")
	private Integer amount;

	public WalletDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WalletDTO(Integer id, String name, String upi, Integer amount) {
		super();
		this.id = id;
		this.name = name;
		this.upi = upi;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpi() {
		return upi;
	}

	public void setUpi(String upi) {
		this.upi = upi;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "WattelDTO [id=" + id + ", name=" + name + ", upi=" + upi + ", amount=" + amount + "]";
	}
}

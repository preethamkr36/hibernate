package com.xworkz.mobile_recharge.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.mobile_recharge.enums.ServicesProvider;
import com.xworkz.mobile_recharge.enums.Type;

@Entity
@Table(name = "mobile_recharge", schema = "hibernate")
public class MobileRechargeDTO {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "serviceprovider")
	@Enumerated(EnumType.STRING)
	private ServicesProvider serviceProvider;
	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private Type type;
	@Column(name = "plan")
	private Integer plan;
	@Column(name = "number")
	private Long number;
	
	

	public MobileRechargeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobileRechargeDTO(Integer id, ServicesProvider serviceProvider, Type type, Integer plan, Long number) {
		super();
		this.id = id;
		this.serviceProvider = serviceProvider;
		this.type = type;
		this.plan = plan;
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ServicesProvider getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(ServicesProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Integer getPlan() {
		return plan;
	}

	public void setPlan(Integer plan) {
		this.plan = plan;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "MobileRechargeDTO [id=" + id + ", serviceProvider=" + serviceProvider + ", type=" + type + ", plan="
				+ plan + ", number=" + number + "]";
	}
	
	

}

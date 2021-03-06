package com.xworkz.app.island.dao;

import java.util.Collection;

import com.xworkz.app.island.dto.IsLandDTO;

public interface IsLandDAO {
	public boolean createIsLand(IsLandDTO dto);
	public boolean deleteIslandById(int id);
	public IsLandDTO getIslandById(int id);
	public void updateLocationById(int id,String location);
	public String getIsLandCountryById(int id);
	public String getislandNameByCountry(int id,String country);
	public Collection<IsLandDTO> getAllIsLand();
	public void updateIsLandNameById(int id,String name);
	public void updateIsLandNameByCountry(int id,String name,String country);
	public boolean deleteIsLandByName(int id,String name);
}

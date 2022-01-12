package com.xworkz.app.island.dao;

import com.xworkz.app.island.dto.IsLandDTO;

public interface IsLandDAO {
	public boolean createIsLand(IsLandDTO dto);
	public boolean deleteIslandById(int id);
	public IsLandDTO getIslandById(int id);
	public void updateLocationById(int id,String location);
}

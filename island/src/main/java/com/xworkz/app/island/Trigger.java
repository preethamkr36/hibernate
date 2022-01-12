package com.xworkz.app.island;

import com.xworkz.app.island.dao.IsLandDAO;
import com.xworkz.app.island.dao.IsLandDAOImpl;
import com.xworkz.app.island.dto.IsLandDTO;

public class Trigger {
	public static void main(String[] args) {
		IsLandDTO dto=new IsLandDTO(1, "Andaman", "Bay Of Bengal", "INDIA");
		IsLandDTO dto2=new IsLandDTO(2, "St. Mary's", "Malpe", "INDIA");

		
		IsLandDAO dao=new IsLandDAOImpl();
		dao.createIsLand(dto2);
		
		
		System.out.println(dao.getIslandById(1));
		dao.updateLocationById(2, "Indian Sea");
		dao.deleteIslandById(2);
	}
}

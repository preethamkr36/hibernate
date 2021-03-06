package com.xworkz.app.island;

import com.xworkz.app.island.dao.IsLandDAO;
import com.xworkz.app.island.dao.IsLandDAOImpl;
import com.xworkz.app.island.dto.IsLandDTO;

public class Trigger {
	public static void main(String[] args) {
		IsLandDTO dto1 = new IsLandDTO(1, "Andaman", "Bay Of Bengal", "INDIA");
		IsLandDTO dto2 = new IsLandDTO(2, "St. Mary's", "Malpe", "INDIA");
		IsLandDTO dto3 = new IsLandDTO(3, "SriLanka", "Indian Ocean", "Srilanka");
		IsLandDTO dto4 = new IsLandDTO(4, "GreenLand", "NorthAtlantic", "Denmark");

		IsLandDAO dao = new IsLandDAOImpl();
		dao.createIsLand(dto1);
		dao.createIsLand(dto2);
		dao.createIsLand(dto3);
		dao.createIsLand(dto4);

		System.out.println(dao.getIslandById(1));
		dao.updateLocationById(2, "Indian Sea");
		dao.deleteIslandById(2);
		System.out.println(dao.getIslandById(1));
		dao.updateLocationById(4, "North Atlantic");
		System.out.println(dao.getIsLandCountryById(3));
		System.out.println(dao.getislandNameByCountry(4, "Denmark"));
		dao.updateIsLandNameById(2, "St. Marry's IsLand");
		dao.updateIsLandNameByCountry(3, "Sri Lanka", "SriLanka");
		dao.deleteIsLandByName(4, "Denmark");
	}
}

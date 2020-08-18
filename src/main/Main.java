package main;

import com.baris.services.Fighter;
import com.baris.services.FighterServiceImpl;
import com.baris.services.FighterServiceImplService;

public class Main {

	public static void main(String[] args) {

		FighterServiceImpl webService = new FighterServiceImplService().getFighterServiceImplPort();
		Fighter fighter;
		try {
			fighter = webService.getFighterById(2);
			System.out.println(fighter.getName());
			fighter = webService.getFighterByName("Badr");
			System.out.println(fighter.getId());
		} catch (NullPointerException e) {
			System.out.println("There is no fihgter with this id");
		}
	}

}

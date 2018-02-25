// Rich Burcham

import java.io.*;

public class DoorBellRings {



	public static void main(String args [] ) {
		System.out.println("DoorBell Rings");
		String owner = "PapaDogs";
		String visiter = "Mamafluffs"; 

		/* Create Doorbell objects using constructors */ 
		DoorBell ringDoor = new DoorBell (visiter, owner);
	
		/* Invoke methods for Doorbell */
		ringDoor.whoIsIt();
		ringDoor.answerOwner();
		ringDoor.answerVisiter();

	}
}



// Rich Burcham

import java.io.*;
public class DoorBell {

String visiter;
String owner;

// This is the constructor of the class DoorBell

	public DoorBell(String visiterName, String ownerName) {
		this.visiter=visiterName;
		this.owner=ownerName;
	}

	public void whoIsIt() {	
		System.out.println("Hi, who is it ");

	} 

	public void answerOwner() {	
		System.out.println("Hi, this is " + this.visiter);

	} 

	public void answerVisiter() {
		System.out.println("Hi, this is " + this.owner + " common on it!");
	}
	

}

package Weapon;

import Player.Player;

public class 방패 extends Weapon implements MyInterface.ttrowable {
	private int shield = 5;
		
	public 방패() {
		super("방패");
		this.setpower(35);
	}
	
	public void setshield(int num) {
		this.shield = num;
	}
	
	public int getshield() {
		return this.shield;
	}
	
	public int 던지기(Player target) {
		this.setshield(this.getshield()-1);
		if(this.getshield()==0) System.out.println("마지막 방패입니다.");
		return this.getpower();
	}
}

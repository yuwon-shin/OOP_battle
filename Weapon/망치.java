package Weapon;

import Player.Player;

public class ¸ÁÄ¡ extends Weapon implements MyInterface.ttrowable {
	private int hammer = 5;
	
    public ¸ÁÄ¡() {
    	super("¸ÁÄ¡");
    }
    public ¸ÁÄ¡(String name) {
    	super(name);
    	this.setpower(38);
    }
    public void sethammer(int num) {
    	this.hammer = num;
    }
    public int gethammer() {
    	return hammer;    	
    }
    public int ´øÁö±â(Player target){
    	this.sethammer(this.gethammer()-1);
    	if(this.gethammer()==0) System.out.println("¸¶Áö¸· ¸ÁÄ¡ÀÔ´Ï´Ù.");
    	return this.getpower();
    }

}

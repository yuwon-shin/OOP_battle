package Weapon;

import Player.Player;

public class ��ġ extends Weapon implements MyInterface.ttrowable {
	private int hammer = 5;
	
    public ��ġ() {
    	super("��ġ");
    }
    public ��ġ(String name) {
    	super(name);
    	this.setpower(38);
    }
    public void sethammer(int num) {
    	this.hammer = num;
    }
    public int gethammer() {
    	return hammer;    	
    }
    public int ������(Player target){
    	this.sethammer(this.gethammer()-1);
    	if(this.gethammer()==0) System.out.println("������ ��ġ�Դϴ�.");
    	return this.getpower();
    }

}

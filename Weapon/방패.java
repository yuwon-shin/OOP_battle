package Weapon;

import Player.Player;

public class ���� extends Weapon implements MyInterface.ttrowable {
	private int shield = 5;
		
	public ����() {
		super("����");
		this.setpower(35);
	}
	
	public void setshield(int num) {
		this.shield = num;
	}
	
	public int getshield() {
		return this.shield;
	}
	
	public int ������(Player target) {
		this.setshield(this.getshield()-1);
		if(this.getshield()==0) System.out.println("������ �����Դϴ�.");
		return this.getpower();
	}
}

package Weapon;

import Player.Player;

public class �ܵ� extends Weapon implements MyInterface.ttrowable {
    private int knife = (int) (Math.random()*3+1);

    public �ܵ�(){
    	super("�ܵ�");
    	this.setpower(12);
    
    }
    public void setknife(int num) {
    	this.knife = num;
    }
    public int getknife() {
    	return this.knife;
    }
    public int ������(Player target){
    	this.setknife(this.getknife()-1);
    	if(this.getknife()==0) System.out.println("������ �ܵ��Դϴ�.");
    	return this.getpower();
    }

}

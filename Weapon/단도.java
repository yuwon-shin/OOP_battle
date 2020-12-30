package Weapon;

import Player.Player;

public class 단도 extends Weapon implements MyInterface.ttrowable {
    private int knife = (int) (Math.random()*3+1);

    public 단도(){
    	super("단도");
    	this.setpower(12);
    
    }
    public void setknife(int num) {
    	this.knife = num;
    }
    public int getknife() {
    	return this.knife;
    }
    public int 던지기(Player target){
    	this.setknife(this.getknife()-1);
    	if(this.getknife()==0) System.out.println("마지막 단도입니다.");
    	return this.getpower();
    }

}

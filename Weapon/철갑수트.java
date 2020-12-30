package Weapon;

import java.util.ArrayList;

import Player.Player;

public class 철갑수트 extends Weapon implements MyInterface.Shooting {

    private ArrayList <미사일> 미사일통 = new ArrayList <미사일>();

    public 철갑수트() {
    	super("철갑수트");
    	
    }
    public 철갑수트(String name) {
    	super(name);
    	this.setpower(15);
    	미사일충전();
    }
    
    public int get미사일통size() {
    	return this.미사일통.size();
    }
    
    public void 미사일충전(){
    	미사일 b = new 미사일();
    	for(int i = 0; i<5; i++) 
    		미사일통.add(b);
    }
    public int 쏘기(Player target){
    	int b_pw = this.미사일통.get(0).get미사일power();
    	미사일통.remove(0);
    	int 미사일공격 = this.getpower()+b_pw;
    	if(미사일통.size()==0) System.out.println("마지막 미사일입니다.");
    	return 미사일공격;
    }

    

}

package Weapon;

import java.util.ArrayList;

import Player.Player;

public class 활 extends Weapon implements MyInterface.Shooting {
	
    private ArrayList <화살> 화살통 = new ArrayList <화살>();

    public 활(){
    	super("활");
    	this.setpower(10);
    	화살통채우기();
    }
    public int get화살통size() {
    	return this.화살통.size();
    }
    public void 화살통채우기(){
    	화살 o = new 화살();
    	for(int i = 0; i<5; i++) //블랙위도우 특수 무기 --> 5번으로 한정
    		화살통.add(o);
    }

    public int 쏘기(Player target){
    	int o_pw = this.화살통.get(0).get화살power();
    	화살통.remove(0);
    	int 활공격 = this.getpower()+o_pw;
    	if(화살통.size()==0) {
    		System.out.println("마지막 화살입니다.");
    	}
    	return 활공격;
    }

   

}

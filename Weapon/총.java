package Weapon;

import java.util.ArrayList;

import Player.Player;

public class ÃÑ extends Weapon implements MyInterface.Shooting {

    private ArrayList <ÃÑ¾Ë> ÃÑ¾ËÅë = new ArrayList <ÃÑ¾Ë>();

    public ÃÑ() {
    	super("ÃÑ");
    	this.setpower(5);
    	ÃÑ¾ËÅëÃ¤¿ì±â();
    }
    
    public int getÃÑ¾ËÅësize() {
    	return this.ÃÑ¾ËÅë.size();
    }
    
    public void ÃÑ¾Ë»ç¿ë() {
    	ÃÑ¾ËÅë.remove(0);
    }
    
    public void ÃÑ¾ËÅëÃ¤¿ì±â(){
    	ÃÑ¾Ë x = new ÃÑ¾Ë();
    	for(int i = 0; i<Math.random()*4+1; i++)
    		ÃÑ¾ËÅë.add(x);

    }
    
    public int ½î±â(Player target){
    	int x_pw = this.ÃÑ¾ËÅë.get(0).getÃÑ¾Ëpower();
    	ÃÑ¾Ë»ç¿ë();
    	
    	if(ÃÑ¾ËÅë.size()==0) System.out.println("¸¶Áö¸· ÃÑ¾ËÀÔ´Ï´Ù.");
    	int ÃÑ°ø°İ = this.getpower()+x_pw;
    	return ÃÑ°ø°İ;
    }

}

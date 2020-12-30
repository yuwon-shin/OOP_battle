package Player;
import Weapon.*;
import mary.TextToSpeech;

import java.util.ArrayList;

public abstract class Player implements MyInterface.Attackable, MyInterface.Hitable {
    public String name;
    private int hp;
    private int power;
    private ArrayList<Weapon> wp = new ArrayList <Weapon>();
    TextToSpeech tts =new TextToSpeech();
    
    
    public Player(){
    }
    public Player(String name) {
    	this.name = name;
    	System.out.println(this.name +"이/가 게임에 참여하였습니다.");
    	
    }

    public int gethp(){
        return hp;
    }

    public void sethp(int hp){
    	if(hp<0)
    		this.hp = 0;  // hp가 음수가 되는 것 방지
    	else	
    		this.hp = hp;
    	if(this.hp==0) {
    		System.out.println("This Player is killed!!!");
    		tts.setVoice("cmu-rms-hsmm");
    		tts.speak("Player killed!", 1.0f,false,true);
    	}
    }

    public int getpower(){
        return power;
    }

    public void setpower(int power){
    	this.power = power;
    }

    public void addWeapon(Weapon weapon) {
    	this.wp.add(weapon);
    }
    
    public ArrayList <Weapon> getWeapon(){
    	return wp;
    }
    
    public void 무기setting(int s){

		총 gun = new 총();
    	단도 dan = new 단도();
    	this.addWeapon(gun);
    	this.addWeapon(dan);

    	 //총과 단도는 모든 캐릭터의 기본 무기
    	
		switch(s) {          //캐릭터별 특별 무기 생성
		case 1: this.addWeapon(new 활()); break;
		case 2: this.addWeapon(new 마크7()); break;
		case 3: this.addWeapon(new 묠니르()); break;
		case 4: this.addWeapon(new 방패()); break;
		default: break;
    	}
		
		
    }
    
   
    public void show무기목록(){
    	tts.setVoice("cmu-rms-hsmm");
    	tts.speak("New Player Created!", 1.0f,false,true);
    	System.out.print(">>> "+this.name + " 이/(가) 가진 무기목록 :");
    	for(int i=0; i<this.wp.size(); i++) {
    		System.out.print(wp.get(i).name);
    		System.out.print(" ");
    	
    	}
    	System.out.println();
    }
    
    
    public void 때리기(Player target){
    	System.out.println(this.name+ " ---Hit) " + this.power +"---> " + target.name);
    	target.sethp(target.gethp()-this.power); 
    }
    
    public void attack(Player target){
    	try {
	      	int num = (int) (Math.random()*(wp.size()-1));
	    	int 공격력;
	    	
	    	if(wp.get(num) instanceof 총 && ((총) wp.get(num)).get총알통size()==0) {
	    		wp.remove(num);
	    		num=0;
	    	}
	    	if(wp.get(num) instanceof 단도 && ((단도) wp.get(num)).getknife()==0) {
	    		wp.remove(num); 
	    		num = 0;
	    	}
	    	
	    	if(this.getWeapon().size()<=1) {
				때리기(target);
				return;
	    	}
	    	
	    	Weapon w = wp.get(num);
	    	
	    	if(w instanceof 총) {
	    		공격력 = ((총) w).쏘기(target)+this.power;
	    		System.out.println(this.name+ " ---"+ w.name + "/ Shoot) " + 공격력 +"---> " + target.name);
	    		target.sethp(target.gethp()-공격력);
	   		}

	   		if(w instanceof 단도) {
	    		공격력 = ((단도) w).던지기(target)+this.power;
	    		System.out.println(this.name+ " ---"+ w.name + "/ Throw) " + 공격력 +"---> " + target.name);
	    		target.sethp(target.gethp()-공격력);
	    	}
    	}
    	catch(IndexOutOfBoundsException e) {
    	}
    	if (this.getWeapon().size()==0) 때리기(target);
    }

    public void attack(Player target, Weapon weapon){
   
    }

    

}

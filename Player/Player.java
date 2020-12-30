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
    	System.out.println(this.name +"��/�� ���ӿ� �����Ͽ����ϴ�.");
    	
    }

    public int gethp(){
        return hp;
    }

    public void sethp(int hp){
    	if(hp<0)
    		this.hp = 0;  // hp�� ������ �Ǵ� �� ����
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
    
    public void ����setting(int s){

		�� gun = new ��();
    	�ܵ� dan = new �ܵ�();
    	this.addWeapon(gun);
    	this.addWeapon(dan);

    	 //�Ѱ� �ܵ��� ��� ĳ������ �⺻ ����
    	
		switch(s) {          //ĳ���ͺ� Ư�� ���� ����
		case 1: this.addWeapon(new Ȱ()); break;
		case 2: this.addWeapon(new ��ũ7()); break;
		case 3: this.addWeapon(new ���ϸ�()); break;
		case 4: this.addWeapon(new ����()); break;
		default: break;
    	}
		
		
    }
    
   
    public void show������(){
    	tts.setVoice("cmu-rms-hsmm");
    	tts.speak("New Player Created!", 1.0f,false,true);
    	System.out.print(">>> "+this.name + " ��/(��) ���� ������ :");
    	for(int i=0; i<this.wp.size(); i++) {
    		System.out.print(wp.get(i).name);
    		System.out.print(" ");
    	
    	}
    	System.out.println();
    }
    
    
    public void ������(Player target){
    	System.out.println(this.name+ " ---Hit) " + this.power +"---> " + target.name);
    	target.sethp(target.gethp()-this.power); 
    }
    
    public void attack(Player target){
    	try {
	      	int num = (int) (Math.random()*(wp.size()-1));
	    	int ���ݷ�;
	    	
	    	if(wp.get(num) instanceof �� && ((��) wp.get(num)).get�Ѿ���size()==0) {
	    		wp.remove(num);
	    		num=0;
	    	}
	    	if(wp.get(num) instanceof �ܵ� && ((�ܵ�) wp.get(num)).getknife()==0) {
	    		wp.remove(num); 
	    		num = 0;
	    	}
	    	
	    	if(this.getWeapon().size()<=1) {
				������(target);
				return;
	    	}
	    	
	    	Weapon w = wp.get(num);
	    	
	    	if(w instanceof ��) {
	    		���ݷ� = ((��) w).���(target)+this.power;
	    		System.out.println(this.name+ " ---"+ w.name + "/ Shoot) " + ���ݷ� +"---> " + target.name);
	    		target.sethp(target.gethp()-���ݷ�);
	   		}

	   		if(w instanceof �ܵ�) {
	    		���ݷ� = ((�ܵ�) w).������(target)+this.power;
	    		System.out.println(this.name+ " ---"+ w.name + "/ Throw) " + ���ݷ� +"---> " + target.name);
	    		target.sethp(target.gethp()-���ݷ�);
	    	}
    	}
    	catch(IndexOutOfBoundsException e) {
    	}
    	if (this.getWeapon().size()==0) ������(target);
    }

    public void attack(Player target, Weapon weapon){
   
    }

    

}

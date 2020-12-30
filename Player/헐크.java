package Player;
import Weapon.*;
public class 헐크 extends Player {

    public 헐크(){
    	sethp(1200);
    	setpower(80);
    	this.name = "헐크";
    	무기setting(5);
    	show무기목록();
 
    }
    
    public void 때리기(Player target) {
    	try {
	    	int num = (int) (Math.random()*1);
	    	
			if(this.getWeapon().get(num) instanceof 총 && ((총) this.getWeapon().get(num)).get총알통size()==0) {
	    		this.getWeapon().remove(num);
	    		num = 0;
	    		
	    	}
	    	if(this.getWeapon().get(num) instanceof 단도 && ((단도)this.getWeapon().get(num)).getknife()==0) {
	    		this.getWeapon().remove(num); 
	    		num = 0;
	    	}
  	
	    	Weapon wp = this.getWeapon().get(num);
	    	
	    	int 공격력 = this.getpower();
	    	
	    	if (wp instanceof 총) {
	    		((총)wp).총알사용();
	    		if (((총)wp).get총알통size()==0) System.out.println("마지막 총알입니다.");
	    		System.out.println(this.name+ " ---"+ wp.name + "/ Hit) " + 공격력 +"---> " + target.name);
	    		target.sethp(target.gethp()-공격력);   
	    	}
	    	
	    	
			if (wp instanceof 단도) {
	    		((단도)wp).setknife(((단도) wp).getknife()-1);
	    		if (((단도)wp).getknife()==0) System.out.println("마지막 단도입니다.");
	    		System.out.println(this.name+ " ---"+ wp.name + "/ Hit) " + 공격력 +"---> " + target.name);
	    		target.sethp(target.gethp()-공격력);   
	    	}
    	
    	}
    	
    	catch(IndexOutOfBoundsException e) {
    	}
    	if(this.getWeapon().size()==0) super.때리기(target); 
    }
    
    public void attack(Player target){
 		때리기(target);
    }

    public void attack(Player target, Weapon wp){
    }

}

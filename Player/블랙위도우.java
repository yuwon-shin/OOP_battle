package Player;
import Weapon.*;

public class 블랙위도우 extends Player {
	
    public 블랙위도우() {
    	this.name = "블랙위도우";
    	sethp(960);
    	setpower(65);
    	무기setting(1);
    	show무기목록();
    }
    public void attack(Player target){
    	
    	if(this.gethp()>=(960/2)) {
			super.attack(target);
			return;
		}
    	if(this.gethp()<(960/2)) {
    		if(this.getWeapon().size()==0) {
				때리기(target);
				return;
	    	}
    		
			if(this.getWeapon().get(this.getWeapon().size()-1) instanceof 활 ){
    		int n = this.getWeapon().size();
    		this.attack(target, this.getWeapon().get(n-1));
			}
			else
				super.attack(target);
		}
		
		
    }

    public void attack(Player target, Weapon weapon){
    	
    	if (weapon instanceof 활) {
    		if (((활)weapon).get화살통size() ==0) {
    			int n = this.getWeapon().size()-1;
    			this.getWeapon().remove(n);
    			super.attack(target);
    		}
    		else {
    			int 공격력 = ((활) weapon).쏘기(target)+this.getpower();
    			System.out.println(this.name+ " ---"+ weapon.name + "/ Shoot) " + 공격력 +"---> " + target.name);
    			target.sethp(target.gethp()-공격력);
    			
    		}
    		
    	}
    	
    	
   
    }

}

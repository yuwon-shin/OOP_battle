package Player;
import Weapon.*;

public class 토르 extends Player {

    public 토르(){
    	sethp(1000);
    	setpower(60);
    	this.name = "토르";
    	무기setting(3);
    	show무기목록();
    }

    public void attack(Player target){
    	
    	if(this.gethp()>=(1000/2)) {
			super.attack(target);
			return;
		}
    	if(this.gethp()<(1000/2)) {
    		if(this.getWeapon().size()==0) {
				때리기(target);
				return;
	    	}
    		
			if(this.getWeapon().get(this.getWeapon().size()-1) instanceof 묠니르 ){
    		int n = this.getWeapon().size();
    		this.attack(target, this.getWeapon().get(n-1));
			}
			else
				super.attack(target);
		}
    }

    public void attack(Player target, Weapon weapon){
    	if (weapon instanceof 묠니르) {
    		if(((묠니르)weapon).gethammer()==0){
    			int n = this.getWeapon().size()-1;
    			this.getWeapon().remove(n);
    		}
    		else {
    			int 공격력 = ((묠니르)weapon).던지기(target)+this.getpower();
    			System.out.println(this.name+ " ---"+ weapon.name + "/ Throw) " + 공격력 +"---> " + target.name);
        		target.sethp(target.gethp()-공격력);
        		
    		}
    		
    	}
    }

}

package Player;
import Weapon.*;

public class 캡틴아메리카 extends Player {

    public 캡틴아메리카(){
    	sethp(950);
    	setpower(65);
    	this.name = "캡틴아메리카";
    	무기setting(4);
    	show무기목록();
    }

    public void attack(Player target){
    	
    	if(this.gethp()>=(950/2)) {
			super.attack(target);
			return;
		}
    	if(this.gethp()<(950/2)) {
    		if(this.getWeapon().size()==0) {
				때리기(target);
				return;
	    	}
    		
			if(this.getWeapon().get(this.getWeapon().size()-1) instanceof 방패 ){
    		int n = this.getWeapon().size();
    		this.attack(target, this.getWeapon().get(n-1));
			}
			else
				super.attack(target);
		}
    }

    public void attack(Player target, Weapon weapon){
    	if (weapon instanceof 방패) {
    		if(((방패)weapon).getshield()==0){
    			int n = this.getWeapon().size()-1;
    			this.getWeapon().remove(n);
    			super.attack(target);
    		}
    		else{
    			int 공격력 = ((방패) weapon).던지기(target)+this.getpower();
    			System.out.println(this.name+ " ---"+ weapon.name + "/ Throw) " + 공격력 +"---> " + target.name);
        		target.sethp(target.gethp()-공격력);
        		
        		
    		}
    		
    	}
    }

}

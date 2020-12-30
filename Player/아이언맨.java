package Player;
import Weapon.*;

public class 아이언맨 extends Player {

    public 아이언맨(){
    	sethp(970);
    	setpower(60);
    	this.name = "아이언맨";
    	무기setting(2);
    	show무기목록();
    }

    public void attack(Player target){
    	if(this.gethp()>=(970/2)) {
			super.attack(target);
			return;
		}
    	if(this.gethp()<(970/2)) {
    		if(this.getWeapon().size()==0) {
				때리기(target);
				return;
	    	}
    		
			if(this.getWeapon().get(this.getWeapon().size()-1) instanceof 마크7 ){
    		int n = this.getWeapon().size();
    		this.attack(target, this.getWeapon().get(n-1));
			}
			else
				super.attack(target);
		}
    }

    public void attack(Player target, Weapon weapon){
    	
    	if (weapon instanceof 마크7) {
    		if (((마크7)weapon).get미사일통size()==0){
    			int n = this.getWeapon().size()-1;
    			this.getWeapon().remove(n);
    			super.attack(target);
    		}
    		else {
    			int 공격력 = ((마크7)weapon).쏘기(target)+this.getpower();
    			System.out.println(this.name+ " ---"+ weapon.name + "/ Shoot) " + 공격력 +"---> " + target.name);
        		target.sethp(target.gethp()-공격력);
        		
        		
    		}
    		
    	}
    }

}

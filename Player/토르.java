package Player;
import Weapon.*;

public class �丣 extends Player {

    public �丣(){
    	sethp(1000);
    	setpower(60);
    	this.name = "�丣";
    	����setting(3);
    	show������();
    }

    public void attack(Player target){
    	
    	if(this.gethp()>=(1000/2)) {
			super.attack(target);
			return;
		}
    	if(this.gethp()<(1000/2)) {
    		if(this.getWeapon().size()==0) {
				������(target);
				return;
	    	}
    		
			if(this.getWeapon().get(this.getWeapon().size()-1) instanceof ���ϸ� ){
    		int n = this.getWeapon().size();
    		this.attack(target, this.getWeapon().get(n-1));
			}
			else
				super.attack(target);
		}
    }

    public void attack(Player target, Weapon weapon){
    	if (weapon instanceof ���ϸ�) {
    		if(((���ϸ�)weapon).gethammer()==0){
    			int n = this.getWeapon().size()-1;
    			this.getWeapon().remove(n);
    		}
    		else {
    			int ���ݷ� = ((���ϸ�)weapon).������(target)+this.getpower();
    			System.out.println(this.name+ " ---"+ weapon.name + "/ Throw) " + ���ݷ� +"---> " + target.name);
        		target.sethp(target.gethp()-���ݷ�);
        		
    		}
    		
    	}
    }

}

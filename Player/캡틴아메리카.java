package Player;
import Weapon.*;

public class ĸƾ�Ƹ޸�ī extends Player {

    public ĸƾ�Ƹ޸�ī(){
    	sethp(950);
    	setpower(65);
    	this.name = "ĸƾ�Ƹ޸�ī";
    	����setting(4);
    	show������();
    }

    public void attack(Player target){
    	
    	if(this.gethp()>=(950/2)) {
			super.attack(target);
			return;
		}
    	if(this.gethp()<(950/2)) {
    		if(this.getWeapon().size()==0) {
				������(target);
				return;
	    	}
    		
			if(this.getWeapon().get(this.getWeapon().size()-1) instanceof ���� ){
    		int n = this.getWeapon().size();
    		this.attack(target, this.getWeapon().get(n-1));
			}
			else
				super.attack(target);
		}
    }

    public void attack(Player target, Weapon weapon){
    	if (weapon instanceof ����) {
    		if(((����)weapon).getshield()==0){
    			int n = this.getWeapon().size()-1;
    			this.getWeapon().remove(n);
    			super.attack(target);
    		}
    		else{
    			int ���ݷ� = ((����) weapon).������(target)+this.getpower();
    			System.out.println(this.name+ " ---"+ weapon.name + "/ Throw) " + ���ݷ� +"---> " + target.name);
        		target.sethp(target.gethp()-���ݷ�);
        		
        		
    		}
    		
    	}
    }

}

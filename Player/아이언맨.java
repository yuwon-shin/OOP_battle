package Player;
import Weapon.*;

public class ���̾�� extends Player {

    public ���̾��(){
    	sethp(970);
    	setpower(60);
    	this.name = "���̾��";
    	����setting(2);
    	show������();
    }

    public void attack(Player target){
    	if(this.gethp()>=(970/2)) {
			super.attack(target);
			return;
		}
    	if(this.gethp()<(970/2)) {
    		if(this.getWeapon().size()==0) {
				������(target);
				return;
	    	}
    		
			if(this.getWeapon().get(this.getWeapon().size()-1) instanceof ��ũ7 ){
    		int n = this.getWeapon().size();
    		this.attack(target, this.getWeapon().get(n-1));
			}
			else
				super.attack(target);
		}
    }

    public void attack(Player target, Weapon weapon){
    	
    	if (weapon instanceof ��ũ7) {
    		if (((��ũ7)weapon).get�̻�����size()==0){
    			int n = this.getWeapon().size()-1;
    			this.getWeapon().remove(n);
    			super.attack(target);
    		}
    		else {
    			int ���ݷ� = ((��ũ7)weapon).���(target)+this.getpower();
    			System.out.println(this.name+ " ---"+ weapon.name + "/ Shoot) " + ���ݷ� +"---> " + target.name);
        		target.sethp(target.gethp()-���ݷ�);
        		
        		
    		}
    		
    	}
    }

}

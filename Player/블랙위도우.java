package Player;
import Weapon.*;

public class �������� extends Player {
	
    public ��������() {
    	this.name = "��������";
    	sethp(960);
    	setpower(65);
    	����setting(1);
    	show������();
    }
    public void attack(Player target){
    	
    	if(this.gethp()>=(960/2)) {
			super.attack(target);
			return;
		}
    	if(this.gethp()<(960/2)) {
    		if(this.getWeapon().size()==0) {
				������(target);
				return;
	    	}
    		
			if(this.getWeapon().get(this.getWeapon().size()-1) instanceof Ȱ ){
    		int n = this.getWeapon().size();
    		this.attack(target, this.getWeapon().get(n-1));
			}
			else
				super.attack(target);
		}
		
		
    }

    public void attack(Player target, Weapon weapon){
    	
    	if (weapon instanceof Ȱ) {
    		if (((Ȱ)weapon).getȭ����size() ==0) {
    			int n = this.getWeapon().size()-1;
    			this.getWeapon().remove(n);
    			super.attack(target);
    		}
    		else {
    			int ���ݷ� = ((Ȱ) weapon).���(target)+this.getpower();
    			System.out.println(this.name+ " ---"+ weapon.name + "/ Shoot) " + ���ݷ� +"---> " + target.name);
    			target.sethp(target.gethp()-���ݷ�);
    			
    		}
    		
    	}
    	
    	
   
    }

}

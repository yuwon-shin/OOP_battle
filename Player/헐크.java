package Player;
import Weapon.*;
public class ��ũ extends Player {

    public ��ũ(){
    	sethp(1200);
    	setpower(80);
    	this.name = "��ũ";
    	����setting(5);
    	show������();
 
    }
    
    public void ������(Player target) {
    	try {
	    	int num = (int) (Math.random()*1);
	    	
			if(this.getWeapon().get(num) instanceof �� && ((��) this.getWeapon().get(num)).get�Ѿ���size()==0) {
	    		this.getWeapon().remove(num);
	    		num = 0;
	    		
	    	}
	    	if(this.getWeapon().get(num) instanceof �ܵ� && ((�ܵ�)this.getWeapon().get(num)).getknife()==0) {
	    		this.getWeapon().remove(num); 
	    		num = 0;
	    	}
  	
	    	Weapon wp = this.getWeapon().get(num);
	    	
	    	int ���ݷ� = this.getpower();
	    	
	    	if (wp instanceof ��) {
	    		((��)wp).�Ѿ˻��();
	    		if (((��)wp).get�Ѿ���size()==0) System.out.println("������ �Ѿ��Դϴ�.");
	    		System.out.println(this.name+ " ---"+ wp.name + "/ Hit) " + ���ݷ� +"---> " + target.name);
	    		target.sethp(target.gethp()-���ݷ�);   
	    	}
	    	
	    	
			if (wp instanceof �ܵ�) {
	    		((�ܵ�)wp).setknife(((�ܵ�) wp).getknife()-1);
	    		if (((�ܵ�)wp).getknife()==0) System.out.println("������ �ܵ��Դϴ�.");
	    		System.out.println(this.name+ " ---"+ wp.name + "/ Hit) " + ���ݷ� +"---> " + target.name);
	    		target.sethp(target.gethp()-���ݷ�);   
	    	}
    	
    	}
    	
    	catch(IndexOutOfBoundsException e) {
    	}
    	if(this.getWeapon().size()==0) super.������(target); 
    }
    
    public void attack(Player target){
 		������(target);
    }

    public void attack(Player target, Weapon wp){
    }

}

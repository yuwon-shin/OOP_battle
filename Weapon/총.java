package Weapon;

import java.util.ArrayList;

import Player.Player;

public class �� extends Weapon implements MyInterface.Shooting {

    private ArrayList <�Ѿ�> �Ѿ��� = new ArrayList <�Ѿ�>();

    public ��() {
    	super("��");
    	this.setpower(5);
    	�Ѿ���ä���();
    }
    
    public int get�Ѿ���size() {
    	return this.�Ѿ���.size();
    }
    
    public void �Ѿ˻��() {
    	�Ѿ���.remove(0);
    }
    
    public void �Ѿ���ä���(){
    	�Ѿ� x = new �Ѿ�();
    	for(int i = 0; i<Math.random()*4+1; i++)
    		�Ѿ���.add(x);

    }
    
    public int ���(Player target){
    	int x_pw = this.�Ѿ���.get(0).get�Ѿ�power();
    	�Ѿ˻��();
    	
    	if(�Ѿ���.size()==0) System.out.println("������ �Ѿ��Դϴ�.");
    	int �Ѱ��� = this.getpower()+x_pw;
    	return �Ѱ���;
    }

}

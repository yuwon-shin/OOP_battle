package Weapon;

import java.util.ArrayList;

import Player.Player;

public class ö����Ʈ extends Weapon implements MyInterface.Shooting {

    private ArrayList <�̻���> �̻����� = new ArrayList <�̻���>();

    public ö����Ʈ() {
    	super("ö����Ʈ");
    	
    }
    public ö����Ʈ(String name) {
    	super(name);
    	this.setpower(15);
    	�̻�������();
    }
    
    public int get�̻�����size() {
    	return this.�̻�����.size();
    }
    
    public void �̻�������(){
    	�̻��� b = new �̻���();
    	for(int i = 0; i<5; i++) 
    		�̻�����.add(b);
    }
    public int ���(Player target){
    	int b_pw = this.�̻�����.get(0).get�̻���power();
    	�̻�����.remove(0);
    	int �̻��ϰ��� = this.getpower()+b_pw;
    	if(�̻�����.size()==0) System.out.println("������ �̻����Դϴ�.");
    	return �̻��ϰ���;
    }

    

}

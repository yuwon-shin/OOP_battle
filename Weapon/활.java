package Weapon;

import java.util.ArrayList;

import Player.Player;

public class Ȱ extends Weapon implements MyInterface.Shooting {
	
    private ArrayList <ȭ��> ȭ���� = new ArrayList <ȭ��>();

    public Ȱ(){
    	super("Ȱ");
    	this.setpower(10);
    	ȭ����ä���();
    }
    public int getȭ����size() {
    	return this.ȭ����.size();
    }
    public void ȭ����ä���(){
    	ȭ�� o = new ȭ��();
    	for(int i = 0; i<5; i++) //�������� Ư�� ���� --> 5������ ����
    		ȭ����.add(o);
    }

    public int ���(Player target){
    	int o_pw = this.ȭ����.get(0).getȭ��power();
    	ȭ����.remove(0);
    	int Ȱ���� = this.getpower()+o_pw;
    	if(ȭ����.size()==0) {
    		System.out.println("������ ȭ���Դϴ�.");
    	}
    	return Ȱ����;
    }

   

}

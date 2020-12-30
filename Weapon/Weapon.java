package Weapon;

public class Weapon {
    private int power;
    public String name;

    public Weapon(){
    }
    
    public Weapon(String name){
    	this.name = name;
    }
    
    public int getpower(){
        return power;
    }

    public void setpower(int power){
    	this.power = power;
    }
       

}

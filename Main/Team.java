package Main;
import java.util.ArrayList;

public class Team <T> {
	private T t;
	ArrayList <T> ar = new ArrayList <T>();
	
	public T getTeam() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	public void add(T t) {  //ÆÀ¿ø Ãß°¡
		ar.add(t);
	}
	public T getÆÀ¿ø(int i) {  
		return ar.get(i);
	}
	public int teamsize() {
		return ar.size();
	}
}

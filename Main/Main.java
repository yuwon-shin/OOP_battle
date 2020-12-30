package Main;
import java.util.Scanner;
import Player.*;
import View.BattleWindow;


public class Main {
	private static Team <Player> team1 = new Team <Player>();
	private static Team <Player> team2 = new Team <Player>();
	private static int team1_hp ;
	private static int team2_hp ;
	
	

	public static void ������() {  // 2:2 �� ����, ĳ���ʹ� ���� ���� (�� �ߺ� �Ұ�)
		
		Team <Player> playerlist = new Team <Player>();

		for (int i=0; i<4; i++) {
			System.out.print("ĳ���� ���� �ѹ��� �Է��Ͻÿ�>>>" );
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			switch(num) {
			case 1: playerlist.add(new ��������()); continue;
			case 2: playerlist.add(new ��ũ()); continue;
			case 3: playerlist.add(new ���̾��()); continue;
			case 4: playerlist.add(new ĸƾ�Ƹ޸�ī()); continue;
			case 5: playerlist.add(new �丣()); continue;
			default: break;
			}
		}
	
		// �� ����
		team1.add(playerlist.get����(0));
		team1.add(playerlist.get����(1));
		System.out.println("Team1: "+ team1.get����(0).name + ", "+ team1.get����(1).name);
		team2.add(playerlist.get����(2));
		team2.add(playerlist.get����(3));
		System.out.println("Team2: "+ team2.get����(0).name + ", "+ team2.get����(1).name);
			
	} 
	
	public static void �����ϱ�(Team <Player> ����, Team <Player> Ÿ��) {
		
		for (int i=0; i<����.teamsize(); i++ ) {
			int num = (int) (Math.random()*2);
			
			if(Ÿ��.get����(0).gethp()==0 && Ÿ��.get����(1).gethp()==0)
				return;
			
			if(Ÿ��.get����(num).gethp() <= 0) {
				i--;
				continue;
			}
			if (����.get����(i).gethp()<=0)
				continue;
			
			if(����.get����(i).getWeapon().size()==0)
				����.get����(i).getWeapon().clear();
			System.out.println("������ >>> " + ����.get����(i).name);
			����.get����(i).attack(Ÿ��.get����(num));
				
		}
	}
	
	
	public static void ����ȭ��() {
		System.out.println("=======================================");
    	
    	System.out.println("                  Team1                 ");
    	System.out.println("---------------------------------------");
    	System.out.printf(" %10s   |   %5s       %7s\n", "�̸�" , "HP", "POWER") ;
    	System.out.println("---------------------------------------");

    	for (int i=0 ; i<team1.teamsize() ; i++) {
    		System.out.printf(" %10s   |  %7s     %7s\n", team1.get����(i).name, team1.get����(i).gethp() , team1.get����(i).getpower() ) ;
    	}
    	
    	System.out.println("=======================================");
    	
    	System.out.println("                  Team2                 ");
    	System.out.println("---------------------------------------");
    	System.out.printf(" %10s   |   %5s       %7s\n", "�̸�" , "hp", "power") ;
    	System.out.println("---------------------------------------");
    	for (int i=0 ; i<team2.teamsize() ; i++) {
    		System.out.printf(" %10s   |  %7s     %7s\n", team2.get����(i).name, team2.get����(i).gethp() , team2.get����(i).getpower() ) ;
    	}
    	
    	System.out.println("=======================================");
    	System.out.println("");
    	System.out.println("");
		
	}
	
	public static void ��Ʋ����() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************���� ����****************");
		int round = 1;
		
		while(true) {
			System.out.println("--------ROUND " + (round++) + "--------");
			System.out.println("team1�� ������ ���۵˴ϴ�.");
			�����ϱ�(team1, team2);
			System.out.println();
			System.out.println("team2�� ������ ���۵˴ϴ�.");
			�����ϱ�(team2,team1);
			System.out.println();
			
			System.out.println(">>>>>>>>>>>>> ��Ʋ ��� <<<<<<<<<<<<");
			System.out.println("       Team1       |       Team2       ");
	    	System.out.println("---------------------------------------");
	    	System.out.printf("    %7s     %6s      | %6s     %7s\n", "�̸�" , "hp", "�̸�" , "hp") ;
	    	System.out.println("---------------------------------------");
	    	for (int j=0 ; j<team2.teamsize() ; j++) {
	    		System.out.printf("    %7s     %6d     | %6s     %6d\n",  team1.get����(j).name, team1.get����(j).gethp(), team2.get����(j).name, team2.get����(j).gethp()) ;
	    	}
	    	System.out.println();
	    	team1_hp = 0;
			team2_hp = 0;
	    	team1_hp= team1.get����(0).gethp()+team1.get����(1).gethp();
	    	team2_hp= team2.get����(0).gethp()+team2.get����(1).gethp();
	    	
	    	if (team2_hp ==0) {
	    		System.out.println(">>> Team1�� �¸��Դϴ�!!");
	    		break;
	    	}
	    	if (team1_hp ==0) {
	    		System.out.println(">>> Team2�� �¸��Դϴ�!!");
	    		break;
	    	}	
			
			scan.nextLine();
		}
		System.out.println("**************THE END****************");
	}
	
	public static void main(String [] args) {
		������();
		����ȭ��();
		��Ʋ����();
		
		
		
		
	}

}

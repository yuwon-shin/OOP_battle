package Main;
import java.util.Scanner;
import Player.*;
import View.BattleWindow;


public class Main {
	private static Team <Player> team1 = new Team <Player>();
	private static Team <Player> team2 = new Team <Player>();
	private static int team1_hp ;
	private static int team2_hp ;
	
	

	public static void 팀구성() {  // 2:2 팀 구성, 캐릭터는 선택 가능 (단 중복 불가)
		
		Team <Player> playerlist = new Team <Player>();

		for (int i=0; i<4; i++) {
			System.out.print("캐릭터 생성 넘버를 입력하시오>>>" );
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			switch(num) {
			case 1: playerlist.add(new 블랙위도우()); continue;
			case 2: playerlist.add(new 헐크()); continue;
			case 3: playerlist.add(new 아이언맨()); continue;
			case 4: playerlist.add(new 캡틴아메리카()); continue;
			case 5: playerlist.add(new 토르()); continue;
			default: break;
			}
		}
	
		// 팀 구성
		team1.add(playerlist.get팀원(0));
		team1.add(playerlist.get팀원(1));
		System.out.println("Team1: "+ team1.get팀원(0).name + ", "+ team1.get팀원(1).name);
		team2.add(playerlist.get팀원(2));
		team2.add(playerlist.get팀원(3));
		System.out.println("Team2: "+ team2.get팀원(0).name + ", "+ team2.get팀원(1).name);
			
	} 
	
	public static void 공격하기(Team <Player> 공격, Team <Player> 타겟) {
		
		for (int i=0; i<공격.teamsize(); i++ ) {
			int num = (int) (Math.random()*2);
			
			if(타겟.get팀원(0).gethp()==0 && 타겟.get팀원(1).gethp()==0)
				return;
			
			if(타겟.get팀원(num).gethp() <= 0) {
				i--;
				continue;
			}
			if (공격.get팀원(i).gethp()<=0)
				continue;
			
			if(공격.get팀원(i).getWeapon().size()==0)
				공격.get팀원(i).getWeapon().clear();
			System.out.println("공격자 >>> " + 공격.get팀원(i).name);
			공격.get팀원(i).attack(타겟.get팀원(num));
				
		}
	}
	
	
	public static void 시작화면() {
		System.out.println("=======================================");
    	
    	System.out.println("                  Team1                 ");
    	System.out.println("---------------------------------------");
    	System.out.printf(" %10s   |   %5s       %7s\n", "이름" , "HP", "POWER") ;
    	System.out.println("---------------------------------------");

    	for (int i=0 ; i<team1.teamsize() ; i++) {
    		System.out.printf(" %10s   |  %7s     %7s\n", team1.get팀원(i).name, team1.get팀원(i).gethp() , team1.get팀원(i).getpower() ) ;
    	}
    	
    	System.out.println("=======================================");
    	
    	System.out.println("                  Team2                 ");
    	System.out.println("---------------------------------------");
    	System.out.printf(" %10s   |   %5s       %7s\n", "이름" , "hp", "power") ;
    	System.out.println("---------------------------------------");
    	for (int i=0 ; i<team2.teamsize() ; i++) {
    		System.out.printf(" %10s   |  %7s     %7s\n", team2.get팀원(i).name, team2.get팀원(i).gethp() , team2.get팀원(i).getpower() ) ;
    	}
    	
    	System.out.println("=======================================");
    	System.out.println("");
    	System.out.println("");
		
	}
	
	public static void 배틀시작() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************게임 시작****************");
		int round = 1;
		
		while(true) {
			System.out.println("--------ROUND " + (round++) + "--------");
			System.out.println("team1의 공격이 시작됩니다.");
			공격하기(team1, team2);
			System.out.println();
			System.out.println("team2의 공격이 시작됩니다.");
			공격하기(team2,team1);
			System.out.println();
			
			System.out.println(">>>>>>>>>>>>> 배틀 결과 <<<<<<<<<<<<");
			System.out.println("       Team1       |       Team2       ");
	    	System.out.println("---------------------------------------");
	    	System.out.printf("    %7s     %6s      | %6s     %7s\n", "이름" , "hp", "이름" , "hp") ;
	    	System.out.println("---------------------------------------");
	    	for (int j=0 ; j<team2.teamsize() ; j++) {
	    		System.out.printf("    %7s     %6d     | %6s     %6d\n",  team1.get팀원(j).name, team1.get팀원(j).gethp(), team2.get팀원(j).name, team2.get팀원(j).gethp()) ;
	    	}
	    	System.out.println();
	    	team1_hp = 0;
			team2_hp = 0;
	    	team1_hp= team1.get팀원(0).gethp()+team1.get팀원(1).gethp();
	    	team2_hp= team2.get팀원(0).gethp()+team2.get팀원(1).gethp();
	    	
	    	if (team2_hp ==0) {
	    		System.out.println(">>> Team1의 승리입니다!!");
	    		break;
	    	}
	    	if (team1_hp ==0) {
	    		System.out.println(">>> Team2의 승리입니다!!");
	    		break;
	    	}	
			
			scan.nextLine();
		}
		System.out.println("**************THE END****************");
	}
	
	public static void main(String [] args) {
		팀구성();
		시작화면();
		배틀시작();
		
		
		
		
	}

}

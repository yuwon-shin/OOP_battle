package View;
import Player.*;
import Weapon.*;
import mary.TextToSpeech;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import Main.Team;
import java.awt.Font;
import java.awt.SystemColor;
public class BattleWindow extends JFrame implements ActionListener{

	private JPanel contentPane;
	JLabel team11 = new JLabel("image1");
	JLabel team12 = new JLabel("image2");
	JLabel team21 = new JLabel("New label");
	JLabel team22 = new JLabel("New label");
	JButton attack1 = new JButton("Attack");
	JButton attack2 = new JButton("Attack");
	JButton attack3 = new JButton("Attack");
	JButton attack4 = new JButton("Attack");
	JButton weapon1 = new JButton("Weapon");
	JButton weapon2 = new JButton("Weapon");
	JButton weapon3 = new JButton("Weapon");
	JButton weapon4 = new JButton("Weapon");
	JProgressBar progressBar1 = new JProgressBar();
	JProgressBar progressBar2 = new JProgressBar();
	JProgressBar progressBar3 = new JProgressBar();
	JProgressBar progressBar4 = new JProgressBar();
	JScrollPane scrollPane = new JScrollPane();
	JTextArea textArea = new JTextArea();
	JLabel hp1 = new JLabel("100");
	JLabel hp2 = new JLabel("100");
	JLabel hp3 = new JLabel("100");
	JLabel hp4 = new JLabel("100");
	JButton save = new JButton("Save Result");
	JLabel background = new JLabel("Background");
	static Player player1;
	static Player player2;
	private static Team <Player> team1 ;
	private static Team <Player> team2 ;
	private static int team1_hp ;
	private static int team2_hp ;
	
	TextToSpeech tts =new TextToSpeech();
	/**
	 * Launch the application.
	 */
	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {

		public void run() {
			try {
				BattleWindow gamme = new BattleWindow(team1, team2);
				gamme.setVisible(true);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		});
}

	/**
	 * Create the frame.
	 */
	public BattleWindow() {
		setTitle("Battle Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1508, 702);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setVisible(true);
		contentPane.setLayout(null);
		save.setBackground(new Color(248, 248, 255));
		save.setForeground(new Color(70, 130, 180));
		save.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 20));
		save.setBounds(661, 499, 153, 44);
		
		contentPane.add(save);
		
		team11.setVerticalAlignment(SwingConstants.BOTTOM);
		team11.setHorizontalAlignment(SwingConstants.CENTER);
		team11.setBounds(17, 28, 277, 443);
		contentPane.add(team11);
		
		team12.setHorizontalAlignment(SwingConstants.CENTER);
		team12.setVerticalAlignment(SwingConstants.BOTTOM);
		team12.setBounds(311, 28, 277, 442);
		contentPane.add(team12);
		
		team21.setBounds(881, 28, 277, 443);
		contentPane.add(team21);
		
		team22.setBounds(1175, 28, 277, 443);
		contentPane.add(team22);
		attack1.setForeground(new Color(211, 211, 211));
		attack1.setBackground(new Color(128, 128, 128));
		attack1.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
	
		attack1.setBounds(90, 530, 125, 29);
		contentPane.add(attack1);
		
		attack2.setForeground(new Color(211, 211, 211));
		attack2.setBackground(new Color(128, 128, 128));
		attack2.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
		attack2.setBounds(389, 530, 125, 29);
		contentPane.add(attack2);
		attack3.setForeground(new Color(211, 211, 211));
		attack3.setBackground(new Color(128, 128, 128));
		attack3.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
		
		attack3.setBounds(955, 530, 125, 29);
		contentPane.add(attack3);
		
		attack4.setForeground(new Color(211, 211, 211));
		attack4.setBackground(new Color(128, 128, 128));
		attack4.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
		attack4.setBounds(1259, 530, 125, 29);
		contentPane.add(attack4);
		weapon1.setForeground(new Color(112, 128, 144));
		weapon1.setBackground(new Color(211, 211, 211));
		weapon1.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
		
		weapon1.setBounds(90, 486, 125, 29);
		contentPane.add(weapon1);
		
		weapon2.setForeground(new Color(112, 128, 144));
		weapon2.setBackground(new Color(211, 211, 211));
		weapon2.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
		weapon2.setBounds(389, 486, 125, 29);
		contentPane.add(weapon2);
		
		weapon3.setForeground(new Color(112, 128, 144));
		weapon3.setBackground(new Color(211, 211, 211));
		weapon3.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
		weapon3.setBounds(955, 486, 125, 29);
		contentPane.add(weapon3);
		
		weapon4.setForeground(new Color(112, 128, 144));
		weapon4.setBackground(new Color(211, 211, 211));
		weapon4.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
		weapon4.setBounds(1259, 486, 125, 29);
		contentPane.add(weapon4);
		
		progressBar1.setMaximum(100);
		progressBar1.setValue(100);
		progressBar1.setBackground(new Color(176, 196, 222));
		progressBar1.setForeground(new Color(70, 130, 180));
		progressBar1.setBounds(17, 571, 277, 20);
		contentPane.add(progressBar1);
		progressBar2.setBackground(new Color(176, 196, 222));
		progressBar2.setForeground(new Color(70, 130, 180));
		
		progressBar2.setValue(100);
		progressBar2.setBounds(311, 571, 277, 20);
		contentPane.add(progressBar2);
		progressBar3.setForeground(new Color(250, 128, 114));
		
		progressBar3.setMaximum(100);
		progressBar3.setValue(100);
		progressBar3.setBackground(new Color(255, 228, 225));
		progressBar3.setBounds(881, 571, 277, 20);
		contentPane.add(progressBar3);
		
		progressBar4.setForeground(new Color(250, 128, 114));
		progressBar4.setBackground(new Color(255, 228, 225));
		progressBar4.setValue(100);
		progressBar4.setBounds(1175, 571, 277, 20);
		contentPane.add(progressBar4);
		
		hp1.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
		hp1.setForeground(Color.WHITE);
		
		
		hp1.setBounds(252, 548, 50, 21);
		contentPane.add(hp1);
		hp2.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
		hp2.setForeground(new Color(255, 255, 255));
		hp2.setBounds(543, 548, 57, 21);
		
		contentPane.add(hp2);
		hp3.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
		hp3.setForeground(Color.WHITE);
		hp3.setBounds(1110, 548, 57, 21);
		
		contentPane.add(hp3);
		hp4.setForeground(new Color(255, 255, 255));
		hp4.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 18));
		hp4.setBounds(1401, 548, 68, 21);
		
		contentPane.add(hp4);
		
		
		scrollPane.setBounds(612, 28, 244, 443);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
		background.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\battlebeagyeong.jpg"));
		background.setBounds(-377, 0, 1863, 646);
		contentPane.add(background);
		
		
	}
	public BattleWindow(Team<Player> team1, Team<Player> team2) {
		this();
		this.team1 = team1;
		this.team2 = team2;
		this.team11.setIcon(changeIcon(team1.getÆÀ¿ø(0)));
		this.team12.setIcon(changeIcon(team1.getÆÀ¿ø(1)));
		this.team21.setIcon(changeIcon(team2.getÆÀ¿ø(0)));
		this.team22.setIcon(changeIcon(team2.getÆÀ¿ø(1)));
		½ÃÀÛÈ­¸é();
		
		this.progressBar1.setMaximum(team1.getÆÀ¿ø(0).gethp());
		this.progressBar1.setValue(team1.getÆÀ¿ø(0).gethp());
		this.progressBar2.setMaximum(team1.getÆÀ¿ø(1).gethp());
		this.progressBar2.setValue(team1.getÆÀ¿ø(1).gethp());
		this.progressBar3.setMaximum(team2.getÆÀ¿ø(0).gethp());
		this.progressBar3.setValue(team2.getÆÀ¿ø(0).gethp());
		this.progressBar4.setMaximum(team2.getÆÀ¿ø(1).gethp());
		this.progressBar4.setValue(team2.getÆÀ¿ø(1).gethp());
		this.hp1.setText(Integer.toString(team1.getÆÀ¿ø(0).gethp()));
		this.hp2.setText(Integer.toString(team1.getÆÀ¿ø(1).gethp()));
		this.hp3.setText(Integer.toString(team2.getÆÀ¿ø(0).gethp()));
		this.hp4.setText(Integer.toString(team2.getÆÀ¿ø(1).gethp()));
		
		this.textArea.append("*********GAME START*********\n");
		this.attack1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (team1.getÆÀ¿ø(0).gethp()<=0) {
					attack1.setEnabled(false);
					return;
				}
				Player Å¸°Ù = °ø°ÝÇÏ±â(team1.getÆÀ¿ø(0), team2);
				textArea.append("°ø°ÝÀÚ >>> "+ team1.getÆÀ¿ø(0).name+"\n");
				JProgressBar progressBar = null;
				JLabel hp = null;
				if(Å¸°Ù == team2.getÆÀ¿ø(0)) { 
					progressBar = progressBar3;
					hp = hp3;					
				}
				if(Å¸°Ù == team2.getÆÀ¿ø(1)) { 
					progressBar = progressBar4;
					hp = hp4;
				}
				int value = Å¸°Ù.gethp();
				progressBar.setValue(value);
				
				if (Å¸°Ù.gethp()<=0) 
					hp.setText(Integer.toString(0));
				else
					hp.setText(Integer.toString(value));
				
				hpÈ®ÀÎ();
			}
		});
		
		this.attack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (team1.getÆÀ¿ø(1).gethp()<=0) {
					attack2.setEnabled(false);
					return;
				}
					
				Player Å¸°Ù = °ø°ÝÇÏ±â(team1.getÆÀ¿ø(1), team2);
				textArea.append("°ø°ÝÀÚ >>> "+ team1.getÆÀ¿ø(1).name+"\n");
				JProgressBar progressBar = null;
				JLabel hp = null;
				if(Å¸°Ù == team2.getÆÀ¿ø(0)) { 
					progressBar = progressBar3;
					hp = hp3;					
				}
				if(Å¸°Ù == team2.getÆÀ¿ø(1)) { 
					progressBar = progressBar4;
					hp = hp4;
				}
				int value = Å¸°Ù.gethp();
				progressBar.setValue(value);
				
				if (Å¸°Ù.gethp()<=0) 
					hp.setText(Integer.toString(0));
				else
					hp.setText(Integer.toString(value));
				hpÈ®ÀÎ();
			}
		});
		
		this.attack3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				if (team2.getÆÀ¿ø(0).gethp()<=0) {
					attack3.setEnabled(false);
					return;
				}
				Player Å¸°Ù = °ø°ÝÇÏ±â(team2.getÆÀ¿ø(0), team1);
				textArea.append("°ø°ÝÀÚ >>> "+ team2.getÆÀ¿ø(0).name+"\n");
				JProgressBar progressBar = null;
				JLabel hp = null;
				if(Å¸°Ù == team1.getÆÀ¿ø(0)) { 
					progressBar = progressBar1;
					hp = hp1;					
				}
				if(Å¸°Ù == team1.getÆÀ¿ø(1)) { 
					progressBar = progressBar2;
					hp = hp2;
				}
				int value = Å¸°Ù.gethp();
				progressBar.setValue(value);
				
				if (Å¸°Ù.gethp()<=0) 
					hp.setText(Integer.toString(0));
				else
					hp.setText(Integer.toString(value));
				hpÈ®ÀÎ();
			}
		});
		
		this.attack4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				if (team2.getÆÀ¿ø(1).gethp()<=0) {
					attack4.setEnabled(false);
					return;
				}
				textArea.append("°ø°ÝÀÚ >>> "+ team2.getÆÀ¿ø(1).name+"\n");
				Player Å¸°Ù = °ø°ÝÇÏ±â(team2.getÆÀ¿ø(1), team1);
				
				JProgressBar progressBar = null;
				JLabel hp = null;
				if(Å¸°Ù == team1.getÆÀ¿ø(0)) { 
					progressBar = progressBar1;
					hp = hp1;					
				}
				if(Å¸°Ù == team1.getÆÀ¿ø(1)) { 
					progressBar = progressBar2;
					hp = hp2;
				}
				int value = Å¸°Ù.gethp();
				progressBar.setValue(value);
				
				if (Å¸°Ù.gethp()<=0) 
					hp.setText(Integer.toString(0));
				else
					hp.setText(Integer.toString(value));
				hpÈ®ÀÎ();
			}
		});
		
		this.weapon1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg2) {
				new WeaponBox(team1.getÆÀ¿ø(0)).setVisible(true);
			}
		});
		this.weapon2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg3) {
				new WeaponBox(team1.getÆÀ¿ø(1)).setVisible(true);
			}
		});
		this.weapon3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg2) {
				new WeaponBox(team2.getÆÀ¿ø(0)).setVisible(true);
			}
		});
		this.weapon4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg4) {
				new WeaponBox(team2.getÆÀ¿ø(1)).setVisible(true);
			}
		});
		scrollPane.setViewportView(textArea);
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				saveToFile();
				
			}

			private void saveToFile() {
				// TODO Auto-generated method stub
				PrintWriter pw = null;
				
				try {
					pw = new PrintWriter("C:\\Temp\\game_log.txt");
					pw.println(textArea.getText());
					
					pw.flush();
					pw.close();
					new EndWindow().setVisible(true);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
	}
	


	public void ½ÃÀÛÈ­¸é() {
		this.textArea.append("                 Team1               \n");
		this.textArea.append("    Player    |    HP    |    Power   \n");
    	this.textArea.append("-------------------------------------- \n");
    	this.textArea.append("  "+team1.getÆÀ¿ø(0).name+"   "+team1.getÆÀ¿ø(0).gethp()+"   "+team1.getÆÀ¿ø(0).getpower()+"   \n");
    	this.textArea.append("  "+team1.getÆÀ¿ø(1).name+"   "+team1.getÆÀ¿ø(1).gethp()+"   "+team1.getÆÀ¿ø(1).getpower()+"   \n");
    	this.textArea.append("                 Team2               \n");
    	this.textArea.append("    Player    |    HP    |    Power   \n");
    	this.textArea.append("-------------------------------------- \n");
    	this.textArea.append("  "+team2.getÆÀ¿ø(0).name+"   "+team2.getÆÀ¿ø(0).gethp()+"   "+team2.getÆÀ¿ø(0).getpower()+"   \n");
    	this.textArea.append("  "+team2.getÆÀ¿ø(1).name+"   "+team2.getÆÀ¿ø(1).gethp()+"   "+team2.getÆÀ¿ø(1).getpower()+"   \n");
    	this.textArea.append("\n");
	}
	
	public ImageIcon changeIcon(Player player) {
		javax.swing.ImageIcon icon = null;
		if(player instanceof ºí·¢À§µµ¿ì) {
			icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uBE14\uB799\uC704\uB3C4\uC6B0.png");
		}	
		if(player instanceof ÇæÅ©) {
			icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uD5D0\uD06C.jpg");
		}	
		if(player instanceof ¾ÆÀÌ¾ð¸Ç) {
			icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uC544\uC774\uC5B8\uB9E8.jpg");
		}	
		if(player instanceof Ä¸Æ¾¾Æ¸Þ¸®Ä«) {
			icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uCEA1\uD2F4\uC544\uBA54\uB9AC\uCE74.jpg");
		}	
		if(player instanceof Åä¸£) {
			icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uD1A0\uB974.jpg");
		}	
		
		return icon;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static Player °ø°ÝÇÏ±â(Player °ø°Ý, Team <Player> Å¸°Ù) {
		
		int num = (int) (Math.random()*2);		
		
		if(Å¸°Ù.getÆÀ¿ø(1).gethp() <= 0) num=0; 
		if(Å¸°Ù.getÆÀ¿ø(0).gethp() <= 0) num=1; 
			
		Player °ø°Ý´ë»ó = Å¸°Ù.getÆÀ¿ø(num);
		if(°ø°Ý.getWeapon().size()==0)
			°ø°Ý.getWeapon().clear();
		System.out.println("°ø°ÝÀÚ >>> " + °ø°Ý.name);
		°ø°Ý.attack(°ø°Ý´ë»ó);
				
		return °ø°Ý´ë»ó;
	}
	public void hpÈ®ÀÎ() {
		this.textArea.append(">>>>>>>>>>>>> ¹èÆ² °á°ú <<<<<<<<<<<<\n");
		this.textArea.append("       Team1       |       Team2       \n");
		this.textArea.append("---------------------------------------\n");
		this.textArea.append("    ÀÌ¸§         hp      |     ÀÌ¸§           hp     \n") ;
		this.textArea.append("---------------------------------------\n");
    	
    	this.textArea.append("    "+team1.getÆÀ¿ø(0).name+"    "+  team1.getÆÀ¿ø(0).gethp()+"   |    " +team2.getÆÀ¿ø(0).name+"   "+team2.getÆÀ¿ø(0).gethp()+"   \n") ;
    	this.textArea.append("    "+team1.getÆÀ¿ø(1).name+"    "+  team1.getÆÀ¿ø(1).gethp()+"   |    " +team2.getÆÀ¿ø(1).name+"   "+team2.getÆÀ¿ø(1).gethp()+"   \n") ;
    	this.textArea.append("\n");
    	
		team1_hp = 0;
		team2_hp = 0;
    	team1_hp= team1.getÆÀ¿ø(0).gethp()+team1.getÆÀ¿ø(1).gethp();
    	team2_hp= team2.getÆÀ¿ø(0).gethp()+team2.getÆÀ¿ø(1).gethp();
    	
    	if (team2_hp ==0) {
    		
    		this.textArea.append(">>> Team1ÀÇ ½Â¸®ÀÔ´Ï´Ù!!\n");
    		tts.speak("Congratulations! Team1 wins!", 1.0f,false,true);
    		System.out.println("---------------------------------");
    		System.out.println();
    		System.out.println( "           TEAM1 WINS            ");
    		System.out.println();
    		System.out.println("---------------------------------");
    		this.attack1.setEnabled(false);
    		this.attack2.setEnabled(false);
    		
    	}
    	else if (team1_hp ==0) {
    		
    		this.textArea.append(">>> Team2ÀÇ ½Â¸®ÀÔ´Ï´Ù!!\n");
    		tts.speak("Congratulations! Team2 wins!", 1.0f,false,true);
    		System.out.println("---------------------------------");
    		System.out.println();
    		System.out.println( "           TEAM2 WINS            ");
    		System.out.println();
    		System.out.println("---------------------------------");
    		this.attack3.setEnabled(false);
    		this.attack4.setEnabled(false);

    	}
    	else
    		return;
	}

}
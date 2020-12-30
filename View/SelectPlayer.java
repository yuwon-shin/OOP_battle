package View;
import Main.Team;
import Player.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class SelectPlayer extends JFrame {

	private JPanel contentPane;
	JPanel 블랙위도우panel = new JPanel();
	JCheckBox 블랙위도우click = new JCheckBox("\uBE14\uB799 \uC704\uB3C4\uC6B0");
	JLabel 블랙위도우img = new JLabel("New label");
	JPanel 아이언맨panel = new JPanel();
	JCheckBox 아이언맨click = new JCheckBox("\uC544\uC774\uC5B8\uB9E8");
	JLabel 아이언맨img = new JLabel("");
	JPanel 캡틴아메리카panel = new JPanel();
	JCheckBox 캡틴아메리카click = new JCheckBox("\uCEA1\uD2F4\uC544\uBA54\uB9AC\uCE74");
	JLabel 캡틴아메리카img = new JLabel("New label");
	JPanel 헐크panel = new JPanel();
	JCheckBox 헐크click = new JCheckBox("\uD5D0\uD06C");
	JLabel 헐크img = new JLabel("");
	JPanel 토르panel = new JPanel();
	JCheckBox 토르click = new JCheckBox("\uD1A0\uB974");
	JLabel 토르img = new JLabel("New label");
	JLabel banner = new JLabel("");
	JButton nextButton = new JButton("NEXT");
	private static Team <Player> playerlist = new Team <Player>();
	static Team <Player> team1 = new Team<Player>();
	static Team <Player> team2 = new Team<Player>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectPlayer frame = new SelectPlayer();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SelectPlayer() {
		setTitle("Select Players");
		setBounds(100, 100, 1100, 624);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		nextButton.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 19));
		nextButton.setForeground(new Color(240, 248, 255));
		nextButton.setBackground(new Color(70, 130, 180));
		nextButton.setBounds(973, 75, 88, 35);
		contentPane.add(nextButton);
		
		블랙위도우panel.setBackground(Color.WHITE);
		블랙위도우panel.setBounds(0, 125, 215, 443);
		contentPane.add(블랙위도우panel);
		블랙위도우panel.setLayout(null);
		
		블랙위도우click.setHorizontalAlignment(SwingConstants.CENTER);
		블랙위도우click.setForeground(new Color(176, 196, 222));
		블랙위도우click.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 18));
		
		블랙위도우click.setBounds(42, 403, 129, 29);
		블랙위도우click.setBackground(new Color(25, 25, 112));
		블랙위도우panel.add(블랙위도우click);
		
		
		블랙위도우img.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uBE14\uB799\uC704\uB3C4\uC6B0.png"));
		블랙위도우img.setBounds(-44, 0, 271, 443);
		블랙위도우panel.add(블랙위도우img);
		
		
		아이언맨panel.setBackground(Color.WHITE);
		아이언맨panel.setBounds(429, 125, 215, 443);
		contentPane.add(아이언맨panel);
		아이언맨panel.setLayout(null);
		
		아이언맨click.setForeground(new Color(176, 196, 222));
		아이언맨click.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 18));
		
		
		아이언맨click.setBounds(62, 403, 105, 29);
		아이언맨click.setBackground(new Color(25, 25, 112));
		아이언맨panel.add(아이언맨click);
		아이언맨img.setHorizontalAlignment(SwingConstants.LEFT);
		아이언맨img.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uC544\uC774\uC5B8\uB9E8.jpg"));
		
		
		아이언맨img.setBounds(-50, 0, 313, 443);
		아이언맨panel.add(아이언맨img);
		
		
		캡틴아메리카panel.setBackground(Color.WHITE);
		캡틴아메리카panel.setBounds(644, 125, 215, 443);
		contentPane.add(캡틴아메리카panel);
		캡틴아메리카panel.setLayout(null);
		
		캡틴아메리카click.setForeground(new Color(176, 196, 222));
		캡틴아메리카click.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 18));
		
		
		캡틴아메리카click.setBounds(41, 403, 141, 29);
		캡틴아메리카click.setBackground(new Color(25, 25, 112));
		캡틴아메리카panel.add(캡틴아메리카click);
		캡틴아메리카img.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uCEA1\uD2F4\uC544\uBA54\uB9AC\uCE74.jpg"));
		
		
		캡틴아메리카img.setBounds(-49, 0, 275, 443);
		캡틴아메리카panel.add(캡틴아메리카img);
		
		
		헐크panel.setBounds(209, 125, 222, 443);
		contentPane.add(헐크panel);
		헐크panel.setBackground(Color.WHITE);
		헐크panel.setLayout(null);
		
		헐크click.setForeground(new Color(176, 196, 222));
		헐크click.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 18));
		
		
		헐크click.setBounds(76, 403, 69, 29);
		헐크click.setBackground(new Color(25, 25, 112));
		헐크panel.add(헐크click);
		
		
		헐크img.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uD5D0\uD06C.jpg"));
		헐크img.setBounds(-41, 0, 269, 443);
		헐크panel.add(헐크img);
		
		
		토르panel.setBounds(854, 125, 222, 443);
		contentPane.add(토르panel);
		토르panel.setBackground(Color.WHITE);
		토르panel.setLayout(null);
		
		토르click.setForeground(new Color(176, 196, 222));
		토르click.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 18));
		
		
		토르click.setBounds(88, 403, 69, 29);
		토르click.setBackground(new Color(25, 25, 112));
		토르panel.add(토르click);
		
		토르img.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uD1A0\uB974.jpg"));
		토르img.setBounds(-50, 0, 272, 443);
		토르panel.add(토르img);
		
		
		banner.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\banner.png"));
		banner.setBounds(-49, -20, 1125, 146);
		contentPane.add(banner);
		
		
		블랙위도우click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(블랙위도우click.isSelected()) {
					playerlist.add(new 블랙위도우());
					
				}
				블랙위도우click.setEnabled(false);
			}
		});
		
		헐크click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(헐크click.isSelected()) {
					playerlist.add(new 헐크());
				}
				헐크click.setEnabled(false);
			}
		});
		
		토르click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(토르click.isSelected()) {
					playerlist.add(new 토르());
				}
				토르click.setEnabled(false);	
			}
			
		});
		
		캡틴아메리카click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(캡틴아메리카click.isSelected()) {
					playerlist.add(new 캡틴아메리카());
				}
				캡틴아메리카click.setEnabled(false);
			}
		});
		
		아이언맨click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(아이언맨click.isSelected()) {
					playerlist.add(new 아이언맨());
				}
				아이언맨click.setEnabled(false);
			}
		});	
		
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(블랙위도우click.isSelected() && 헐크click.isSelected() && 아이언맨click.isSelected() && 캡틴아메리카click.isSelected() && 토르click.isSelected()) {
					System.out.println("-------------WARNING-------------");
					System.out.println("    총 네명의 플레이어만 참여할 수 있습니다.");
					System.out.println("마지막으로 선택한 플레이어는 게임에서 제외합니다.");
					System.out.println("---------------------------------");
				}
				team1.add(playerlist.get팀원(0)); 
				team1.add(playerlist.get팀원(1));
				System.out.println("Team1: "+team1.get팀원(0).name + ", "+team1.get팀원(1).name);
				team2.add(playerlist.get팀원(2));
				team2.add(playerlist.get팀원(3));
				System.out.println("Team2: "+ team2.get팀원(0).name + ", "+ team2.get팀원(1).name);
				dispose();
				new BattleWindow(team1, team2).setVisible(true);
				
			}
		});
	}
	

}
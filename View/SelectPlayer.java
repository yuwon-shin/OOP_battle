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
	JPanel ��������panel = new JPanel();
	JCheckBox ��������click = new JCheckBox("\uBE14\uB799 \uC704\uB3C4\uC6B0");
	JLabel ��������img = new JLabel("New label");
	JPanel ���̾��panel = new JPanel();
	JCheckBox ���̾��click = new JCheckBox("\uC544\uC774\uC5B8\uB9E8");
	JLabel ���̾��img = new JLabel("");
	JPanel ĸƾ�Ƹ޸�īpanel = new JPanel();
	JCheckBox ĸƾ�Ƹ޸�īclick = new JCheckBox("\uCEA1\uD2F4\uC544\uBA54\uB9AC\uCE74");
	JLabel ĸƾ�Ƹ޸�īimg = new JLabel("New label");
	JPanel ��ũpanel = new JPanel();
	JCheckBox ��ũclick = new JCheckBox("\uD5D0\uD06C");
	JLabel ��ũimg = new JLabel("");
	JPanel �丣panel = new JPanel();
	JCheckBox �丣click = new JCheckBox("\uD1A0\uB974");
	JLabel �丣img = new JLabel("New label");
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
		
		
		
		nextButton.setFont(new Font("���������� Bold", Font.PLAIN, 19));
		nextButton.setForeground(new Color(240, 248, 255));
		nextButton.setBackground(new Color(70, 130, 180));
		nextButton.setBounds(973, 75, 88, 35);
		contentPane.add(nextButton);
		
		��������panel.setBackground(Color.WHITE);
		��������panel.setBounds(0, 125, 215, 443);
		contentPane.add(��������panel);
		��������panel.setLayout(null);
		
		��������click.setHorizontalAlignment(SwingConstants.CENTER);
		��������click.setForeground(new Color(176, 196, 222));
		��������click.setFont(new Font("���������� Bold", Font.PLAIN, 18));
		
		��������click.setBounds(42, 403, 129, 29);
		��������click.setBackground(new Color(25, 25, 112));
		��������panel.add(��������click);
		
		
		��������img.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uBE14\uB799\uC704\uB3C4\uC6B0.png"));
		��������img.setBounds(-44, 0, 271, 443);
		��������panel.add(��������img);
		
		
		���̾��panel.setBackground(Color.WHITE);
		���̾��panel.setBounds(429, 125, 215, 443);
		contentPane.add(���̾��panel);
		���̾��panel.setLayout(null);
		
		���̾��click.setForeground(new Color(176, 196, 222));
		���̾��click.setFont(new Font("���������� Bold", Font.PLAIN, 18));
		
		
		���̾��click.setBounds(62, 403, 105, 29);
		���̾��click.setBackground(new Color(25, 25, 112));
		���̾��panel.add(���̾��click);
		���̾��img.setHorizontalAlignment(SwingConstants.LEFT);
		���̾��img.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uC544\uC774\uC5B8\uB9E8.jpg"));
		
		
		���̾��img.setBounds(-50, 0, 313, 443);
		���̾��panel.add(���̾��img);
		
		
		ĸƾ�Ƹ޸�īpanel.setBackground(Color.WHITE);
		ĸƾ�Ƹ޸�īpanel.setBounds(644, 125, 215, 443);
		contentPane.add(ĸƾ�Ƹ޸�īpanel);
		ĸƾ�Ƹ޸�īpanel.setLayout(null);
		
		ĸƾ�Ƹ޸�īclick.setForeground(new Color(176, 196, 222));
		ĸƾ�Ƹ޸�īclick.setFont(new Font("���������� Bold", Font.PLAIN, 18));
		
		
		ĸƾ�Ƹ޸�īclick.setBounds(41, 403, 141, 29);
		ĸƾ�Ƹ޸�īclick.setBackground(new Color(25, 25, 112));
		ĸƾ�Ƹ޸�īpanel.add(ĸƾ�Ƹ޸�īclick);
		ĸƾ�Ƹ޸�īimg.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uCEA1\uD2F4\uC544\uBA54\uB9AC\uCE74.jpg"));
		
		
		ĸƾ�Ƹ޸�īimg.setBounds(-49, 0, 275, 443);
		ĸƾ�Ƹ޸�īpanel.add(ĸƾ�Ƹ޸�īimg);
		
		
		��ũpanel.setBounds(209, 125, 222, 443);
		contentPane.add(��ũpanel);
		��ũpanel.setBackground(Color.WHITE);
		��ũpanel.setLayout(null);
		
		��ũclick.setForeground(new Color(176, 196, 222));
		��ũclick.setFont(new Font("���������� Bold", Font.PLAIN, 18));
		
		
		��ũclick.setBounds(76, 403, 69, 29);
		��ũclick.setBackground(new Color(25, 25, 112));
		��ũpanel.add(��ũclick);
		
		
		��ũimg.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uD5D0\uD06C.jpg"));
		��ũimg.setBounds(-41, 0, 269, 443);
		��ũpanel.add(��ũimg);
		
		
		�丣panel.setBounds(854, 125, 222, 443);
		contentPane.add(�丣panel);
		�丣panel.setBackground(Color.WHITE);
		�丣panel.setLayout(null);
		
		�丣click.setForeground(new Color(176, 196, 222));
		�丣click.setFont(new Font("���������� Bold", Font.PLAIN, 18));
		
		
		�丣click.setBounds(88, 403, 69, 29);
		�丣click.setBackground(new Color(25, 25, 112));
		�丣panel.add(�丣click);
		
		�丣img.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uD1A0\uB974.jpg"));
		�丣img.setBounds(-50, 0, 272, 443);
		�丣panel.add(�丣img);
		
		
		banner.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\banner.png"));
		banner.setBounds(-49, -20, 1125, 146);
		contentPane.add(banner);
		
		
		��������click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(��������click.isSelected()) {
					playerlist.add(new ��������());
					
				}
				��������click.setEnabled(false);
			}
		});
		
		��ũclick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(��ũclick.isSelected()) {
					playerlist.add(new ��ũ());
				}
				��ũclick.setEnabled(false);
			}
		});
		
		�丣click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(�丣click.isSelected()) {
					playerlist.add(new �丣());
				}
				�丣click.setEnabled(false);	
			}
			
		});
		
		ĸƾ�Ƹ޸�īclick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ĸƾ�Ƹ޸�īclick.isSelected()) {
					playerlist.add(new ĸƾ�Ƹ޸�ī());
				}
				ĸƾ�Ƹ޸�īclick.setEnabled(false);
			}
		});
		
		���̾��click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(���̾��click.isSelected()) {
					playerlist.add(new ���̾��());
				}
				���̾��click.setEnabled(false);
			}
		});	
		
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(��������click.isSelected() && ��ũclick.isSelected() && ���̾��click.isSelected() && ĸƾ�Ƹ޸�īclick.isSelected() && �丣click.isSelected()) {
					System.out.println("-------------WARNING-------------");
					System.out.println("    �� �׸��� �÷��̾ ������ �� �ֽ��ϴ�.");
					System.out.println("���������� ������ �÷��̾�� ���ӿ��� �����մϴ�.");
					System.out.println("---------------------------------");
				}
				team1.add(playerlist.get����(0)); 
				team1.add(playerlist.get����(1));
				System.out.println("Team1: "+team1.get����(0).name + ", "+team1.get����(1).name);
				team2.add(playerlist.get����(2));
				team2.add(playerlist.get����(3));
				System.out.println("Team2: "+ team2.get����(0).name + ", "+ team2.get����(1).name);
				dispose();
				new BattleWindow(team1, team2).setVisible(true);
				
			}
		});
	}
	

}
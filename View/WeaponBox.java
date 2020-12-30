package View;
import Player.*;
import Weapon.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class WeaponBox extends JFrame {
	
	private JPanel contentPane;
	JPanel panel1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JPanel panel3 = new JPanel();
	JLabel 총 = new JLabel("");
	JLabel 단도 = new JLabel("");
	JLabel specialwp = new JLabel("");
	JLabel backimage = new JLabel("");
	JLabel titleLabel = new JLabel("");
	static Player player;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeaponBox frame = new WeaponBox(player);
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
	public WeaponBox() {
		
		setBounds(100, 100, 1013, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		titleLabel.setForeground(new Color(240, 255, 240));
		titleLabel.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 28));
		titleLabel.setBounds(38, 359, 547, 68);
		
		contentPane.add(titleLabel);
		panel3.setBackground(new Color(85, 107, 47));
		panel3.setBounds(664, 29, 296, 208);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		
		specialwp.setHorizontalAlignment(SwingConstants.CENTER);
		specialwp.setBounds(0, 0, 296, 208);
		panel3.add(specialwp);
		panel_2.setBackground(new Color(85, 107, 47));
		panel_2.setBounds(351, 29, 296, 208);
		
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		단도.setDisabledIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uB2E8\uB3C4.png"));
		단도.setHorizontalAlignment(SwingConstants.CENTER);
		단도.setBounds(0, 0, 296, 208);
		panel_2.add(단도);
		
		panel1.setBackground(new Color(85, 107, 47));
		panel1.setBounds(38, 29, 296, 208);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		총.setDisabledIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uCD1D.png"));
		총.setHorizontalAlignment(SwingConstants.CENTER);
		총.setBounds(0, 0, 296, 208);
		panel1.add(총);
		
		backimage.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\weaponbackground.png"));
		backimage.setBounds(0, -17, 1039, 561);
		contentPane.add(backimage);
		
	}
	public WeaponBox(Player 플레이어) {
		this();
		setTitle(플레이어.name+ "'s Weapons");
		titleLabel.setText(플레이어.name + "'s Weapon Box");
		
		for(int i=0; i<플레이어.getWeapon().size();i++) {
			if(플레이어.getWeapon().get(i) instanceof 총) {
				총.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uCD1D.png"));
			}
		}
		
		for(int i=0; i<플레이어.getWeapon().size();i++) {
			if(플레이어.getWeapon().get(i) instanceof 단도) {
				단도.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uB2E8\uB3C4.png"));
			}
		}
		specialwp.setIcon(mainWP(플레이어));

	}
	
	public ImageIcon mainWP(Player player) {
		ImageIcon icon = null;
		try {
			Weapon wp = player.getWeapon().get(player.getWeapon().size()-1);
			
			if(player instanceof 블랙위도우) {
				if(wp instanceof 활){
					icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uD65C.png");
				}
			}	
			if(player instanceof 헐크) {
				icon = null;
			}	
			if(player instanceof 아이언맨) {
				if(wp instanceof 마크7) {
					icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uB9C8\uD06C7.png");
				}
			}	
			if(player instanceof 캡틴아메리카) {
				if(wp instanceof 방패) {
					icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uBC29\uD328.png");
				}
			}	
			if(player instanceof 토르) {
				if(wp instanceof 묠니르) {
					icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uBB20\uB2C8\uB974.png");
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			icon = null;			
		}
		return icon;
	}
}

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
	JLabel �� = new JLabel("");
	JLabel �ܵ� = new JLabel("");
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
		titleLabel.setFont(new Font("���������� Bold", Font.PLAIN, 28));
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
		
		�ܵ�.setDisabledIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uB2E8\uB3C4.png"));
		�ܵ�.setHorizontalAlignment(SwingConstants.CENTER);
		�ܵ�.setBounds(0, 0, 296, 208);
		panel_2.add(�ܵ�);
		
		panel1.setBackground(new Color(85, 107, 47));
		panel1.setBounds(38, 29, 296, 208);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		��.setDisabledIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uCD1D.png"));
		��.setHorizontalAlignment(SwingConstants.CENTER);
		��.setBounds(0, 0, 296, 208);
		panel1.add(��);
		
		backimage.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\weaponbackground.png"));
		backimage.setBounds(0, -17, 1039, 561);
		contentPane.add(backimage);
		
	}
	public WeaponBox(Player �÷��̾�) {
		this();
		setTitle(�÷��̾�.name+ "'s Weapons");
		titleLabel.setText(�÷��̾�.name + "'s Weapon Box");
		
		for(int i=0; i<�÷��̾�.getWeapon().size();i++) {
			if(�÷��̾�.getWeapon().get(i) instanceof ��) {
				��.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uCD1D.png"));
			}
		}
		
		for(int i=0; i<�÷��̾�.getWeapon().size();i++) {
			if(�÷��̾�.getWeapon().get(i) instanceof �ܵ�) {
				�ܵ�.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uB2E8\uB3C4.png"));
			}
		}
		specialwp.setIcon(mainWP(�÷��̾�));

	}
	
	public ImageIcon mainWP(Player player) {
		ImageIcon icon = null;
		try {
			Weapon wp = player.getWeapon().get(player.getWeapon().size()-1);
			
			if(player instanceof ��������) {
				if(wp instanceof Ȱ){
					icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uD65C.png");
				}
			}	
			if(player instanceof ��ũ) {
				icon = null;
			}	
			if(player instanceof ���̾��) {
				if(wp instanceof ��ũ7) {
					icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uB9C8\uD06C7.png");
				}
			}	
			if(player instanceof ĸƾ�Ƹ޸�ī) {
				if(wp instanceof ����) {
					icon = new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\\uBC29\uD328.png");
				}
			}	
			if(player instanceof �丣) {
				if(wp instanceof ���ϸ�) {
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

package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EndWindow extends JFrame {

	private JPanel contentPane;
	JLabel background = new JLabel("");
	JLabel label1 = new JLabel("Are you sure to");
	JLabel label2 = new JLabel("CLOSE the GAME?");
	JButton back = new JButton("BACK");
	JButton close = new JButton("CLOSE");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndWindow frame = new EndWindow();
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
	public EndWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1292, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		close.setForeground(new Color(65, 105, 225));
		close.setBackground(new Color(224, 255, 255));
		close.setFont(new Font("³ª´®½ºÄù¾î ExtraBold", Font.BOLD, 22));
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		close.setBounds(1074, 410, 145, 59);
		contentPane.add(close);
		
		
		back.setForeground(new Color(0, 0, 128));
		back.setFont(new Font("³ª´®½ºÄù¾î ExtraBold", Font.BOLD, 22));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				dispose();
			}
		});
		back.setBackground(new Color(135, 206, 250));
		back.setBounds(912, 410, 145, 59);
		contentPane.add(back);
		
		
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("³ª´®½ºÄù¾î ExtraBold", Font.BOLD, 36));
		label1.setForeground(new Color(240, 255, 255));
		label1.setBounds(835, 263, 446, 96);
		contentPane.add(label1);
		
		
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setForeground(new Color(240, 255, 255));
		label2.setFont(new Font("³ª´®½ºÄù¾î ExtraBold", Font.BOLD, 38));
		label2.setBounds(831, 317, 467, 96);
		contentPane.add(label2);
		
		
		background.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\startimage.png"));
		background.setBounds(-52, 0, 1322, 676);
		contentPane.add(background);
	}
}

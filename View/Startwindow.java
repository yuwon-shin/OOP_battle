package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Startwindow extends JFrame {

	private JPanel contentPane;
	JButton StartButton = new JButton("GAME START");
	JLabel startimage = new JLabel("");
	private final JLabel lblNewLabel = new JLabel("It's time to play Yuvenders");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Startwindow frame = new Startwindow();
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
	public Startwindow() {
		setTitle("Start the Game");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1292, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new SelectPlayer().setVisible(true);
			}
		});
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(906, 283, 336, 64);
		
		contentPane.add(lblNewLabel);
		
		
		StartButton.setBackground(SystemColor.activeCaption);
		StartButton.setForeground(Color.DARK_GRAY);
		StartButton.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.PLAIN, 22));
		StartButton.setBounds(1005, 340, 216, 54);
		contentPane.add(StartButton);
		
		
		startimage.setIcon(new ImageIcon("C:\\Users\\\uC2E0\uC720\uC6D0\\Desktop\\startimage.png"));
		startimage.setBounds(0, 0, 1270, 688);
		contentPane.add(startimage);
	}
}

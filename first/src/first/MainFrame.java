package first;
import java.awt.BorderLayout;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		getContentPane().setLayout(null);
		
		JLabel titleLabel = new JLabel("New label");
		titleLabel.setBounds(137, 27, 418, 175);
		getContentPane().add(titleLabel);
		setTitle("Wordle Solver ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleImage = new JLabel();

	    ImageIcon icon = new ImageIcon(this.getClass().getResource("/title.jpg"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(1000, 500, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        titleImage.setIcon(scaledIcon);
		//ImageIcon title = new ImageIcon(new ImageIcon("title.png").getImage().getScaledInstance(titleImage.getWidth(), titleImage.getHeight(), Image.SCALE_DEFAULT));
		titleImage.setBounds(98, 11, 1029, 227);
		contentPane.add(titleImage);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTwo nw = new FrameTwo();
				nw.newScreen();
				try {
					Main.setUp();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setVisible(false);
			}
		});
		btnNewButton.setBounds(485, 285, 232, 117);
		contentPane.add(btnNewButton);
		
		
	}
}

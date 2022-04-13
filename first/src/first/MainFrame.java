package first;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Image;
import java.io.IOException;
import java.awt.Color;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	private JPanel contentPane;
	private JLabel titleLabel;
	private JLabel titleImage;
	private ImageIcon icon;
	private Image img;
	private Image imgScale;
	private ImageIcon scaledIcon;
	private JButton startButton;
	
	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setLocationRelativeTo(null);
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
		titleLabel = new JLabel("New label");
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
		
		titleImage = new JLabel();
	    icon = new ImageIcon(this.getClass().getResource("/title.jpg"));
        img = icon.getImage();
        imgScale = img.getScaledInstance(1000, 500, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(imgScale);
        titleImage.setIcon(scaledIcon);
		titleImage.setBounds(130, 11, 1029, 227);
		contentPane.add(titleImage);
		
		startButton = new JButton("Start");
		startButton.setBackground(UIManager.getColor("Slider.shadow"));
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTwo nw = new FrameTwo();
				nw.newScreen();
				try {
					Main.setUp();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		startButton.setBounds(485, 285, 232, 117);
		contentPane.add(startButton);
		
		
	}
}

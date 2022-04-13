package first;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class FrameTwo{

	private static JFrame frameTwo = new JFrame();
	private JPanel Jframe;
	private JTextField wordBox;
	private JTextField wordCount;
	private JTextArea listBox;
	private JButton buttonr1c1;
	private JButton buttonr1c2;
	private JButton buttonr1c3;
	private JButton buttonr1c4;
	private JButton buttonr1c5;
	private JButton buttonr2c1;
	private JButton buttonr2c2;
	private JButton buttonr2c3;
	private JButton buttonr2c4;
	private JButton buttonr2c5;
	private JButton buttonr3c1;
	private JButton buttonr3c2;
	private JButton buttonr3c3;
	private JButton buttonr3c4;
	private JButton buttonr3c5;
	private JButton buttonr4c1;
	private JButton buttonr4c2;
	private JButton buttonr4c3;
	private JButton buttonr4c4;
	private JButton buttonr4c5;
	private JButton buttonr5c1;
	private JButton buttonr5c2;
	private JButton buttonr5c3;
	private JButton buttonr5c4;
	private JButton buttonr5c5;
	private JButton buttonr6c1;
	private JButton buttonr6c2;
	private JButton buttonr6c3;
	private JButton buttonr6c4;
	private JButton buttonr6c5;
	private JButton resetButton;
	private JButton enterButton;
	

	private int enterCounter = 1;
	private int counterR1C1;
	private int counterR1C2;
	private int counterR1C3;
	private int counterR1C4;
	private int counterR1C5;
	private int counterR2C1;
	private int counterR2C2;
	private int counterR2C3;
	private int counterR2C4;
	private int counterR2C5;
	private int counterR3C1;
	private int counterR3C2;
	private int counterR3C3;
	private int counterR3C4;
	private int counterR3C5;
	private int counterR4C1;
	private int counterR4C2;
	private int counterR4C3;
	private int counterR4C4;
	private int counterR4C5;
	private int counterR5C1;
	private int counterR5C2;
	private int counterR5C3;
	private int counterR5C4;
	private int counterR5C5;
	private int counterR6C1;
	private int counterR6C2;
	private int counterR6C3;
	private int counterR6C4;
	private int counterR6C5;
	
	
	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameTwo.setLocationRelativeTo(null);
					frameTwo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameTwo() {
		frameTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTwo.setBounds(100, 100, 1280, 720);
		Jframe = new JPanel();
		Jframe.setBorder(new EmptyBorder(5, 5, 5, 5));
		frameTwo.setContentPane(Jframe);
		Jframe.setLayout(null);
		
		wordBox = new JTextField();
		wordBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		wordBox.setHorizontalAlignment(SwingConstants.CENTER);
		wordBox.setText("Try " + Main.getWord().toUpperCase());
		wordBox.setBounds(782, 46, 192, 79);
		Jframe.add(wordBox);
		wordBox.setColumns(10);
		wordBox.setEditable(false); 
		
		listBox = new JTextArea();
		listBox.setText("Possible words: ");
		listBox.setWrapStyleWord(true);
		listBox.setLineWrap(true);
		listBox.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		listBox.setBounds(782, 229, 432, 412);
		Jframe.add(listBox);
		listBox.setEditable(false); 
		
		wordCount = new JTextField();
		wordCount.setText("Words Left:");
		wordCount.setHorizontalAlignment(SwingConstants.CENTER);
		wordCount.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		wordCount.setColumns(10);
		wordCount.setBounds(1021, 46, 192, 79);
		Jframe.add(wordCount);
		wordCount.setEditable(false);
		
		enterButton = new JButton("Enter");
		enterButton.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Increase enter counter
				enterCounter++;
				//Checks if all squares in a row are green
				if(Main.getOne() == 3 && Main.getTwo() == 3 && Main.getThree() == 3 && Main.getFour() == 3 && Main.getFive() == 3) {
					enterCounter = 7;
				}
				//Updates displays and texboxes
				wordBox.setText("Try " + Main.setWord().toUpperCase());
				wordCount.setText("Possible words left: \n" + Main.getLength());
				listBox.setText("Possible words: " + String.join(", ", Main.getWordleList()));
				//Resets algorithm values
				Main.setOne(1);
				Main.setTwo(1);
				Main.setThree(1);
				Main.setFour(1);
				Main.setFive(1);
				//Updates a row of guess boxes depending on the enterCounter number
				if(enterCounter == 2) {
					buttonr2c1.setText(Main.getWord().substring(0,1).toUpperCase());
					buttonr2c2.setText(Main.getWord().substring(1,2).toUpperCase());
					buttonr2c3.setText(Main.getWord().substring(2,3).toUpperCase());
					buttonr2c4.setText(Main.getWord().substring(3,4).toUpperCase());
					buttonr2c5.setText(Main.getWord().substring(4,5).toUpperCase());
				}
				else if(enterCounter == 3) {
					buttonr3c1.setText(Main.getWord().substring(0,1).toUpperCase());
					buttonr3c2.setText(Main.getWord().substring(1,2).toUpperCase());
					buttonr3c3.setText(Main.getWord().substring(2,3).toUpperCase());
					buttonr3c4.setText(Main.getWord().substring(3,4).toUpperCase());
					buttonr3c5.setText(Main.getWord().substring(4,5).toUpperCase());
				}
				else if(enterCounter == 4) {
					buttonr4c1.setText(Main.getWord().substring(0,1).toUpperCase());
					buttonr4c2.setText(Main.getWord().substring(1,2).toUpperCase());
					buttonr4c3.setText(Main.getWord().substring(2,3).toUpperCase());
					buttonr4c4.setText(Main.getWord().substring(3,4).toUpperCase());
					buttonr4c5.setText(Main.getWord().substring(4,5).toUpperCase());
				}
				else if(enterCounter == 5) {
					buttonr5c1.setText(Main.getWord().substring(0,1).toUpperCase());
					buttonr5c2.setText(Main.getWord().substring(1,2).toUpperCase());
					buttonr5c3.setText(Main.getWord().substring(2,3).toUpperCase());
					buttonr5c4.setText(Main.getWord().substring(3,4).toUpperCase());
					buttonr5c5.setText(Main.getWord().substring(4,5).toUpperCase());
				}
				else if(enterCounter == 6) {
					buttonr6c1.setText(Main.getWord().substring(0,1).toUpperCase());
					buttonr6c2.setText(Main.getWord().substring(1,2).toUpperCase());
					buttonr6c3.setText(Main.getWord().substring(2,3).toUpperCase());
					buttonr6c4.setText(Main.getWord().substring(3,4).toUpperCase());
					buttonr6c5.setText(Main.getWord().substring(4,5).toUpperCase());
				}
			}
		});
		enterButton.setBounds(782, 152, 192, 66);
		Jframe.add(enterButton);
		
		buttonr1c1 = new JButton("");
		buttonr1c1.setForeground(Color.WHITE);
		buttonr1c1.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr1c1.setBackground(Color.GRAY);
		buttonr1c1.setBounds(73, 69, 115, 79);
		buttonr1c1.setText(Main.getWord().substring(0,1).toUpperCase());
		Jframe.add(buttonr1c1);
		buttonr1c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Counter cycles between 0 - 2 
				if(enterCounter == 1) {
					if(counterR1C1 == 2) {
						counterR1C1 = 0;
					}
					else if(counterR1C1 < 2) {
						counterR1C1++;
					}
					//Depending on the counter this button is set to either gray, yellow, or green
					if(counterR1C1 == 0) {
						buttonr1c1.setBackground(Color.GRAY);
					}
					else if(counterR1C1 == 1) {
						buttonr1c1.setBackground(Color.YELLOW);
					}
					else if(counterR1C1 == 2) {
						buttonr1c1.setBackground(Color.GREEN);
					}
					//Once button color is set, algorithm values will also be set
					if(buttonr1c1.getBackground() == Color.GREEN) {
						Main.setOne(3);
					}
					if(buttonr1c1.getBackground() == Color.YELLOW) {
						Main.setOne(2);
					}
					if(buttonr1c1.getBackground() == Color.GRAY) {
						Main.setOne(1);
					}
				}
			}
		});
		
		
		buttonr1c2 = new JButton("");
		buttonr1c2.setForeground(Color.WHITE);
		buttonr1c2.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr1c2.setBackground(Color.GRAY);
		buttonr1c2.setBounds(198, 69, 115, 79);
		buttonr1c2.setText(Main.getWord().substring(1,2).toUpperCase());
		Jframe.add(buttonr1c2);
		buttonr1c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 1) {
					if(counterR1C2 == 2) {
						counterR1C2 = 0;
					}
					else if(counterR1C2 < 2) {
						counterR1C2++;
					}
					
					if(counterR1C2 == 0) {
						buttonr1c2.setBackground(Color.GRAY);
					}
					else if(counterR1C2 == 1) {
						buttonr1c2.setBackground(Color.YELLOW);
					}
					else if(counterR1C2 == 2) {
						buttonr1c2.setBackground(Color.GREEN);
					}
					
					if(buttonr1c2.getBackground() == Color.GREEN) {
						Main.setTwo(3);
					}
					if(buttonr1c2.getBackground() == Color.YELLOW) {
						Main.setTwo(2);
					}
					if(buttonr1c2.getBackground() == Color.GRAY) {
						Main.setTwo(1);
					}
				}
			}
		});
	
		buttonr1c3 = new JButton("");
		buttonr1c3.setForeground(Color.WHITE);
		buttonr1c3.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr1c3.setBackground(Color.GRAY);
		buttonr1c3.setBounds(323, 69, 115, 79);
		buttonr1c3.setText(Main.getWord().substring(2,3).toUpperCase());
		Jframe.add(buttonr1c3);
		buttonr1c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 1) {
					if(counterR1C3 == 2) {
						counterR1C3 = 0;
					}
					else if(counterR1C3 < 2) {
						counterR1C3++;
					}
					
					if(counterR1C3 == 0) {
						buttonr1c3.setBackground(Color.GRAY);
					}
					else if(counterR1C3 == 1) {
						buttonr1c3.setBackground(Color.YELLOW);
					}
					else if(counterR1C3 == 2) {
						buttonr1c3.setBackground(Color.GREEN);
					}
					
					if(buttonr1c3.getBackground() == Color.GREEN) {
						Main.setThree(3);
					}
					if(buttonr1c3.getBackground() == Color.YELLOW) {
						Main.setThree(2);
					}
					if(buttonr1c3.getBackground() == Color.GRAY) {
						Main.setThree(1);
					}
				}
			}
		});

		
		buttonr1c4 = new JButton("");
		buttonr1c4.setForeground(Color.WHITE);
		buttonr1c4.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr1c4.setBackground(Color.GRAY);
		buttonr1c4.setBounds(448, 69, 115, 79);
		buttonr1c4.setText(Main.getWord().substring(3,4).toUpperCase());
		Jframe.add(buttonr1c4);
		buttonr1c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 1) {
					if(counterR1C4 == 2) {
						counterR1C4 = 0;
					}
					else if(counterR1C4 < 2) {
						counterR1C4++;
					}
					
					if(counterR1C4 == 0) {
						buttonr1c4.setBackground(Color.GRAY);
					}
					else if(counterR1C4 == 1) {
						buttonr1c4.setBackground(Color.YELLOW);
					}
					else if(counterR1C4 == 2) {
						buttonr1c4.setBackground(Color.GREEN);
					}
					
					if(buttonr1c4.getBackground() == Color.GREEN) {
						Main.setFour(3);
					}
					if(buttonr1c4.getBackground() == Color.YELLOW) {
						Main.setFour(2);
					}
					if(buttonr1c4.getBackground() == Color.GRAY) {
						Main.setFour(1);
					}
				}
			}
		});
		
		buttonr1c5 = new JButton("");
		buttonr1c5.setForeground(Color.WHITE);
		buttonr1c5.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr1c5.setBackground(Color.GRAY);
		buttonr1c5.setBounds(573, 69, 115, 79);
		buttonr1c5.setText(Main.getWord().substring(4,5).toUpperCase());
		Jframe.add(buttonr1c5);
		buttonr1c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 1) {
					if(counterR1C5 == 2) {
						counterR1C5 = 0;
					}
					else if(counterR1C5 < 2) {
						counterR1C5++;
					}
					
					if(counterR1C5 == 0) {
						buttonr1c5.setBackground(Color.GRAY);
					}
					else if(counterR1C5 == 1) {
						buttonr1c5.setBackground(Color.YELLOW);
					}
					else if(counterR1C5 == 2) {
						buttonr1c5.setBackground(Color.GREEN);
					}
					
					if(buttonr1c5.getBackground() == Color.GREEN) {
						Main.setFive(3);
					}
					if(buttonr1c5.getBackground() == Color.YELLOW) {
						Main.setFive(2);
					}
					if(buttonr1c5.getBackground() == Color.GRAY) {
						Main.setFive(1);
					}
				}
			}
		});
		
		buttonr2c1 = new JButton("");
		buttonr2c1.setForeground(Color.WHITE);
		buttonr2c1.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr2c1.setBackground(Color.GRAY);
		buttonr2c1.setBounds(73, 159, 115, 79);
		Jframe.add(buttonr2c1);
		buttonr2c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 2) {
					if(counterR2C1 == 2) {
						counterR2C1 = 0;
					}
					else if(counterR2C1 < 2) {
						counterR2C1++;
					}
					
					if(counterR2C1 == 0) {
						buttonr2c1.setBackground(Color.GRAY);
					}
					else if(counterR2C1 == 1) {
						buttonr2c1.setBackground(Color.YELLOW);
					}
					else if(counterR2C1 == 2) {
						buttonr2c1.setBackground(Color.GREEN);
					}
					
					if(buttonr2c1.getBackground() == Color.GREEN) {
						Main.setOne(3);
					}
					if(buttonr2c1.getBackground() == Color.YELLOW) {
						Main.setOne(2);
					}
					if(buttonr2c1.getBackground() == Color.GRAY) {
						Main.setOne(1);
					}
				}
			}
		});
		
		buttonr2c2 = new JButton("");
		buttonr2c2.setForeground(Color.WHITE);
		buttonr2c2.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr2c2.setBackground(Color.GRAY);
		buttonr2c2.setBounds(198, 159, 115, 79);
		Jframe.add(buttonr2c2);
		buttonr2c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 2) {
					if(counterR2C2 == 2) {
						counterR2C2 = 0;
					}
					else if(counterR2C2 < 2) {
						counterR2C2++;
					}
					
					if(counterR2C2 == 0) {
						buttonr2c2.setBackground(Color.GRAY);
					}
					else if(counterR2C2 == 1) {
						buttonr2c2.setBackground(Color.YELLOW);
					}
					else if(counterR2C2 == 2) {
						buttonr2c2.setBackground(Color.GREEN);
					}
					
					if(buttonr2c2.getBackground() == Color.GREEN) {
						Main.setTwo(3);
					}
					if(buttonr2c2.getBackground() == Color.YELLOW) {
						Main.setTwo(2);
					}
					if(buttonr2c2.getBackground() == Color.GRAY) {
						Main.setTwo(1);
					}
				}
			}
		});
		
		buttonr2c3 = new JButton("");
		buttonr2c3.setForeground(Color.WHITE);
		buttonr2c3.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr2c3.setBackground(Color.GRAY);
		buttonr2c3.setBounds(323, 159, 115, 79);
		Jframe.add(buttonr2c3);
		buttonr2c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 2) {
					if(counterR2C3 == 2) {
						counterR2C3 = 0;
					}
					else if(counterR2C3 < 2) {
						counterR2C3++;
					}
					
					if(counterR2C3 == 0) {
						buttonr2c3.setBackground(Color.GRAY);
					}
					else if(counterR2C3 == 1) {
						buttonr2c3.setBackground(Color.YELLOW);
					}
					else if(counterR2C3 == 2) {
						buttonr2c3.setBackground(Color.GREEN);
					}
					
					if(buttonr2c3.getBackground() == Color.GREEN) {
						Main.setThree(3);
					}
					if(buttonr2c3.getBackground() == Color.YELLOW) {
						Main.setThree(2);
					}
					if(buttonr2c3.getBackground() == Color.GRAY) {
						Main.setThree(1);
					}
				}
			}
		});
		
		buttonr2c4 = new JButton("");
		buttonr2c4.setForeground(Color.WHITE);
		buttonr2c4.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr2c4.setBackground(Color.GRAY);
		buttonr2c4.setBounds(448, 159, 115, 79);
		Jframe.add(buttonr2c4);
		buttonr2c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 2) {
					if(counterR2C4 == 2) {
						counterR2C4 = 0;
					}
					else if(counterR2C4 < 2) {
						counterR2C4++;
					}
					
					if(counterR2C4 == 0) {
						buttonr2c4.setBackground(Color.GRAY);
					}
					else if(counterR2C4 == 1) {
						buttonr2c4.setBackground(Color.YELLOW);
					}
					else if(counterR2C4 == 2) {
						buttonr2c4.setBackground(Color.GREEN);
					}
					
					if(buttonr2c4.getBackground() == Color.GREEN) {
						Main.setFour(3);
					}
					if(buttonr2c4.getBackground() == Color.YELLOW) {
						Main.setFour(2);
					}
					if(buttonr2c4.getBackground() == Color.GRAY) {
						Main.setFour(1);
					}
				}
			}
		});
		
		buttonr2c5 = new JButton("");
		buttonr2c5.setForeground(Color.WHITE);
		buttonr2c5.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr2c5.setBackground(Color.GRAY);
		buttonr2c5.setBounds(573, 159, 115, 79);
		Jframe.add(buttonr2c5);
		buttonr2c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 2) {
					if(counterR2C5 == 2) {
						counterR2C5 = 0;
					}
					else if(counterR2C5 < 2) {
						counterR2C5++;
					}
					
					if(counterR2C5 == 0) {
						buttonr2c5.setBackground(Color.GRAY);
					}
					else if(counterR2C5 == 1) {
						buttonr2c5.setBackground(Color.YELLOW);
					}
					else if(counterR2C5 == 2) {
						buttonr2c5.setBackground(Color.GREEN);
					}
					
					if(buttonr2c5.getBackground() == Color.GREEN) {
						Main.setFive(3);
					}
					if(buttonr2c5.getBackground() == Color.YELLOW) {
						Main.setFive(2);
					}
					if(buttonr2c5.getBackground() == Color.GRAY) {
						Main.setFive(1);
					}
				}
			}
		});
		
		buttonr3c1 = new JButton("");
		buttonr3c1.setForeground(Color.WHITE);
		buttonr3c1.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr3c1.setBackground(Color.GRAY);
		buttonr3c1.setBounds(73, 249, 115, 79);
		Jframe.add(buttonr3c1);
		buttonr3c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 3) {
					if(counterR3C1 == 2) {
						counterR3C1 = 0;
					}
					else if(counterR3C1 < 2) {
						counterR3C1++;
					}
					
					if(counterR3C1 == 0) {
						buttonr3c1.setBackground(Color.GRAY);
					}
					else if(counterR3C1 == 1) {
						buttonr3c1.setBackground(Color.YELLOW);
					}
					else if(counterR3C1 == 2) {
						buttonr3c1.setBackground(Color.GREEN);
					}
					
					if(buttonr3c1.getBackground() == Color.GREEN) {
						Main.setOne(3);
					}
					if(buttonr3c1.getBackground() == Color.YELLOW) {
						Main.setOne(2);
					}
					if(buttonr3c1.getBackground() == Color.GRAY) {
						Main.setOne(1);
					}
				}
			}
		});
		
		buttonr3c2 = new JButton("");
		buttonr3c2.setForeground(Color.WHITE);
		buttonr3c2.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr3c2.setBackground(Color.GRAY);
		buttonr3c2.setBounds(198, 249, 115, 79);
		Jframe.add(buttonr3c2);
		buttonr3c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 3) {
					if(counterR3C2 == 2) {
						counterR3C2 = 0;
					}
					else if(counterR3C2 < 2) {
						counterR3C2++;
					}
					
					if(counterR3C2 == 0) {
						buttonr3c2.setBackground(Color.GRAY);
					}
					else if(counterR3C2 == 1) {
						buttonr3c2.setBackground(Color.YELLOW);
					}
					else if(counterR3C2 == 2) {
						buttonr3c2.setBackground(Color.GREEN);
					}
					
					if(buttonr3c2.getBackground() == Color.GREEN) {
						Main.setTwo(3);
					}
					if(buttonr3c2.getBackground() == Color.YELLOW) {
						Main.setTwo(2);
					}
					if(buttonr3c2.getBackground() == Color.GRAY) {
						Main.setTwo(1);
					}
				}
			}
		});
		
		buttonr3c3 = new JButton("");
		buttonr3c3.setForeground(Color.WHITE);
		buttonr3c3.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr3c3.setBackground(Color.GRAY);
		buttonr3c3.setBounds(323, 249, 115, 79);
		Jframe.add(buttonr3c3);
		buttonr3c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 3) {
					if(counterR3C3 == 2) {
						counterR3C3 = 0;
					}
					else if(counterR3C3 < 2) {
						counterR3C3++;
					}
					
					if(counterR3C3 == 0) {
						buttonr3c3.setBackground(Color.GRAY);
					}
					else if(counterR3C3 == 1) {
						buttonr3c3.setBackground(Color.YELLOW);
					}
					else if(counterR3C3 == 2) {
						buttonr3c3.setBackground(Color.GREEN);
					}
					
					if(buttonr3c3.getBackground() == Color.GREEN) {
						Main.setThree(3);
					}
					if(buttonr3c3.getBackground() == Color.YELLOW) {
						Main.setThree(2);
					}
					if(buttonr3c3.getBackground() == Color.GRAY) {
						Main.setThree(1);
					}
				}
			}
		});
		
		buttonr3c4 = new JButton("");
		buttonr3c4.setForeground(Color.WHITE);
		buttonr3c4.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr3c4.setBackground(Color.GRAY);
		buttonr3c4.setBounds(448, 249, 115, 79);
		Jframe.add(buttonr3c4);
		buttonr3c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 3) {
					if(counterR3C4 == 2) {
						counterR3C4 = 0;
					}
					else if(counterR3C4 < 2) {
						counterR3C4++;
					}
					
					if(counterR3C4 == 0) {
						buttonr3c4.setBackground(Color.GRAY);
					}
					else if(counterR3C4 == 1) {
						buttonr3c4.setBackground(Color.YELLOW);
					}
					else if(counterR3C4 == 2) {
						buttonr3c4.setBackground(Color.GREEN);
					}
					
					if(buttonr3c4.getBackground() == Color.GREEN) {
						Main.setFour(3);
					}
					if(buttonr3c4.getBackground() == Color.YELLOW) {
						Main.setFour(2);
					}
					if(buttonr3c4.getBackground() == Color.GRAY) {
						Main.setFour(1);
					}
				}
			}
		});
		
		buttonr3c5 = new JButton("");
		buttonr3c5.setForeground(Color.WHITE);
		buttonr3c5.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr3c5.setBackground(Color.GRAY);
		buttonr3c5.setBounds(573, 249, 115, 79);
		Jframe.add(buttonr3c5);
		buttonr3c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 3) {
					if(counterR3C5 == 2) {
						counterR3C5 = 0;
					}
					else if(counterR3C5 < 2) {
						counterR3C5++;
					}
					
					if(counterR3C5 == 0) {
						buttonr3c5.setBackground(Color.GRAY);
					}
					else if(counterR3C5 == 1) {
						buttonr3c5.setBackground(Color.YELLOW);
					}
					else if(counterR3C5 == 2) {
						buttonr3c5.setBackground(Color.GREEN);
					}
					
					if(buttonr3c5.getBackground() == Color.GREEN) {
						Main.setFive(3);
					}
					if(buttonr3c5.getBackground() == Color.YELLOW) {
						Main.setFive(2);
					}
					if(buttonr3c5.getBackground() == Color.GRAY) {
						Main.setFive(1);
					}
				}
			}
		});
		
		buttonr4c1 = new JButton("");
		buttonr4c1.setForeground(Color.WHITE);
		buttonr4c1.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr4c1.setBackground(Color.GRAY);
		buttonr4c1.setBounds(73, 339, 115, 79);
		Jframe.add(buttonr4c1);
		buttonr4c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 4) {
					if(counterR4C1 == 2) {
						counterR4C1 = 0;
					}
					else if(counterR4C1 < 2) {
						counterR4C1++;
					}
					
					if(counterR4C1 == 0) {
						buttonr4c1.setBackground(Color.GRAY);
					}
					else if(counterR4C1 == 1) {
						buttonr4c1.setBackground(Color.YELLOW);
					}
					else if(counterR4C1 == 2) {
						buttonr4c1.setBackground(Color.GREEN);
					}
					
					if(buttonr4c1.getBackground() == Color.GREEN) {
						Main.setOne(3);
					}
					if(buttonr4c1.getBackground() == Color.YELLOW) {
						Main.setOne(2);
					}
					if(buttonr4c1.getBackground() == Color.GRAY) {
						Main.setOne(1);
					}
				}
			}
		});
		
		buttonr4c2 = new JButton("");
		buttonr4c2.setForeground(Color.WHITE);
		buttonr4c2.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr4c2.setBackground(Color.GRAY);
		buttonr4c2.setBounds(198, 339, 115, 79);
		Jframe.add(buttonr4c2);
		buttonr4c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 4) {
					if(counterR4C2 == 2) {
						counterR4C2 = 0;
					}
					else if(counterR4C2 < 2) {
						counterR4C2++;
					}
					
					if(counterR4C2 == 0) {
						buttonr4c2.setBackground(Color.GRAY);
					}
					else if(counterR4C2 == 1) {
						buttonr4c2.setBackground(Color.YELLOW);
					}
					else if(counterR4C2 == 2) {
						buttonr4c2.setBackground(Color.GREEN);
					}
					
					if(buttonr4c2.getBackground() == Color.GREEN) {
						Main.setTwo(3);
					}
					if(buttonr4c2.getBackground() == Color.YELLOW) {
						Main.setTwo(2);
					}
					if(buttonr4c2.getBackground() == Color.GRAY) {
						Main.setTwo(1);
					}
				}
			}
		});
		
		buttonr4c3 = new JButton("");
		buttonr4c3.setForeground(Color.WHITE);
		buttonr4c3.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr4c3.setBackground(Color.GRAY);
		buttonr4c3.setBounds(323, 339, 115, 79);
		Jframe.add(buttonr4c3);
		buttonr4c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 4) {
					if(counterR4C3 == 2) {
						counterR4C3 = 0;
					}
					else if(counterR4C3 < 2) {
						counterR4C3++;
					}
					
					if(counterR4C3 == 0) {
						buttonr4c3.setBackground(Color.GRAY);
					}
					else if(counterR4C3 == 1) {
						buttonr4c3.setBackground(Color.YELLOW);
					}
					else if(counterR4C3 == 2) {
						buttonr4c3.setBackground(Color.GREEN);
					}
					
					if(buttonr4c3.getBackground() == Color.GREEN) {
						Main.setThree(3);
					}
					if(buttonr4c3.getBackground() == Color.YELLOW) {
						Main.setThree(2);
					}
					if(buttonr4c3.getBackground() == Color.GRAY) {
						Main.setThree(1);
					}
				}
			}
		});
		
		buttonr4c4 = new JButton("");
		buttonr4c4.setForeground(Color.WHITE);
		buttonr4c4.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr4c4.setBackground(Color.GRAY);
		buttonr4c4.setBounds(448, 339, 115, 79);
		Jframe.add(buttonr4c4);
		buttonr4c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 4) {
					if(counterR4C4 == 2) {
						counterR4C4 = 0;
					}
					else if(counterR4C4 < 2) {
						counterR4C4++;
					}
					
					if(counterR4C4 == 0) {
						buttonr4c4.setBackground(Color.GRAY);
					}
					else if(counterR4C4 == 1) {
						buttonr4c4.setBackground(Color.YELLOW);
					}
					else if(counterR4C4 == 2) {
						buttonr4c4.setBackground(Color.GREEN);
					}
					
					if(buttonr4c4.getBackground() == Color.GREEN) {
						Main.setFour(3);
					}
					if(buttonr4c4.getBackground() == Color.YELLOW) {
						Main.setFour(2);
					}
					if(buttonr4c4.getBackground() == Color.GRAY) {
						Main.setFour(1);
					}
				}
			}
		});
		
		buttonr4c5 = new JButton("");
		buttonr4c5.setForeground(Color.WHITE);
		buttonr4c5.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr4c5.setBackground(Color.GRAY);
		buttonr4c5.setBounds(573, 339, 115, 79);
		Jframe.add(buttonr4c5);
		buttonr4c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 4) {
					if(counterR4C5 == 2) {
						counterR4C5 = 0;
					}
					else if(counterR4C5 < 2) {
						counterR4C5++;
					}
					
					if(counterR4C5 == 0) {
						buttonr4c5.setBackground(Color.GRAY);
					}
					else if(counterR4C5 == 1) {
						buttonr4c5.setBackground(Color.YELLOW);
					}
					else if(counterR4C5 == 2) {
						buttonr4c5.setBackground(Color.GREEN);
					}
					
					if(buttonr4c5.getBackground() == Color.GREEN) {
						Main.setFive(3);
					}
					if(buttonr4c5.getBackground() == Color.YELLOW) {
						Main.setFive(2);
					}
					if(buttonr4c5.getBackground() == Color.GRAY) {
						Main.setFive(1);
					}
				}
			}
		});
		
		buttonr5c1 = new JButton("");
		buttonr5c1.setForeground(Color.WHITE);
		buttonr5c1.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr5c1.setBackground(Color.GRAY);
		buttonr5c1.setBounds(73, 429, 115, 79);
		Jframe.add(buttonr5c1);
		buttonr5c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 5) {
					if(counterR5C1 == 2) {
						counterR5C1 = 0;
					}
					else if(counterR5C1 < 2) {
						counterR5C1++;
					}
					
					if(counterR5C1 == 0) {
						buttonr5c1.setBackground(Color.GRAY);
					}
					else if(counterR5C1 == 1) {
						buttonr5c1.setBackground(Color.YELLOW);
					}
					else if(counterR5C1 == 2) {
						buttonr5c1.setBackground(Color.GREEN);
					}
					
					if(buttonr5c1.getBackground() == Color.GREEN) {
						Main.setOne(3);
					}
					if(buttonr5c1.getBackground() == Color.YELLOW) {
						Main.setOne(2);
					}
					if(buttonr5c1.getBackground() == Color.GRAY) {
						Main.setOne(1);
					}
				}
			}
		});
		
		buttonr5c2 = new JButton("");
		buttonr5c2.setForeground(Color.WHITE);
		buttonr5c2.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr5c2.setBackground(Color.GRAY);
		buttonr5c2.setBounds(198, 429, 115, 79);
		Jframe.add(buttonr5c2);
		buttonr5c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 5) {
					if(counterR5C2 == 2) {
						counterR5C2 = 0;
					}
					else if(counterR5C2 < 2) {
						counterR5C2++;
					}
					
					if(counterR5C2 == 0) {
						buttonr5c2.setBackground(Color.GRAY);
					}
					else if(counterR5C2 == 1) {
						buttonr5c2.setBackground(Color.YELLOW);
					}
					else if(counterR5C2 == 2) {
						buttonr5c2.setBackground(Color.GREEN);
					}
					
					if(buttonr5c2.getBackground() == Color.GREEN) {
						Main.setTwo(3);
					}
					if(buttonr5c2.getBackground() == Color.YELLOW) {
						Main.setTwo(2);
					}
					if(buttonr5c2.getBackground() == Color.GRAY) {
						Main.setTwo(1);
					}
				}
			}
		});
		
		buttonr5c3 = new JButton("");
		buttonr5c3.setForeground(Color.WHITE);
		buttonr5c3.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr5c3.setBackground(Color.GRAY);
		buttonr5c3.setBounds(323, 429, 115, 79);
		Jframe.add(buttonr5c3);
		buttonr5c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 5) {
					if(counterR5C3 == 2) {
						counterR5C3 = 0;
					}
					else if(counterR5C3 < 2) {
						counterR5C3++;
					}
					
					if(counterR5C3 == 0) {
						buttonr5c3.setBackground(Color.GRAY);
					}
					else if(counterR5C3 == 1) {
						buttonr5c3.setBackground(Color.YELLOW);
					}
					else if(counterR5C3 == 2) {
						buttonr5c3.setBackground(Color.GREEN);
					}
					
					if(buttonr5c3.getBackground() == Color.GREEN) {
						Main.setThree(3);
					}
					if(buttonr5c3.getBackground() == Color.YELLOW) {
						Main.setThree(2);
					}
					if(buttonr5c3.getBackground() == Color.GRAY) {
						Main.setThree(1);
					}
				}
			}
		});
		
		buttonr5c4 = new JButton("");
		buttonr5c4.setForeground(Color.WHITE);
		buttonr5c4.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr5c4.setBackground(Color.GRAY);
		buttonr5c4.setBounds(448, 429, 115, 79);
		Jframe.add(buttonr5c4);
		buttonr5c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 5) {
					if(counterR5C4 == 2) {
						counterR5C4 = 0;
					}
					else if(counterR5C4 < 2) {
						counterR5C4++;
					}
					
					if(counterR5C4 == 0) {
						buttonr5c4.setBackground(Color.GRAY);
					}
					else if(counterR5C4 == 1) {
						buttonr5c4.setBackground(Color.YELLOW);
					}
					else if(counterR5C4 == 2) {
						buttonr5c4.setBackground(Color.GREEN);
					}
					
					if(buttonr5c4.getBackground() == Color.GREEN) {
						Main.setFour(3);
					}
					if(buttonr5c4.getBackground() == Color.YELLOW) {
						Main.setFour(2);
					}
					if(buttonr5c4.getBackground() == Color.GRAY) {
						Main.setFour(1);
					}
				}
			}
		});
		
		buttonr5c5 = new JButton("");
		buttonr5c5.setForeground(Color.WHITE);
		buttonr5c5.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr5c5.setBackground(Color.GRAY);
		buttonr5c5.setBounds(573, 429, 115, 79);
		Jframe.add(buttonr5c5);
		buttonr5c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 5) {
					if(counterR5C5 == 2) {
						counterR5C5 = 0;
					}
					else if(counterR5C5 < 2) {
						counterR5C5++;
					}
					
					if(counterR5C5 == 0) {
						buttonr5c5.setBackground(Color.GRAY);
					}
					else if(counterR5C5 == 1) {
						buttonr5c5.setBackground(Color.YELLOW);
					}
					else if(counterR5C5 == 2) {
						buttonr5c5.setBackground(Color.GREEN);
					}
					
					if(buttonr5c5.getBackground() == Color.GREEN) {
						Main.setFive(3);
					}
					if(buttonr5c5.getBackground() == Color.YELLOW) {
						Main.setFive(2);
					}
					if(buttonr5c5.getBackground() == Color.GRAY) {
						Main.setFive(1);
					}
				}
			}
		});
		
		buttonr6c1 = new JButton("");
		buttonr6c1.setForeground(Color.WHITE);
		buttonr6c1.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr6c1.setBackground(Color.GRAY);
		buttonr6c1.setBounds(73, 519, 115, 79);
		Jframe.add(buttonr6c1);
		buttonr6c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 6) {
					if(counterR6C1 == 2) {
						counterR6C1 = 0;
					}
					else if(counterR6C1 < 2) {
						counterR6C1++;
					}
					
					if(counterR6C1 == 0) {
						buttonr6c1.setBackground(Color.GRAY);
					}
					else if(counterR6C1 == 1) {
						buttonr6c1.setBackground(Color.YELLOW);
					}
					else if(counterR6C1 == 2) {
						buttonr6c1.setBackground(Color.GREEN);
					}
					
					if(buttonr6c1.getBackground() == Color.GREEN) {
						Main.setOne(3);
					}
					if(buttonr6c1.getBackground() == Color.YELLOW) {
						Main.setOne(2);
					}
					if(buttonr6c1.getBackground() == Color.GRAY) {
						Main.setOne(1);
					}
				}
			}
		});
		
		buttonr6c2 = new JButton("");
		buttonr6c2.setForeground(Color.WHITE);
		buttonr6c2.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr6c2.setBackground(Color.GRAY);
		buttonr6c2.setBounds(198, 519, 115, 79);
		Jframe.add(buttonr6c2);
		buttonr6c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 6) {
					if(counterR6C2 == 2) {
						counterR6C2 = 0;
					}
					else if(counterR6C2 < 2) {
						counterR6C2++;
					}
					
					if(counterR6C2 == 0) {
						buttonr6c2.setBackground(Color.GRAY);
					}
					else if(counterR6C2 == 1) {
						buttonr6c2.setBackground(Color.YELLOW);
					}
					else if(counterR6C2 == 2) {
						buttonr6c2.setBackground(Color.GREEN);
					}
					
					if(buttonr6c2.getBackground() == Color.GREEN) {
						Main.setTwo(3);
					}
					if(buttonr6c2.getBackground() == Color.YELLOW) {
						Main.setTwo(2);
					}
					if(buttonr6c2.getBackground() == Color.GRAY) {
						Main.setTwo(1);
					}
				}
			}
		});
		
		buttonr6c3 = new JButton("");
		buttonr6c3.setForeground(Color.WHITE);
		buttonr6c3.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr6c3.setBackground(Color.GRAY);
		buttonr6c3.setBounds(323, 519, 115, 79);
		Jframe.add(buttonr6c3);
		buttonr6c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 6) {
					if(counterR6C3 == 2) {
						counterR6C3 = 0;
					}
					else if(counterR6C3 < 2) {
						counterR6C3++;
					}
					
					if(counterR6C3 == 0) {
						buttonr6c3.setBackground(Color.GRAY);
					}
					else if(counterR6C3 == 1) {
						buttonr6c3.setBackground(Color.YELLOW);
					}
					else if(counterR6C3 == 2) {
						buttonr6c3.setBackground(Color.GREEN);
					}
					
					if(buttonr6c3.getBackground() == Color.GREEN) {
						Main.setThree(3);
					}
					if(buttonr6c3.getBackground() == Color.YELLOW) {
						Main.setThree(2);
					}
					if(buttonr6c3.getBackground() == Color.GRAY) {
						Main.setThree(1);
					}
				}
			}
		});
		
		buttonr6c4 = new JButton("");
		buttonr6c4.setForeground(Color.WHITE);
		buttonr6c4.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr6c4.setBackground(Color.GRAY);
		buttonr6c4.setBounds(448, 519, 115, 79);
		Jframe.add(buttonr6c4);
		buttonr6c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 6) {
					if(counterR6C4 == 2) {
						counterR6C4 = 0;
					}
					else if(counterR6C4 < 2) {
						counterR6C4++;
					}
					
					if(counterR6C4 == 0) {
						buttonr6c4.setBackground(Color.GRAY);
					}
					else if(counterR6C4 == 1) {
						buttonr6c4.setBackground(Color.YELLOW);
					}
					else if(counterR6C4 == 2) {
						buttonr6c4.setBackground(Color.GREEN);
					}
					
					if(buttonr6c4.getBackground() == Color.GREEN) {
						Main.setFour(3);
					}
					if(buttonr6c4.getBackground() == Color.YELLOW) {
						Main.setFour(2);
					}
					if(buttonr6c4.getBackground() == Color.GRAY) {
						Main.setFour(1);
					}
				}
			}
		});
		
		buttonr6c5 = new JButton("");
		buttonr6c5.setForeground(Color.WHITE);
		buttonr6c5.setFont(new Font("Trebuchet MS", Font.BOLD, 55));
		buttonr6c5.setBackground(Color.GRAY);
		buttonr6c5.setBounds(573, 519, 115, 79);
		Jframe.add(buttonr6c5);
		buttonr6c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(enterCounter == 6) {
					if(counterR6C5 == 2) {
						counterR6C5 = 0;
					}
					else if(counterR6C5 < 2) {
						counterR6C5++;
					}
					
					if(counterR6C5 == 0) {
						buttonr6c5.setBackground(Color.GRAY);
					}
					else if(counterR6C5 == 1) {
						buttonr6c5.setBackground(Color.YELLOW);
					}
					else if(counterR6C5 == 2) {
						buttonr6c5.setBackground(Color.GREEN);
					}
					
					if(buttonr6c5.getBackground() == Color.GREEN) {
						Main.setFive(3);
					}
					if(buttonr6c5.getBackground() == Color.YELLOW) {
						Main.setFive(2);
					}
					if(buttonr6c5.getBackground() == Color.GRAY) {
						Main.setFive(1);
					}
				}
			}
		});
		
		resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Reset some of the algorithm values using Main.setUp()
				try {
					Main.setUp();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//Reset enterCounter since we're back on row one of guess boxes
				enterCounter = 1;
				//Reset all texboxes and displays
				listBox.setText("Possible words left: ");
				wordBox.setText("Try " + Main.getWord().toUpperCase());
				wordCount.setText("Words left: ");
				//Main.setUp() does not reset these algorithm values so will be manually reset
				Main.setOne(1);
				Main.setTwo(1);
				Main.setThree(1);
				Main.setFour(1);
				Main.setFive(1);
				//Reseting all counters so that guess boxes counter will match up with the color gray
				counterR1C1 = 0;
				counterR1C2 = 0;
				counterR1C3 = 0;
				counterR1C4 = 0;
				counterR1C5 = 0;
				counterR2C1 = 0;
				counterR2C2 = 0;
				counterR2C3 = 0;
				counterR2C4 = 0;
				counterR2C5 = 0;
				counterR3C1 = 0;
				counterR3C2 = 0;
				counterR3C3 = 0;
				counterR3C4 = 0;
				counterR3C5 = 0;
				counterR4C1 = 0;
				counterR4C2 = 0;
				counterR4C3 = 0;
				counterR4C4 = 0;
				counterR4C5 = 0;
				counterR5C1 = 0;
				counterR5C2 = 0;
				counterR5C3 = 0;
				counterR5C4 = 0;
				counterR5C5 = 0;
				counterR6C1 = 0;
				counterR6C2 = 0;
				counterR6C3 = 0;
				counterR6C4 = 0;
				counterR6C5 = 0;
				//Setting all guess boxes back to gray
				buttonr1c1.setBackground(Color.GRAY);
				buttonr1c2.setBackground(Color.GRAY);
				buttonr1c3.setBackground(Color.GRAY);
				buttonr1c4.setBackground(Color.GRAY);
				buttonr1c5.setBackground(Color.GRAY);
				
				buttonr2c1.setBackground(Color.GRAY);
				buttonr2c2.setBackground(Color.GRAY);
				buttonr2c3.setBackground(Color.GRAY);
				buttonr2c4.setBackground(Color.GRAY);
				buttonr2c5.setBackground(Color.GRAY);
				
				buttonr3c1.setBackground(Color.GRAY);
				buttonr3c2.setBackground(Color.GRAY);
				buttonr3c3.setBackground(Color.GRAY);
				buttonr3c4.setBackground(Color.GRAY);
				buttonr3c5.setBackground(Color.GRAY);
				
				buttonr4c1.setBackground(Color.GRAY);
				buttonr4c2.setBackground(Color.GRAY);
				buttonr4c3.setBackground(Color.GRAY);
				buttonr4c4.setBackground(Color.GRAY);
				buttonr4c5.setBackground(Color.GRAY);
				
				buttonr5c1.setBackground(Color.GRAY);
				buttonr5c2.setBackground(Color.GRAY);
				buttonr5c3.setBackground(Color.GRAY);
				buttonr5c4.setBackground(Color.GRAY);
				buttonr5c5.setBackground(Color.GRAY);
				
				buttonr6c1.setBackground(Color.GRAY);
				buttonr6c2.setBackground(Color.GRAY);
				buttonr6c3.setBackground(Color.GRAY);
				buttonr6c4.setBackground(Color.GRAY);
				buttonr6c5.setBackground(Color.GRAY);
				//Resetting rows 2 and above of guess boxes so that only SALET is shown on 1st row.
				buttonr2c1.setText("");
				buttonr2c2.setText("");
				buttonr2c3.setText("");
				buttonr2c4.setText("");
				buttonr2c5.setText("");
				
				buttonr3c1.setText("");
				buttonr3c2.setText("");
				buttonr3c3.setText("");
				buttonr3c4.setText("");
				buttonr3c5.setText("");
				
				buttonr4c1.setText("");
				buttonr4c2.setText("");
				buttonr4c3.setText("");
				buttonr4c4.setText("");
				buttonr4c5.setText("");
				
				buttonr5c1.setText("");
				buttonr5c2.setText("");
				buttonr5c3.setText("");
				buttonr5c4.setText("");
				buttonr5c5.setText("");
				
				buttonr6c1.setText("");
				buttonr6c2.setText("");
				buttonr6c3.setText("");
				buttonr6c4.setText("");
				buttonr6c5.setText("");
			}
		});
		resetButton.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		resetButton.setBounds(1021, 152, 192, 66);
		Jframe.add(resetButton);
		

	}
}



///////////////////////////|
//|File: Menu.java
//|Author: Jerrin C. Redmon
//|Language: Java v17
//|Version: 1.0
//|Date: August 28, 2023
///////////////////////////|

/* Description:
 * A program to assist an the tedious task of strip mining in minecraft
 * using a macro to automatically mine and move forward for a given time
 */
 
//----------------------------------------------------------------
    
// Imports //
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JButton;

/**Javadocs**
 * @author Jerrin C. Redmon
 * @version 1.0
 */
@SuppressWarnings("serial")
public class Menu extends JFrame {

	public String title = "Autominer";
	public String version = " 1.0 ";
	public JFrame frame; 
	public JButton[] buttons = new JButton[6];
	public JButton helpButton;
	public JButton stopButton;
	public JTextArea textArea;
	public JPanel panel;
	public Icon[] icons = new Icon[6];
	public String[] buttonText = new String[6];
	private Miner miner;
	
	// Help Description and License //
	private String help = "Welcome to the Minecraft Autominer!\n\n"
			+"Author: Jerrin C. Redmon\n\n\n"
			+"Lisensed under the GNU GPL v3.\n"
			+"See https://www.gnu.org/licenses/gpl-3.0.html\n\n"
			+"This program allow you to macro\n"
			+"the boring task of strip mining\n\n"
			+"How to use: \n" 
			+"Select the duration of the macro\n"
			+"and switch to the game window\n"
			+"then wait 5 seconds for the miner to begin\n\n"
			+"To Stop: \n"
			+"Press the stop button on the program";
			
			
	/**
	 * Menu Constructor
	 */
	public Menu() {

		miner = new Miner();
		gui();
	}
	
	
	/**
	 * Graphical User Interface
	 * Sets parameters of GUI
	 */
	private void gui() {

		setTitle(title + version);
		setSize(320, 320);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		panel = new JPanel();
		
		// Adds image to buttons //
		icons[0] = new ImageIcon(getClass().getResource("/images/woodPickaxe.png"));
		icons[1] = new ImageIcon(getClass().getResource("/images/stonePickaxe.png"));
		icons[2] = new ImageIcon(getClass().getResource("/images/ironPickaxe.png"));
		icons[3] = new ImageIcon(getClass().getResource("/images/goldPickaxe.png"));
		icons[4] = new ImageIcon(getClass().getResource("/images/diamondPickaxe.png"));
		icons[5] = new ImageIcon(getClass().getResource("/images/neatheritePickaxe.png"));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(icons[i]);
			panel.add(buttons[i]);
		}
		
		// Adds text to buttons //
		helpButton = new JButton("Help");
		stopButton = new JButton("Stop");
		buttonText[0] = "10_sec";
		buttonText[1] = "60_sec";
		buttonText[2] = "10_min";
		buttonText[3] = "30_min";
		buttonText[4] = "60_min";
		buttonText[5] = "10_hrs";
		panel.setBackground(Color.DARK_GRAY);
		for (int i = 0; i < buttonText.length; i++) {
			buttons[i].setText(buttonText[i]);
		}
		panel.add(helpButton);
		panel.add(stopButton);
		add(panel);
		setVisible(true);
		
		
		// Button 0 listener //
			buttons[0].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					miner.initiateMiner(10);
					miner.start();
				}
			});
			
		// Button 1 listener //
			buttons[1].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					miner.initiateMiner(60);
					miner.start();
				}
			});
			
		// Button 2 listener //
			buttons[2].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					miner.initiateMiner(600);
					miner.start();
				}
			});
			
		// Button 3 listener //
			buttons[3].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					miner.initiateMiner(1800);
					miner.start();
				}
			});
			
		// Button 4 listener //
			buttons[4].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					miner.initiateMiner(3600);
					miner.start();
				}
			});
			
		// Button 5 listener //
			buttons[5].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					miner.initiateMiner(36000);
					miner.start();
				}
			});
			
		// Stop button listener //
			stopButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					miner.interrupt();
					miner = new Miner();
				}
			});
			
		// Help button listener //
			helpButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					frame = new JFrame();
					textArea = new JTextArea(help);
					textArea.setEditable(false);
					frame.setTitle("Help");
					frame.setSize(360, 360);
					frame.add(textArea);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setVisible(true);
				}
			});
		}
		
		
	// Main Method //
	public static void main(String[] args) {

		new Menu();
	}
}

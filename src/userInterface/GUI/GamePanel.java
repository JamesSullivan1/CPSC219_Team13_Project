package userInterface.GUI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import main.Location;

public class GamePanel extends JPanel {

	private JButton btnQuit;
	private ImageIcon quitButton, rollOverQuitButton;
    private MouseHandler mouseHandler;
    private int topLeftX = 285;
    private int topLeftY = 145;
    private static final int SQUARE_LENGTH = 44;
	
	public GamePanel() {
		setLayout(null);
		ImagePanel background = new ImagePanel(new ImageIcon("GUIImages\\GamePanelBackground.jpg").getImage());
		
		quitButton = new ImageIcon("GUIImages\\gamePanelQuitButton.png");
		rollOverQuitButton = new ImageIcon("GUIImages\\rollOverGamePanelQuitButton.png");
		btnQuit = new JButton(quitButton);
		btnQuit.setOpaque(false);
		btnQuit.setContentAreaFilled(false);
		btnQuit.setBorderPainted(false);
		btnQuit.setFocusPainted(false);
		btnQuit.setBounds(385, 480, 145, 105);
		btnQuit.setRolloverIcon(rollOverQuitButton);
        
        mouseHandler = new MouseHandler(this, topLeftX, topLeftY, SQUARE_LENGTH);	
		add(btnQuit);
		add(background);
		
	}
}

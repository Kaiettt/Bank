package Login;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class AdminUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminUI frame = new AdminUI();
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
	public AdminUI() {
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 360, 550);
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    ImageIcon icon = new ImageIcon("D:/OOPCLASS/BankingSystem/src/image/Lovepik_com-401708250-bank-icon.png");
	    setIconImage(icon.getImage());
	    setContentPane(contentPane);
	    contentPane.setLayout(null);

	    JLabel lblNewLabel_4 = new JLabel("WELCOME!");
	    lblNewLabel_4.setBounds(96, 57, 196, 62);
	    lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 24));  // Example: Arial, Bold, size 24
        lblNewLabel_4.setForeground(Color.WHITE);
	    contentPane.add(lblNewLabel_4);
	    
	    
	    ImageIcon originalIcon = new ImageIcon("D:\\OOPCLASS\\BankingSystem\\src\\image\\money-bag_189715.png");

        // Check if the image loaded successfully
        if (originalIcon.getIconWidth() == -1) {
            System.out.println("Image not found or is invalid.");
            return; // Exit if the image is not found
        }

        // Scale the image to fit JLabel dimensions
        Image img = originalIcon.getImage(); // Get the original image
        Image scaledImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon scaledIcon = new ImageIcon(scaledImg); 

        // Create a JLabel to hold the scaled image
        JLabel lblNewLabel_5 = new JLabel();
        lblNewLabel_5.setIcon(scaledIcon);
        lblNewLabel_5.setBounds(70, 120, 266, 185); // Set bounds for the label
        contentPane.add(lblNewLabel_5); // Add the label to the content pane
	    
	    
	    textField = new JTextField();
	    textField.setBounds(70, 335, 199, 28);
	    contentPane.add(textField);
	    textField.setColumns(10);
	    
	    textField_1 = new JTextField();
	    textField_1.setColumns(10);
	    textField_1.setBounds(70, 407, 199, 28);
	    contentPane.add(textField_1);
	    
	    JLabel lblNewLabel_2 = new JLabel();
	    lblNewLabel_2.setBackground(Color.WHITE);
	    lblNewLabel_2.setOpaque(true);
	    lblNewLabel_2.setBounds(61, 329, 217, 45);
	    contentPane.add(lblNewLabel_2);

	    JLabel lblNewLabel_3 = new JLabel();
	    lblNewLabel_3.setBackground(Color.WHITE);
	    lblNewLabel_3.setOpaque(true);
	    lblNewLabel_3.setBounds(61, 401, 217, 45);
	    contentPane.add(lblNewLabel_3);

	    // Add the background label last so it doesn't cover the other components
	    JLabel lblNewLabel = new JLabel();
	    lblNewLabel.setBounds(0, 0, 346, 524);
	    lblNewLabel.setForeground(Color.WHITE); // Set text color (white)
	    lblNewLabel.setOpaque(true); // Enable background visibility
	    lblNewLabel.setBackground(Color.decode("#4849BF")); // Background color
	    contentPane.add(lblNewLabel);
	
	    setLocationRelativeTo(null);
	}

}

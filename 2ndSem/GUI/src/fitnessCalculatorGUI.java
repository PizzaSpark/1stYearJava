import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fitnessCalculatorGUI {

	private JFrame frmFitnessCalculator;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtDuration;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField txtBefore;
	private JTextField txtAfter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fitnessCalculatorGUI window = new fitnessCalculatorGUI();
					window.frmFitnessCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fitnessCalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFitnessCalculator = new JFrame();
		frmFitnessCalculator.setTitle("Fitness Calculator");
		frmFitnessCalculator.setBounds(100, 100, 408, 451);
		frmFitnessCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFitnessCalculator.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 44, 369, 63);
		frmFitnessCalculator.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton btnSwimming = new JRadioButton("Swimming");
		btnSwimming.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(btnSwimming);
		btnSwimming.setBounds(6, 7, 109, 23);
		panel.add(btnSwimming);
		
		JRadioButton btnRunning = new JRadioButton("Running");
		btnRunning.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(btnRunning);
		btnRunning.setBounds(6, 33, 109, 23);
		panel.add(btnRunning);
		
		JRadioButton btnKBoxing = new JRadioButton("Kick Boxing");
		btnKBoxing.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(btnKBoxing);
		btnKBoxing.setBounds(216, 7, 109, 23);
		panel.add(btnKBoxing);
		
		JRadioButton btnBiking = new JRadioButton("Biking");
		btnBiking.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(btnBiking);
		btnBiking.setBounds(216, 33, 109, 23);
		panel.add(btnBiking);
		
		JLabel lblNewLabel = new JLabel("Choose an Activity: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 11, 177, 22);
		frmFitnessCalculator.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 116, 372, 36);
		frmFitnessCalculator.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Duration");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 11, 70, 14);
		panel_1.add(lblNewLabel_1);
		
		txtDuration = new JTextField();
		txtDuration.setBounds(82, 8, 70, 20);
		panel_1.add(txtDuration);
		txtDuration.setColumns(10);
		
		JRadioButton btnMin = new JRadioButton("Minutes");
		buttonGroup_1.add(btnMin);
		btnMin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMin.setBounds(172, 8, 76, 23);
		panel_1.add(btnMin);
		
		JRadioButton btnHour = new JRadioButton("Hour");
		buttonGroup_1.add(btnHour);
		btnHour.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnHour.setBounds(261, 8, 76, 23);
		panel_1.add(btnHour);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 190, 372, 95);
		frmFitnessCalculator.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Heart Rate:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 11, 122, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Before");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(44, 36, 46, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("After");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(44, 61, 46, 14);
		panel_2.add(lblNewLabel_4);
		
		txtBefore = new JTextField();
		txtBefore.setBounds(100, 33, 66, 20);
		panel_2.add(txtBefore);
		txtBefore.setColumns(10);
		
		txtAfter = new JTextField();
		txtAfter.setBounds(100, 58, 66, 20);
		panel_2.add(txtAfter);
		txtAfter.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("bps");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(176, 35, 46, 17);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("bps");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(176, 60, 46, 17);
		panel_2.add(lblNewLabel_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 296, 369, 77);
		frmFitnessCalculator.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Results: ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(10, 11, 67, 14);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Calories Burnt:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(20, 30, 109, 14);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Heart Rate Increase (bps):");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(30, 49, 183, 25);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblCalories = new JLabel("0");
		lblCalories.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCalories.setBounds(139, 30, 155, 14);
		panel_3.add(lblCalories);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(139, 52, 46, 14);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblHeart = new JLabel("0");
		lblHeart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHeart.setBounds(219, 54, 46, 14);
		panel_3.add(lblHeart);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnSwimming.isSelected()) {
					if(btnMin.isSelected()) {
						int a = Integer.parseInt(txtDuration.getText());
						int d = Integer.parseInt(txtBefore.getText());
						int f = Integer.parseInt(txtAfter.getText());
						int Result = 4 * a;
						double Result1 = 0.2 * a;
						double n = 0.1 * Result1;
						double c = n * d;
						double g = c + f;
						
						lblHeart.setText(g+"");
						lblCalories.setText(Result+""+" Calories");
					} else if (btnHour.isSelected()) {
						int a = Integer.parseInt(txtDuration.getText());
						int d = Integer.parseInt(txtBefore.getText());
						int f = Integer.parseInt(txtAfter.getText());
						int Result = 240 * a;
						double Result1 = 0.2 * a;
						double n = 0.1 * Result1;
						double c = n * d;
						double g = c + f;
						
						lblHeart.setText(g+"");
						lblCalories.setText(Result+""+" Calories");
					}
						
				} else if (btnRunning.isSelected()) {
						if(btnMin.isSelected()) {
							int a = Integer.parseInt(txtDuration.getText());
							int d = Integer.parseInt(txtBefore.getText());
							int f = Integer.parseInt(txtAfter.getText());
							int Result = 5 * a;
							double Result1 = 0.2 * a;
							double n = 0.1 * Result1;
							double c = n * d;
							double g = c + f;
						
							lblHeart.setText(g+"");
							lblCalories.setText(Result+""+" Calories");
						} else if (btnHour.isSelected()) {
							int a = Integer.parseInt(txtDuration.getText());
							int d = Integer.parseInt(txtBefore.getText());
							int f = Integer.parseInt(txtAfter.getText());
							int Result = 300 * a;
							double Result1 = 0.2 * a;
							double n = 0.1 * Result1;
							double c = n * d;
							double g = c + f;
							lblHeart.setText(g+"");
							lblCalories.setText(Result+""+" Calories");
					} 
					
				} else if (btnKBoxing.isSelected()) {
						if(btnMin.isSelected()) {
							int a = Integer.parseInt(txtDuration.getText());
							int d = Integer.parseInt(txtBefore.getText());
							int f = Integer.parseInt(txtAfter.getText());
							int Result = 3 * a;
							double Result1 = 0.2 * a;
							double n = 0.1 * Result1;
							double c = n * d;
							double g = c + f;
							
							lblHeart.setText(g+"");
							lblCalories.setText(Result+""+" Calories");
						} else if (btnHour.isSelected()) {
							int a = Integer.parseInt(txtDuration.getText());
							int d = Integer.parseInt(txtBefore.getText());
							int f = Integer.parseInt(txtAfter.getText());
							int Result = 180 * a;
							double Result1 = 0.2 * a;
							double n = 0.1 * Result1;
							double c = n * d;
							double g = c + f;
							
							lblHeart.setText(g+"");
							lblCalories.setText(Result+""+" Calories");
						} 
				} else if (btnBiking.isSelected()) {
						if(btnMin.isSelected()) {
							int a = Integer.parseInt(txtDuration.getText());
							int d = Integer.parseInt(txtBefore.getText());
							int f = Integer.parseInt(txtAfter.getText());
							int Result = 5 * a;
							double Result1 = 0.2 * a;
							double n = 0.1 * Result1;
							double c = n * d;
							double g = c + f;
							
							lblHeart.setText(g+"");
							lblCalories.setText(Result+""+" Calories");
						} else if (btnHour.isSelected()) {
							int a = Integer.parseInt(txtDuration.getText());
							int d = Integer.parseInt(txtBefore.getText());
							int f = Integer.parseInt(txtAfter.getText());
							int Result = 300 * a;
							double Result1 = 0.2 * a;
							double n = 0.1 * Result1;
							double c = n * d;
							double g = c + f;
							
							lblHeart.setText(g+"");
							lblCalories.setText(Result+""+" Calories");
					} 
				}
					
			}
		});
		btnNewButton.setBounds(155, 380, 89, 23);
		frmFitnessCalculator.getContentPane().add(btnNewButton);
	}

}
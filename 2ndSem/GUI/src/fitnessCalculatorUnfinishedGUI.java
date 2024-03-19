import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ButtonGroup;

public class fitnessCalculatorUnfinishedGUI {

	private JFrame frame;
	private JTextField Duration;
	private JTextField textField_1;
	private JTextField After;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fitnessCalculatorUnfinishedGUI window = new fitnessCalculatorUnfinishedGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fitnessCalculatorUnfinishedGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 474, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChooseAnActivity = new JLabel("Choose an Activity:");
		lblChooseAnActivity.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblChooseAnActivity.setBounds(30, 11, 247, 51);
		frame.getContentPane().add(lblChooseAnActivity);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(40, 72, 376, 130);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton Running = new JRadioButton("Running");
		buttonGroup.add(Running);
		Running.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Running.setBounds(6, 69, 148, 30);
		panel.add(Running);
		
		JRadioButton Swimming = new JRadioButton("Swimming");
		buttonGroup.add(Swimming);
		Swimming.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Swimming.setBounds(6, 20, 148, 30);
		panel.add(Swimming);
		
		JRadioButton KickBoxing = new JRadioButton("Kick Boxing");
		buttonGroup.add(KickBoxing);
		KickBoxing.setFont(new Font("Tahoma", Font.PLAIN, 24));
		KickBoxing.setBounds(176, 20, 148, 30);
		panel.add(KickBoxing);
		
		JRadioButton Biking = new JRadioButton("Biking");
		buttonGroup.add(Biking);
		Biking.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Biking.setBounds(176, 69, 148, 30);
		panel.add(Biking);
		
		JLabel lblDuration = new JLabel("Duration:");
		lblDuration.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDuration.setBounds(30, 212, 93, 51);
		frame.getContentPane().add(lblDuration);
		
		Duration = new JTextField();
		Duration.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Duration.setBounds(121, 222, 96, 29);
		frame.getContentPane().add(Duration);
		Duration.setColumns(10);
		
		JRadioButton Minutes = new JRadioButton("Minutes");
		buttonGroup_1.add(Minutes);
		Minutes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Minutes.setBounds(223, 223, 83, 30);
		frame.getContentPane().add(Minutes);
		
		JRadioButton Hour = new JRadioButton("Hour");
		buttonGroup_1.add(Hour);
		Hour.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Hour.setBounds(321, 223, 83, 30);
		frame.getContentPane().add(Hour);
		
		JLabel lblHeartRate = new JLabel("Heart Rate:");
		lblHeartRate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHeartRate.setBounds(30, 270, 117, 51);
		frame.getContentPane().add(lblHeartRate);
		
		JLabel Before = new JLabel("Before");
		Before.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Before.setBounds(40, 317, 117, 41);
		frame.getContentPane().add(Before);
		
		JLabel lblAfter = new JLabel("After");
		lblAfter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAfter.setBounds(40, 353, 54, 51);
		frame.getContentPane().add(lblAfter);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(121, 327, 96, 29);
		frame.getContentPane().add(textField_1);
		
		After = new JTextField();
		After.setFont(new Font("Tahoma", Font.PLAIN, 18));
		After.setColumns(10);
		After.setBounds(121, 368, 96, 29);
		frame.getContentPane().add(After);
		
		JLabel lblBps = new JLabel("bps");
		lblBps.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBps.setBounds(223, 317, 43, 41);
		frame.getContentPane().add(lblBps);
		
		JLabel lblBps_1 = new JLabel("bps");
		lblBps_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBps_1.setBounds(223, 353, 43, 41);
		frame.getContentPane().add(lblBps_1);
		
		JLabel lblResults = new JLabel("Results:");
		lblResults.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResults.setBounds(30, 407, 117, 51);
		frame.getContentPane().add(lblResults);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setLayout(null);
		panel_1.setBounds(30, 468, 376, 130);
		frame.getContentPane().add(panel_1);
		
		JLabel lblCaloriesBurnt = new JLabel("Calories Burnt:");
		lblCaloriesBurnt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCaloriesBurnt.setBounds(10, 10, 177, 51);
		panel_1.add(lblCaloriesBurnt);
		
		JLabel lblHeartRateIncrease = new JLabel("Heart Rate Increase (bps):");
		lblHeartRateIncrease.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHeartRateIncrease.setBounds(10, 50, 263, 51);
		panel_1.add(lblHeartRateIncrease);
	}
}
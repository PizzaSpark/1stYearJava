import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.Period;

public class ageCalculatorGUI {

	private JFrame frmAgeCalculator;
	private JTextField textFieldMonth;
	private JTextField textFieldDay;
	private JTextField textFieldYear;
	private JLabel outputString;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				ageCalculatorGUI window = new ageCalculatorGUI();
				window.frmAgeCalculator.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ageCalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgeCalculator = new JFrame();
		frmAgeCalculator.setTitle("Age Calculator");
		frmAgeCalculator.setBounds(100, 100, 561, 300);
		frmAgeCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgeCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Date of Birth:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 158, 31);
		frmAgeCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblMonth = new JLabel("Month:");
		lblMonth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth.setBounds(58, 51, 69, 31);
		frmAgeCalculator.getContentPane().add(lblMonth);
		
		JLabel lblMonth_1 = new JLabel("Day:");
		lblMonth_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_1.setBounds(58, 85, 69, 31);
		frmAgeCalculator.getContentPane().add(lblMonth_1);
		
		JLabel lblMonth_1_1 = new JLabel("Year:");
		lblMonth_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_1_1.setBounds(58, 119, 69, 31);
		frmAgeCalculator.getContentPane().add(lblMonth_1_1);
		
		textFieldMonth = new JTextField();
		textFieldMonth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldMonth.setBounds(137, 52, 96, 28);
		frmAgeCalculator.getContentPane().add(textFieldMonth);
		textFieldMonth.setColumns(10);
		
		textFieldDay = new JTextField();
		textFieldDay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldDay.setColumns(10);
		textFieldDay.setBounds(137, 86, 96, 28);
		frmAgeCalculator.getContentPane().add(textFieldDay);
		
		textFieldYear = new JTextField();
		textFieldYear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldYear.setColumns(10);
		textFieldYear.setBounds(137, 120, 96, 28);
		frmAgeCalculator.getContentPane().add(textFieldYear);
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(e -> {
			String month = textFieldMonth.getText();
			String day = textFieldDay.getText();
			String year = textFieldYear.getText();

			int monthh = Integer.parseInt(month);
			int dayy = Integer.parseInt(day);
			int yearr = Integer.parseInt(year);

			LocalDate today = LocalDate.now();
			LocalDate birthday = LocalDate.of(yearr, monthh, dayy);

			Period period = Period.between(birthday, today);

			int finalMonths = period.getMonths();
			int finalDay = period.getDays();
			int finalYear = period.getYears();

			outputString.setText(finalYear+" years "+finalMonths+" months "+finalDay+" days");
		});
		btnCalculate.setBackground(Color.WHITE);
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalculate.setBounds(68, 185, 120, 21);
		frmAgeCalculator.getContentPane().add(btnCalculate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(e -> {
			textFieldMonth.setText("");
			textFieldDay.setText("");
			textFieldYear.setText("");
			outputString.setText("");
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBackground(Color.WHITE);
		btnReset.setBounds(68, 216, 120, 21);
		frmAgeCalculator.getContentPane().add(btnReset);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResult.setBounds(248, 10, 158, 31);
		frmAgeCalculator.getContentPane().add(lblResult);
		
		outputString = new JLabel("");
		outputString.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outputString.setBounds(270, 51, 267, 31);
		frmAgeCalculator.getContentPane().add(outputString);
		
		
	}
}

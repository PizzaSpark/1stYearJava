import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.time.*;

public class educationCalculatorGUI {

	private JFrame frmGUI1;
	private JTextField textFieldMonthNow;
	private JLabel outputStringBirthday;
	private JLabel outputStringEducation;
	private JTextField textFieldDayNow;
	private JTextField textFieldYearNow;
	private JLabel lblEnterYourBirthdate;
	private JLabel lblMonth_3;
	private JTextField textFieldMonth;
	private JTextField textFieldDay;
	private JLabel lblMonth_1;
	private JLabel lblNumber_3;
	private JTextField textFieldYear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					educationCalculatorGUI window = new educationCalculatorGUI();
					window.frmGUI1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public educationCalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGUI1 = new JFrame();
		frmGUI1.setTitle("Calculator");
		frmGUI1.setBounds(100, 100, 563, 541);
		frmGUI1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGUI1.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter Date Today");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 195, 31);
		frmGUI1.getContentPane().add(lblNewLabel);

		JLabel lblMonth = new JLabel("Month [1-12]:");
		lblMonth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth.setBounds(41, 51, 149, 28);
		frmGUI1.getContentPane().add(lblMonth);

		textFieldMonthNow = new JTextField();
		textFieldMonthNow.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldMonthNow.setBounds(191, 51, 86, 28);
		frmGUI1.getContentPane().add(textFieldMonthNow);
		textFieldMonthNow.setColumns(10);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String education = "";

				int MMn = Integer.parseInt(textFieldMonthNow.getText());
				int ddn = Integer.parseInt(textFieldDayNow.getText());
				int YYYYn = Integer.parseInt(textFieldYearNow.getText());
				int MM = Integer.parseInt(textFieldMonth.getText());
				int dd = Integer.parseInt(textFieldDay.getText());
				int YYYY = Integer.parseInt(textFieldYear.getText());

				LocalDate today = LocalDate.of(YYYYn, MMn, ddn);
				LocalDate birthday = LocalDate.of(YYYY, MM, dd);

				Period period = Period.between(birthday, today);

				int Month = period.getMonths();
				int Day = period.getDays();
				int Year = period.getYears();

				if (Year >= 0 && Year <= 2) {
					education = "Playgroup";
				} else if (Year >= 3 && Year <= 4) {
					education = "Nursery";
				} else if (Year >= 5 && Year <= 6) {
					education = "Kindergarten";
				} else if (Year >= 7 && Year <= 12) {
					education = "Elementary";
				} else if (Year >= 13 && Year <= 16) {
					education = "High School";
				} else if (Year >= 17 && Year <= 21) {
					education = "College";
				}

				outputStringBirthday
						.setText("You are now " + Year + " years " + Month + " months and " + Day + " days old.");
				outputStringEducation.setText("Your educational level is in " + education);
			}
		});
		btnCalculate.setBackground(Color.WHITE);
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalculate.setBounds(41, 348, 120, 21);
		frmGUI1.getContentPane().add(btnCalculate);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldMonthNow.setText("");
				textFieldDayNow.setText("");
				textFieldYearNow.setText("");
				textFieldMonth.setText("");
				textFieldDay.setText("");
				textFieldYear.setText("");
				outputStringBirthday.setText("");
				outputStringEducation.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBackground(Color.WHITE);
		btnReset.setBounds(171, 348, 120, 21);
		frmGUI1.getContentPane().add(btnReset);

		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResult.setBounds(10, 379, 158, 31);
		frmGUI1.getContentPane().add(lblResult);

		outputStringBirthday = new JLabel("");
		outputStringBirthday.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outputStringBirthday.setBounds(41, 420, 498, 28);
		frmGUI1.getContentPane().add(outputStringBirthday);

		JLabel lblNumber = new JLabel("Day [1-30]:");
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumber.setBounds(41, 89, 149, 28);
		frmGUI1.getContentPane().add(lblNumber);

		textFieldDayNow = new JTextField();
		textFieldDayNow.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldDayNow.setColumns(10);
		textFieldDayNow.setBounds(191, 89, 86, 28);
		frmGUI1.getContentPane().add(textFieldDayNow);

		JLabel lblNumber_1 = new JLabel("Year: ");
		lblNumber_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumber_1.setBounds(41, 127, 149, 28);
		frmGUI1.getContentPane().add(lblNumber_1);

		textFieldYearNow = new JTextField();
		textFieldYearNow.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldYearNow.setColumns(10);
		textFieldYearNow.setBounds(191, 127, 86, 28);
		frmGUI1.getContentPane().add(textFieldYearNow);

		outputStringEducation = new JLabel("");
		outputStringEducation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outputStringEducation.setBounds(41, 458, 498, 28);
		frmGUI1.getContentPane().add(outputStringEducation);

		lblEnterYourBirthdate = new JLabel("Enter Your Birthdate");
		lblEnterYourBirthdate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterYourBirthdate.setBounds(10, 165, 195, 31);
		frmGUI1.getContentPane().add(lblEnterYourBirthdate);

		lblMonth_3 = new JLabel("Month [1-12]:");
		lblMonth_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_3.setBounds(41, 206, 149, 28);
		frmGUI1.getContentPane().add(lblMonth_3);

		textFieldMonth = new JTextField();
		textFieldMonth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldMonth.setColumns(10);
		textFieldMonth.setBounds(191, 206, 86, 28);
		frmGUI1.getContentPane().add(textFieldMonth);

		textFieldDay = new JTextField();
		textFieldDay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldDay.setColumns(10);
		textFieldDay.setBounds(191, 244, 86, 28);
		frmGUI1.getContentPane().add(textFieldDay);

		lblMonth_1 = new JLabel("Day [1-30]:");
		lblMonth_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_1.setBounds(41, 244, 149, 28);
		frmGUI1.getContentPane().add(lblMonth_1);

		lblNumber_3 = new JLabel("Year: ");
		lblNumber_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumber_3.setBounds(41, 282, 149, 28);
		frmGUI1.getContentPane().add(lblNumber_3);

		textFieldYear = new JTextField();
		textFieldYear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldYear.setColumns(10);
		textFieldYear.setBounds(191, 282, 86, 28);
		frmGUI1.getContentPane().add(textFieldYear);

	}
}

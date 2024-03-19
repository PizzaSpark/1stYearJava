import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class multicalculatorGUI {

	private JFrame frmGUI2;
	private JTextField textField1;
	private JLabel outputStringPositive;
	private JLabel outputStringNegative;
	private JLabel outputStringOdd;
	private JLabel outputStringEven;
	private JLabel outputStringPN;
	private JLabel outputStringOE;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private JTextField textField8;
	private JTextField textField9;
	private JTextField textField10;
	private JTextField textField11;
	private JTextField textField12;
	private JTextField textField13;
	private JTextField textField14;
	private JTextField textField15;
	private JTextField textField16;
	private JTextField textField17;
	private JTextField textField18;
	private JTextField textField19;
	private JTextField textField20;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					multicalculatorGUI window = new multicalculatorGUI();
					window.frmGUI2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public multicalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGUI2 = new JFrame();
		frmGUI2.setTitle("Calculator");
		frmGUI2.setBounds(100, 100, 487, 784);
		frmGUI2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGUI2.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the numbers:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 195, 31);
		frmGUI2.getContentPane().add(lblNewLabel);
		
		JLabel lblMonth = new JLabel("Number 1:");
		lblMonth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth.setBounds(41, 51, 86, 28);
		frmGUI2.getContentPane().add(lblMonth);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField1.setBounds(147, 51, 86, 28);
		frmGUI2.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int []arr = new int[20];
				int positive = 0;
				int negative = 0;
				int odd = 0;
				int even = 0;
				
				arr[0] = Integer.parseInt(textField1.getText());
				arr[1] = Integer.parseInt(textField2.getText());
				arr[2] = Integer.parseInt(textField3.getText());
				arr[3] = Integer.parseInt(textField4.getText());
				arr[4] = Integer.parseInt(textField5.getText());
				arr[5] = Integer.parseInt(textField6.getText());
				arr[6] = Integer.parseInt(textField7.getText());
				arr[7] = Integer.parseInt(textField8.getText());
				arr[8] = Integer.parseInt(textField9.getText());
				arr[9] = Integer.parseInt(textField10.getText());
				arr[10] = Integer.parseInt(textField11.getText());
				arr[11] = Integer.parseInt(textField12.getText());
				arr[12] = Integer.parseInt(textField13.getText());
				arr[13] = Integer.parseInt(textField14.getText());
				arr[14] = Integer.parseInt(textField15.getText());
				arr[15] = Integer.parseInt(textField16.getText());
				arr[16] = Integer.parseInt(textField17.getText());
				arr[17] = Integer.parseInt(textField18.getText());
				arr[18] = Integer.parseInt(textField19.getText());
				arr[19] = Integer.parseInt(textField20.getText());
				
				for (int i = 0; i < arr.length; i++) 
				{
		           if (arr[i]>0)
		           {
		        	   positive = positive + arr[i];
		           }
		           else
		           {
		        	   negative = negative + arr[i];
		           }
		        }
				
				for (int i = 0; i < arr.length; i++) 
				{
		           if (arr[i] % 2 == 0)
		           {
		        	   even = even + arr[i];
		           }
		           else
		           {
		        	   odd = odd + arr[i];
		           }
		        }
				
				int PoNe = positive - negative;
				int OE = odd - even;
				outputStringPositive.setText("The sum of all positive numbers is "+positive);
				outputStringNegative.setText("The sum of all negative numbers is "+negative);
				outputStringOdd.setText("The sum of all odd numbers is "+odd);
				outputStringEven.setText("The sum of all even numbers is "+even);
				outputStringPN.setText("The difference of positive and negative is "+PoNe);
				outputStringOE.setText("The difference of odd and even is "+OE);
			}
		});
		btnCalculate.setBackground(Color.WHITE);
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalculate.setBounds(41, 447, 120, 21);
		frmGUI2.getContentPane().add(btnCalculate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				textField4.setText("");
				textField5.setText("");
				textField6.setText("");
				textField7.setText("");
				textField8.setText("");
				textField9.setText("");
				textField10.setText("");
				textField11.setText("");
				textField12.setText("");
				textField13.setText("");
				textField14.setText("");
				textField15.setText("");
				textField16.setText("");
				textField17.setText("");
				textField18.setText("");
				textField19.setText("");
				textField20.setText("");
				outputStringPositive.setText("");
				outputStringNegative.setText("");
				outputStringOdd.setText("");
				outputStringEven.setText("");
				outputStringPN.setText("");
				outputStringOE.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBackground(Color.WHITE);
		btnReset.setBounds(171, 447, 120, 21);
		frmGUI2.getContentPane().add(btnReset);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResult.setBounds(10, 478, 158, 31);
		frmGUI2.getContentPane().add(lblResult);
		
		outputStringPositive = new JLabel("");
		outputStringPositive.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outputStringPositive.setBounds(41, 519, 395, 28);
		frmGUI2.getContentPane().add(outputStringPositive);
		
		JLabel lblNumber = new JLabel("Number 2:");
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumber.setBounds(41, 89, 86, 28);
		frmGUI2.getContentPane().add(lblNumber);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField2.setColumns(10);
		textField2.setBounds(147, 89, 86, 28);
		frmGUI2.getContentPane().add(textField2);
		
		JLabel lblNumber_1 = new JLabel("Number 3:");
		lblNumber_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumber_1.setBounds(41, 127, 86, 28);
		frmGUI2.getContentPane().add(lblNumber_1);
		
		textField3 = new JTextField();
		textField3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField3.setColumns(10);
		textField3.setBounds(147, 127, 86, 28);
		frmGUI2.getContentPane().add(textField3);
		
		textField4 = new JTextField();
		textField4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField4.setColumns(10);
		textField4.setBounds(147, 165, 86, 28);
		frmGUI2.getContentPane().add(textField4);
		
		JLabel lblMonth_1_1 = new JLabel("Number 4:");
		lblMonth_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_1_1.setBounds(41, 165, 86, 28);
		frmGUI2.getContentPane().add(lblMonth_1_1);
		
		JLabel lblNumber_2 = new JLabel("Number 5:");
		lblNumber_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumber_2.setBounds(41, 203, 86, 28);
		frmGUI2.getContentPane().add(lblNumber_2);
		
		textField5 = new JTextField();
		textField5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField5.setColumns(10);
		textField5.setBounds(147, 203, 86, 28);
		frmGUI2.getContentPane().add(textField5);
		
		textField6 = new JTextField();
		textField6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField6.setColumns(10);
		textField6.setBounds(147, 241, 86, 28);
		frmGUI2.getContentPane().add(textField6);
		
		JLabel lblMonth_1_2 = new JLabel("Number 6:");
		lblMonth_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_1_2.setBounds(41, 241, 86, 28);
		frmGUI2.getContentPane().add(lblMonth_1_2);
		
		JLabel lblMonth_2_1 = new JLabel("Number 7:");
		lblMonth_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_2_1.setBounds(41, 279, 86, 28);
		frmGUI2.getContentPane().add(lblMonth_2_1);
		
		textField7 = new JTextField();
		textField7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField7.setColumns(10);
		textField7.setBounds(147, 279, 86, 28);
		frmGUI2.getContentPane().add(textField7);
		
		textField8 = new JTextField();
		textField8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField8.setColumns(10);
		textField8.setBounds(147, 317, 86, 28);
		frmGUI2.getContentPane().add(textField8);
		
		JLabel lblMonth_1_1_1 = new JLabel("Number 8:");
		lblMonth_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_1_1_1.setBounds(41, 317, 86, 28);
		frmGUI2.getContentPane().add(lblMonth_1_1_1);
		
		JLabel lblMonth_2_1_1 = new JLabel("Number 9:");
		lblMonth_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_2_1_1.setBounds(41, 355, 86, 28);
		frmGUI2.getContentPane().add(lblMonth_2_1_1);
		
		textField9 = new JTextField();
		textField9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField9.setColumns(10);
		textField9.setBounds(147, 355, 86, 28);
		frmGUI2.getContentPane().add(textField9);
		
		textField10 = new JTextField();
		textField10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField10.setColumns(10);
		textField10.setBounds(147, 393, 86, 28);
		frmGUI2.getContentPane().add(textField10);
		
		JLabel lblMonth_1_1_1_1 = new JLabel("Number 10:");
		lblMonth_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_1_1_1_1.setBounds(41, 393, 108, 28);
		frmGUI2.getContentPane().add(lblMonth_1_1_1_1);
		
		outputStringNegative = new JLabel("");
		outputStringNegative.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outputStringNegative.setBounds(41, 557, 395, 28);
		frmGUI2.getContentPane().add(outputStringNegative);
		
		outputStringOdd = new JLabel("");
		outputStringOdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outputStringOdd.setBounds(41, 595, 395, 28);
		frmGUI2.getContentPane().add(outputStringOdd);
		
		outputStringEven = new JLabel("");
		outputStringEven.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outputStringEven.setBounds(41, 633, 395, 28);
		frmGUI2.getContentPane().add(outputStringEven);
		
		outputStringPN = new JLabel("");
		outputStringPN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outputStringPN.setBounds(41, 671, 395, 28);
		frmGUI2.getContentPane().add(outputStringPN);
		
		outputStringOE = new JLabel("");
		outputStringOE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outputStringOE.setBounds(41, 709, 395, 28);
		frmGUI2.getContentPane().add(outputStringOE);
		
		JLabel lblNumber_4 = new JLabel("Number 11:");
		lblNumber_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumber_4.setBounds(258, 51, 108, 28);
		frmGUI2.getContentPane().add(lblNumber_4);
		
		textField11 = new JTextField();
		textField11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField11.setColumns(10);
		textField11.setBounds(364, 51, 86, 28);
		frmGUI2.getContentPane().add(textField11);
		
		textField12 = new JTextField();
		textField12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField12.setColumns(10);
		textField12.setBounds(364, 89, 86, 28);
		frmGUI2.getContentPane().add(textField12);
		
		JLabel lblNumber_3 = new JLabel("Number 12:");
		lblNumber_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumber_3.setBounds(258, 89, 108, 28);
		frmGUI2.getContentPane().add(lblNumber_3);
		
		JLabel lblNumber_1_1 = new JLabel("Number 13:");
		lblNumber_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumber_1_1.setBounds(258, 127, 108, 28);
		frmGUI2.getContentPane().add(lblNumber_1_1);
		
		textField13 = new JTextField();
		textField13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField13.setColumns(10);
		textField13.setBounds(364, 127, 86, 28);
		frmGUI2.getContentPane().add(textField13);
		
		textField14 = new JTextField();
		textField14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField14.setColumns(10);
		textField14.setBounds(364, 165, 86, 28);
		frmGUI2.getContentPane().add(textField14);
		
		JLabel lblMonth_1_1_2 = new JLabel("Number 14:");
		lblMonth_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_1_1_2.setBounds(258, 165, 108, 28);
		frmGUI2.getContentPane().add(lblMonth_1_1_2);
		
		JLabel lblNumber_2_1 = new JLabel("Number 15:");
		lblNumber_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumber_2_1.setBounds(258, 203, 108, 28);
		frmGUI2.getContentPane().add(lblNumber_2_1);
		
		textField15 = new JTextField();
		textField15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField15.setColumns(10);
		textField15.setBounds(364, 203, 86, 28);
		frmGUI2.getContentPane().add(textField15);
		
		textField16 = new JTextField();
		textField16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField16.setColumns(10);
		textField16.setBounds(364, 241, 86, 28);
		frmGUI2.getContentPane().add(textField16);
		
		JLabel lblMonth_1_2_1 = new JLabel("Number 16:");
		lblMonth_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_1_2_1.setBounds(258, 241, 108, 28);
		frmGUI2.getContentPane().add(lblMonth_1_2_1);
		
		JLabel lblMonth_2_1_2 = new JLabel("Number 17:");
		lblMonth_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_2_1_2.setBounds(258, 279, 108, 28);
		frmGUI2.getContentPane().add(lblMonth_2_1_2);
		
		textField17 = new JTextField();
		textField17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField17.setColumns(10);
		textField17.setBounds(364, 279, 86, 28);
		frmGUI2.getContentPane().add(textField17);
		
		textField18 = new JTextField();
		textField18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField18.setColumns(10);
		textField18.setBounds(364, 317, 86, 28);
		frmGUI2.getContentPane().add(textField18);
		
		JLabel lblMonth_1_1_1_2 = new JLabel("Number 18:");
		lblMonth_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_1_1_1_2.setBounds(258, 317, 108, 28);
		frmGUI2.getContentPane().add(lblMonth_1_1_1_2);
		
		JLabel lblMonth_2_1_1_1 = new JLabel("Number 19:");
		lblMonth_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_2_1_1_1.setBounds(258, 355, 108, 28);
		frmGUI2.getContentPane().add(lblMonth_2_1_1_1);
		
		textField19 = new JTextField();
		textField19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField19.setColumns(10);
		textField19.setBounds(364, 355, 86, 28);
		frmGUI2.getContentPane().add(textField19);
		
		textField20 = new JTextField();
		textField20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField20.setColumns(10);
		textField20.setBounds(364, 393, 86, 28);
		frmGUI2.getContentPane().add(textField20);
		
		JLabel lblMonth_1_1_1_1_1 = new JLabel("Number 20:");
		lblMonth_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth_1_1_1_1_1.setBounds(258, 393, 108, 28);
		frmGUI2.getContentPane().add(lblMonth_1_1_1_1_1);
		
		
	}
}

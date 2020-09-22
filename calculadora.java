package calcaa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculadora {

	private JFrame frame;
	private JTextField txtDisplay;

	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
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
	public calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 284, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtDisplay.setBounds(10, 11, 233, 38);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn7.setBounds(20, 60, 48, 48);
		frame.getContentPane().add(btn7);	
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn9.setBounds(136, 60, 48, 48);
		frame.getContentPane().add(btn9);
			
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn8.setBounds(78, 60, 48, 48);
		frame.getContentPane().add(btn8);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnplus.setBounds(194, 60, 48, 48);
		frame.getContentPane().add(btnplus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn4.setBounds(20, 136, 48, 48);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn5.setBounds(78, 136, 48, 48);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn6.setBounds(136, 136, 48, 48);
		frame.getContentPane().add(btn6);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnminus.setBounds(194, 136, 48, 48);
		frame.getContentPane().add(btnminus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn1.setBounds(20, 207, 48, 48);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn2.setBounds(78, 207, 48, 48);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn3.setBounds(136, 207, 48, 48);
		frame.getContentPane().add(btn3);
		
		JButton btnast = new JButton("*");
		btnast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnast.setBounds(194, 207, 48, 48);
		frame.getContentPane().add(btnast);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn0.setBounds(20, 274, 48, 48);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.setBounds(78, 274, 48, 48);
		frame.getContentPane().add(btndot);
		
		JButton btnbar = new JButton("/");
		btnbar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnbar.setBounds(136, 274, 48, 48);
		frame.getContentPane().add(btnbar);
		
		JButton btneq = new JButton("=");
		btneq.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String answer;
					secondnum = Double.parseDouble(txtDisplay.getText());
					if (operations == "+")
					{
						result = firstnum + secondnum;
						answer = String.format("%.2f" ,result);
						txtDisplay.setText(answer);
					}
					else if (operations == "-")
					{	
						result = firstnum - secondnum;
						answer = String.format("%.2f",result);
						txtDisplay.setText(answer);
					}
					else if (operations == "*")
					{
						result = firstnum * secondnum;
						answer = String.format("%.2f",result);
						txtDisplay.setText(answer);
					}
					else if (operations == "/")
					{
						result = firstnum / secondnum;
						answer = String.format("%.2f",result);
						txtDisplay.setText(answer);
					}
					
					
					
					
					
			}
		});
		btneq.setBounds(194, 274, 48, 48);
		frame.getContentPane().add(btneq);
	}
}

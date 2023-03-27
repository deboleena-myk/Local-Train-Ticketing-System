package trainticketing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Ticketing {

	private JFrame frame;
	private JTextField txtdate;
	private JTextField txtfare;
	private JTextField txtgst;
	private JTextField txttotal;
	private JTextField txtticketnumber;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtclass;
	private JTextField txtarrivalreturn;
	private JTextField txtadult;
	private JTextField txtchild;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketing window = new Ticketing();
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
	public Ticketing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.setBounds(100, 100, 909, 770);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 875, 60);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Local Train Ticketing System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(178, 10, 505, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Type");
		lblNewLabel_1.setBounds(135, 90, 116, 23);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnGeneral = new JRadioButton("General");
		rdbtnGeneral.setBackground(SystemColor.activeCaption);
		rdbtnGeneral.setBounds(10, 135, 103, 21);
		rdbtnGeneral.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(rdbtnGeneral);
		
		JRadioButton rdbtnChairCar = new JRadioButton("Chair Car");
		rdbtnChairCar.setBackground(SystemColor.activeCaption);
		rdbtnChairCar.setBounds(10, 172, 103, 21);
		rdbtnChairCar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(rdbtnChairCar);
		
		JRadioButton rdbtnArrivalTicket = new JRadioButton("Arrival ticket");
		rdbtnArrivalTicket.setBackground(SystemColor.activeCaption);
		rdbtnArrivalTicket.setBounds(135, 135, 119, 21);
		rdbtnArrivalTicket.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(rdbtnArrivalTicket);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return ticket");
		rdbtnReturnTicket.setBackground(SystemColor.activeCaption);
		rdbtnReturnTicket.setBounds(135, 172, 121, 21);
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBackground(SystemColor.activeCaption);
		rdbtnAdult.setBounds(297, 135, 103, 21);
		rdbtnAdult.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBackground(SystemColor.activeCaption);
		rdbtnChild.setBounds(297, 172, 103, 21);
		rdbtnChild.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(rdbtnChild);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 127, 390, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 290, 390, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblFrom = new JLabel("From :");
		lblFrom.setBounds(28, 313, 61, 23);
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To :");
		lblTo.setBounds(28, 346, 45, 23);
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(lblTo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(99, 317, 174, 21);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a station", "Barddhaman", "Cocachbehar", "Durgapur", "Kolkata", "Panagarh", "Sealdah"}));
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(99, 350, 174, 21);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select a station", "Barddhaman", "Coachbehar", "Durgapur", "Kolkata", "Panagarh", "Sealdah"}));
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("Destination");
		lblNewLabel_4.setBounds(99, 257, 116, 23);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setBounds(28, 398, 54, 23);
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(lblDate);
		
		txtdate = new JTextField();
		txtdate.setBounds(99, 403, 174, 19);
		frame.getContentPane().add(txtdate);
		txtdate.setColumns(10);
		
		JLabel lblFare = new JLabel("Fare :");
		lblFare.setBounds(28, 515, 110, 23);
		lblFare.setFont(new Font("Tahoma", Font.BOLD, 19));
		frame.getContentPane().add(lblFare);
		
		JLabel lblGST = new JLabel("GST :");
		lblGST.setBounds(28, 548, 54, 29);
		lblGST.setFont(new Font("Tahoma", Font.BOLD, 19));
		frame.getContentPane().add(lblGST);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setBounds(28, 592, 71, 21);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 19));
		frame.getContentPane().add(lblTotal);
		
		txtfare = new JTextField();
		txtfare.setBounds(177, 521, 116, 19);
		frame.getContentPane().add(txtfare);
		txtfare.setColumns(10);
		
		txtgst = new JTextField();
		txtgst.setBounds(177, 557, 116, 19);
		frame.getContentPane().add(txtgst);
		txtgst.setColumns(10);
		
		txttotal = new JTextField();
		txttotal.setBounds(177, 597, 116, 19);
		frame.getContentPane().add(txttotal);
		txttotal.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 483, 390, 2);
		frame.getContentPane().add(separator_2);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(283, 670, 85, 21);
		btnExit.setToolTipText("Exit System");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Ticketing System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBackground(UIManager.getColor("Button.background"));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(btnExit);
		
		
		
		JLabel lblNewLabel_9 = new JLabel("Ticket Number :");
		lblNewLabel_9.setBounds(468, 106, 134, 23);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Price :");
		lblNewLabel_10.setBounds(468, 142, 60, 13);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Date :");
		lblNewLabel_11.setBounds(468, 171, 60, 23);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Time :");
		lblNewLabel_12.setBounds(468, 204, 60, 19);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblClass = new JLabel("Class :");
		lblClass.setBounds(468, 270, 60, 22);
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Arriving/ Return Ticket :");
		lblTicket.setBounds(468, 302, 211, 23);
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult :");
		lblAdult.setBounds(468, 335, 71, 23);
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child :");
		lblChild.setBounds(468, 368, 71, 23);
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblChild);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(412, 245, 473, 2);
		frame.getContentPane().add(separator_3);
		
		txtticketnumber = new JTextField();
		txtticketnumber.setBounds(655, 110, 128, 19);
		frame.getContentPane().add(txtticketnumber);
		txtticketnumber.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(655, 139, 128, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(655, 176, 128, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(655, 207, 128, 19);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		txtclass = new JTextField();
		txtclass.setBounds(707, 273, 128, 19);
		frame.getContentPane().add(txtclass);
		txtclass.setColumns(10);
		
		txtarrivalreturn = new JTextField();
		txtarrivalreturn.setBounds(707, 307, 128, 19);
		frame.getContentPane().add(txtarrivalreturn);
		txtarrivalreturn.setColumns(10);
		
		txtadult = new JTextField();
		txtadult.setBounds(707, 340, 128, 19);
		frame.getContentPane().add(txtadult);
		txtadult.setColumns(10);
		
		txtchild = new JTextField();
		txtchild.setBounds(707, 373, 128, 19);
		frame.getContentPane().add(txtchild);
		txtchild.setColumns(10);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(404, 80, 14, 643);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		frame.getContentPane().add(separator_4);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(28, 670, 110, 21);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1;
				String q1="";
				num1 = 1325 + (int) + (Math.random()*4238);
				q1+=num1 + 1325;
				lblNewLabel_9.setText(q1);
				
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(btnConfirm);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(166, 670, 85, 23);
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtfare.setText(null);
				txtgst.setText(null);
				txttotal.setText(null);
				txtticketnumber.setText(null);
				txtclass.setText(null);
				txtarrivalreturn.setText(null);
				txtadult.setText(null);
				txtchild.setText(null);
				rdbtnGeneral.setSelected(false);
				rdbtnChairCar.setSelected(false);
				rdbtnAdult.setSelected(false);
				rdbtnArrivalTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				comboBox.setSelectedItem("Select any station");
				comboBox_1.setSelectedItem("Select any station");
				txtdate.setText(null);
				
			}
		});
		btnReset.setBackground(UIManager.getColor("Button.background"));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(btnReset);
		
	}
}

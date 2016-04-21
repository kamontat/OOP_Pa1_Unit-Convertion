package GUI;

import Code.Length;
import Code.UnitConverter;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by kamontat on 21/4/59.
 */
public class MainMenu extends JFrame {
	private final int TEXTFIELD1 = 1;
	private final int TEXTFIELD2 = 2;

	private JTextField textField1;
	private JPanel panel1;
	private JComboBox<String> comboBox1;
	private JLabel message;
	private JTextField textField2;
	private JComboBox<String> comboBox2;
	private JButton convertButton;
	private JButton clearButton;

	private double amount;
	private Length from;
	private Length to;
	private Boolean lock = false;
	private int switchField;

	public MainMenu() {
		UnitConverter uc = new UnitConverter();
		setContentPane(panel1);

		convertButton.setEnabled(false);

		addUnit(comboBox1);
		addUnit(comboBox2);

		textField1.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				amount = warningIn(textField1);
				switchField = TEXTFIELD1;
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				amount = warningIn(textField1);
				switchField = TEXTFIELD1;
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				amount = warningIn(textField1);
				switchField = TEXTFIELD1;
			}
		});

		textField2.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				amount = warningIn(textField2);
				switchField = TEXTFIELD2;
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				amount = warningIn(textField2);
				switchField = TEXTFIELD2;
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				amount = warningIn(textField2);
				switchField = TEXTFIELD2;
			}
		});

		// unlock converting when user choose comboBox
		comboBox1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				lock = false;
			}
		});
		comboBox2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				lock = false;
			}
		});

		convertButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				from = Length.values()[comboBox1.getSelectedIndex()];
				to = Length.values()[comboBox2.getSelectedIndex()];

				if (!lock) {
					if (switchField == TEXTFIELD1) {
						textField2.setText(String.format("%.2f", uc.convert(amount, from, to)));
					} else {
						textField1.setText(String.format("%.2f", uc.convert(amount, to, from)));
					}
				}
				lock = true;
			}
		});

		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField1.setText("");
				textField2.setText("");
			}
		});
	}

	private double warningIn(JTextField field) {
		// unlock converting.
		lock = false;
		// check String must be number.
		if (isAllNumberIn(field.getText())) {
			convertButton.setEnabled(true);
			return Float.parseFloat(field.getText());
		} else {
			convertButton.setEnabled(false);
		}
		return 0;
	}


	private void addUnit(JComboBox<String> comboBox) {
		for (int i = 0; i < Length.values().length; i++) {
			comboBox.addItem(Length.values()[i].getName());
		}

	}

	private Boolean isAllNumberIn(String input) {
		// if input is emply String
		if (input.length() == 0) return false;

		Boolean checkDot = false;

		Character[] except = new Character[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};
		for (int i = 0; i < input.length(); i++) {
			char aChar = input.charAt(i);
			Boolean checkNumber = false;

			if (aChar == '.' && !checkDot) {
				checkDot = true;
			} else if (aChar == '.' && checkDot) return false;

			for (Character exceptChar : except) {
				if (aChar == exceptChar) {
					checkNumber = true;
				}
			}

			if (!checkNumber) return false;
		}
		return true;
	}

	public void run() {
		pack();
		setSize(625, 65);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MainMenu dialog = new MainMenu();
		dialog.run();

	}
}

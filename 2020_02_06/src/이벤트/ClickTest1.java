package 이벤트;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickTest1 extends JFrame {
	//멤버변수
	private JTextField resTextField;
	private JTextField num1Text;
	private JTextField num2Text;
	private JLabel lblNewLabel;

	public ClickTest1() {
		//gridBag Layout : 참조형 변수 
		getContentPane().setBackground(Color.PINK);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 19, 0, 0, 0, 0, 4 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 2 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setEnabled(false);
			//argument : 메소드에 들어가는 실제 인자
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		resTextField = new JTextField();
		resTextField.setEditable(false);
		
		GridBagConstraints gbc_resTextField = new GridBagConstraints();
		gbc_resTextField.gridwidth = 4;
		gbc_resTextField.insets = new Insets(0, 0, 5, 0);
		gbc_resTextField.fill = GridBagConstraints.BOTH;
		gbc_resTextField.gridx = 1;
		gbc_resTextField.gridy = 1;
		
		getContentPane().add(resTextField, gbc_resTextField);
		resTextField.setColumns(4);
		num1Text = new JTextField();
		
		GridBagConstraints gbc_num1Text = new GridBagConstraints();
		gbc_num1Text.insets = new Insets(0, 0, 0, 5);
		gbc_num1Text.fill = GridBagConstraints.BOTH;
		gbc_num1Text.gridx = 1;
		gbc_num1Text.gridy = 3;
		getContentPane().add(num1Text, gbc_num1Text);
		num1Text.setColumns(10);

		JComboBox opCombo = new JComboBox();
		opCombo.setModel(new DefaultComboBoxModel(new String[] { "+", "-", "*", "/" }));
		GridBagConstraints gbc_opCombo = new GridBagConstraints();
	
		gbc_opCombo.insets = new Insets(0, 0, 0, 5);
		gbc_opCombo.fill = GridBagConstraints.BOTH;
		gbc_opCombo.gridx = 2;
		gbc_opCombo.gridy = 3;
		
		getContentPane().add(opCombo, gbc_opCombo);
		num2Text = new JTextField();
		
		GridBagConstraints gbc_num2Text = new GridBagConstraints();
		gbc_num2Text.insets = new Insets(0, 0, 0, 5);
		gbc_num2Text.fill = GridBagConstraints.BOTH;
		gbc_num2Text.gridx = 3;
		gbc_num2Text.gridy = 3;

		getContentPane().add(num2Text, gbc_num2Text);
		num2Text.setColumns(10);
		
		JButton answerShowBtn = new JButton("=");
		answerShowBtn.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
			int num1 = Integer.parseInt(num1Text.getText());
			int num2 = Integer.parseInt(num2Text.getText());
			String opStr=(String) opCombo.getSelectedItem();
			resTextField.setText( num1 + opStr+num2);
			int res=0;
			switch (opStr) {
			case "+": res = num1 + num2; break;
			case "-": res = num1 - num2; break;
			case "*": res = num1 * num2; break;
			case "/": res = num1 / num2; break;

			default:
				break;
			}
			resTextField.setText(num1 + opStr + num2 +"="+res);
		}

		});

		GridBagConstraints gbc_answerShowBtn = new GridBagConstraints();

		gbc_answerShowBtn.fill = GridBagConstraints.BOTH;
		gbc_answerShowBtn.gridx = 4;
		gbc_answerShowBtn.gridy = 3;
		getContentPane().add(answerShowBtn, gbc_answerShowBtn);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ClickTest1 test1 = new ClickTest1();
		test1.pack();
		test1.setVisible(true);

	}

}

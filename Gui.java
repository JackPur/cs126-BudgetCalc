import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankAppGUI extends JFrame {
    //Declare components
    private JLabel titleLabel;
    private JLabel balanceLabel;
    private JLabel depositLabel;
    private JLabel withdrawalLabel;
    private JTextField balanceField;
    private JTextField depositField;
    private JTextField withdrawalField;
    private JButton depositButton;
    private JButton withdrawalButton;
    private JButton getBalanceButton;
    private JButton clearButton;

    public BankAppGUI() {
        //Setup the window
        setTitle("Simple Banking App");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //Instantiate components
        titleLabel = new JLabel("Simple Banking App");
        balanceLabel = new JLabel("Balance: ");
        depositLabel = new JLabel("Deposit: ");
        withdrawalLabel = new JLabel("Withdrawal: ");
        balanceField = new JTextField(10);
        depositField = new JTextField(10);
        withdrawalField = new JTextField(10);
        depositButton = new JButton("Deposit");
        withdrawalButton = new JButton("Withdrawal");
        getBalanceButton = new JButton("Get Balance");
        clearButton = new JButton("Clear");

        //Add components to the window
        add(titleLabel);
        add(balanceLabel);
        add(balanceField);
        add(depositLabel);
        add(depositField);
        add(withdrawalLabel);
        add(withdrawalField);
        add(depositButton);
        add(withdrawalButton);
        add(getBalanceButton);
        add(clearButton);

        //Add action listeners
        depositButton.addActionListener(new DepositButtonListener());
        withdrawalButton.addActionListener(new WithdrawalButtonListener());
        getBalanceButton.addActionListener(new GetBalanceButtonListener());
        clearButton.addActionListener(new ClearButtonListener());
    }

    //ActionListener classes
    private class DepositButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Get deposit amount from text field
            double depositAmount = Double.parseDouble(depositField.getText());
            //Get current balance from text field
            double currentBalance = Double.parseDouble(balanceField.getText());
            //Add deposit amount to current balance
            double newBalance = currentBalance + depositAmount;
            //Set new balance in text field
            balanceField.setText(String.valueOf(newBalance));
        }
    }

    private class WithdrawalButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Get withdrawal amount from text field
            double withdrawalAmount = Double.parseDouble(withdrawalField.getText());
            //Get current balance from text field
            double currentBalance = Double.parseDouble(balanceField.getText());
            //Subtract withdrawal amount from current balance
            double newBalance = currentBalance - withdrawalAmount;
            //Set new balance in text field
            balanceField.setText(String.valueOf(newBalance));
        }
    }

    private class GetBalanceButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Get current balance from text field
            double currentBalance = Double.parseDouble(balanceField.getText());
            //Display current balance in message dialog
            JOptionPane.showMessageDialog(null, "Your current balance is: " + currentBalance);
        }
    }

    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Clear text fields
            balanceField.setText("");
            depositField.setText("");
            withdrawalField.setText("");
        }
    }

    public static void main(String[] args) {
        BankAppGUI bankingApp = new BankAppGUI();
        bankingApp.setVisible(true);
    }

}
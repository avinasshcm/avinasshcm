import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton SUBMIT;

    JPanel panel;

    JLabel userIDLabel, passwordLabel;

    final JTextField userID, password;

    String userName;

    String pwd;

    Login() {
        userIDLabel = new JLabel();
        userIDLabel.setText("Username:");
        userID = new JTextField(20);

        passwordLabel = new JLabel();
        passwordLabel.setText("Password:");
        password = new JPasswordField(20);

        SUBMIT = new JButton("SUBMIT");

        panel = new JPanel(new GridLayout(3, 1));
        panel.add(userIDLabel);
        panel.add(userID);
        panel.add(passwordLabel);
        panel.add(password);
        panel.add(SUBMIT);
        add(panel, BorderLayout.CENTER);
        SUBMIT.addActionListener(this);
        setTitle("LOGIN FORM");
    }

    public void actionPerformed(ActionEvent ae) {
        userName = userID.getText();
        pwd = password.getText();
        if (userName.equals("roseindia") && pwd.equals("roseindia")) {
            NextPage page = new NextPage();
            page.setVisible(true);
            JLabel label = new JLabel("Welcome:" + userName);
            page.getContentPane().add(label);
        } else {
            System.out.println("enter the valid username and password");
            JOptionPane.showMessageDialog(this, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
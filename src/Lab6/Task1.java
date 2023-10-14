package Lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JDialog {
    private JLabel loginLabel, passwordLabel;
    private JTextField loginField, passwordField;
    private JButton okButton, cancelButton;

    public Task1() {

        loginLabel = new JLabel("Логін:");
        passwordLabel = new JLabel("Пароль:");
        loginField = new JTextField(20);
        passwordField = new JPasswordField(20);
        okButton = new JButton("ОК");
        cancelButton = new JButton("Відміна");

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(loginLabel);
        panel.add(loginField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(okButton);
        panel.add(cancelButton);
        add(panel);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Task1 dialog = new Task1();
                dialog.setVisible(true);
            }
        });
    }
}


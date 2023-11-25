package Lab12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Lab12 extends JFrame {

    private int NumberOfPoints = 0;
    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new Lab12();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Lab12() {

        frame = new JFrame("Lab12");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        //#1
        JPanel window1 = new JPanel(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        centerPanel.add(new JLabel("Питання №1"));
        centerPanel.add(new JLabel("Назва дисципліни"));

        JRadioButton FirstARadioButton = new JRadioButton("Java");
        JRadioButton FirstBRadioButton = new JRadioButton("CTRL C + CTRL V");
        JRadioButton FirstCRadioButton = new JRadioButton("Chat GPT");

        ButtonGroup group = new ButtonGroup();
        group.add(FirstARadioButton);
        group.add(FirstBRadioButton);
        group.add(FirstCRadioButton);

        centerPanel.add(FirstARadioButton);
        centerPanel.add(FirstBRadioButton);
        centerPanel.add(FirstCRadioButton);

        window1.add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        JButton switchButton1 = new JButton("Далі");
        switchButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (FirstARadioButton.isSelected()) {
                    NumberOfPoints += 5;
                }
                else {
                    NumberOfPoints += 2;
                }
                cardLayout.show(cardPanel, "window2");
            }
        });
        bottomPanel.add(switchButton1);

        window1.add(bottomPanel, BorderLayout.SOUTH);

        //#2
        JPanel window2 = new JPanel(new BorderLayout());

        JPanel centerPanel2 = new JPanel();
        centerPanel2.setLayout(new BoxLayout(centerPanel2, BoxLayout.Y_AXIS));

        centerPanel2.add(new JLabel("Питання №2"));
        centerPanel2.add(new JLabel("ПІБ викладача"));

        JRadioButton SecondARadioButton = new JRadioButton("Chat GPT");
        JRadioButton SecondBRadioButton = new JRadioButton("Ватаманіца Едгар Вадимович");
        JRadioButton SecondCRadioButton = new JRadioButton("Забув");

        ButtonGroup SecondGroup = new ButtonGroup();
        SecondGroup.add(SecondARadioButton);
        SecondGroup.add(SecondBRadioButton);
        SecondGroup.add(SecondCRadioButton);

        centerPanel2.add(SecondARadioButton);
        centerPanel2.add(SecondBRadioButton);
        centerPanel2.add(SecondCRadioButton);

        window2.add(centerPanel2, BorderLayout.CENTER);

        JPanel bottomPanel2 = new JPanel();
        JButton switchButton2 = new JButton("Далі");
        switchButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (SecondBRadioButton.isSelected()) {
                    NumberOfPoints += 5;
                } else {
                    NumberOfPoints += 2;
                }
                cardLayout.show(cardPanel, "window3");
            }
        });
        bottomPanel2.add(switchButton2);

        window2.add(bottomPanel2, BorderLayout.SOUTH);


//#3
        JPanel window3 = new JPanel(new BorderLayout());

        JPanel centerPanel3 = new JPanel();
        centerPanel3.setLayout(new BoxLayout(centerPanel3, BoxLayout.Y_AXIS));

        centerPanel3.add(new JLabel("Питання №3"));
        centerPanel3.add(new JLabel("Староста групи"));

        JRadioButton ThirdARadioButton = new JRadioButton("Берляк");
        JRadioButton ThirdBRadioButton = new JRadioButton("Очкарик");
        JRadioButton ThirdCRadioButton = new JRadioButton("Якийсь утирок");

        ButtonGroup ThirdGroup = new ButtonGroup();
        ThirdGroup.add(ThirdARadioButton);
        ThirdGroup.add(ThirdBRadioButton);
        ThirdGroup.add(ThirdCRadioButton);

        centerPanel3.add(ThirdARadioButton);
        centerPanel3.add(ThirdBRadioButton);
        centerPanel3.add(ThirdCRadioButton);

        window3.add(centerPanel3, BorderLayout.CENTER);

        JPanel bottomPanel3 = new JPanel();
        JButton switchButton3 = new JButton("Далі");
        switchButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ThirdCRadioButton.isSelected()) {
                    NumberOfPoints += 5;
                } else {
                    NumberOfPoints += 2;
                }
                cardLayout.show(cardPanel, "window4");
            }
        });
        bottomPanel3.add(switchButton3);

        window3.add(bottomPanel3, BorderLayout.SOUTH);

//4
        JPanel window4 = new JPanel(new BorderLayout());

        JPanel centerPanel4 = new JPanel();
        centerPanel4.setLayout(new BoxLayout(centerPanel4, BoxLayout.Y_AXIS));

        centerPanel4.add(new JLabel("Тест пройдено"));
        JLabel pointsLabel = new JLabel("Кількість балів: " + NumberOfPoints);
        centerPanel4.add(pointsLabel);
        window4.add(centerPanel4, BorderLayout.CENTER);

        JPanel bottomPanel4 = new JPanel();
        JButton switchButton4 = new JButton("Забрати документи");
        switchButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Кількість балів: " + NumberOfPoints/3);
                frame.dispose();
            }
        });

        bottomPanel4.add(switchButton4);

        window4.add(bottomPanel4, BorderLayout.SOUTH);

        cardPanel.add(window1, "window1");
        cardPanel.add(window2, "window2");
        cardPanel.add(window3, "window3");
        cardPanel.add(window4, "window4");

        frame.getContentPane().add(cardPanel);

        frame.setSize(300, 180);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
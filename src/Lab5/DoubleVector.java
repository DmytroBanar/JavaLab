package Lab5;

import javax.swing.*;
import java.awt.*;

public class DoubleVector {
    public static void main(String[] args) {

        double[] vector = {1.0, 2.0, 3.0, 4.0, 5.0};


        JFrame frame = new JFrame("Task2 Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        int result1 = 10;
        double result2 = 20.3;
        String result3 = "Hello C++ developers";

        JLabel label1 = new JLabel("Vector: ");
        StringBuilder vectorText = new StringBuilder();
        for (double element : vector) {
            vectorText.append(element).append(" ");
        }
        label1.setText(label1.getText() + vectorText.toString());

        JLabel label2 = new JLabel("Result 1: " + result1);
        JLabel label3 = new JLabel("Result 2: " + result2);
        JLabel label4 = new JLabel("Result 3: " + result3);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);

        frame.setVisible(true);
    }
}

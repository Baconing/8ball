package ball;

import main.java.ball.Listeners.ButtonListener;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static JFrame frame = new JFrame("8 Ball");
    public static JMenuBar menuBar = new JMenuBar();
    public static JLabel text = new JLabel("8 Ball", SwingConstants.CENTER);
    public static Button button = new Button("Shake");
    public static void main(String[] args) {
        System.setProperty("apple.laf.useScreenMenuBar", "true");

        menuBar.setName("8 Ball");
        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(new Rectangle(1024, 720));

        text.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(text, BorderLayout.CENTER);

        button.setPreferredSize(new Dimension(100, 50));
        button.addActionListener(new ButtonListener());
        frame.getContentPane().add(button, BorderLayout.AFTER_LINE_ENDS);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}

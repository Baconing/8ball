package main.java.ball.Listeners;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.lang.Thread;

import ball.Main;

public class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Main.button.setEnabled(false);

        Main.text.setText("Processing...");
        Main.text.setForeground(new Color(0, 0, 0));
        Main.text.paintImmediately(Main.text.getVisibleRect());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException err) {
            err.printStackTrace();
        }

        ArrayList<String> goodResponses = new ArrayList<String>(Arrays.asList("It is certain.", "It is decidedly so.", "Without a doubt.", "Yes definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes."));
        ArrayList<String> unknownResponses = new ArrayList<String>(Arrays.asList("Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again."));
        ArrayList<String> badResponses = new ArrayList<String>(Arrays.asList("Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."));

        int responseType = new Random().nextInt(1, 4);
        System.out.println(responseType);

        Random response = new Random();

        switch(responseType) {
            case 1:
                // Good
                Main.text.setText(goodResponses.get(response.nextInt(goodResponses.size())));
                Main.text.setForeground(new Color(0, 150, 0));
                break;
            case 2:
                // Unknown
                Main.text.setText(unknownResponses.get(response.nextInt(unknownResponses.size())));
                Main.text.setForeground(new Color(150, 150, 150));
                Main.text.paintImmediately(Main.text.getVisibleRect());
                break;
            case 3:
                // Bad
                Main.text.setText(badResponses.get(response.nextInt(badResponses.size())));
                Main.text.setForeground(new Color(200, 0, 0));
                Main.text.paintImmediately(Main.text.getVisibleRect());
                break;
            default:
                System.out.println("????");
        }

        Main.text.paintImmediately(Main.text.getVisibleRect());
        Main.button.setEnabled(true);
    }
}

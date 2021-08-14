package Chapter14.YouDoIt;

import javax.swing.*;
import java.awt.*;

public class JFrame4 {
    public static void main(String[] args) {
        final int FRAME_WIDTH = 600;
        final int FRAME_HEIGHT = 250;

        Font headlineFont = new Font("Arial", Font.BOLD, 36);
        Font textBodyFont = headlineFont.deriveFont(Font.PLAIN, 14);
        JFrame aFrame = new JFrame("Fourth Frame");
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greeting = new JLabel("Greeting");
        greeting.setFont(headlineFont); // new font applied to greeting
        aFrame.add(greeting);
    }
}

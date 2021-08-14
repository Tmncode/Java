package Chapter14.YouDoIt;

import javax.swing.*;
import java.awt.*;

public class JFrame6 {
    public static void main(String[] args) {
        final int FRAME_WIDTH = 600;
        final int FRAME_HEIGHT = 300;
        JFrame aFrame = new JFrame("Sixth Frame");
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greeting = new JLabel("Hello,");
        JLabel greeting2 = new JLabel("Who are you?");
        aFrame.setLayout(new FlowLayout()); // The layout manager allows multiple components in the JFrame to be visible
        aFrame.add(greeting);
        aFrame.add(greeting2);
    }
}

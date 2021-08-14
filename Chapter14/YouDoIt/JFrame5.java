package Chapter14.YouDoIt;

import javax.swing.*;
import java.awt.*;

public class JFrame5 {
    public static void main(String[] args) {
        final int FRAME_WIDTH = 450;
        final int FRAME_HEIGHT = 250;

        JFrame aFrame = new JFrame("Fifth Frame");
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greeting = new JLabel("Hello");
        JLabel greeting2 = new JLabel("Who are you?");
        aFrame.add(greeting);
        aFrame.add(greeting2);
    }
}

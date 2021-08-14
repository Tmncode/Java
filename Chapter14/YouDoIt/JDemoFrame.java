package Chapter14.YouDoIt;
// Open a new file, and type the following statement to import the javax.swing classes:
import javax.swing.*;

import java.awt.*;

// On the next lines, type the following class header for the JDemoFrame class, its opening curly brace,
// the main() method header, and its opening curly brace:

public class JDemoFrame {
    public static void main(String[] args) {
        // Within the body of the main() method, enter the following code to declare a JFrame with a title,
        // set its size, and make it visible.
        // If you neglect to set a JFrame’s size, you see only the title bar of the JFrame
        // (because the size is 0 × 0 by default); if you neglect to make the JFrame visible,
        // you do not see anything.
        // Add two closing curly braces—one for the main() method and one for the JDemoFrame class.

        JFrame aFrame = new JFrame("This is a Frame");

        Font headLineFont = new Font("Monospaced", Font.BOLD, 36);
        final int WIDTH = 600;
        final int HEIGHT = 350;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel greeting = new JLabel("Good day");

        // The counterpart to the add() method is the remove() method.
        // The following statement removes greeting from aFrame:
        aFrame.add(greeting);
        //aFrame.remove(greeting);

        greeting.setText("How you doing?");
        greeting.setFont(headLineFont);

        // Save the file as JDemoFrame.java.
        //
        // Compile and then run the program.
        //
        // The output looks like Figure 14-6—an empty JFrame with a title bar,
        // a little wider than it is tall.
        //
        // The JFrame has all the properties of frames you have seen in applications you have used.
        //
        // For example, click the JFrame’s Minimize button,
        // and the JFrame minimizes to an icon on the Windows taskbar.
    }
}

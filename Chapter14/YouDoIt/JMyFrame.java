package Chapter14.YouDoIt;

import javax.swing.*;

public class JMyFrame extends JFrame{
    final int WIDTH = 425;
    final int HEIGHT = 200;
    public JMyFrame(){
        super("My frame");
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

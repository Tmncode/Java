package Chapter14.YouDoIt;
import Chapter14.YouDoIt.JFrameWithManyComponents;

public class CreateJFrameWithComponents {
    public static void main(String[] args) {
        JFrameWithManyComponents aFrame = new JFrameWithManyComponents();
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 100;
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
    }
}

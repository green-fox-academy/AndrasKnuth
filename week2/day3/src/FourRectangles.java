import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        int max = 150;
        int min = 1;
        int range = max - min + 1;
        int n = 4;
        for (int i = 0; i < n; i++) {
            int rand = (int) (Math.random() * range) + min;
            int rand2 = (int) (Math.random() * range) + min;
            Color randomColor = new Color(rand, rand2, rand);
            graphics.setColor(randomColor);
            graphics.fillRect(rand, rand2, rand, rand);
        }
        // draw four different size and color rectangles.
        // avoid code duplication.


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

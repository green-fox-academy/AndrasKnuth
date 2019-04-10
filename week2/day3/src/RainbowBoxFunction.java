import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        for(int i = 0; i < 10; i++){
            int max = 256;
            int min = 1;
            int range = max - min + 1;
            int rand = (int) (Math.random() * range) + min;
            int rand2 = (int) (Math.random() * range) + min;
            int rand3 = (int) (Math.random() * range) + min;
            Color randomColor = new Color(rand, rand2, rand3);
            graphics.setColor(randomColor);
            square(graphics);
        }
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.



    }
    public static void square(Graphics graphics){
        int size = 10;
        int max = 256;
        int min = 1;
        int range = max - min + 1;
        for (int j = 0; j < 100; j++) {
            int rand = (int) (Math.random() * range) + min;
            int rand2 = (int) (Math.random() * range) + min;
            graphics.fillRect(rand, rand2, size, size);
        }

    }

    // Don't touch the code below
    static int WIDTH = 620;
    static int HEIGHT = 620;

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

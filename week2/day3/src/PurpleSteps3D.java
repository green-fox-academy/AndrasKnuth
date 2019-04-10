import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {
        int x = 10;
        int y = 10;
        int size = 10;
        Color purple = new Color(128, 0, 128);
        for (int i = 1; i < 6; i++){
            graphics.setColor(purple);
            graphics.fillRect(x, y, size, size);
            x = x*2;
            y = y*2;
            size = size*2;
        }
        int a = 10;
        int b = 10;
        int size1 = 10;
        for (int i = 1; i < 6; i++){
            graphics.drawRect(a, b, size1, size1);
            a = a*2;
            b = b*2;
            size1 = size1*2;
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
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.blue);
        graphics.fillRect(30, 30 , 50 , 50);
        graphics.setColor(Color.red);
        graphics.drawLine(30, 30, 80, 30);
        graphics.setColor(Color.green);
        graphics.drawLine(80, 30, 80, 80);
        graphics.setColor(Color.pink);
        graphics.drawLine(80, 80, 30, 80);
        graphics.setColor(Color.yellow);
        graphics.drawLine(30, 80, 30, 30);
        // Draw a box that has different colored lines on each edge.



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

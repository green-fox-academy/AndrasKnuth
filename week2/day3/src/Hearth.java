import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import javax.swing.*;
        import java.awt.*;
        import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Hearth {
    public static void mainDraw(Graphics graphics) {
        // graphics.setColor();
        // graphics.fillRect(0, 0, 640, 640);
        graphics.setColor(Color.pink);
        line(graphics, 50, 50);

    }

    public static void line(Graphics graphics, int x, int y) {
        graphics.drawArc(x, y, 50, 50, 25, 25);
    }
    // Create a line drawing function that takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    // Don't touch this...
    static int WIDTH = 640;
    static int HEIGHT = 640;

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

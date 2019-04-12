import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        graphics.fillRect(0, 0, 640, 640);
        graphics.setColor(Color.yellow);
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 32; j++) {
                line(graphics, 20 * j, 0);
                line(graphics, 0, 20 * j);
            }

        }
    }

    public static void line(Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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

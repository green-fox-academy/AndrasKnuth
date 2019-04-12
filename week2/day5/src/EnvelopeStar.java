import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class EnvelopeStar {
    public static void draw1(Graphics graphics) {
        graphics.setColor(Color.blue);
        int x = WIDTH/16;
        int y = 10;
        int x1 = WIDTH-10;
        int y1 = HEIGHT/16;
        for (int i = 0; i < WIDTH/16; i++) {
            if (x < WIDTH && y1 < HEIGHT) {
                graphics.drawLine(x, y, x1, y1);
                x += WIDTH / 16;
                y1 += HEIGHT / 16;
            }
        }
    }
    public static void draw2(Graphics graphics) {
        graphics.setColor(Color.red);
        int x = 10;
        int y = HEIGHT/16;
        int x1 = WIDTH/16;
        int y1 = HEIGHT-10;
        for (int i = 0; i < WIDTH/16; i++) {
            if (x1 < WIDTH && y < HEIGHT) {
                graphics.drawLine(x, y, x1, y1);
                x1 += WIDTH / 16;
                y += HEIGHT / 16;
            }
        }
    }

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
            draw1(graphics);
            draw2(graphics);
        }
    }
}

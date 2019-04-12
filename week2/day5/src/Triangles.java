import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int z2 = 10;
        int y2 = 100;
        int b2 = 100;
            for (int z = z2; z > 0; z--) {
                int y = y2;
                int b = b2;
                int x = 320;
                int a = 320;

                for (int j = 20; j > 0; j--) {
                    if (y < 300) {
                        graphics.drawLine(x, y, x - 10, y + 10);
                        graphics.drawLine(x - 10, y + 10, x + 10, y + 10);
                        graphics.drawLine(x + 10, y + 10, x, y);
                        x -= 10;
                        y += 10;
                    }
                }
                for (int i = 20; i > 0; i--) {
                    if (b < 300) {
                        graphics.drawLine(a, b, a + 10, b + 10);
                        graphics.drawLine(a + 10, b + 10, a - 10, b + 10);
                        graphics.drawLine(a - 10, b + 10, a, b);
                        a += 10;
                        b += 10;
                    }
                }
                y2 += 20;
                b2 += 20;
                z2--;
            }
        }

    // Don't touch the code below
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

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        int x = 10;
        int y = 10;
        int xpoints[] = {x, x+10, x+10, x, x};
        int ypoints[] = {y, y, y+10, y+10, 3y};
        int npoints = 5;
        graphics.drawPolygon(xpoints, ypoints, npoints);
        Color purple = new Color(128, 0, 128);
       for (int i = 1; i < 20; i++){
           graphics.setColor(purple);
           graphics.fillRect(x, y, 10, 10);

           x += 10;
           y += 10;
       }




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
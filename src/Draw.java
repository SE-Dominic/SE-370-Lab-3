import jdk.jfr.Unsigned;

import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {

    int x, y, width, height;
    public Draw(int x, int y, int width, int height) {
        /*this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        */
         this.setBounds(x, y, width, height);
         this.setVisible(true);
    }

    void setX(int x) {this.x = x;}

    void setY(int y) {this.y = y;}

    void setWidth(int width) {this.width = width;}

    void setHeight(int height) {this.height = height;}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBars(g);
    }

    private void drawBars(final Graphics g) {
        int outerMargin = 20;
        int width = 100;
        int height = 200;

    }
//        super.paintComponent(g);
//        g.setColor(Color.RED);
//        Unsigned x1, x2, y1, y2;
//        g.drawLine(100, 0, 100, 800);


}



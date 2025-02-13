import jdk.jfr.Unsigned;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

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
    void drawLines (Graphics g) {
        Graphics2D line = (Graphics2D) g;
        line.drawLine(x, y, 3, 3);
    }
    void setX(int x) {this.x = x;}

    void setY(int y) {this.y = y;}

    void setWidth(int width) {this.width = width;}

    void setHeight(int height) {this.height = height;}

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }


}



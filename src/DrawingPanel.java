import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Random;

class DrawingPanel extends JPanel {
    private static final int BUFFER = 40; //padding around grid
    private final ArrayList<Line2D.Double> lines;
    private final ArrayList<Color> colors;
    private final Random random;

    public DrawingPanel() {
        random = new Random();
        lines = new ArrayList<>();
        colors = new ArrayList<>();
    }

    public void redraw() {
        generateRandomLines();
        repaint();
    }

    private void generateRandomLines() {
        lines.clear();
        colors.clear();

        int width = getWidth();
        int height = getHeight();
        int xOffset = 25; //small x adjustment from grid sides
        int yOffset = -5; //small y adjustment from grid bottom

        if (width <= 2*BUFFER || height <= 2*BUFFER) return;

        //height and width of acceptable area to draw lines
        int adjustedWidth = width - 2*BUFFER - (2 * xOffset); // (window width) - (both buffers) - (offset for both sides)
        int adjustedHeight = height - 2*BUFFER; // (window height) - (both buffer sides)

        //draws 12 lines
        int NUMBER_OF_LINES = 12;
        for (int i = 0; i < NUMBER_OF_LINES; i++) {
            //calculate x position within buffered area
            double x = BUFFER + xOffset + ((double) adjustedWidth / (NUMBER_OF_LINES - 1)) * i;

            //start at bottom of grid area (y = height - BUFFER + yOffset)
            double yStart = height - BUFFER + yOffset;

            //random height within the grid area
            double yEnd = BUFFER + adjustedHeight * (0.1 + random.nextDouble() * 0.9);

            lines.add(new Line2D.Double(x, yStart, x, yEnd)); //draw line
            colors.add(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256))); //random color
        }
    }

    //need to modify this method to use it in our JPanel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //draw grid within panel
        g2d.setColor(Color.LIGHT_GRAY);
        int width = getWidth();
        int height = getHeight();
        int adjustedWidth = width - 2*BUFFER;
        int adjustedHeight = height - 2*BUFFER;

        //vertical grid lines
        for (int i = 0; i <= 10; i++) {
            int x = BUFFER + (i * adjustedWidth) / 10;
            g2d.drawLine(x, BUFFER, x, height - BUFFER);
        }

        //horizontal grid lines
        for (int i = 0; i <= 10; i++) {
            int y = BUFFER + (i * adjustedHeight) / 10;
            g2d.drawLine(BUFFER, y, width - BUFFER, y);
        }

        //vertical lines
        g2d.setStroke(new BasicStroke(10f));
        for (int i = 0; i < lines.size(); i++) {
            g2d.setColor(colors.get(i));
            g2d.draw(lines.get(i));
        }

        //if lines list is empty make new ones
        if (lines.isEmpty()) {
            generateRandomLines();
            repaint();
        }
    }
}
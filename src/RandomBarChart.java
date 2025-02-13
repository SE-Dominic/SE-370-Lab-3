import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Random;

public class RandomBarChart extends JFrame {
    private DrawingPanel drawingPanel;

    public RandomBarChart() {
        setTitle("Random Bar Chart");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);

        JButton redrawButton = new JButton("Redraw");

        int buttonHeight = redrawButton.getPreferredSize().height;
        redrawButton.setBorder(BorderFactory.createEmptyBorder(buttonHeight/2, 0, buttonHeight/2, 0));

        redrawButton.addActionListener(e -> drawingPanel.redraw());
        add(redrawButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RandomBarChart().setVisible(true);
        });
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Random;

public class RandomBarChart extends JFrame {
    private DrawingPanel drawingPanel;

    public RandomBarChart() {
        //window handling
        setTitle("Random Bar Chart");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //main panel that has the grid
        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);

        //the button for redrawing
        JButton redrawButton = new JButton("Redraw");

        //basically change the size of the button by adding buffers around the button text
        int buttonHeight = redrawButton.getPreferredSize().height;
        redrawButton.setBorder(BorderFactory.createEmptyBorder(buttonHeight/2, 0, buttonHeight/2, 0));
        redrawButton.setFocusPainted(false); //remove black line around text

        //button action -> call redraw() to redraw the random lines
        redrawButton.addActionListener(e -> drawingPanel.redraw());


        add(redrawButton, BorderLayout.SOUTH);
    }


    public static void main(String[] args) {
        //this invokeLater is for thread safety?
        //i have no fuckin clue tbh the tutorial told me to put it
        SwingUtilities.invokeLater(() -> {
            new RandomBarChart().setVisible(true); //initialize window
        });
    }
}
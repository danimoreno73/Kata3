package software.ulpgc.kata3;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JFreeChartBarChartDisplay barChartDisplay;

    public MainFrame() throws HeadlessException {
        this.setTitle("Chart Viewer");
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createBarChartDisplay());
    }

    private Component createBarChartDisplay() {

        JFreeChartBarChartDisplay display = new JFreeChartBarChartDisplay();
        this.barChartDisplay = display;
        return display;
    }

    public BarChartDisplay barChartDisplay(){return barChartDisplay;}
}

package software.ulpgc.kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.util.Map;

public class JFreeChartBarChartDisplay extends JPanel implements BarChartDisplay {
    @Override
    public void show(Map<String, Integer> dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "BarChart",
                "Frequency",
                "Total",
                barChartDataset(dataset),
                PlotOrientation.VERTICAL,
                false, false, false
        );
        add(new ChartPanel(chart));
    }

    private CategoryDataset barChartDataset(Map<String, Integer> provider) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Map.Entry<String, Integer> entry : provider.entrySet()){
            dataset.addValue(entry.getValue(),"Frequency", entry.getKey());
        }
        return dataset;
    }
}

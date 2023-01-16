import de.bencoepp.asciichart.chart.LineChart;
import de.bencoepp.asciichart.data.LineElement;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChartTest {

    @Test
    void testLineChartPrint(){
        LineChart lineChart = new LineChart();
        lineChart.setTitle("A Test Line Chart");
        lineChart.setDescription("Some description for the Test Line Chart");
        ArrayList<LineElement> lineElements = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            LineElement lineElement = new LineElement();
            lineElement.setTitle("Element " + i);
            lineElement.setValue(ThreadLocalRandom.current().nextLong(100));
            lineElements.add(lineElement);
        }

        //Print Chart to console
        lineChart.print();
        assertTrue(true);
    }

}

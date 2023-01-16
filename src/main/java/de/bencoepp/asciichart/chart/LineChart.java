package de.bencoepp.asciichart.chart;

import de.bencoepp.asciichart.data.LineElement;

import java.util.ArrayList;

public class LineChart extends Chart{
    private ArrayList<LineElement> data;

    @Override
    public void print() {

    }

    public ArrayList<LineElement> getData() {
        return data;
    }

    public void setData(ArrayList<LineElement> data) {
        this.data = data;
    }
}

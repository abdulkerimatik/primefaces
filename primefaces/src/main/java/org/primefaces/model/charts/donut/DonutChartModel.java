/*
 * The MIT License
 *
 * Copyright (c) 2009-2023 PrimeTek Informatics
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.primefaces.model.charts.donut;

import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.ChartModel;

/**
 * Defines the donut model used to create donut chart component.
 */
public class DonutChartModel extends ChartModel {

    private static final long serialVersionUID = 1L;

    private ChartData data;
    private DonutChartOptions options;

    public DonutChartModel() { }

    public DonutChartModel(ChartData data, DonutChartOptions options) {
        this.data = data;
        this.options = options;
    }

    /**
     * Gets the type
     *
     * @return type of current chart
     */
    @Override
    public String getType() {
        return "doughnut";
    }

    /**
     * Gets the data to create dataSets
     *
     * @return data
     */
    @Override
    public ChartData getData() {
        return data;
    }

    /**
     * Sets the data to create dataSets
     *
     * @param data The {@link ChartData} object
     */
    public void setData(ChartData data) {
        this.data = data;
    }

    /**
     * Gets the configuration options
     *
     * @return options
     */
    @Override
    public DonutChartOptions getOptions() {
        return options;
    }

    /**
     * Sets the configuration options
     *
     * @param options The {@link DonutChartOptions} object
     */
    public void setOptions(DonutChartOptions options) {
        this.options = options;
    }
}

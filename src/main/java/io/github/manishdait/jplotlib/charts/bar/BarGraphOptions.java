/*
 * MIT License
 * 
 * Copyright (c) 2023 Manish Dait
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.manishdait.jplotlib.charts.bar;

/**
 * The BarGraphOptions interface provides methods for creating vertical (bar)
 * and horizontal (barh) bar graphs
 * within the JPlotLib library.
 * 
 */
public interface BarGraphOptions {
    /**
     * Create a vertical bar graph.
     *
     * @param labels
     *            Array of labels or categories for the bars.
     * @param points
     *            Array of numerical data points corresponding to the labels.
     * @return BarGraph representing the vertical bar graph.
     */
    BarGraph bar(String[] labels, double[] points);

    /**
     * Create a horizontal bar graph.
     *
     * @param labels
     *            Array of labels or categories for the bars.
     * @param points
     *            Array of numerical data points corresponding to the labels.
     * @return BarGraph representing the horizontal bar graph.
     */
    BarGraph barh(String[] labels, double[] points);

}

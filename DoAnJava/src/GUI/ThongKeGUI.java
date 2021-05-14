/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CONTROLLER.ThongKeDao;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import model.ThongKe;
import org.apache.poi.hssf.record.chart.DefaultDataLabelTextPropertiesRecord;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author CHINH
 */
public class ThongKeGUI {
    public void showDBThongKe(JPanel jpnItem){
        List<ThongKe> listItem = new ThongKeDao().getlistThongKe();
        if (listItem!=null){
            DefaultCategoryDataset DataSet= new DefaultCategoryDataset();
            for (ThongKe item :listItem){
                DataSet.addValue(item.getSoLuong(),"Hóa Đơn", item.getNgayLapHD());
            }
            JFreeChart chart =ChartFactory.createBarChart("Thống kê số lượng hóa đơn","Thời gian", "Số lượng", DataSet, PlotOrientation.HORIZONTAL, true, true, true);
            ChartPanel chartPanel=new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));
            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
        }
    }
}

package com.epam.task03;


import javax.swing.*;
import java.awt.*;

/**
 * Created by vrama on 28.02.2016.
 */
public class Logic {

    private static Object[][] data;

    public Logic() {
    }

    private static void printData(Object[][] dat){
        Object[] columnNames = {"Step", "Function"};
        JTable table = new JTable(dat, columnNames);
        JFrame jfrm = new JFrame("DataTable");

        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(300, 170);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JScrollPane jscrlp = new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        jfrm.getContentPane().add(jscrlp);
        jfrm.setVisible(true);
    }

    protected static void tanFunction(double arraySize, double a, double b, double h) {
            double[] step = new double[(int)arraySize];
            data = new Object[(int)arraySize][2];

            int st = 0;

                for (double i = a; i < b; i += h, st++) {

                    data[st][0] = i + "";
                    data[st][1] = Math.tan(2*i) - 3 + "";
                }

        printData(data);
    }
}

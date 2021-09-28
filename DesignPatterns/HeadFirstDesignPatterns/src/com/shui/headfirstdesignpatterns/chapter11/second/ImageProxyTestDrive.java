package com.shui.headfirstdesignpatterns.chapter11.second;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 15:15.
 */
public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public static void main(String[] args) {
        try {
            ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ImageProxyTestDrive() throws Exception {
        cds.put("Ambient: Music for Airports", "http://image.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("Ima", "http://image.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("Buddha Bar", "http://image.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("Karma", "http://image.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("MCMXC A.D.", "http://image.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("Northern Exposure", "http://image.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("Selected Ambient Works, Vol. 2", "http://image.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("oliver", "http://image.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");

        URL initialURL = new URL((String) cds.get("Selected Ambient Works, Vol. 2"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration e = cds.keys(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        // 建立框架和菜单
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    private URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

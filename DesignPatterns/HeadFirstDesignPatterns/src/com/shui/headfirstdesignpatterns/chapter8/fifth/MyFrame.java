package com.shui.headfirstdesignpatterns.chapter8.fifth;

import javax.swing.*;
import java.awt.*;

/**
 * @author shui.
 * @date 2021/8/16.
 * @time 16:48.
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule!!";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}

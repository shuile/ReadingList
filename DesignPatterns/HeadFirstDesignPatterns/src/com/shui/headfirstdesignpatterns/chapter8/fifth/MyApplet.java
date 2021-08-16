package com.shui.headfirstdesignpatterns.chapter8.fifth;

import java.applet.Applet;
import java.awt.*;

/**
 * @author shui.
 * @date 2021/8/16.
 * @time 16:53.
 */
public class MyApplet extends Applet {
    String message;

    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    public void destroy() {
//        message = "Applet destroying...";
//        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}

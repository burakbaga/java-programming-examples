package com.burak.swingornegi;

import javax.swing.*;

public class Pencere {

    private JFrame frame;

    public Pencere() {
        frame = new JFrame();

        JButton button = new JButton("Tıkla");

        frame.add(button);
        frame.setSize(400, 500);

        frame.setLayout(null);

        frame.setVisible(true);

    }

}

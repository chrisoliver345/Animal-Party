package com.chriscj.animalparty;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class Window extends Canvas {
    @Serial
    private static final long serialVersionUID = -1241309228985760786L;
    public static JFrame frame;

    public Window(int width, int height, String title, AnimalParty party) {
        frame = new JFrame(title);

        Dimension bounds = new Dimension(width, height);

//        frame.setPreferredSize(bounds);
        frame.setMaximumSize(bounds);
        frame.setMinimumSize(bounds);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(party);
        frame.setVisible(true);

        party.start();
    }
}

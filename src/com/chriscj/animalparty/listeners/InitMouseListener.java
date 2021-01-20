package com.chriscj.animalparty.listeners;

import com.chriscj.animalparty.Handler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.chriscj.animalparty.util.Util.mouseOver;

public class InitMouseListener extends MouseAdapter {


    private final Handler handler;

    public InitMouseListener(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
    }
}

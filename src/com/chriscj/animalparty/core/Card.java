package com.chriscj.animalparty.core;

import com.chriscj.animalparty.AnimalParty;
import com.chriscj.animalparty.GameObject;
import com.chriscj.animalparty.ID;
import com.chriscj.animalparty.util.Util;

import java.awt.*;
import java.awt.event.MouseEvent;

import static com.chriscj.animalparty.util.Util.getMousePosition;
import static com.chriscj.animalparty.util.Util.mouseOver;

public class Card extends GameObject {
    private boolean state = false;

    public Card(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        x = Util.clamp(x, 0, AnimalParty.WIDTH - 38);
        y = Util.clamp(y, 0, AnimalParty.HEIGHT - 67);

        Point p = getMousePosition();
        state = mouseOver(p.x, p.y, x, y, 32, 32);
    }

    @Override
    public void render(Graphics g) {
        g.fillRect(x, y, 32, 32);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }
}

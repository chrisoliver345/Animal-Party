package com.chriscj.animalparty.init;

import com.chriscj.animalparty.Handler;
import com.chriscj.animalparty.ID;
import com.chriscj.animalparty.core.Card;

import java.awt.*;

import static com.chriscj.animalparty.AnimalParty.HEIGHT;
import static com.chriscj.animalparty.AnimalParty.WIDTH;

public class InitializeObjects {
    public InitializeObjects(Handler handler) {
        handler.addObject(new Card(WIDTH/2 - 32, HEIGHT/2 - 32, ID.Player));
    }
}

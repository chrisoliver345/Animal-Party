package com.chriscj.animalparty;

import com.chriscj.animalparty.core.Animal;
import com.chriscj.animalparty.init.InitializeObjects;
import com.chriscj.animalparty.listeners.InitMouseListener;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.io.Serial;

public class AnimalParty extends Canvas implements Runnable{
    @Serial
    private static final long serialVersionUID = 4029859779177463247L;

    public static final int WIDTH = 640;
    public static final int HEIGHT = WIDTH / 12 * 9;

    private Thread thread;
    private boolean running = false;

    private Handler handler;

    public AnimalParty() {
        handler = new Handler();

//        this.addKeyListener(new KeyInput(handler));


        new InitializeObjects(handler);
        this.addMouseListener(new InitMouseListener(handler));

        new Window(WIDTH, HEIGHT, "Animal Party", this);

    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta --;
            }
            if (running) {
                render();
            }
            frames ++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
        stop();
    }

    private void tick() {
        handler.tick();
//        hud.tick();
    }

    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        handler.render(g);
//        hud.render(g);

        g.dispose();
        bs.show();
    }

    public static void main(String[] args) {
        Animal cj = new Animal("CJ", "Amphibian", "Toad", "Female");
        Animal chris = new Animal("Chris", "Mammal", "Owl", "Male");

        System.out.println("CJ is a " + cj.getSpecies());
        System.out.println("Chris is a " + chris.getSpecies());


        new AnimalParty();
    }
}

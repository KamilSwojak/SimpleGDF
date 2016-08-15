package com.kamil.game.main;

import resources.Resources;

import javax.swing.*;

public class GameMain {
    public static final String GAME_TITLE = "Java Game Development Framework";
    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 450;

    public static Game sGame;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        sGame = new Game(GAME_WIDTH, GAME_HEIGHT);

        frame.add(sGame);
        frame.pack();

        frame.setVisible(true);
        frame.setIconImage(Resources.iconImage);


    }

}

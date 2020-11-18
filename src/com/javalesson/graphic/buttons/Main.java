package com.javalesson.graphic.buttons;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame("Тест кнопок");

        MyJPane pane = new MyJPane();

        frame.setContentPane(pane);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

package com.javalesson.graphic.buttons;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MyJPane extends JPanel {

    public MyJPane() throws IOException {
        super();

        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(new GridBagLayout());


        JPanel externalPanelThree = new JPanel();
        externalPanelThree.setPreferredSize(new Dimension(200, 80));
        externalPanelThree.setBackground(Color.green);
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 2;

        JCheckBox one = new JCheckBox("1", false);
        one.setActionCommand("one");
        JCheckBox two = new JCheckBox("2", false);
        two.setActionCommand("two");

        ButtonGroup group = new ButtonGroup();
        group.add(two);
        group.add(one);

        TextField field = new TextField(10);
        JButton bt = new JButton("test");
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // int x = Integer.parseInt(field.getText());
                if (group.getSelection().getActionCommand().equals("one")) {
                    field.setText("one");
                }

                if (one.isSelected()) {
                }

                if (two.isSelected()) {
                    field.setText("two");
                }
                System.out.println("dfssdf" + " ");
            }
        });


        externalPanelThree.add(field);
        externalPanelThree.add(bt);
        externalPanelThree.add(one);
        externalPanelThree.add(two);


        add(externalPanelThree, constraints);

        JPanel externalPanelOne = new JPanel();

        externalPanelOne.setLayout(new FlowLayout());
        externalPanelOne.setPreferredSize(new Dimension(120, 90));
        JToggleButton buttonOne = new JToggleButton("кнопка-рычаг", false);

        Image img = ImageIO.read(new File("src\\com\\javalesson\\graphic\\buttons\\sticker.png"));
        img = img.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        buttonOne.setIcon(new ImageIcon(img));
        buttonOne.setMargin(new Insets(5, 8, 5, 8));

        buttonOne.setHorizontalAlignment(SwingConstants.RIGHT);
        buttonOne.setIconTextGap(12);
        buttonOne.setPreferredSize(new Dimension(110, 20));
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                buttonOne.setText((buttonOne.isSelected()) ? "Нажата" : "Отжата");

            }
        });


        JRadioButton buttonTwo = new JRadioButton("кнопка-флаг");
        buttonTwo.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (buttonTwo.isSelected()) buttonTwo.setText("sdsad");
            }
        });


        buttonTwo.setMnemonic('G');
        externalPanelOne.add(buttonOne, BoxLayout.X_AXIS);
        externalPanelOne.add(buttonTwo, BoxLayout.X_AXIS);
        externalPanelOne.setBorder(BorderFactory.createTitledBorder("Кнопочки"));
        constraints.ipadx = 0;
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        add(externalPanelOne, constraints);


        JPanel externalPanelTwo = new JPanel();
        externalPanelTwo.setLayout(new FlowLayout(FlowLayout.LEFT));
        externalPanelTwo.setPreferredSize(new Dimension(120, 150));
        externalPanelTwo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 4, true));
        ButtonGroup buttonGroup = new ButtonGroup();


        JCheckBox checkBoxOne = new JCheckBox("первый", false);
        JCheckBox checkBoxTwo = new JCheckBox("второй", true);
        JCheckBox checkBoxThree = new JCheckBox("третий", false);
        JCheckBox checkBoxFour = new JCheckBox("четвертый", false);
        buttonGroup.add(checkBoxOne);
        buttonGroup.add(checkBoxTwo);
        buttonGroup.add(checkBoxThree);
        buttonGroup.add(checkBoxFour);
        externalPanelTwo.add(checkBoxOne);
        externalPanelTwo.add(checkBoxTwo);
        externalPanelTwo.add(checkBoxThree);
        externalPanelTwo.add(checkBoxFour);


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажато");
            }
        };


        buttonGroup.getSelection().addActionListener(listener);

        constraints.weighty = 1;
        constraints.gridy = 1;
        constraints.gridx = 1;
        constraints.gridheight = 1;
        add(externalPanelTwo, constraints);


    }


}

package KINGDOM;

import javax.swing.*;
import java.awt.*;

public class UI {

    JFrame window;
    JPanel titleNamePanel, startButtonePanel;
    JPanel mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLable;
    JLabel hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel,goldLable,goldNumberLable;
    JButton startButton, choice1, choice2,choice3,choice4;
    JTextArea mainTextArea;

    Font titleFont = new Font("Times New Roman", Font.PLAIN,90);
    Font normalfont = new Font("Times New Roman", Font.PLAIN,26);

    public void creatUI(Game.ChoiceHandler cHandler){

        //Window
        window = new JFrame();
        window.setSize(1000, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);


        //Title Screen
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(200 ,100,600,500);
        titleNamePanel.setBackground(Color.BLACK);
        titleNameLable = new JLabel("The Deliverance");
        titleNameLable.setForeground(Color.white);
        titleNameLable.setFont(titleFont);
        titleNamePanel.add(titleNameLable);

        startButtonePanel = new JPanel();
        startButtonePanel.setBounds(400,400,200,100);
        startButtonePanel.setBackground(Color.white);
        startButton = new JButton("START");
        startButton.setBackground(Color.WHITE);
        startButton.setFont(normalfont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("start");
        startButtonePanel.add(startButton);

        window.add(titleNamePanel);
        window.add(startButtonePanel);

        //Game Screen
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        //Text box
        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(100, 100, 600 , 250);
        mainTextArea.setBackground(Color.darkGray);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalfont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        //Choices
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350 ,300 ,150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        window.add(choiceButtonPanel);

        choice1 = new JButton(" ");
        choice1.setBackground(Color.darkGray);
        choice1.setForeground(Color.white);
        choice1.setFont(normalfont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);
        choice2 = new JButton(" ");
        choice2.setBackground(Color.darkGray);
        choice2.setForeground(Color.white);
        choice2.setFont(normalfont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        choice3 = new JButton(" ");
        choice3.setBackground(Color.darkGray);
        choice3.setForeground(Color.white);
        choice3.setFont(normalfont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
        choice4 = new JButton(" ");
        choice4.setBackground(Color.darkGray);
        choice4.setForeground(Color.white);
        choice4.setFont(normalfont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        //Player Status
        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,900,50);
        playerPanel.setBackground(Color.darkGray);
        playerPanel.setLayout(new GridLayout(1,4));
        window.add(playerPanel);

        //HP
        hpLabel = new JLabel("HP:");
        hpLabel.setFont(normalfont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);

        hpNumberLabel = new JLabel();
        hpNumberLabel.setForeground(Color.white);
        hpNumberLabel.setFont(normalfont);
        playerPanel.add(hpNumberLabel);

        //Weapon
        weaponLabel = new JLabel("WEAPON:");
        weaponLabel.setForeground(Color.white);
        weaponLabel.setFont(normalfont);
        playerPanel.add(weaponLabel);

        weaponNameLabel = new JLabel();
        weaponNameLabel.setForeground(Color.white);
        weaponNameLabel.setFont(normalfont);
        playerPanel.add(weaponNameLabel);

        goldLable = new JLabel("GOLD:");
        goldLable.setForeground(Color.white);
        goldLable.setFont(normalfont);
        playerPanel.add(goldLable);

        goldNumberLable = new JLabel();
        goldNumberLable.setForeground(Color.white);
        goldNumberLable.setFont(normalfont);
        playerPanel.add(goldNumberLable);








        window.setVisible(true);


    }
}

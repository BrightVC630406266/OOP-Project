package KINGDOM;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Game {

    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    Story story = new Story(this, ui, vm);
    String nextPos1,nextPos2,nextPos3,nextPos4;



    public static void main(String[] args){

        new Game();
    }

    public Game(){

        ui.creatUI(cHandler);

        vm.showTitleScreen();
        story.defaultSetup();



    }

    public class ChoiceHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){

            String yourChoice = event.getActionCommand();

            switch (yourChoice){
                case "start": vm.titleToHouse();story.house();break;
                case "c1": story.selectPos(nextPos1);break;
                case "c2": story.selectPos(nextPos2);break;
                case "c3": story.selectPos(nextPos3);break;
                case "c4": story.selectPos(nextPos4);break;
            }

        }
    }

}

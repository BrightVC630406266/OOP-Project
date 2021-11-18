package KINGDOM;

public class VisibilityManager {
    UI ui;
    public VisibilityManager(UI userInterface){

        ui = userInterface;

    }

    public void showTitleScreen(){

        // Show the title screen
        ui.titleNamePanel.setVisible(true);
        ui.startButtonePanel.setVisible(true);

        //Hide the game screen
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }

    public void titleToHouse(){
        // Show the title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonePanel.setVisible(false);

        //Hide the game screen
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);

    }
}

package KINGDOM;

import package02.*;

public class Story {
    Game game;
    UI ui;
    VisibilityManager vm;
    Player player = new Player();
    SuperWeapon weapon;
    SuperEnemy enemy;
    int Gold;

    public Story(Game g, UI userInterface, VisibilityManager vManager){

        game = g;
        ui = userInterface;
        vm = vManager;

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

    public void defaultSetup(){

        player.hp = 100;
        ui.hpNumberLabel.setText("" + player.hp);

        player.currentWeapon = new Weapon_Hand();
        ui.weaponNameLabel.setText(player.currentWeapon.name);
        player.Gold=0;
        player.enemyKills = 0;
        ui.goldNumberLable.setText(String.valueOf(Gold));
    }

    public void selectPos(String nextPos){
        switch (nextPos){

            case "fight":fight();break;
            case "playerATK":playerATK();break;
            case "enemyATK":enemyATK();break;
            case "win":win();break;
            case "lose":lose();break;
            case "toTitle":toTitle();break;
            case "house": house();break;
            case "continueSleep": continueSleep();
            case "talkMother": talkMother(); break;
            case "talkFather": talkToFather(); break;
            case "fatherContinue":fatherContinue();break;
            case "acceptFatherSword":acceptfatherSword();break;
            case "crossRoad":crossRoad();break;
            case "goNorth":north();break;
            case "goEast":east();break;
            case "goSouth":south();break;
            case "goWest":west();break;
            case "buySword":buySoword();break;
            case "buyLightsaber":buyLightsaber();break;


        }

    }


    public void house(){
        ui.mainTextArea.setText("You wake up in your house cause your mother calling you. \n\nwhat do you do?");
        ui.choice1.setText("Talk to your mother.");
        ui.choice2.setText("Countinue to sleep");
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPos1 = "talkMother";
        game.nextPos2 = "continueSleep";
    }

    public void continueSleep(){
        ui.mainTextArea.setText(" BONK !  Your mother came to your room and hit your head with a pan and said" + " \n\n'Wake the fuck up samurai We have city to burn'");
        player.hp = player.hp-10;
        ui.hpNumberLabel.setText("" + player.hp);

        ui.choice1.setText("Wake up and talk with your mother");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPos1 = "talkMother";

    }

    public void talkMother(){
        ui.mainTextArea.setText("MOTHER : Good morning my son Your father sent me to wake you up and He told me he have something to talk with you. \n\nwhat do you do?");
        ui.choice1.setText("Talk to your father");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPos1 = "talkFather";
    }

    public void talkToFather(){
        ui.mainTextArea.setText("FATHER : Morning son how are you did you eat something?, I have a job for you do you still remember our debtor ,John?\n\nYour job is walk into the forest to the town, find this house and take our money back.  ");
        ui.choice1.setText("Continue");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPos1 = "fatherContinue";

    }
    public void fatherContinue(){
        ui.mainTextArea.setText("But before you go you should train with your sword with the dummy over there because in the forest has many monster, and this will make you STORNGER! my son." + "\n\nTake this.");
        ui.choice1.setText("Continue");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPos1 = "acceptFatherSword";
    }


    public void acceptfatherSword(){
        ui.mainTextArea.setText("(You obtained a knife!)\n");
        player.currentWeapon = new Weapon_knife();
        ui.weaponNameLabel.setText("Knife");

        ui.choice1.setText("Countinue");
        game.nextPos1 = "crossRoad";


    }


    public void crossRoad(){
        ui.mainTextArea.setText("You walk into a crossroad in the forest \n\nWhat do you do?");

        ui.choice1.setVisible(true);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);

        ui.choice1.setText("Go north");
        ui.choice2.setText("Go east");
        ui.choice3.setText("Go south");
        ui.choice4.setText("Go west");

        game.nextPos1 ="goNorth";
        game.nextPos2 ="goEast";
        game.nextPos3 ="goSouth";
        game.nextPos4 ="goWest";
    }

    //townGate
    public void north(){
        if(player.enemyKills >= 5){
            ui.mainTextArea.setText("you killed 5 monster!  you can walk into the town and you found the debter and you took the money to your father \n\n\nEND");

            ui.choice1.setVisible(true);
            ui.choice2.setVisible(true);
            ui.choice3.setVisible(true);
            ui.choice4.setVisible(true);

            ui.choice1.setText("Walk into the town");
            ui.choice2.setText("Back");

            game.nextPos1 = "intoTheTown";
            game.nextPos2 = "crossRoad";

            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
        }
        else    ui.mainTextArea.setText("You walk to north and found the town gate When you going to walk in the town guard came out and told you to kills 5 monster then you can into the town");
                ui.choice1.setText("Back");
                game.nextPos1 = "crossRoad";

                ui.choice2.setVisible(false);
                ui.choice3.setVisible(false);
                ui.choice4.setVisible(false);

    }

    //Holy Waterfall ( heal HP )
    public void east(){
        int i = new java.util.Random().nextInt(30);
        ui.mainTextArea.setText("You walk to east and found the Holy Waterfall and you drink the holy water\n\n(You received "+i+" HP!)");
        player.hp += i;
        ui.hpNumberLabel.setText(String.valueOf(player.hp));

        ui.choice1.setText("Back");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPos1 = "crossRoad";

    }

    //secretShop buy a sword
    public void south(){
        ui.mainTextArea.setText("You walk to south cross Chao Phraya River and found a secret shop! \n\n what do you do?");

        ui.choice1.setText("Buy a Longsword(30 GOLD)");
        ui.choice2.setText("Buy a Lightsaber(100 GOLD)");
        ui.choice3.setText("Back");

        game.nextPos1 = "buySword";
        game.nextPos2 = "buyLightsaber";
        game.nextPos3 = "crossRoad";

        ui.choice4.setVisible(false);
    }

    public void buySoword(){
        if(Gold>=30){
            ui.mainTextArea.setText("You bought a LongSword");
            ui.weaponNameLabel.setText("Long Sword");
            player.currentWeapon = new Weapon_Long_Sword();
        }
        else if(Gold<30){
            ui.mainTextArea.setText("Not enough gold!");
        }


        ui.choice1.setText("Back");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        game.nextPos1 = "crossRoad";
    }

    public void buyLightsaber(){
        if(Gold>=100){
            ui.mainTextArea.setText("You bought a Lightsaber");
            ui.weaponNameLabel.setText("LightSaber");
            player.currentWeapon = new Weapon_LightSaber();
        }
        else if(Gold<100){
            ui.mainTextArea.setText("Not enough gold!");
        }


        ui.choice1.setText("Back");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        game.nextPos1 = "crossRoad";

    }

    //fightEnemy
    public void west(){

        int i=  new java.util.Random().nextInt(100)+1;

        if(i<=30){
            enemy = new Enemy_Slime();
        }
        else if(i<=60){
            enemy = new Enemy_Goblin();
        }
        else if (i<=90){
            enemy = new Enemy_Witch();
        }
        else enemy = new Enemy_Dragon();

        ui.mainTextArea.setText("You encounter a "+enemy.name+ "!");

        ui.choice1.setText("Fight !");
        ui.choice2.setText("Run !");
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPos1 = "fight";
        game.nextPos2 = "crossRoad";


    }

    public void intoTheTown(){

    }

    public void fight(){
        ui.mainTextArea.setText("Name   : "+enemy.name+ "\nHP   :" + enemy.hp + "\n\nwhat do you do?");
        ui.choice1.setText("Attack!");
        ui.choice2.setText("Run!");
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPos1="playerATK";
        game.nextPos2="crossRoad";
    }

    public void playerATK(){

        int playerDMG = new java.util.Random().nextInt(player.currentWeapon.damage)+5;

        ui.mainTextArea.setText("You attacked the "+ enemy.name+"with a "+player.currentWeapon.name+" and gave "+playerDMG+ " damage!");
        enemy.hp = enemy.hp - playerDMG;

        ui.choice1.setText(">");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        if(enemy.hp > 0){
            game.nextPos1="enemyATK";
        }
        else if(enemy.hp < 1){
            game.nextPos1="win";
        }
    }

    public void enemyATK(){
        int enemyDMG = new java.util.Random().nextInt(enemy.atk)+2;

        player.hp = player.hp - enemyDMG;

        ui.mainTextArea.setText(enemy.name + " attacked you with a "+enemy.currentWeapon.name+" and gave "+enemyDMG+" damage!"+"\n\n(You received "+enemyDMG+" damage!)");
        ui.hpNumberLabel.setText(""+player.hp);

        ui.choice1.setText(">");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        if(player.hp > 0){
            game.nextPos1="fight";
        }
        else if(player.hp < 1){
            game.nextPos1="lose";
        }
    }

    public void win(){
        int i = new java.util.Random().nextInt(enemy.goldDrop)+10;
        Gold += i;
        ui.mainTextArea.setText("You've defeated the "+enemy.name+"!\nThe enemy dropped a Gold!\n\n(You obtained "+i+" Gold!)");
        ui.goldNumberLable.setText(String.valueOf(Gold));
        player.enemyKills += 1;

        ui.choice1.setText(">");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPos1="crossRoad";
    }

    public void lose(){
        ui.mainTextArea.setText("YOU DIED\n\n<GAME OVER>");


        ui.choice1.setText("To the title screen");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPos1="toTitle";
    }

    public void toTitle(){
        defaultSetup();
        vm.showTitleScreen();
    }









}

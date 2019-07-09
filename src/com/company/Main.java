package com.company;

public class Main {

    public static void main(String[] args) {
        Boss Tom = new Boss(500, 50);
        Tom.makeSpeech();
        Tom.changeBossDefence();
        Tom.printInfo();

        Warrior Jery = new Warrior(250, 20);
        Magic merlin = new Magic(250, 20);
        Mental professorX = new Mental(250, 20);

        int num = Tom.getDefence();
        switch (num) {
            case 1:
                Jery.setPhysicalHit(10);
                Jery.psyhicalHit();
                break;
            case 2:
                merlin.setMagicalHit(20);
                merlin.magicalHit();
                break;
            case 3:
                professorX.setKineticHit(40);
                professorX.kineticHit();
                break;
            default:
                break;

        }

        Jery.makeSpeech();
        Jery.printInfo();


        merlin.makeSpeech();
        merlin.printInfo();


        professorX.makeSpeech();
        professorX.printInfo();

    }
}



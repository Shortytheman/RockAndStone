package controller;

import classes.Driller;
import classes.Dwarf;
import classes.DwarfChooser;
import classes.Scout;
import workstations.DiveStation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

  public void mainMenu() {
    //Klassekald
    DiveStation divestation = new DiveStation();
    Dwarf currentDwarf = null;
    Scanner scanner = new Scanner(System.in);
    int choice = 0;

    System.out.println("Welcome to the dwarf game u silly goose, choose your dwarf and afterwards - " +
        "the corresponding weapons. ");
    System.out.println("""
        1: Scout
        2: Driller""");

    do {
      try {
        System.out.println("Please enter a number on the list");
        choice = scanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.print("Invalid input.. please enter a number.. ");
      }
      scanner.nextLine();
    } while (choice < 1 || choice > 2);

    switch (choice){
      case 1:
        Scout scout = new Scout();
        scout.chooseLoadout();
        currentDwarf = scout;
        break;
      case 2:
        Driller driller = new Driller();
        driller.chooseLoadout();
        currentDwarf = driller;
        break;
    }


    boolean flag = true;

    while (flag) {
      System.out.println("_________________________\n       Game Menu\n_________________________\n" + """
          1: Change your dwarf
          2: Change your loadout
          3: Enter the weapon workbench
          4: Enter the Divestation
          5: blablabbla
          6: måske maks 6 menuvalg!?! hvad synes i boiz? hvad skal der mere være
          9: Exit the program\n""");

      do {
        try {
          System.out.println("Please enter a number on the list");
          choice = scanner.nextInt();
        } catch (InputMismatchException e) {
          System.out.print("Invalid input.. please enter a number.. ");
        }
        scanner.nextLine();
      } while (choice < 1 || choice > 7 && choice != 9);

      switch(choice){
        case 1:
          System.out.println("Opening the dwarf changing station, please wait..");
          DwarfChooser dwarfChooser = new DwarfChooser();
          currentDwarf = dwarfChooser.chooseDwarf();;
          break;
        case 2:
          System.out.println("WEAPONBENCH");
          break;
        case 3:
          System.out.println("MINERAL EXCHANGE STATION");
          break;
        case 4:
          System.out.println("Opening dive station, hold on miner");
          currentDwarf.setMission(divestation.chooseMission());
          break;
        case 5:
        case 6:
        case 7:
          //Show current class, weapons, mission and minerals.
        case 9: flag = false;
      }
    }
  }

  public static void main(String[] args) {
    Game g = new Game();
    g.mainMenu();
  }

}

package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

  public void mainMenu() {
    boolean flag = true;
    int choice = 0;
    Scanner scanner = new Scanner(System.in);

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
      } while (choice < 1 || choice > 6 && choice != 9);

      switch(choice){
        case 1:
          System.out.println("Opening the dwarf changing station, please wait..");
          break;
        case 2:
          System.out.println("JOHANNES SKRIV WEAPONBENCH 7/2, eller jeg laver lurt på dit lår");
        case 3:
          System.out.println("FREDERINCO SKRIV MINERAL EXCHANGE STATION 7/2 ELLER JEG KOMMER PÅ DIN FOD");
        case 4:
          System.out.println("Opening dive station, hold on miner");
        case 5:
        case 6:
        case 9: flag = false;
      }
    }
  }

  public static void main(String[] args) {
    Game g = new Game();
    g.mainMenu();
  }

}

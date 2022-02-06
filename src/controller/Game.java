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
          4: Enter the cosmetics workbench
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
        case 3:
        case 4:
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

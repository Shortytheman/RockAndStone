package classes;

import equipables.weapons.SecondaryWeapon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DwarfChooser {

  public Dwarf chooseDwarf(){
    int choice = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose your class, and i will show you your options for that class");

    System.out.println("""
        1: Driller
        2: Scout
        """);

    do {
      try {
        System.out.println("Please enter a number on the list");
        choice = scanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.print("Invalid input.. please enter a number.. ");
      }
      scanner.nextLine();
    } while (choice < 1 || choice > 2);

    Dwarf dwarf = null;

    switch (choice){
      case 1:
        Driller driller = new Driller();
        driller.chooseLoadout();
        dwarf = driller;
        break;
      case 2:
      Scout scout = new Scout();
      scout.chooseLoadout();
      dwarf = scout;
      break;
    }
    return dwarf;
  }
}

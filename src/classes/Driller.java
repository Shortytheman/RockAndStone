package classes;

import equipables.Equipment;
import equipables.weapons.PrimaryWeapon;
import equipables.weapons.SecondaryWeapon;
import equipables.weapons.Throwable;
import java.util.Scanner;

public class Driller extends Dwarf{

  public void chooseLoadout(){
    int primaryWeapon = 0;
    int secondaryWeapon = 0;
    int throwable = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("\nChoose primary weapon");

    System.out.println("""
        1: CRSPR flamethrower - 15 damage
        2: Cryo cannon - 10 damage
        3: Corrosive sludge pump - 25 damage""");

    if (scanner.hasNextInt()) {
      primaryWeapon = scanner.nextInt();
    }
    if (primaryWeapon < 4 && primaryWeapon > 0){
    } else {
      do {
        System.out.println("Wrong input, choose a number from the list.");
        if (!scanner.hasNextInt()){
          scanner.nextLine();
          scanner.next();
        }else {
          primaryWeapon = scanner.nextInt();
        }
      }
      while (primaryWeapon > 3 || primaryWeapon < 1);
    }
    scanner.nextLine();

    switch (primaryWeapon){
      case 1: this.setPrimaryWeapon(new PrimaryWeapon("CRSPR flamethrower",15));
        System.out.println("CRSPR flamethrower has been chosen as primary weapon");
      break;
      case 2: this.setPrimaryWeapon(new PrimaryWeapon("Cryo cannon",10));
        System.out.println("Cryo cannon has been chosen as primary weapon");
      break;
      case 3: this.setPrimaryWeapon(new PrimaryWeapon("Corrosive sludge pump",25));
        System.out.println("Corrosive sludge pump has been chosen as primary weapon");
    }

    System.out.println("\nChoose secondary weapon");

    System.out.println("""
        1: Subata120 - 15 damage
        2: Experimental plasma charger - 35 damage""");

    if (scanner.hasNextInt()) {
      secondaryWeapon = scanner.nextInt();
    }
    if (secondaryWeapon < 3 && secondaryWeapon > 0){
    } else {
      do {
        System.out.println("Wrong input, choose a number from the list.");
        if (!scanner.hasNextInt()){
          scanner.nextLine();
          scanner.next();
        }else {
          secondaryWeapon = scanner.nextInt();
        }
      }
      while (secondaryWeapon > 2 || secondaryWeapon < 1);
    }
    scanner.nextLine();

    switch (secondaryWeapon){
      case 1: this.setSecondaryWeapon(new SecondaryWeapon("Subata120",15));
        System.out.println("Subata120 has been chosen as secondary weapon");
        break;
      case 2: this.setSecondaryWeapon(new SecondaryWeapon("Experimental plasma charger",35));
        System.out.println("Experimental plasma charger has been chosen as secondary weapon");
    }

    System.out.println("\nChoose throwable");

    System.out.println("""
        1: Impact axe - 70 damage
        2: High explosive grenade - 80 damage
        3: Neurotoxin grenade - 30 damage/second over 5 seconds""");

    if (scanner.hasNextInt()) {
      throwable = scanner.nextInt();
    }
    if (throwable < 4 && throwable > 0){
    } else {
      do {
        System.out.println("Wrong input, choose a number from the list.");
        if (!scanner.hasNextInt()){
          scanner.nextLine();
          scanner.next();
        }else {
          throwable = scanner.nextInt();
        }
      }
      while (throwable > 3 || throwable < 1);
    }
    scanner.nextLine();

    switch (throwable){
      case 1: this.setThrowable(new Throwable("Impact axe",70));
        System.out.println("Impact axe has been chosen as throwable");
      break;
      case 2: this.setThrowable(new Throwable("High explosive grenade",80));
        System.out.println("High explosive grenade has been chosen as throwable");
      break;
      case 3: this.setThrowable(new Throwable("Neurotoxin grenade",30));
        System.out.println("Neurotoxin grenade has been chosen as throwable");
    }

    System.out.println("\nYou have chosen the the following setup for rocking hard: ");
    System.out.println("Primary weapon: " + this.getPrimaryWeapon().getName() + "\n" + "Secondary weapon: "
        + this.getSecondaryWeapon().getName() + "\n" + "Throwable: " + this.getThrowable().getName());
  }


  public static void main(String[] args) {
    Driller f = new Driller();
    f.chooseLoadout();
  }


}

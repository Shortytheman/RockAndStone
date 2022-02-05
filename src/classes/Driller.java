package classes;

import equipables.weapons.PrimaryWeapon;
import equipables.weapons.SecondaryWeapon;
import equipables.weapons.Throwable;
import java.util.Scanner;

public class Driller extends Dwarf{

  public void chooseLoadout(){
    String[] commentary = {"Hey hey.. You have to enter the valid numbers..",
        "I knew you had a little body, but i guess ur brain has dwarfism too",
        "Last straw sergant Driller.. next mistake and im sending you into battle with a a weapon of my choosing",
        "Good luck killing spiders with this one.."};

    int dummyCounter = 0;
    int choice = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("\nChoose primary weapon");

    System.out.println("""
        1: CRSPR flamethrower - 15 damage
        2: Cryo cannon - 10 damage
        3: Corrosive sludge pump - 25 damage""");
    if (scanner.hasNextInt()) {
      choice = scanner.nextInt();
    }
    if (choice > 3 || choice < 1){
      do {
        if (dummyCounter == 3){
          System.out.println(commentary[dummyCounter]);
          this.setPrimaryWeapon(new PrimaryWeapon("A CHICKEN",1));
          break;
        }
        System.out.println(commentary[dummyCounter]);
        dummyCounter++;
        if (!scanner.hasNextInt()){
          scanner.nextLine();
          scanner.next();
        }else {
          choice = scanner.nextInt();
        }
      }
      while (choice > 3 || choice < 1);
    }
    scanner.nextLine();

    switch (choice){
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
    dummyCounter = 0;
    choice = 0;
    if (scanner.hasNextInt()) {
      choice = scanner.nextInt();
    }
    if (choice > 2 || choice < 1){
      do {
        if (dummyCounter == 3){
          System.out.println(commentary[dummyCounter]);
          this.setSecondaryWeapon(new SecondaryWeapon("A GODDAMN STUPID CHICKEN",1));
          break;
        }
        System.out.println(commentary[dummyCounter]);
        dummyCounter++;
        if (!scanner.hasNextInt()){
          scanner.nextLine();
          scanner.next();
        }else {
          choice = scanner.nextInt();
        }
      }
      while (choice > 2 || choice < 1);
    }
    scanner.nextLine();

    switch (choice){
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
    dummyCounter = 0;
    choice = 0;
    if (scanner.hasNextInt()) {
      choice = scanner.nextInt();
    }
    if (choice > 3 || choice < 1){
      do {
        if (dummyCounter == 3){
          System.out.println(commentary[dummyCounter]);
          this.setThrowable(new Throwable("A GODDAMN STUPID THROWABLE CHICKEN",1));
          break;
        }
        System.out.println(commentary[dummyCounter]);
        dummyCounter++;
        if (!scanner.hasNextInt()){
          scanner.nextLine();
          scanner.next();
        }else {
          choice = scanner.nextInt();
        }
      }
      while (choice > 3 || choice < 1);
    }
    scanner.nextLine();

    switch (choice){
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
    Driller d = new Driller();
    d.chooseLoadout();
  }

}

package classes;

import equipables.weapons.PrimaryWeapon;
import equipables.weapons.SecondaryWeapon;
import equipables.weapons.Throwable;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scout extends Dwarf{

  public void chooseLoadout(){
    String[] commentary = {"Enter a number: ", "Hey hey.. You have to enter the valid numbers..",
        "I knew you had a little body, but i guess ur brain has dwarfism too",
        "Last straw sergant Driller.. next mistake and im sending you into battle with a a weapon of my choosing",
        "Good luck killing spiders with this one.."};

    int dummyCounter = -1;
    int choice = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("\nChoose primary weapon");

    System.out.println("""
        1: Deepcore GK2 - 15 damage
        2: M1000 Classic - 45 damage
        3: DRAK-25 plasma Carbine - 20 damage""");

    do {
      try {
        dummyCounter++;
        if (dummyCounter == 4){
          System.out.println(commentary[dummyCounter]);
          this.setPrimaryWeapon(new PrimaryWeapon("A CHICKEN",1));
          System.out.println("\n" + this.getPrimaryWeapon().getName() + " Has been chosen s your primary weapon");
          break;
        }
        System.out.println(commentary[dummyCounter]);
        choice = scanner.nextInt();
      } catch (InputMismatchException ignored) {

      }
      scanner.nextLine();
    } while (choice < 1 || choice > 3);

    switch (choice){
      case 1: this.setPrimaryWeapon(new PrimaryWeapon("Deepcore GK2",15));
        System.out.println("CRSPR flamethrower has been chosen as primary weapon");
        break;
      case 2: this.setPrimaryWeapon(new PrimaryWeapon("M1000 Classic",45));
        System.out.println("Cryo cannon has been chosen as primary weapon");
        break;
      case 3: this.setPrimaryWeapon(new PrimaryWeapon("DRAK-25 Plasma Carbine",20));
        System.out.println("Corrosive sludge pump has been chosen as primary weapon");
    }

    System.out.println("\nChoose secondary weapon");

    System.out.println("""
        1: Jury-Rigget Boomstick - 45 damage
        2: Zhukov NUK17 - 13 damage""");
    dummyCounter = -1;
    choice = 0;

    do {
      try {
        dummyCounter++;
        if (dummyCounter == 4){
          System.out.println(commentary[dummyCounter]);
          this.setSecondaryWeapon(new SecondaryWeapon("A GODDAMN CHICKEN",1));
          System.out.println("\n" + this.getSecondaryWeapon().getName() + " Has been chosen s your secondary weapon");
          break;
        }
        System.out.println(commentary[dummyCounter]);
        choice = scanner.nextInt();
      } catch (InputMismatchException ignored) {

      }
      scanner.nextLine();
    } while (choice < 1 || choice > 2);

    switch (choice){
      case 1: this.setSecondaryWeapon(new SecondaryWeapon("Jury-Rigged Boomstick",45));
        System.out.println("Subata120 has been chosen as secondary weapon");
        break;
      case 2: this.setSecondaryWeapon(new SecondaryWeapon("Zhukov NUK17",13));
        System.out.println("Experimental plasma charger has been chosen as secondary weapon");
    }

    System.out.println("\nChoose throwable");

    System.out.println("""
        1: Inhibitor-Field Generator - 75 damage
        2: Cryo Grenade - 45 damage
        3: Pheromone Canister - 5 damage""");
    dummyCounter = -1;
    choice = 0;

    do {
      try {
        dummyCounter++;
        if (dummyCounter == 4){
          System.out.println(commentary[dummyCounter]);
          this.setThrowable(new Throwable("A THROWABLE FREAKING CHICKEN",1));
          System.out.println("\n" + this.getThrowable().getName() + " Has been chosen s your throwable");
          break;
        }
        System.out.println(commentary[dummyCounter]);
        choice = scanner.nextInt();
      } catch (InputMismatchException ignored) {

      }
      scanner.nextLine();
    } while (choice < 1 || choice > 3);

    switch (choice){
      case 1: this.setThrowable(new Throwable("Inhibitor-Field Generator",75));
        System.out.println("Impact axe has been chosen as throwable");
        break;
      case 2: this.setThrowable(new Throwable("Cryo Grenade",45));
        System.out.println("High explosive grenade has been chosen as throwable");
        break;
      case 3: this.setThrowable(new Throwable("Pheromone Canister",5));
        System.out.println("Neurotoxin grenade has been chosen as throwable");
    }

    System.out.println("\nYou have chosen the the following setup for rocking hard: ");
    System.out.println("Primary weapon: " + this.getPrimaryWeapon().getName() + "\n" + "Secondary weapon: "
        + this.getSecondaryWeapon().getName() + "\n" + "Throwable: " + this.getThrowable().getName());
  }

}

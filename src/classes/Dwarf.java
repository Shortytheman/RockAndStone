package classes;

import equipables.Equipment;
import equipables.weapons.PrimaryWeapon;
import equipables.weapons.SecondaryWeapon;
import equipables.weapons.Throwable;

public abstract class Dwarf {

  int health;
  private PrimaryWeapon primaryWeapon;
  private SecondaryWeapon secondaryWeapon;
  private Throwable throwable;
  private Equipment equipment;

  public PrimaryWeapon getPrimaryWeapon() {
    return primaryWeapon;
  }

  public void setPrimaryWeapon(PrimaryWeapon primaryWeapon) {
    this.primaryWeapon = primaryWeapon;
  }

  public SecondaryWeapon getSecondaryWeapon() {
    return secondaryWeapon;
  }

  public void setSecondaryWeapon(SecondaryWeapon secondaryWeapon) {
    this.secondaryWeapon = secondaryWeapon;
  }

  public Throwable getThrowable() {
    return throwable;
  }

  public void setThrowable(Throwable throwable) {
    this.throwable = throwable;
  }

  public Equipment getEquipment() {
    return equipment;
  }

  public void setEquipment(Equipment equipment) {
    this.equipment = equipment;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public void chooseLoadout(){
    System.out.println("Choose ur primary weapon choice u scurry barrel lobber.. primary weapons first!");


  }


}

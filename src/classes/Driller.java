package classes;

import equipables.Equipment;
import equipables.weapons.PrimaryWeapon;
import equipables.weapons.SecondaryWeapon;
import equipables.weapons.Throwable;

public class Driller extends Dwarf{

  PrimaryWeapon cRSPRFlamethrower;
  PrimaryWeapon cryoCannon;
  PrimaryWeapon corrisiveSludgePump;
  SecondaryWeapon subata120;
  SecondaryWeapon experimentalPlasmaCharger;
  Throwable impactAxe;
  Throwable highExplosiveGrenade;
  Throwable neurotoxinGrenade;
  Equipment reinforcedPowerDrill;
  Equipment sachelCharge;
  Equipment moleArmorRig;

  public Driller(PrimaryWeapon primaryWeapon, SecondaryWeapon secondaryWeapon){
    this.setPrimaryWeapon(primaryWeapon);
    this.setSecondaryWeapon(secondaryWeapon);
  }


}

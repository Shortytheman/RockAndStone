package equipables.weapons;

import enemies.Enemy;

public abstract class Weapon {

  private String name;
  private int damage;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public void dealdamage(Enemy enemy){
  enemy.setHealth(enemy.getHealth() - damage);
  }

}

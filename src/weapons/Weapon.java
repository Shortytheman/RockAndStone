package weapons;

import enemies.Enemy;

public abstract class Weapon {

  private int damage;

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

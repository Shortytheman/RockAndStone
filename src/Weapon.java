public abstract class Weapon {

  private int damage;

  public void dealdamage(Enemy enemy){
  enemy.setHealth(enemy.getHealth() - damage);
  }

}

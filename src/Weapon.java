public abstract class Weapon {

  private int damage;

  public int dealdamage(Enemy enemy){
  return enemy.getHealth() - damage;
  }

}

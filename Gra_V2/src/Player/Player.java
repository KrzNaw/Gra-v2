package Player;


import Defence.Defence;
import Enemy.Enemy;
import Weapon.Weapon;

public class Player {

    private int attackPoints;
    private int defencePoints;
    private int healthPoints;
    private String playerName;
    private Weapon weapon = new Weapon();
    private Defence defence = new Defence();
    private Enemy enemy = new Enemy();

    public Player(){}

    public Player(int attackPoints, int defencePoints, int healthPoints, String playerName) {
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
        this.healthPoints = healthPoints;
        this.playerName = playerName;
    }

    public int getTotalHealthPoints(){
        return healthPoints + defencePoints + defence.getDefenceBonus() + weapon.getDefenceBonus();
    }

    public int getTotalAttackPoint(){
        return attackPoints + weapon.getAttackBonus() + defence.getAttackBonus();
    }

    public void attack (Enemy enemy) {

       int enemyHP = enemy.getTotalHealthPoints();

       int attackOutcome = enemyHP - this.getTotalAttackPoint();

       if ((attackOutcome-enemyHP) <= 0){
            enemy.setHealthPoints(0);
            System.out.println(enemy.getEnemyName() + " przegrywa!");
       } else {
            enemy.setHealthPoints(attackOutcome-enemyHP);
       }
    }

    @Override
    public String toString() {
        return "Player{" +
                "attackPoints=" + attackPoints +
                ", defencePoints=" + defencePoints +
                ", healthPoints=" + healthPoints +
                ", playerName='" + playerName + '\'' +
                '}';
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getPlayerName() {
        return playerName;
    }


}

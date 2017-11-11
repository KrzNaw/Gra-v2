package Enemy;

import Defence.Defence;
import Player.Player;
import Weapon.Weapon;

public class Enemy {

    private int attackPoints;
    private int defencePoints;
    private int healthPoints;
    private String enemyName;
    private Weapon weapon = new Weapon();
    private Defence defence = new Defence();

    public Enemy(){}

    public Enemy(int attackPoints, int defencePoints, int healthPoints, String enemyName) {
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
        this.healthPoints = healthPoints;
        this.enemyName = enemyName;
    }

    public void attack (Player player) {

        int playerHP = player.getTotalHealthPoints();

        int attackOutcome = playerHP - this.getTotalAttackPoint();

        if ((attackOutcome-playerHP) <= 0){
            player.setHealthPoints(0);
            System.out.println(player.getPlayerName() + " przegrywa!");
        } else {
            player.setHealthPoints(attackOutcome-playerHP);
        }

    }

    public int getTotalHealthPoints(){
        return healthPoints + defencePoints + defence.getDefenceBonus() + weapon.getDefenceBonus();
    }

    public int getTotalAttackPoint(){
        return attackPoints + weapon.getAttackBonus() + defence.getAttackBonus();
    }

    @Override
    public String toString() {
        return "Enemy{ " +
                "attackPoints= " + attackPoints +
                ", defencePoints= " + defencePoints +
                ", healthPoints= " + healthPoints +
                ", enemyName=' " + enemyName + '\'' +
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

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }
}

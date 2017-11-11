package Weapon;

public class Weapon {

    private int attackBonus;
    private int defenceBonus;
    private String weaponName;

    public Weapon(){}

    public Weapon(int attackBonus, int defenceBonus, String weaponName) {
        this.attackBonus = attackBonus;
        this.defenceBonus = defenceBonus;
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "attackBonus=" + attackBonus +
                ", defenceBonus=" + defenceBonus +
                ", weaponName='" + weaponName + '\'' +
                '}';
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public int getDefenceBonus() {
        return defenceBonus;
    }

    public void setDefenceBonus(int defenceBonus) {
        this.defenceBonus = defenceBonus;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}

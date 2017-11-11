package Defence;

public class Defence {

    private int defenceBonus;
    private int attackBonus;
    private String defenceName;

    public Defence(){}

    public Defence(int defenceBonus, int attackBonus, String defenceName) {
        this.defenceBonus = defenceBonus;
        this.attackBonus = attackBonus;
        this.defenceName = defenceName;
    }

    @Override
    public String toString() {
        return "Defence{" +
                "defenceBonus=" + defenceBonus +
                ", attackBonus=" + attackBonus +
                ", defenceName='" + defenceName + '\'' +
                '}';
    }

    public int getDefenceBonus() {
        return defenceBonus;
    }

    public void setDefenceBonus(int defenceBonus) {
        this.defenceBonus = defenceBonus;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public String getDefenceName() {
        return defenceName;
    }

    public void setDefenceName(String defenceName) {
        this.defenceName = defenceName;
    }
}

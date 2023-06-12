public class Hero extends Character{


    private int expLevel;

    private int level;
    public Hero(String name, int healthPoints, int strength, int agility, int experiencePoints, int gold) {
        super(name, healthPoints, strength, agility, experiencePoints, gold);
        this.expLevel = 500;
        this.level = 1;
    }

    public void levelUp() {
        if ((this.getExperiencePoints() != 0) && (this.getExpLevel() == this.getExperiencePoints())) {
            this.setLevel(this.getLevel()+1);
            this.setExpLevel(this.getExpLevel() * 2);
            this.setStrength(this.getStrength() + 2);
            this.setAgility(this.getAgility() + 1);
            System.out.println(String.format("Ваш уровень повысился и теперь вы на %d уровне, ваша сила повысилась до %d и ловкость стала %d", this.getLevel(), this.getStrength(), this.getAgility()));
        } else {
            System.out.println(String.format("Ваш уровень: %d", this.getLevel()));
        }

    }

    public int getExpLevel() {
        return expLevel;
    }

    public void setExpLevel(int expLevel) {
        this.expLevel = expLevel;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}

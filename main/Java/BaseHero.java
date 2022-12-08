package Sem1.main.Java;

public abstract class BaseHero {
    protected int offence;
    protected int defence;
    protected int hp;
    protected int speed;
    protected String name;
    protected int[] damage;
    protected boolean delivery;
    protected boolean magic;
    protected int shots;
    

    public BaseHero(int offence, int defence, int hp, int speed, int[] damage, String name, boolean delivery, boolean magic, int shots) {
        this.offence = offence;
        this.defence = defence;
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        this.name = name;
        this.delivery = delivery;
        this.magic = magic;
        this.shots = shots;
    }

    public int getOffence() {
        return offence;
    }

    public int getDefence() {
        return defence;
    }

    public int getHP() {
        return hp;
    }    

    public int getSpeed() {
        return speed;
    }

    public int[] getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public boolean getDelivery() {
        return delivery;
    }

    public boolean getMagic() {
        return magic;
    }

    public int getShots() {
        return shots;
    }

    public void setOffence(int offence){
        if (offence >=0)
            this.offence = offence;
    }

    public void setDefence(int defence){
        if (defence >=0)
            this.defence = defence;
    }

    public void setHP(int hp){
        if (hp >=0)
            this.hp = hp;
    }

    public void setSpeed(int speed){
        if (speed >=0)
            this.speed = speed;
    }

    public void setDamage(int[] damage){
        this.damage = damage;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDelivery(boolean delivery){
        this.delivery = delivery;
    }

    public void setMagic(boolean magic){
        this.magic = magic;
    }

    public void setShots(int shots){
        if (shots >=0)
            this.shots = shots;
    }







    @Override

    public String toString() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }
}

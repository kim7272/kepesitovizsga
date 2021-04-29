package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private int counter;

    private boolean hasShield;
    public Swordsman(boolean hasShield) {
        super(100, hasShield);
    }

    @Override
    public int doDamage() {
        return 10;
    }

    public void sufferDamage(int damage){
        counter = counter + 1;
        if (counter == 1){
           this.lifeScore = this.lifeScore;
        }
        super.sufferDamage(damage);

    }
}

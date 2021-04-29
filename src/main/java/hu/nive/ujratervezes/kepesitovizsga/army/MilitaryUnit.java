package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected  int lifeScore;
    private boolean hasShield;

    public int getLifeScore() {
        return lifeScore;
    }

    public boolean isHasShield() {
        return hasShield;
    }

    public MilitaryUnit(int lifeScore, boolean hasShield) {
        this.lifeScore = lifeScore;
        this.hasShield = hasShield;
    }

    public abstract int doDamage();


    public void sufferDamage(int damage){
        if (hasShield == true) {
            lifeScore = lifeScore - damage/2;
        }
        lifeScore = lifeScore - damage;
    }
}

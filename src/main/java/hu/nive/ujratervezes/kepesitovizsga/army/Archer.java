package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {



    public Archer(boolean hasShield) {
        super(50, false);
    }

    @Override
    public int doDamage() {
        return 20;
    }
}


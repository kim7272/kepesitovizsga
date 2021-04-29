package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends  MilitaryUnit {

    private int counter;


    public HeavyCavalry() {
        super(150, true);
    }

    @Override
    public int doDamage() {
       counter = counter + 1;
       if (counter == 1){
           return 60;
       }
        return 20;
    }
}

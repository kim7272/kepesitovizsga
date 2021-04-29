package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public int getArmySize() {
        if (militaryUnits.isEmpty()){
            return 0;
        }
        return militaryUnits.size();
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int i) {
        List<MilitaryUnit> toRemove = new ArrayList<>();
        for (MilitaryUnit militaryUnit : militaryUnits){
            militaryUnit.sufferDamage(i);
            if (militaryUnit.getLifeScore() < 25){
                toRemove.add(militaryUnit);
            }
        }
        militaryUnits.removeAll(toRemove);


    }

    public int getArmyDamage(){
        int totalCausedDamage = 0;
        for (MilitaryUnit militaryUnit : militaryUnits){
            totalCausedDamage = totalCausedDamage + militaryUnit.doDamage();
        }
        return totalCausedDamage;
    }
}

package com.ejg.switchexpressions;

public class SwitchStatement {
    public int getDamageToPlanet(SingleUsePlastic plastic) {
        int damage = 0;

        switch (plastic) {
            case SPOON:
                damage = 10;
                break;
            case FORK:
                damage = 20;
            case STRAW:
                damage = 30;
                break;
            case BOTTLE:
                damage = 400;
                break;
        }

        return damage;
    }
}

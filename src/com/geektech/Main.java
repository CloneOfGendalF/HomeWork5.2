package com.geektech;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Hero heroes = new Hero(13,124,124325);
        System.out.println("жизни: "+ heroes.getHp() + "; бьет на: " + heroes.getDmg() +
                "; удар: " + heroes.getsDmg()+ "!!!");
        BigBoss bigBoss= new BigBoss(500,160,80);
        System.out.println(" У БигБосса не жизнь, а HP :"+bigBoss.getHpOfBb()+"   ; БигБосс не бьет, а Херачит!!! :"
                +bigBoss.getDmgOfBb()+"   ; Супер БигПАНЧ!!! :" + bigBoss.getsDmgOfBb());
    }
}


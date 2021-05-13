package com.geektech;

public class Hero {
    private int hp;
    private int dmg;
    private int sDmg;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp<=0)
            System.out.println("Умер чертенок");
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        if (dmg<=0)
            System.out.println("Он может ударить сильнее!!!");
        this.dmg = dmg;
    }

    public int getsDmg() {
        return sDmg;
    }

    public void setsDmg(int sDmg) {
        if (sDmg<=dmg)
            System.out.println("Слабоватый супер удар (");
        this.sDmg = sDmg;
    }

    public Hero(int hp, int dmg, int sDmg ){
        this.hp = hp;
        this.dmg = dmg;
        this.sDmg = sDmg;

    }
    public Hero (int hp, int dmg){
        this.hp=hp;
        this.dmg=dmg;
    }
}

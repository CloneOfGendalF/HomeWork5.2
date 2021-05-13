package com.geektech;

public class BigBoss {
    private int hpOfBb;
    private int dmgOfBb;
    private int sDmgOfBb;

    public int getHpOfBb() {
        return hpOfBb;
    }

    public void setHpOfBb(int hpOfBb) {
        if (hpOfBb <= 0)
            System.out.println("Писец БигБоссу");
        this.hpOfBb = hpOfBb;
    }

    public int getDmgOfBb() {
        return dmgOfBb;
    }

    public void setDmgOfBb(int dmgOfBb) {
        if (dmgOfBb <= 0)
            System.out.println("Хера себе БигБосс слабак!");
        this.dmgOfBb = dmgOfBb;
    }

    public int getsDmgOfBb() {
        return sDmgOfBb;
    }

    public void setsDmgOfBb(int sDmgOfBb) {
        if (dmgOfBb<=0)
            System.out.println("Этот удар недостоин БигБосса!!!(");
        this.sDmgOfBb = sDmgOfBb;
    }

    public BigBoss(int hpOfBb, int dmgOfBb, int sDmgOfBb){
        this.hpOfBb = hpOfBb;
        this.dmgOfBb = dmgOfBb;
        this.sDmgOfBb = sDmgOfBb;
    }
}

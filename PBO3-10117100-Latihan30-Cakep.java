package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jawab = new Scanner (System.in);
        System.out.println((char)27 +"[01;35mKamu " +(char)27 +""
                + "[01;32mNgerjain Sendiri" +(char)27 +"[01;33mLatihan 17 Sampai " +
                (char)27 +"[01;34mLatihan 30 Ini?");

        System.out.print((char)27+"[01;34mJawab "+(char)27+
                "[01;35m(Yoi/Enggak) : ");
        String keterangan = jawab.next();

        System.out.println("");
        if("Yoi".equals(keterangan)||("yoi".equals(keterangan))){
            System.out.println((char)27+"[01;31mCakep Bener."+(char)27+
                    "[01;35mGood Job!!");
        }
        if("Enggak".equals(keterangan)||("enggak".equals(keterangan))){
            System.out.println((char)27+"[01;31mTetep Cakep Sih.");
            System.out.println((char)27+"[01;36mSingPenting Paham Konsepnya yee"
                    + ".");
            System.out.println("Keep the code works dude!");
        }

    }
}

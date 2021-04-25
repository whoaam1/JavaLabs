package com.company;

public class App {
    public static void main(String[] args){
        Squeezer Tefal = new Squeezer();
        System.out.println(Tefal);

        Squeezer Samsung = new Squeezer("Samsung", 12, 64, "Black");
        System.out.println(Samsung);

        Squeezer LG = new Squeezer("LG", 12, 32, "Silver", 100,
                "Germany", 10, 2.4, "Metalic", 20,
                30, 0);
        System.out.println(LG);

        Squeezer.printStaticWeight();
        Samsung.printWeight();
    }
}

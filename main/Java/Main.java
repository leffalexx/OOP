package Sem1.main.Java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> list = new ArrayList<>();
        list.add(new Sharpshooter());
        list.add(new Archer());
        list.add(new Monk());
        list.add(new Enchanter());
        list.add(new Peasant());
        list.add(new Pikeman());
        list.add(new Rogue());

        System.out.println(list);
    }
}
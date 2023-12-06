package Abstrakte_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Geräuschermacher>arrayList=new ArrayList<>();
        Auto auto=new Auto();
        Hund hund=new Hund();
        Mensch mensch=new Mensch();
        arrayList.add(hund);
        arrayList.add(auto);
        arrayList.add(mensch);

        for (Geräuschermacher a:arrayList
             ) {
           a.macheGeräusch();


        }

    }
}

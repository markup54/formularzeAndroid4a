package com.example.formularz;

import java.util.ArrayList;

public class JezykiRepo {
    public static ArrayList<Jezyk> jezyki = new ArrayList<>();

    public  static void wypelnijTablice(){
        jezyki.clear();
        jezyki.add(new Jezyk("PHP",R.drawable.obraz1));
        jezyki.add(new Jezyk("Python",R.drawable.obraz2));
        jezyki.add(new Jezyk("Ruby",R.drawable.obraz3));
        jezyki.add(new Jezyk("Java",R.drawable.obraz5));
    }
    public static ArrayList<Jezyk> zwroc(){
        wypelnijTablice();
        return jezyki;
    }

}

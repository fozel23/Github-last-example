package kisiselKullanim;

import java.util.Scanner;

public class AnaClass {
    public static void main(String[] args) {



        System.out.println("ortak classda değişiklik yaptım");

        System.out.println("feyzullah branchinde ortak classda 2. değişiklik yaptım");


        Scanner oku= new Scanner(System.in);
        String st1,st2;
        st1= oku.nextLine();
        st2= oku.next();
        String st3=st1+st2;
        System.out.println("ekrandan okunan " +st1);
        System.out.println("okunan2"  +st2);
        System.out.println("st3= "  +st3);


    }
}

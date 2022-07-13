package br.com.dio.model;

// Exemplos de tipos de dados

public class TipoDeDados {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; ultrapassa o limite que o short pode suportar

        //int i1 = -10000000000; o limite é inferior para inteiros
        int i2 = 28500;

        long l1 = 1000000000000000000L; //L para dizer que é long
        long l2 = 204005000500055000L;

        //float f1 = 4,5;
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.04D;

        char c1 = 'W';
        //char c2 = 'tr'; somente um caracter
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag de se at ki456% 7890";

        //string st4 = "09/10/2022";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}

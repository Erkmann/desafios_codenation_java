package br.com.codenation;

import jdk.nashorn.internal.parser.JSONParser;

public class Testes {

    public static void main(String[] args) {
        int[] ints = new int[] {1,2,3,4,5};

        System.out.println(ints.length/2);

        System.out.println(StatisticUtil.median(new int[] {6,2,4,5,5,6}));
    }


}

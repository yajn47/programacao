package com.unama;

import java.util.Scanner;

public class letrab {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int produzido,defeito;
        System.out.println("informe o total produzido");
        produzido = sc.nextInt();
        System.out.println("informe com defeito");
        defeito = sc.nextInt();
        double limiar = produzido*0.1;
        if(defeito<=limiar) {
            System.out.println("não precisa de manutenção");
        }else{
            System.out.println("precisa de manutenção");
        }
    }
}

package com.unama;

import java.util.Scanner;

public class letrac {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("informe a idade");
        idade = sc.nextInt();
        if (idade <= 10) {
            System.out.print("infantil");
        } else if (idade>10 && idade <= 17) {
        System.out.print("juvenil");
    }else{
        System.out.print("senior");
        }
    }
}

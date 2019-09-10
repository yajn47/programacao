package com.unama;

import java.util.Scanner;

class letrad {

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x;
	int y;
	int z;
        System.out.println("Informe o valor de x: ");
        x = sc.nextInt();
        System.out.println("informe o valor de y: ");
        y = sc.nextInt();
        System.out.println("informe o valor de z: ");
        z = sc.nextInt();
    if (x < y + z || y < x + y || z < x + y){
        System.out.println("Trata-se de um triangulo");
    }
    if (x == y && x == z){
        System.out.println("Três lados iguais . Trata-se de um triangulo equilatero");
    }else if(x == y || x == z){
        System.out.println("dois lados iguais . trata-se de um triangulo isosceles");
    }else
        System.out.println("três lados diferentes");
    }
}

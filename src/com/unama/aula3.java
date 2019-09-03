package com.unama;

import java.util.Scanner;

 class aula3 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int totalCopias;
         System.out.println("informe o total copias: ");
         totalCopias=sc.nextInt();
         double TotalPago;
         if(totalCopias <= 100){
             TotalPago = totalCopias*0.25;
         }else{
             TotalPago = totalCopias*0.25;
         }
         System.out.println("total a ser pago é R$ "+TotalPago);

     }
}

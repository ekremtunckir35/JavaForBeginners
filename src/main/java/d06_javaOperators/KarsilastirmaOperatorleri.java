package d06_javaOperators;

import java.util.Scanner;

public class KarsilastirmaOperatorleri {

    public static void main(String[] args) {


  /*
  Verilerin birbirleriyle karsilastirilmasin da kullanilir.

  Sonuc dogru ise ---> true
  sonuc yanlis ise---->false degerini uretir.

    Karsilastirma operatorleri

    -Buyuk mu----         >           a > b
    -kucuk mu ---->       <           a < b
    -buyuk esit -->       >=          a>= b
    kucuk esit            <=          a<=b
    esit mi               ==          a == b
    esit degil            !=           a!=b



      */

        //Bir sayinin tek mi cift mi oldugunu bulan programi yaziniz

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi  = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Sayi cifttir");

        } else
            System.out.println("Sayi tektir");
//**************************************************************

//uc sayi icersinde en buyuk olani ekrana yazdiriniz
        int a =13 , b =5 , c=28;

        int enBuyuk;
        if(a >= b && a >=c) {
            enBuyuk = a;
        }else if (b >= a && b >=c) {
            enBuyuk = b;
        }else {
            enBuyuk = c;


        }
        System.out.println("En buyuk sayi : " +enBuyuk);




    }



}

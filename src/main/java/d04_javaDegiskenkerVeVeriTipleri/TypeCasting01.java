package d04_javaDegiskenkerVeVeriTipleri;

public class TypeCasting01 {

    public static void main(String[] args) {

        //3/2 nin tam kismini '1' i alir ve 4 sonucunu uretir
        System.out.println(Math.pow(4,(3/2)));//4 sonucunu uretir


        //Kesirli kismi elde etmek icin,sayi once float sarmalina alinir

        float x =(float)3/2;  //x = 1.5 olur
        System.out.println(Math.pow(4,x));//8

//float tipi degiskene atanan degerlerin sonuna "F" veya "f" harfi getirilir.
//long tipi degiskene atanan degerlerin sonuna ise "L" veya "l" harfi getirilir
//Sayet boyle yazilmazsa derleyici ya 10.05 i tamsayi olrak algilayacak
// ya da "Type Mismatch" yani tip uyusmazligi hatasi verecektir.


       // float a = 10.05f;
        //(float)10.05;

     // Buna gore bir variable float tipi veri sarmalinda  iki sekilde yazilir.
        float s1 =10.05f;
        //float s1 = (float)10.05;
    }
}

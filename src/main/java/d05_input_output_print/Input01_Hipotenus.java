package d05_input_output_print;

import java.util.Scanner;

public class Input01_Hipotenus {
    public static void main(String[] args) {


        //Soru :Kenar uzuunluklari klavyeden girilen bir dik ucgenin hipotenusunu,Pisegor teoremine gore hesaplayiniz

//Pisegor Teoremi = Bir dik ucgenin dik acisinin kenarlarinin uzunluklarinin karelerin toplami
//obur kenarinin uzunlugunun karesine esittir.seklinde tanimlanir.
        //yani a² = b² + c²
//


        double a;
        int b ,c;
        Scanner scann = new Scanner(System.in);
        System.out.printf("Gir,kenarlari\n");
        b= scann.nextInt();
        c= scann.nextInt();
        a= Math.sqrt(b * b +c *c);
        System.out.println("Hipotenus..:" + a);




























    }
}

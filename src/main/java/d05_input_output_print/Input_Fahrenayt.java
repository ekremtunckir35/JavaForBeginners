package d05_input_output_print;

import java.util.Scanner;

public class Input_Fahrenayt {

    public static void main(String[] args) {


//Kalvyeden Fahrenhayt(F) birimli sicaklik degerini alin,bu degeri Santigrat(C) birimine cevirip
        //ekrana F ve C degerlerini yaziniz


    Scanner scan = new Scanner(System.in);
        System.out.println("Gir, fahrenhayi \n");
        int F = scan.nextInt();
        float C;
        C =(float) ((F-32)/1.8);
        System.out.printf("Scaklik..:%.2f", C);
//***********************************************************





    }
}



package d05_input_output_print;

public class Escape {
    public static void main(String[] args) {

        //print/format komutlarinin format karakterleri ile kullanimina ornek bir uygulama yapiniz.

        int a =13;
        System.out.printf("%f\n",(float) a);
        System.out.printf("a=%d\n",a);
        System.out.printf("a=%X\n",a);
        System.out.printf("%c%n",'A');
        System.out.printf("%s%n","bade");
        System.out.format("%.2f\n",(float) a);
        System.out.format("%4d%n",a);
        System.out.format("%f\n",Math.PI);
        System.out.format("%.3f\n",Math.PI);
        System.out.format("%.7f%n",Math.PI);

//Yildiz karakterlerinden olusan bir dik ucgeni
// printf,formnat,print,println komutlarini kullanarak yazdiriniz.

        System.out.println("*\n**\n***\n****");
        System.out.print("*\n**\n***\n****\n");
        System.out.printf("*\n**\n***\n****\n");
        System.out.format("*\n**\n***\n****\n");
        System.out.printf("*%n**%n***%n****%n");
        System.out.format("*%n**%n***%n****%n");


    }
}

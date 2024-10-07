package d06_javaOperators;

public class JavadaSayiSistemleri {

    public static void main(String[] args) {


        int b = 1;
        int c = 2;
        int d = b & c;
        int e = b | c;
        int f = c >> 1;
        int g = c << 2;

        System.out.println("b =" + b);
        System.out.println("c = " + Integer.toBinaryString(c));
        System.out.println("b&c =" + Integer.toBinaryString(d));
        System.out.println("b|c =" + Integer.toBinaryString(e));
        System.out.println("c>>1 =" + Integer.toBinaryString(f));
        System.out.println("c<<2 =" + Integer.toBinaryString(g));
        //-------------------------------------------------------
        System.out.println("-------------------------------------");


        //ikili tabandaki 4 bitlik bir sayiyi diger sayi sistemlerine donusturen programi
        //yaziniz
        Integer sayi = 0b1100 ; //4 bitlik binary sayi
        //Sekizli(Octal ) karsiligi
        String sekizli = Integer.toOctalString(sayi);
        System.out.println("1100)8 = "+ sekizli);

        //onaltili (Hexdecimnal) karsiligi
        String onaltili = Integer.toHexString(sayi);
        System.out.println("(1100)16 = "+ onaltili);

        //onlu (Decimal) sayi karsiligi
        String onlu =Integer.toString(sayi);
        System.out.println("(1100)10 = "+ onlu);

        //Ikiliden Onlu Sisteme Donusum alternatif

        int ikili_Onlu = Integer.parseInt("1100",2);
        System.out.println("(1100)10 = "+ ikili_Onlu);


    }

    }



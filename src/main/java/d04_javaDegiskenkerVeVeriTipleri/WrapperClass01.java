package d05_input_output_print;

public class WrapperClass01 {

    public static void main(String[] args) {


        //Temel veri tiplerini String veri tipine donustuirmek icin "toString()" veya
        // "String.valueOf()" metotlari kullanilir.

        String sa =Integer.toString(18);
        String  ka = String.valueOf(18);
        System.out.println(sa + ka);//1818


    //String veri tipini diger veri tiplerine donusturmek icin "Tip.valueOf()" metodu na ek
    //olarak  "Tip.parse()" metodu da kullanilabilir.
    //"parse" ve "valueOf",String veri tipini -->byte,Double,Float,Integer,Long,Short gibi diger
    //veri tiplerinden birine dondurur.

    String name ="18";
    double s1 =Double.parseDouble(name);//18.0
    double s2 = Double.valueOf(name);//18/0
        System.out.println(s1 + s2);
    }
}

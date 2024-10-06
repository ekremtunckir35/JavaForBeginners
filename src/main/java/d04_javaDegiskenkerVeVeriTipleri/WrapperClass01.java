package d04_javaDegiskenkerVeVeriTipleri;

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

    public static class WrapperClass02 {
        public static void main(String[] args) {

            //PARSE TIP ORNEKLERI

            byte b = Byte.parseByte("8");//8
            short s = Short.parseShort("16");//16
            int i = Integer.parseInt("42");//42
            long L = Long.parseLong("55");//55
            float f = Float.parseFloat("4.2");//4.2

            double d = Double.parseDouble("9.99");//9.99
            boolean b2 = java.lang.Boolean.parseBoolean("true");//true
            System.out.println(b + s + i);//66
            System.out.printf(" %.2f\n", d+f+L);//69.19
            System.out.println("b2" + b2);//b2 true
        }
    }
}

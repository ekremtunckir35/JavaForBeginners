package d04_javaDegiskenkerVeVeriTipleri;

public class ExplicitCasting {


    public static void main(String[] args) {

//Buyuk veri tipinin kucuk veri tipine donusumune "Explicit Casting(manuel donusum)denir.
//Bu donusturmede veri kaybi yasanabilir.

    byte a;
    int b;
    b =0x1453; //(1453) 16 sayisi
    a=(byte) b;//int tipinden byte donusum

        System.out.printf("%x\n",a);
      //Esdegeri :System.out.println(Integer.toHexString(a));



    }
}

package d06_javaOperators;

public class MantiksalOperatorler {
    public static void main(String[] args) {


 /*
 Mantiksal Operatorler--> birden fazla veri birbiri ile kiyaslandiginda kullanilir.
 -Mantiksal operatorlerinin sonucu "boolean " degiskeninde tutulr.Sonuc olaral ya "true" ya da "false"
 uretilir.

 MANTIKSAL OPERATORLER
  AND(VE)           &&       ( A < B) && (B<C)

  OR (VEYA)         ||       (A < B || (B<C)

  DEGIL              !        (A < B)   !(A<B)


     && VE -----> KOSUL HER IKI TARAF DORU ISE SONUC ------> TRUE
                      AKSI TAKTIRDE   FALSE

    || VEYA ---> KOSULLRADAN HERHANGI BIRI DOGRU ISE  SONUC ----> TRUE
                  AKSI TAKTIRDE  FALSE

    ! DEGIL----> IFADENIN TERSINI ALIR
  */

        int a =5;
        int b =4;
        int c =3;
        boolean x,y,z;
        x =(a >= 0) && (b==c);//true && false
        y =(a >=0) || (b==c);//true || false
        z=!(c>a) || (c==a);
        System.out.print("x= "+x   + "\ny= "+y  + "\nz= "+z);
    }
}

package d04_javaDegiskenkerVeVeriTipleri;

public class Final01 {

    public static void main(String[] args) {

  /*Program icerisinde degismeyen ifadelere sabit denir. PI sayisi gibi..
  Bir degiskeni degismez bir degere sabitleme islemi icin ozel bir komut ile ifade edilir.
  Java dilinde degiskenleri sabit olrak tanimlamak icindegisken adinin onune "final"sozcugu
  getirilir.

  Sabit degerleri sayisal ve string olarak ikiye ayirabiliriz.
  "..." cift tirnak isaretleri arasina yazilan her turlu mesaj aslinda final dir.

  Finaller  ozellikle bilinen degerleri (Pi =3.14 gibi..) degiskenlere atamada kullanilir.
  Final atamasi ,kodlamayi ve kodun okunabilirlligini kolaylastirdigi icin programimizin
  bellekte daha az yer kaplamasina yardimci olur.





  */


        final int sayi = 5;
        final double pi = 3.14;
        System.out.println(sayi);
        System.out.println(pi);

    }
}

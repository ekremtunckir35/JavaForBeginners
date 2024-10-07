package d06_javaOperators;

public class ArtirmaVeAzaltmaOperatorleri {

    public static void main(String[] args) {


   /*
   -Sayac operatorleri de denir.
   Otomatik olrak bir artirma veya bir azaltma islemi yaparlar.
   a++ , a =a+1 ,a+=1 ayni isleve sahip
   a--,  a = a-1 , a-=1 ayni isleve sahip

   ++ --> on artirma a= ++b yani once degiskeni  1 artir, sonra kullan
   ++ --> son artirma a= b++ yani once degislen degerini al,kullan sonra 1 artir
   --      on cikarma  a =--b  yani once degisken degerini  1 azalt, sonra kullan
   --     son cikarma  a =b--   yani once degisken degerini al,kullan,sonra 1 azalt


    */

 //Ornek : on artirma ya da son asrirma operatorlerinin farkini gosterelim

  int x =30 ;
  int y = 25;
   int z = x * y++;
   int a = x* ++y;
        System.out.println(z);
        System.out.println(a);

        int m =8;
         int b = (m++ - m++);
         System.out.println(b);
// son ornekte  m =8 idi.sonra 1 artti m =9 oldu
//daha sonra  tekrar 1 artirildi m =10 oldu
//(m++ -m++) islemini ---> 0 -10 seklinde yorumlandi sonuc -1
    }
}

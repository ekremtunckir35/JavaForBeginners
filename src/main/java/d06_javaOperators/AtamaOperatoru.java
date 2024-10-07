package d06_javaOperators;

public class AtamaOperatoru {
    public static void main(String[] args) {


 /*
 -Aritmetiksel ya da sozel bir ifadeyi bir degiskene aktarmak icin " = " atama
 operatoru kullanilir.
 - " = " atama operatoru---> esitligin sagindaki ifadeyi soluna aktarir.
   a =3 ifadesinde  a degiskenine 3 degerini atamis oluyoruz.
  */

 //ornek : Toplam += i++; ifadesi  acilimi nedir

//toplam +=i++; yani-----> topam =toplam +1;    i=i +1;

int z =2;
int y =12;
z *=3;   //z =2*3
y/=z;     //y= 12/6
        System.out.println(z);
        System.out.println(y);

int a, b=1 , c=1;
a =++b + ++c;
        System.out.printf("%d%d%d\n",a,b,c);

        a =b++ + c++;
        System.out.printf("%d%d%d\n",a,b,c);

        a =b-- + --c;
        System.out.printf("%d%d%d\n",a,b,c);

    }
}

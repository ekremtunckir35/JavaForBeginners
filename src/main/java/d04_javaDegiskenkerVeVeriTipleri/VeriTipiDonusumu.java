package d04_javaDegiskenkerVeVeriTipleri;

public class VeriTipiDonusumu {

    public static void main(String[] args) {

    }

    public static class EnumConstantOrnek2 {
        public static void main(String[] args) {

            enum Mevsim{ilkbahar,yaz,sonbahar,kis}
            System.out.println("Havalar:");
            System.out.println("Coki soguk.Mevsim :" + Mevsim.kis);
            System.out.println("Coki sicak.Mevsim :" + Mevsim.yaz);
            System.out.println("ruzgarli.Mevsim :" + Mevsim.sonbahar);
            System.out.println("yagmurlu.Mevsim :" + Mevsim.ilkbahar);


        }




    }
}

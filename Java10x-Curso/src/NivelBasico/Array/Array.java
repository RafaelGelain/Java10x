package NivelBasico.Array;

public class Array {
    public static void main(String[] args) {
        /*
        * Array :
        * */

         String[] ninja = new String[4];
         ninja[0] = "Naruto Uzumaki";
         ninja[1] = "Sasuke Uchiha";
         ninja[2] = "Sakura Haruno";

         int[] idade = new int[3];
         idade[0] = 3;
         idade[1] = 4;

        for (int i = 0; i < 4; i++) {
            System.out.println(ninja[i]);
        }
    }
}

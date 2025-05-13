package NivelBasico.Array;
                    /*
                     *   Representacao Visual / Seria um 3x3 sendo o primeiro [] a linha e o segundo [] a coluna.
                     *   # # #
                     *   # # #
                     *   # # #
                     * */
public class Array2D {
    public static void main(String[] args) {
        String[][] ninjaEAldeias = new String[3][3];
        /*   0 # #   */
        ninjaEAldeias[0][0] = "Konoha";
        /*   # 0 #   */
        ninjaEAldeias[0][1] = "Naruto Uzumaki";
        /*   # 0 0   */
        ninjaEAldeias[0][2] = "Sasuke Uchiha";

        /*   1 # #   */
        ninjaEAldeias[1][0] = "Nevoa";
        /*   # 1 #   */
        ninjaEAldeias[1][1] = "Zabuza";
        /*   # 0 1   */
        ninjaEAldeias[1][2] = "Haku";

        /*   2 # #   */
        ninjaEAldeias[2][0] = "Areia";
        /*   # 2 #   */
        ninjaEAldeias[2][1] = "Gaara";
        /*   # 0 2   */
        ninjaEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjaEAldeias.length; i++) {
            System.out.println(ninjaEAldeias[i][1]);
        }

    }
}

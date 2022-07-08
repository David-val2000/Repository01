/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d;

/**
 *
 * @author Homa
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0, i = 0, j = 0, operacion = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < i; j++) {
                operacion = i + j - 1;
                switch (operacion) {
                    case -1:

                        break;
                    case 0:
                        x = x + 1;
                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:
                        x = x + 2;
                        break;
                    default:
                        x = x + 3;
                }

                 System.out.println("i "+j);
                //System.out.println("j "+j);
                //System.out.println("o"+operacion);
                System.out.println(x);
            }

            //System.out.println("operaicon"+operacion);
            //System.out.println("j: " + j);
        }

        // System.out.println("segindo: " + x);
    }

}

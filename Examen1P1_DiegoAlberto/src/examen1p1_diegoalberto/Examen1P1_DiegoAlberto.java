/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_diegoalberto;

import java.util.Scanner;

/**
 *
 * @author 50432
 */
public class Examen1P1_DiegoAlberto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//Scanner

        System.out.println("1. Sumador Binario");
        System.out.println("2. Forma");
        System.out.println("3. Salir ");
        int opcion = sc.nextInt();
        //Menu
        if (opcion != 3) {
            switch (opcion) {
                case 1: {//Ejercicio 1
                    System.out.println("Ingrese la primera cadena"); 
                    String cadena1;
                    cadena1 = sc.next();
                    System.out.println("Ingrese la segunda cadena");
                    String cadena2;
                    cadena2 = sc.next();
                    char n = 0;
                    char n2 = 3;
                    char n3 = 4;
                    char n4 = 5;
                    char n5 = 6;
                    char n6 = 7;
                    char n7 = 8;
                    char n8 = 9;

                    if (cadena1.length() != cadena2.length()) {
                        System.out.println("Las cadena deben tener la misma cantidad de bytes");
                    }//Primera validacion del ejercicio 1
                    for (int i = 0; i == 0; i++) {
                        System.out.println(cadena1 + "" + cadena2);
                       
                    }

                }

                break;
                case 2: {//Ejercicio 2
                    System.out.println("Ingrese el tamaño de la figura");
                    int val;
                    val = sc.nextInt();

                    if (val < 9) {
                        System.out.println("el numero debe ser mayor que 9");
                        System.out.println("");// Primera validacion del ejercicio 2
                    } else {
                        for (int i = 0; i <= val; i++) {
                            for (int j = 0; j <= val; j++) {//INtento de figura
                                System.out.println("     *     ");
                                System.out.println("***********");
                                System.out.println(" * +   + * ");
                                System.out.println("  *     *  ");
                                System.out.println(" + *   * + ");
                                System.out.println("++++*+*++++");
                                System.out.println("     *     ");
                            }
                            System.out.println("");

                        }
                    }
                }
                break;
                case 3: {
                    System.out.println("Gracias, adios");
                }
                break;

            }
            System.out.println("1. Sumador Binario");
            System.out.println("2. Forma");
            System.out.println("3. Salir ");
            opcion = sc.nextInt();
        }

    }
}

package util;

import java.util.Scanner;

// Eu sou Bob o ajudante!
// Fui feito para simplificar seu código.
// Extenda suas classes com esta para que eu possa facilitar o seu trabalho.

public class Helper {

    // Printer:

    // Estas funções sempre irão dar um \n no final.
    // Você pode mudar isso se quiser.

    public static void print(Object aux) {
        System.out.println(aux);
    }

    public static void print() {
        System.out.println();
    }

    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
        print();
    }

    // Scanner:

    // Não use 'scan.close'.
    // Você pode incluir novas funções conforme a necessidade.

    static Scanner scan = new Scanner(System.in);

    public static int nextInt() {
        return scan.nextInt();
    }

    public static double nextDouble() {
        return scan.nextDouble();
    }

    public static String nextLine() {
        return scan.nextLine();
    }

    public static float nextFloat() {
        return scan.nextFloat();
    }

    public static short nextShort() {
        return scan.nextShort();
    }
}
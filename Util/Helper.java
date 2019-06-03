package util;

import java.util.Scanner;

// Eu sou Bob o ajudante!
// Fui feito para simplificar seu código.
// Extenda suas classes com esta para que eu possa facilitar o seu trabalho.

public class Helper {

    // Printer:

    public static void print(Object aux) {
        System.out.print(aux);
    }

    public static void println() {
        System.out.println();
    }

    public static void println(Object aux) {
        System.out.println(aux);
    }

    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
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

    public static String next() {
        return scan.next();
    }

    public static float nextFloat() {
        return scan.nextFloat();
    }

    public static short nextShort() {
        return scan.nextShort();
    }
}
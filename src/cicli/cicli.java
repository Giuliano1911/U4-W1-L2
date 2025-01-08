package cicli;

import java.util.Scanner;

public class cicli {
    public static void main(String[] args) {
        whi();

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int n = Math.abs(Integer.parseInt(scanner.nextLine()));
        fo(n);
    }

    static void whi() {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (!str.equals(":q")) {
            System.out.println("inserisci una stringa");
            str = scanner.next();
        }
    }

    static void fo(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}

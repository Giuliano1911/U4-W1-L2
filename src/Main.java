import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una stringa");
        String str = scanner.next();
        System.out.println(stringaPariDispari(str));

        System.out.println("inserisci un anno");
        int anno = scanner.nextInt();
        System.out.println(anniBisestile(anno));

        System.out.println("inserisci un anno");
        int n1 = scanner.nextInt();
        zeroTre(n1);
    }

    @org.jetbrains.annotations.Contract(pure = true)
    static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

    static boolean anniBisestile(int n) {
        return (n % 400 == 0) || (n % 4 == 0 && n % 100 != 0);
    }

    static void zeroTre(int n) {
        switch (n) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("non è compreso tra 0 e 3");
        }
    }
}
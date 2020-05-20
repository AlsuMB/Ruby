import java.util.Scanner;

public class Run {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write len of sequence: ");
        int iteration = sc.nextInt();
        System.out.print("And write start number: ");
        String newWord = sc.next();
        Ruby ruby = new Ruby();
        for (int i = 0; i < iteration; i++) {
            System.out.println(newWord);
            newWord = ruby.newWord(String.valueOf(newWord));
        }
    }
}

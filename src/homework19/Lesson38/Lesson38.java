package homework19.Lesson38;

import java.io.IOException;
import java.util.Scanner;

public class Lesson38 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new ScannerException("Пользователя ввел не ноль");
            }
        }
    }
}

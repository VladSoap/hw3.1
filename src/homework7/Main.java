package homework7;
class CheckedException extends Exception {
    public CheckedException(String message) {
        super(message);
    }
}
class UncheckedException extends RuntimeException {
    public UncheckedException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (CheckedException e) {
            System.out.println("Поймано проверяемое исключение: " + e.getMessage());
        }

        try {
            throwUncheckedException();
        } catch (UncheckedException e) {
            System.out.println("Поймано непроверяемое исключение: " + e.getMessage());
        }
    }
    public static void throwCheckedException() throws CheckedException {
        throw new CheckedException("Проверяемое исключение");
    }
    public static void throwUncheckedException() {
        throw new UncheckedException("Непроверяемое исключение");
    }
}

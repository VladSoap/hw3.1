package homework6;
public class Main {
    public void throwExceptions() throws Exception {
        try {
            throw new Exception("Exception found in try block");
        } catch (Exception e) {
            throw new Exception("Exception found in catch block");
        } finally {
            throw new Exception("Exception found in finally block");
        }
    }
    public static void main(String[] args) {
        Main example = new Main();
        try {
            example.throwExceptions();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
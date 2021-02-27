package junit;

public class OwnTest {

    public static void main(String[] args) {
        final NumberService numberService = new NumberService();
        final int count = numberService.count(5, 7);
        if(count == 12) {
            System.out.println("Test is true");
        } else{
            System.err.println("Test is false");
        }
    }
}

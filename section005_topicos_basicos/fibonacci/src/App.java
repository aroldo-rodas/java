public class App {
    public static void main(String[] args) throws Exception {
        int a = 0, b = 1;

        // Fn = F(n - 2) + F(n - 1)
        for(int i = 0; i < 20; i++) {
            int temp = a + b;

            a = b;
            b = temp;

            System.out.println(b);
        }
    }
}

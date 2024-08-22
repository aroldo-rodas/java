import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();
        
        System.out.print("How many values?");
        int quantity = sc.nextInt();

        for(int i = 0; i < quantity; i++) {
            System.out.print("value: ");
            int value = sc.nextInt();
            ps.addValue(value);
        }

        sc.close();
        ps.print();
    }
}

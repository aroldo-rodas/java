import java.util.TreeMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "bagio");
        cookies.put("email", "bagio@gmail.com");
        cookies.put("phone", "99696969");

        System.out.println("TODOS OS COOKIES");

        //Para cada s continda em Map.key
        for(String s: cookies.keySet()) {
            System.out.println(s + ": " + cookies.get(s));
        }

        System.out.println();

        System.out.println("Contém 'email': " + cookies.containsKey("email"));
        System.out.println("Email: " + cookies.get("email"));
    }
}

package aplication;

import entities.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Maria", "maria@gememail.com");
        Cliente c2 = new Cliente("Maria", "alex@gememail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}

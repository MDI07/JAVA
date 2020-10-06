package HashSetDemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> h = new HashSet<>();

        h.add("Java");
        h.add("C++");
        h.add("Python");
        h.add("Swift");
        h.add("JS");

        System.out.println(h);
        System.out.println("List contains Java or not: " + h.contains("Java"));

        h.remove("JS");
        System.out.println("List after removing JS: " + h);
        for (String s : h) {
            System.out.println(s);
        }
    }
}

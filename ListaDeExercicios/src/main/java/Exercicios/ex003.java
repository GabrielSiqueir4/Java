package Exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex003 {
    public static void main(String[] args) {
        Map<String, List<String>> map =
                new HashMap<String, List<String>>();
        map.put("joao", new ArrayList<>());
        map.get("joao").add("losartana");
        map.put("julia", new ArrayList<>());
        map.get("julia").add("remedio para diabetes");
        for (Map.Entry<String, List<String>> m : map.entrySet()) {
            System.out.println("nome : " + m.getKey() + " >medicamentos " + m.getValue());

        }

    }
}

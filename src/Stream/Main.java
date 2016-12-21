package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(10,"Bob"));
        list.add(new Person(20,"Alice"));

        Map m = Streams.of(list)
                    .filter(p->p.getAge() > 15)
                    .transform(p -> new Person(p.getAge() + 1, p.getName()))
                    .toMap(p->p.getName(),p->p);


        System.out.println(m);

    }
}

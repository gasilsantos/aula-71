import java.util.ArrayList;

public class ArrayList01 {
    
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>(2);

        System.out.println(names.size());


        names.add("mariazinha");
        names.add("Pafuncio silveira");

        System.out.println(names.size());

        names.add("remo");

        System.out.println(names.size());

        System.out.println(names);

        names.remove(0);
        names.remove("mariazinha");

        System.out.println(names.size());

        names.add("breman");

        System.out.println(names.get(0));

        if (names.contains("bremam")){
            System.out.println("contén");
        } else {
            System.out.println("não contém");
        }

        System.out.println(names.size());

        System.out.println(names);



    }

}


import java.util.*;

class Arraylists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> name = new ArrayList<String>();


        // add elements
        list.add(0);
        list.add(9);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(7);
        list.add(1);

        name.add("kona");
        name.add("Siyam");
        name.add("Soheli");
        name.add("Arefin");
        name.add("Rafin");

        System.out.println(list);
        
        // name.add(2, "Sayed");
        name.set(2, "Sadia");
        System.out.println(name);


        String elements = name.get(4);
        System.out.println(elements);

        name.remove(1);
        System.out.println(name);


        int size = list.size();
        System.out.println(size);

        Collections.sort(list); 
        System.out.println(list);
    }
}
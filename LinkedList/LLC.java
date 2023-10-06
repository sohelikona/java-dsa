package LinkedList;

import java.util.LinkedList;

public class LLC {
       public static void main(String args[]) {
      LinkedList<String> list = new LinkedList<String>();


      list.addFirst("Kona");
      list.addFirst("name");
      list.addFirst("my");
      System.out.println(list);
     
      list.add(2, "is");
      System.out.println(list);
   }

}

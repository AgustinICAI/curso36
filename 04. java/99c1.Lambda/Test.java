import java.util.ArrayList;
import java.util.HashMap;


public class Test{
    public static void main(String argv[])
    {
        ArrayList<String> al = new ArrayList<>();

        al.add("Hola");
        al.add("QUE TAL");
        al.add("ESTAS");

        al.forEach( a -> System.out.println(a));
        //al.forEach( (Object a) -> System.out.println(a));

        HashMap<String,String> hm = new HashMap<>();

        hm.put("PEPE","NAVARRO");
        hm.put("PEPU","HERNANDEZ");
        hm.put("PEPA","JUAN");

        /*for(Map.Entry<String,String> m : hm)
        {
            System.out.println(m.getKey() + "-" +m.getValue());
        }*/

        hm.forEach( (k,v) -> System.out.println(k + "-" + v) );

    }
}
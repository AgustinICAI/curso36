public class App {
    public static void main (String argv[])
    {
        String s = "Hola buenas tardes";

        System.out.println(s.length() - s.replaceAll("a","").length());

        String s1 = "";
        String s2 = "";
        StringBuilder sb1 = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
            //s1 = s.substring(i,i+1) + s1;
            sb1.insert(0,s.charAt(i));

        StringBuilder sb2 = new StringBuilder();
        for(int i = s.length(); i > 0; i--)
            s2 = s2 + s.substring(i-1,i);

        for(int i = s.length()-1; i >= 0; i--)
            sb2.append(s.charAt(i));

        System.out.println(s1);
        System.out.println(s2);

        String s3 = "Hola" + "que" + "tal" + "como" + "estas";

        StringBuilder sb = new StringBuilder();
        sb.append("estas");

        sb.append("Hola").append(" que").append(" ").append("tal");

        System.out.println(sb);


        String s4 = "3123";

        int i4 = Integer.parseInt(s4);

        Integer i44 = Integer.valueOf(s4);

        char c0 = 'b';

        double d = 54.6d;
        float f = (float)d;
        char c = (char)f;
        char c1 = 33;


        System.out.println("Hola, 1+2 es "+ (1+2) + c1);



    }

}

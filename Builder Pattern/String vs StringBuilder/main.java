public class main {

    public static boolean equals2(StringBuilder sb1, StringBuilder sb2) {
        if(sb1.length() != sb2.length())
            return false;
        else {
            for(int i=0; i<sb1.length(); i++) {
                if(sb1.charAt(i) != sb2.charAt(i) )
                    return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        System.out.println("String is immutable while StringBuilder is not.");
        String s = "a string";
        System.out.println(s + s.hashCode());
        s += "AA";
        System.out.println(s + s.hashCode());
        StringBuilder b = new StringBuilder("a stringbuilded");
        System.out.println(b.toString() + s.hashCode());
        b.append("AA");
        System.out.println(b.toString() + s.hashCode());

        System.out.println("String's equality method works as expected but not with StringBuilder");
        final String STR = "fin";
        String s1 = new String(STR);
        String s2 = new String(STR);
        System.out.println("s1 equals s2:"+ s1.equals(s2));
        StringBuilder sb1 = new StringBuilder(STR);
        StringBuilder sb2 = new StringBuilder(STR);
        //System.out.println("sb1 equals sb2:"+sb1.equals(sb2));
        System.out.println("sb1 equals sb2:"+equals2(sb1,sb2));


        System.out.println("String concatenation takes shorter with StringBuilder, ie. StringBuilder's performance is better.");
        String sm = "fast";
        StringBuilder bm = new StringBuilder("fast");
        long start = System.nanoTime();
        sm+="est";
        long end = System.nanoTime();
        double stringTime = end - start;
        System.out.println("Time taken by String concatenation: "+ stringTime + "ns");
        start = System.nanoTime();
        bm.append("est");
        end = System.nanoTime();
        double sBTime = end - start;
        System.out.println("Time taken by StringBuilder concatenation: "+ sBTime + "ns");
        if(stringTime > sBTime) {
            System.out.println("StringBuilder has better performance.");
        }else
            System.out.println("String has better performance.");
    }
}

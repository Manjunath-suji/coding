import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Maths
//    float y=-4.0f;
//        System.out.println(Math.abs(y));
//        System.out.println(Math.cbrt(8));
//        System.out.println(Math.ceil(0.4));
//        System.out.println(Math.floor(0.4));
//        System.out.println(Math.floor(-2.1));
//        System.out.println(Math.PI);
//        System.out.println(Math.toRadians(90));
//        System.out.println(Math.toDegrees(1.5707963267948966));
//        System.out.println(Math.cos(Math.toDegrees(0)));
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.sin(Math.toRadians(90)));
//        System.out.println(Math.exp(0));
//        System.out.println(Math.expm1(0));
//        System.out.println(Math.floorMod(10,4));
//        System.out.println(Math.round(0.4));//returns long or int value
//        System.out.println(Math.rint(0.4));//returns double value
//        System.out.println(Math.max(4,5));
//        System.out.println(Math.min(4,5));
//        System.out.println(Math.pow(2,3));
//        System.out.println(Math.random()*6);//any value between 0 and 1
//        System.out.println(Math.scalb(2,3));//= 2*Math.pow(2,3);

//String methods
//
//String h=
//"Aello";
//String y="hello world";
//String ans="";
//int n=4;
//char[] k={'l','k','f','g'};
//        System.out.println(h.charAt(0));//char
//        System.out.println(h.codePointAt(0));
//        System.out.println(h.codePointBefore(1));
//        System.out.println(h.codePointCount(0,h.length()));//(start index,end index) end index not included
//        System.out.println(h.compareTo("Aelle"));// uses unicode values//returns 0 if equal,<0 if if string is less,>0 if string is greater
//        System.out.println(h.equals("Aello"));
//        System.out.println(h.compareToIgnoreCase("AEllo"));//same as above
//        System.out.println(h.equalsIgnoreCase("AEllo"));
//        System.out.println(h.concat("hjg"));
//        System.out.println(h);
//        System.out.println(h.contains("lloh"));//boolean
//        System.out.println(y.contentEquals("hello world"));//exactly match
//        System.out.println(y.compareTo("hello world"));
//        ans=String.copyValueOf(k,0,k.length);//copy char array elements to string
//        System.out.println(ans);
//        System.out.println(y.endsWith("world"));
//        System.out.println(y.startsWith("hell"));
//        String f="hi %s my age is %d";
//        System.out.println(String.format(f,"sharath",12)); //%s for string
//        System.out.println(Arrays.toString(h.getBytes()));
// char[] w={'h','g','f'};
// String[] q={"er","yu"};
// String d="errf";
// String a="errf";
//        String u= String.join(".","fgh");
//                System.out.println(u);
//        d.getChars(0,1,w,1);
//        System.out.println(Arrays.toString(w));
//        System.out.println(d.indexOf('e'));
//        System.out.println(d.indexOf('e',1));
//        System.out.println(u.isEmpty());
//        System.out.println(d.lastIndexOf('r'));
//        System.out.println(d.regionMatches(1,a,1,2));
//        System.out.println(d.replace('e','f'));
//        System.out.println(d);
//        System.out.println(d.replaceAll("errf","efghf"));
//        StringBuilder b=new StringBuilder("efff");
//        StringBuilder v=new StringBuilder("efff");
//        if(b.compareTo(v)==0){
//            System.out.println("hello");
//        }
//        System.out.println(d.replaceFirst("r","dog"));
//        String j="ghj,fgh  tyu.hjk kj";
//        //String c="[,\\.\\s]";
//        String[] m=j.split("\\.");
//        System.out.println(Arrays.toString(m));
////        for(String s:m){
////            System.out.println(s);
////        }
//        System.out.println(j.subSequence(0,4));
//        System.out.println(j.substring(0,4));
//        String o="12";
//        String x=Integer.toString(12);
//        System.out.println(x);
//        System.out.println(Integer.parseInt(String.valueOf(o.charAt(0))));
//        System.out.println(String.valueOf(o));
//        System.out.println(Arrays.toString(j.toCharArray()));
//        System.out.println(j.trim());
//String builder
//        String g="absDcs";
//        StringBuilder b = new StringBuilder(g.toLowerCase());
//        b.setCharAt(0,Character.toUpperCase(g.charAt(0)));
//        System.out.println(b);
//        System.out.println(b.charAt(0));
//        System.out.println(b.codePointAt(0));
//        b.append("ghjj");
//        System.out.println(b);
//        b.delete(0,4);
//        System.out.println(b);
//        b.deleteCharAt(0);
//        char[] h=new char[4];
//        b.getChars(0,4,h,0);
//        System.out.println(Arrays.toString(h));
//        System.out.println(b.length());
//        String q=b.toString();
//        System.out.println(q);
//        b.appendCodePoint(65);
//        System.out.println(b);
//        System.out.println(b.lastIndexOf("j"));
//        System.out.println(b.codePointCount(0,b.length()));
//
//        System.out.println(b.replace(1,1,"java"));
//        System.out.println(b.reverse());
//        b.setCharAt(1,Character.toLowerCase(b.charAt(0)));
//        System.out.println(b);
//        b.setLength(5);
//        System.out.println(b);
//        System.out.println(b.subSequence(1,3));
//        System.out.println(b.substring(1,3));
//        b.insert(1,"java");
//        System.out.println(b);
//        b.insert(1,'D');
//        System.out.println(b);

//// StringBuffer
//        StringBuffer c=new StringBuffer("asdfghk");
//        System.out.println(c);
//        System.out.println(c.append("uk"));
//        System.out.println(c.insert(1,'j'));
//        System.out.println(c.replace(1,3,"jhfd"));
//        System.out.println(c.reverse());
//        System.out.println(c.length());
//        System.out.println(c.charAt(0));
//        System.out.println(c.subSequence(0,3));
//        System.out.println(c.substring(0,3));
//        c.setCharAt(0,'D');
//        System.out.println(c);
//        String z= c.toString();
//        System.out.println(z);
//        System.out.println(c.indexOf("d"));
//        System.out.println(c.lastIndexOf("d"));
//        System.out.println(c.delete(1,3));
//        System.out.println(c.deleteCharAt(0));
//        System.out.println(c.length());
//        c.setLength(3);
//        System.out.println(c);
//        System.out.println(c.length());

// ArrayList
//        int[] u={1,2,3};
//        ArrayList<Integer> b=new ArrayList<>();
//        b.add(5);
//        b.add(6);
//        b.add(8);
//        b.add(1,10);
//        //System.out.println(b);
//        ArrayList<Integer> m=new ArrayList<>(b);
//        m.addAll(1,b);
//        m.add(7);
//        System.out.println(m);
//        System.out.println(m.get(2));
//       // b.clear();
//        System.out.println(b);
//        System.out.println(b.isEmpty());
//        System.out.println(m.contains(5));
//        System.out.println(m.indexOf(5));
//        System.out.println(m.lastIndexOf(5));
//        System.out.println(m.remove(1));
//        System.out.println(m);
//        System.out.println(m.remove(Integer.valueOf(5)));
//        System.out.println(m);
////        System.out.println(m.removeAll(b));
////        System.out.println(m);
//        System.out.println(m.removeIf(n->n%2==0));
//        System.out.println(m);
//        m.replaceAll(n->n+2);
//        System.out.println(m);
//        ArrayList<String> k=new ArrayList<>();
//        k.add("hello");
//        System.out.println(k);
//        k.replaceAll(n->n.toUpperCase());
//        System.out.println(k);
//        m.add(3);
//        m.add(5);
//        m.add(10);
//        m.add(8);
//        System.out.println(b);
//        System.out.println(m);
//        System.out.println(m.retainAll(b));
//        System.out.println(m);
//        System.out.println(m.set(1,18));
//        System.out.println(m);
//        System.out.println(m.size());
//        m.sort(null);
//        System.out.println(m);
//        Object[] l= m.toArray();
//
//        System.out.println(Arrays.toString(l));
//        System.out.println(l[0]);
//        m.add(5);
//        System.out.println(m.getLast());
//        System.out.println(m.getFirst());
//        m.sort(Comparator.reverseOrder());//sorts array in reverse order
//        System.out.println(m);


// Integer
//
//int i=4;
//        System.out.println(Integer.decode("125")+8);// for all octal hexa and decimal value
//        System.out.println(Integer.parseInt("125")+8);//only for decimal values
//        System.out.println(Integer.toString(4));
//        System.out.println(Integer.toBinaryString(i));
//        System.out.println(Integer.highestOneBit(3));//011 0+2+1
//        System.out.println(Integer.lowestOneBit(3));//011 0+2+1
//        System.out.println(Integer.numberOfTrailingZeros(4));//100 2
//        System.out.println(Integer.bitCount(i));
//        System.out.println(Integer.compare(5,4));
//        System.out.println(Integer.valueOf(i).floatValue());
//        System.out.println(Integer.reverse(4));
//        System.out.println(Integer.rotateLeft(4,1));
//        System.out.println(Integer.rotateRight(4,1));
//        System.out.println(Integer.valueOf("45"));//converts string to int

//Character
//        char[] v={'a','d','u'};
//        Character j='h';
//       char c=Character.valueOf('a');
//        System.out.println(c);
//        System.out.println(Character.codePointAt(v,0));
//        System.out.println(Character.codePointBefore(v,1));
//        System.out.println(j.compareTo('v'));
//        System.out.println(Character.forDigit(10,4));//converts the number  to specific radix
//        System.out.println(Character.isDigit('1'));
//        System.out.println(Character.isLetter('a'));
//        System.out.println(Character.isLetterOrDigit('1'));
//        System.out.println(Character.isLowerCase('a'));
//        System.out.println(Character.isUpperCase('A'));
//        System.out.println(Character.isWhitespace(' '));
//        System.out.println(Character.toString('v'));
//        System.out.println(Character.toUpperCase('v'));
//        System.out.println(Character.toLowerCase('F'));
//        char t='k';
//        System.out.println(Character.valueOf(t));
//        System.out.println(Character.toTitleCase('t'));

//Arrays
//
//     int[] g={1,4,5,6,7,5,4};
//     int[][] j={{1,2,3},{4,5,6}};
//        int[][] e={{1,2,4},{4,5,6}};
//        int[][] r={{1,2,3},{4,5,6}};
//        System.out.println(Arrays.binarySearch(g,0,g.length,4));
//        System.out.println(Arrays.toString(Arrays.copyOf(g,2)));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(g,0,3)));
//        System.out.println(Arrays.deepEquals(j,r));
//        System.out.println(Arrays.deepEquals(j,e));
//        System.out.println(Arrays.toString(j));
//        System.out.println(Arrays.deepToString(j));
//        Arrays.fill(g,1);
//        System.out.println(Arrays.toString(g));
//        Arrays.parallelSetAll(g,n->n*2);
//        int[] d={5,8,9,46,5,8,4};
//        Arrays.parallelSort(d);
//        System.out.println(Arrays.toString(d));
//
        int val=1;
        HashMap<Integer,Character> i=new HashMap<>();
        i.put(val,'a');
        i.put(2,'a');
        i.put(3,'f');
        System.out.println(i.entrySet());
        HashMap<Integer,Character> t=new HashMap<>();
        t.put(val,'a');
        t.put(2,'a');
        t.put(4,'f');
        System.out.println(t.entrySet());
        if(i.entrySet().equals(t.entrySet())){
            System.out.println("hello");
        }
        else {
            System.out.println("bye");
        }


















    }
}
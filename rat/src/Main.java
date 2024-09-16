import java.util.*;
import java.lang.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void ana(String h,String g){
        int sum1=0;
        int sum2=0;
        if(h.length()!=g.length()){
            System.out.println("not valid string");
            return;
        }
        for(int i=0;i<h.length();i++){
            sum1=sum1+h.codePointAt(i);
            sum2+=g.codePointAt(i);
            System.out.println(sum1);
        }
        if(sum1==sum2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }
    public static void arr(int[] arr){
      int count=0;int prev=0;
      int[] e=new int[count];
      if(arr.length==1){
          System.out.println(Arrays.toString(arr));
          return;
      }
      if(arr==null){
          return;
      }
      int i;
      for(i=0;i<arr.length-1;i++){
          if(arr[i]>arr[i+1]){
              prev++;

          }
          else{                              // 1 2 3 4 3 2 1 6 4 2 1 0
              if (prev > count) {


              count=prev;
              e=Arrays.copyOfRange(arr,i-prev,i+1);

              prev=0;}

          }
      }
      if(prev>count){
          count=prev;
          e=Arrays.copyOfRange(arr,i-prev,i+1);
      }
        System.out.println(Arrays.toString(e));
    }
    public static void hex(String f){
        int count=1;
        String ans=" ";
        for(int i=0;i<=f.length()-2;i++){
            if(f.charAt(i)== f.charAt(i+1)){
                count++;
            }
            else{
                ans=ans + count+f.charAt(i);
                count=1;
            }

        }
        count=1;
        if(f.charAt(f.length()-1)!=f.charAt(f.length()-2)){
            ans=ans+count+f.charAt(f.length()-1);
        }


        System.out.println(ans);


    }
     public static void converter(String n){
         String ans="";
         int count=0;


         for(int i=0;i<n.length();i++){
             if(n.charAt(i)=='1'){
                 count++;
             }
             else{
                 if(count>0)
                 {
                 ans= ans + (char)(65+(count-1));
                 count=0;}

             }
         }
         if(n.charAt(n.length()-1)=='1'){
             ans=ans+(char)(65+count-1);
         }

         System.out.println(ans);

     }

     public  static String cap(String s){

         s=s.toLowerCase();
         StringBuilder r=new StringBuilder(s);

         r.setCharAt(0,Character.toUpperCase(s.charAt(0)));
         System.out.println(r);
         String h=r.toString();
         return h;

    }



     public static int valid(String s,int g){

         int countn=0,counta=0;
         char[] t=s.toCharArray();
         if(g>4 && !(Character.isDigit(s.charAt(0)))){
         for(int i=0;i<t.length;i++){
             if(Character.isUpperCase(t[i])){
                 counta++;
             }
             if(Character.isDigit(t[i])){
                 countn++;
             }
             if(t[i]=='/' || t[i]==' '){
                 return 0;

             }
         }
         }

         if(counta>0 && countn>0){
             return 1;
         }

      return 0;
     }
     public static void eve(int[] arr){
         ArrayList<Integer> l=new ArrayList<>();
         ArrayList<Integer> h=new ArrayList<>();
         for(int i=0;i<arr.length;i++){
             if(i%2!=0){
                 l.add(arr[i]);

             }
             else{
                 h.add(arr[i]);
             }

         }
         l.sort(Comparator.naturalOrder());
         h.sort(Comparator.naturalOrder());
         System.out.println(l);
         System.out.println(h);
         System.out.println(l.get(l.size()-2)+h.get(h.size()-2));

     }

     public static int rat(int r,int unit,int n,int[] arr) {
     int count=0;
     int y=0;
     int need=r*unit;
     int sum=0;
     if(arr.length==0){
         return -1;
     }
     for(int i=0;i<n;i++){
         sum=sum+arr[i];
         count++;
         if(sum>=need){
             return count;
         }
     }



     return 0;}
    public static void sub(int k,int[] arr){
        int min=Integer.MIN_VALUE;
        int sum=0;
        int j=0;
        int[] e=new int[k];
        for(int i=0;i<arr.length-k+1;i++)
        {
            while( j<k){
                sum=sum+arr[i+j];
                j++;
            }
            if(i==0){
            if(min<sum){
                min=sum;
                sum=0;
                int o=i+k;
                e=Arrays.copyOfRange(arr,i,o);
            }}
            else if(sum<min){
              min=sum;
              sum=0;
              int o=i+k;
              e=Arrays.copyOfRange(arr,i,o);
            }
            sum=0;
            j=0;

        }
        System.out.println(Arrays.toString(e));
    }

    public static void large(String h){
         int prev=0;
         int count =0;
         int in = 0;
         if(h.charAt(0)=='0'){
             prev=0;
         }
         else{
             prev=1;
         }
         for(int i=1;i<h.length();i++){
             if(h.charAt(i)=='1'){
                 prev++;
             }
             else if(h.charAt(i)=='0'){

                 if(count<prev){
                     count=prev;
                     in=i;
                 }

                 in=in-prev+1;
                 prev=0;
             }
         }
        System.out.println(count);


    }
    public static void repla(String h,char f){
        ArrayList<Character> l=new ArrayList<>();
        int count=1;
        int prev=0;
        char e=h.charAt(0);
        for(int i=0;i<h.length()-1;i++)
        {
            if(l.contains(h.charAt(i))){
                continue;
            }
            for(int j=i+1;j<h.length();j++){
                if(h.charAt(i)==h.charAt(j)){
                    count++;
                }
            }
            if(count>prev){
                prev=count;
                e=h.charAt(i);
                count=1;
            }

        }
        System.out.println(h.replace(e,f));
    }

    public static int op(String h){
         int result=Integer.parseInt(String.valueOf(h.charAt(0)));
         for(int i=1;i<h.length();i=i+2){
             if(h.charAt(i)=='A'){
                 result=result & Integer.parseInt(String.valueOf(h.charAt(i+1)));
             }
             if(h.charAt(i)=='O'){
                 result=result | Integer.parseInt(String.valueOf(h.charAt(i+1)));
             }
             if(h.charAt(i)=='E'){
                 result=result ^ Integer.parseInt(String.valueOf(h.charAt(i+1)));
             }


         }




       return result;
    }

    public static void main(String[] args) {

      Scanner s=new Scanner(System.in);
//      int t=s.nextInt();
////       int r,unit;
////       r=s.nextInt();
////       unit=s.nextInt();
////       int n;
////       n=s.nextInt();
////       int[] arr=new int[n];
////      for(int j=0;j<n;j++){
////          arr[j]=s.nextInt();
////      }
////        System.out.println(Arrays.toString(arr));
////        //sub(3,arr);
////        eve(arr);
//        String p=s.nextLine();
//        int y=p.length();
//        System.out.println(valid(p,y));
//        String u=s.nextLine();
//        char f=s.nextLine().charAt(0);
//        System.out.println("Binary is " + Integer.toOctalString(t));
//        if(Integer.toBinaryString(t).charAt(Integer.toBinaryString(t).length()-1)==1){
//            System.out.println("odd");
//        }
//        else{
//            System.out.println("even");
//        }
//        int r=op(u);
//        System.out.println(r);
 //       large(u);
//        cap(u);
  //      converter(u);
//        char c='A';
//        System.out.println(Character.toChars(65));
 //     hex(u);
//
//        int[] e={2,1
//        };
//   //     sub(2,e);
//        arr(e);
//        System.out.println(cap(u));
////
   //     int[] g={1 ,2 ,3  ,4 ,3 ,2 ,1 ,6 ,4 ,2 ,1, 0};
        // arr(g);
 //       System.out.println((char)97);
  //      System.out.println(Integer.toHexString(12));
       // converter(u);
       // ana(u,f);
//        repla(u,f);
        System.out.println((int)'A');
        if(f>=65 && f<=75){
            System.out.println("it is valid");
        }

    }}

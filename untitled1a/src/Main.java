//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
class Main{
    public static void match(String h,String j){
        int s=j.length();
        System.out.println(s);
        for(int i=0;i<=h.length()-(s+1)+1;i++){

             String l=h.substring(i,s+i);
            if(l.equals(j))
            {
                System.out.print(i+1+" "+(i+s));
                System.out.println("");
            }
        }


    }
    public static void countoperations(int[] g){
        ArrayList<Integer> k= new ArrayList<>();
        for(int i=0;i<g.length;i++){
            k.add(g[i]);
        }
        System.out.println(k);
        k.sort(Comparator.naturalOrder());
        int count=0;
        for(int i=0;i<g.length;i++){
            if(g[i]==k.get(0)){
                k.remove(0);
                count++;
            }
            else if(g[i]>k.get(0)){
                int temp=g[i];
                g[i]=g[g.length-1];
                g[g.length-1]=temp;
                if(g[i]>k.get(0)){
                temp=g[i];
                g[i]=g[i+1];
                g[i+1]=temp;
                count++;
                i--;}
                count++;
            }
        }
        System.out.println(count);
    }

    public static void match1(String h,String j){
        int s=j.length();
        System.out.println(s);
        for(int i=0;i<=h.length()-(s+1)+1;i++){
            String r=h.substring(i,s+i);
            if(r.equals(j))
            {
                System.out.print((i+1)+" "+(i+s));
                System.out.println("");
            }
        }


    }

    public static void str(String str,String e){
       int y;
       int count=0;
        if(str.length()>e.length()){
            y=e.length();
        }
        else {
            y=str.length();
        }
        for(int i=0;i<y;i++){

             if(str.charAt(i)=='?'){
                continue;
            }

             else if(str.charAt(i)=='*')
             {
                 int p=i;
                 while(str.charAt(i+1)!=e.charAt(p)){
                     count++;
                     p++;
                 }
                 if(str.charAt(i+1)==e.charAt(i+count)){
                     int l=i+count;
                    for(int j=i+1;j<y;j++){

                        if(str.charAt(j)!=e.charAt(l)){
                            System.out.println("Strings are not equal");
                            return;
                        }
                        l++;
                    }
                 }
                 else {
                     System.out.println("Strins are not equal");
                     return;
                 }
                 System.out.println("equla");
                 return;

             }

            else if(str.charAt(i)!=e.charAt(i)){
                System.out.println("Strings are not equal");
                return;
            }

        }
        System.out.println("Strings are equal");

    }
    public static void profit(int[] s){
        int sum=0;
        int cur=0;
        int y=s[0];
        for(int j=1;j<s.length;j++){
            if(s[j]<10){
                sum=sum+(cur-y);
                y=s[j];
                cur=0;
                System.out.println(sum);
            }
            else if(s[j]>=10){
                if(s[j]>cur){
                    cur=s[j];
                }

            }
        }
        sum=sum+(cur-y);
        System.out.println(sum);

    }
    public static void max(int[] arr){


        int y=0;
        int u=0;
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> h=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]<0 && !(l.contains(arr[i]))))
            {
                y=y+arr[i];
                l.add(arr[i]);
            }
            else if(arr[i]>0 &&!(h.contains(arr[i])))
            {
                u=u+arr[i];
                h.add(arr[i]);

            }
            else if(arr[i]<0 && l.contains(arr[i])){
                h.add(arr[i]);
                u=u+arr[i];

            }
            else{
              l.add(arr[i]);
              y=y+arr[i];
            }

        }
        System.out.println((u-y));
    }
    public static void profit1(int[] g){
        int max=0;
        for(int i=1;i<g.length;i++){
            if(g[i]>g[i-1]){
                max+=g[i]-g[i-1];
            }
        }

        System.out.println(max);

    }

    public static void sum(int[] arr){
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>0 && sum>max){
                max=sum;
            }

        }
    System.out.println(max);
}
public static void rep(String h,char r,char p){
        String ans="";
    for(int i=0;i<h.length();i++){
        if(h.charAt(i)==r){
            ans=ans+p;
        }
        else if(h.charAt(i)==p){
            ans=ans+r;
        }
        else{
            ans=ans+h.charAt(i);
        }
    }
    System.out.println(ans);

}
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
//        int n=r.nextInt();
//        int[] arr=new int[n];
//        for(int j=0;j<n;j++){
//            arr[j]=r.nextInt();
//        }
//
//        max(arr);

//String h=r.nextLine();
//String d=r.nextLine();
//match1(h,d);
//  int[] a={1,-1,2,3,4,-1,5};
//  sum(a);
//        String d=r.nextLine();
//        char f=r.next().charAt(0);
//        char p=r.next().charAt(0);
//        rep(d,f,p);
        int[] j={2,30,15,10,8,25,80};
       profit1(j);

    }

}
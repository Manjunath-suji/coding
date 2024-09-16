import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void prim(String h){
                int sum=0;
                for(int i=0;i<h.length();i++){
                         String k=""+h.charAt(i);
                        sum=sum+Integer.parseInt(k);
                }
                if(sum==2){
                        System.out.println("yes");
                }
                else if(sum%2!=0){
                        System.out.println("yes");
                }
                else{
                        System.out.println("no");
                }



        }

        public static void st(String h){
                String s="";
                Stack<Character> d=new Stack<>();
                for(int i=0;i<h.length();i++){
                        d.push(h.charAt(i));
                }
                int count=0;
                while(!d.isEmpty()){

                        char r=d.pop();
                        if(r=='1'){
                                count++;

                        }
                        else if(r=='0'){
                                System.out.println(count);
                                if(count==1){
                                        s=s+"A";
                                }
                                if(count==4){
                                        s=s+"D";
                                }
                                System.out.println(s);
                                count=0;

                        }



                }
        }

    public static int rec(int[] arr,int i)
    {
            if(i==arr.length-1){
                    return arr[i];
            }
            return arr[i]+ rec(arr,i+1);


    }
    public static void main(String[] args) {
ll h=new ll();
h.insert(12);
        h.insert(18);
        h.insert(8);
        h.insert(2);
        h.insert(18);
        h.insert(22);
        h.insert(82);
        h.last(56);
        h.display();
        h.ind(12,1);
        h.display();
        System.out.println(h.size);
        String g="0111101";
        String ans="";
        st(g);
        int[] y={1,5,8};
       int t= rec(y,0);
            System.out.println(t);








    }
}
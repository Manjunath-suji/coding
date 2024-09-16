//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int rec(int[][] n,int i){

     if( i>=n.length){
         return 0;
        }

      return n[i][i]+rec(n,i+1);
    }
    public static void main(String[] args) {
           int[][] y={{1,2,3,4},{58,7,9,5},{5,89,5,4},{8,9,7,4}};
        System.out.println(rec(y,0));


    }
}
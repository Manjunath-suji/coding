import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int m =0 ;
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
        int[] a = new int[size];
        for(int i = 0 ; i<size ; i++){
            a[i] = sc.nextInt();

        }

        for(int i = 0 ; i<size ; i++){
            int k = 0;
            if(a[i] < 0) {
                a[i] = a[i] * (-1);
            }

            else if(i>0){
            for(int j=0;j<i;j++){
                if(a[j]==a[i])
                {
                 a[i]=-(a[i]);
                }
            }
            }

}
   for(int l= 0 ; l< size  ; l++){


      m = m + a[l];

   }
        System.out.println(m);
        System.out.println(Arrays.toString(a));
    }}
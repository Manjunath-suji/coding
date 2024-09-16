import java.util.*;
public class Main {
    public static int col(int[][] arr,int g,int h){
        int j=0;
        int count=0;
        for(int i=0;i<h;i++){
            int y=0;
            for(y=0;y<g;y++){
                if(arr[y][i]==1)
                {
                    count++;
                }
            }
        }
        return count-2;
    }
    public static void rot(int[] arr,int f){
        int[] temp=new int[f];
        if(f>arr.length){
            f=f%arr.length;
        }
        if(f==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=0;i<f;i++){
            temp[i]=arr[i];
        }
        System.out.println(Arrays.toString(temp));
        for(int j=0;j<=arr.length-f-1;j++){
            arr[j]=arr[j+f];
        }
        System.out.println(Arrays.toString(arr));
        int i=0;
        for(int k=arr.length-f;k<arr.length;k++){

            arr[k]=temp[i];
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int g,h;
        Scanner r =new Scanner(System.in);
//
//        g=r.nextInt();
//        h=r.nextInt();
//
//        int[][] m=new int[g][h];
//        for(int i=0;i<g;i++){
//            for(int j=0;j<h;j++)
//            {
//                Scanner p=new Scanner(System.in);
//                m[i][j]=p.nextInt();
//
//            }
//        }
//        int u=col(m,g,h);
//        System.out.println(u);
       int[] i={1,2,3,4,5};
       rot(i,2);

    }
}
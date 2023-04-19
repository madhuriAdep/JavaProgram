import java.net.SocketPermission;
import java.util.Scanner;

class JavaArray{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter size");
        int size=sc.nextInt();
        int a[]=new int[size];
        
        // int arr[]={1,2,3,4,5};
        for(int i=0;i<size;i++){
            // System.out.print(arr[i]+" ");
            System.out.println(" enter arr values");
            a[i]=sc.nextInt();
        }
        System.out.println(" display arr values");
        for(int i=0;i<size;i++){
            // System.out.print(arr[i]+" ");
            System.out.println(a[i] +" ");
           
        }
        
    }
}
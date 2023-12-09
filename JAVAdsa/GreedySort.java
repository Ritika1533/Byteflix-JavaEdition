package dsa;
import java.util.Scanner;
public class GreedySort {
    static void minGreedySort(int a[], int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
               int temp;
               temp=a[i];
               a[i]=a[min];
               a[min]=temp;
            }
        }
    }


    public static  void main(String[] args){
        int []a=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms of array");
        int num=sc.nextInt();
        System.out.println("enter the array element");
        for(int i=0;i<num;i++){
           a[i]=sc.nextInt();
        }
        System.out.println("unsorted array ");
        for(int i=0;i<num;i++){
            System.out.print(a[i]);
            System.out.print("\t");
        }
        minGreedySort(a,num);
        System.out.print("");
        System.out.println("sorted array ");
        for(int i=0;i<num;i++){
            System.out.print(a[i]);
            System.out.print("\t");
        }
    }

}
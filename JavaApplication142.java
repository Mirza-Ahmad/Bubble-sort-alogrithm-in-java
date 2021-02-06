package javaapplication142;
import java.util.Scanner;
public class JavaApplication142 
{
    public static void main(String[] args) 
    {
      Scanner is =new Scanner(System.in);
      int s;
      System.out.println("Enter the size:");
      s=is.nextInt();
      int arr[]=new int[s];
      System.out.println("Enter the elements of the array:");
      for(int i=0; i<arr.length; i++)
      {
        System.out.println("Enter the elements " + (i+1) + ":");
        arr[i]=is.nextInt();
      }
      for(int i=0; i<arr.length; i++)
      {
          for(int j=i+1; j<arr.length; j++)
          {
              int temp;
              if(arr[j]<arr[i])
              {
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
              }
          }
      }
      System.out.println("After the sorting of the bubble sort:");
      for(int i=0; i<arr.length; i++)
      {
         System.out.println(arr[i]);
      }
    }
}
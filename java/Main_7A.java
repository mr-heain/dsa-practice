import java.util.Scanner;
public class Main_7A{
public static void main(String ags[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n = sc.nextInt();
int [] arr = new int[n];
System.out.println("Enter the elements :");
for(int i = 0 ; i< n ; i++){
arr[i] = sc.nextInt();
}
System.out.println("Enter the element to search : ");
int target = sc.nextInt();
int result = linearSearch(arr ,target);
System.out.println(result != -1 ? "Element found in the index  " + result : "element not found");}
public static int linearSearch(int[] arr , int target){
for (int i=0;i< arr.length;i++){
if(arr[i] == target){
return i;}}return -1;}}


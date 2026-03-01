import java.util.Scanner;
public class Main_7B{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter the elements in acending order: ");
for(int i= 0; i<n ; i++){
arr[i] = sc.nextInt();
}
System.out.print("Enter the element to search: ");
int target = sc.nextInt();
int result = binarySearch(arr,target);
System.out.println(result != -1 ? "Element found in index at " + result : "element not found" );}


public static int binarySearch(int [] arr, int target){
int left = 0, right = arr.length -1,res = -1;
while(left <= right){
int mid = (left + right)/2;
if(arr[mid] == target ){ return mid;}
else if(arr[mid]< target ){ left = mid+1;}
else { right = mid-1;}}
return res;}}
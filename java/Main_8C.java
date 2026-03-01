import java.util.Scanner;
public class Main_8C{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter te number of terms: ");
int n = sc.nextInt();
int arr [] = new int[n] ;
System.out.println("Enter the elements:");
for (int i = 0; i<n ; i++){
arr[i] = sc.nextInt();}
System.out.println("Original array: ");
printArray(arr,n);
mergeSort(arr,0,n-1);
System.out.println("Sorted array: ");
printArray(arr,n);}

public static void printArray(int [] arr,int n){
for(int i = 0; i<n;i++){
System.out.print(i == n-1? arr[i] +"\n ": arr[i] + " ");}}

public static void mergeSort(int arr[],int low , int high){
if(low < high){
int mid = (low+high)/2;
mergeSort(arr,low,mid);
mergeSort(arr,mid+1,high);
merge(arr,low,mid,high);}}

public static void merge(int arr[], int low,int mid,int high){
int [] left = new int[mid-low+1];
int [] right = new int[high -mid];
System.arraycopy(arr,low,left,0,left.length);
System.arraycopy(arr,mid+1,right,0,right.length);
int i = 0,j=0,k=low;
while(i<left.length && j<right.length){
if(left[i] <= right[j]){
arr[k] = left[i];
i++;}
else{
arr[k] = right[j];
j++;}
k++;}
while(i<left.length){
arr[k] = left[i];
i++;
k++;}
while(j<right.length){
arr[k] = right[j];
j++;
k++;
}}}
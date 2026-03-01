import java.util.Scanner;
public class Main_8A{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of elements :");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("enter the elements");
	for(int i = 0; i<n ;i++){
		arr[i] = sc.nextInt();}
	System.out.println("Original array: " );
	printArray(arr);
	insertionSort(arr);
	System.out.println("sorted array: ");
	printArray(arr);}

	public static void insertionSort(int arr[] ){
	for (int i = 0;i< arr.length;i++){
	int key = arr[i];
	int j = i-1;
	while(j>=0 && arr[j] > key){
	arr[j+1] = arr[j];
		j--;}
		arr[j+1] = key;}}

	public static void printArray(int arr[]){
	for(int i = 0;i<arr.length;i++){
		System.out.print( (i+1)== arr.length ?arr[i]+ "\n " :arr[i]+ " ");
		//System.out.print(arr[i]);
}}}
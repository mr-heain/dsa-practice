import java.util.*;
import java.lang.reflect.*;
public class Index{
public static void main(String [] args){


while(true){
String choice = "";
Scanner sc= new Scanner(System.in);
System.out.print("\n=== Lab Index ====\n1.Stack(Array)\n2.Queue(Array)\n3.Stack(LinkedList)\n4.Queue(LinkedList)\n5.Infix To PostFix Conversion\n6.BinaryTreeTraversal\n7A.LinearSearch\n7B.BinarySearch\n8A.Insertion Sort\n8B.Quick Sort\n8C.Merge Sort\n9A.Depth First Search\n9B.Breadth First Search\n10.Finding Single Source Shortest Path Of a Graph\n===End of the Index====\n*for exit type exit \nEnter your choice(s.no):");

choice = sc.nextLine().toUpperCase();
if(choice.equals("EXIT")){
sc.close();System.out.print("\n --- program completed --- \n ---thanks for using this --- \n");
System.exit(0);}

else if(choice.length() <=2 && choice != null && choice.length()>0 && Character.isDigit(choice.charAt(0))){

try{
System.out.println("\n\n--- Porgram Main_"+choice+" ----");
Class.forName("Main_"+choice).getMethod("main",String[].class).invoke(null,(Object)null);
}
catch(ClassNotFoundException e){
System.out.println("Error: program not found complete it ");} 
catch(Exception e){
System.out.println("Error runnng class "+e.getCause());}
finally{
System.out.println("--- End of 'Main_"+choice+"'---\n");}

}
else{
System.out.println("Invalid choice");}




}}}

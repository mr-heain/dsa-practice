import java.util.Scanner;
class Node_6 {
int data;
Node left ,right;
public Node_6(int data){
this.data = data;
this.left = left;
this.right = right;}}

class BinaryTree_6{
Node root;
public void inorderTraversal(Node node){
if(node != null){
inorderTraversal(node.left);
System.out.print(node.data + " ");
inorderTraversal(node.right);}}

public void preorderTraversal(Node node){
if(node != null){
System.out.print(node.data+ " ");
preorderTraversal(node.left);
preorderTraversal(node.right);}}

public void postorderTraversal(Node node){
if(node != null){
postorderTraversal(node.left);
postorderTraversal(node.right);
System.out.print(node.data + " ");}}}

public class Main_6{
public static void main(String args[]){
BinaryTree_6 tree = new BinaryTree_6();
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of nodes : ");
int n = sc.nextInt();
System.out.println(" enter the node values: ");
for(int i = 0; i< n; i++){
int data = sc.nextInt();
Node_6 node = new Node_6(data);
if(tree.root == null){
tree.root = node;}
else{
 Node temp = tree.root;
 while(true){
  if(data < temp.data){
   if(temp.left == null){
     temp.left = node;
     break;}
   temp = temp.left;}
else{
if(temp.right == null){
temp.right = node;
break;}
temp = temp.right;}}}}
System.out.println("Inorder Traversal: ");
tree.inorderTraversal(tree.root);
System.out.println("\npreorder Traversal: ");
tree.preorderTraversal(tree.root);
System.out.println("\npostorder Traversal: ");
tree.postorderTraversal(tree.root);
}}






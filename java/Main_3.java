import java.util.Scanner;

class p_3{
public static void pl(Object s){
System.out.println(s);}
public static void p(Object s){
System.out.print(s);}}


class Node{
int data;
Node next;
public Node(int data){
this.data = data;
this.next = null;}}


class Stack_3{
Node top;
public void push(int data){
Node newNode = new Node(data);
newNode.next = top;
top = newNode;}
public int pop(){
if(top == null){
p_3.pl("Stack is empty");
return -1;}
else{
int data = top.data;
top = top.next;
return data;}}
public void display(){
Node temp = top;
while(temp != null){
p_3.p(temp.data+ (temp.next != null? " ":"\n"));
temp = temp.next;}}}

public class Main_3{
public static void main(String args[]){
Stack_3 stack = new Stack_3();
Scanner sc = new Scanner(System.in);
while(true){
p_3.p("1.push \n2.pop \n3.display \n4.exit \nEnter your choice : ");
int choice = sc.nextInt();
switch(choice){
case 1:
p_3.p("enter element to push");
int data = sc.nextInt();
stack.push(data);
break;
case 2:
p_3.pl("Popped element : "+ stack.pop());
break;
case 3:
p_3.pl("Stack elements: ");
stack.display();
break;
case 4:
return;
//System.exit(0);
//break;
default :
p_3.pl("Invalid option try again");
}}}}



import java.util.Scanner;
class Node{
int data;
Node next;
public Node(int data){
this.data = data;
this.next = null;}}

class Queue_4{
Node front,rear;
public void enqueue(int data){
Node newNode = new Node(data);
if (rear == null){
front = rear = newNode;}
else{
rear.next = newNode;
rear = newNode;}}
public int dequeue(){
if(front == null){
System.out.println("queue is empty");
return -1;}
else{
int data =front.data;
front = front.next;
if(front == null){
rear = null;}
return data;}}
public void display(){
Node temp = front;
while(temp != null){
System.out.print(temp.data+(temp.next!= null? " ":"\n"));
temp = temp.next;
}}}

public class Main_4{
public static void pl(Object p){
System.out.println(p);}
public static void p(Object p){
System.out.print(p);}
public static void main(String args[]){
Queue_4 queue = new Queue_4();
Scanner sc = new Scanner(System.in);
p("1.enqueue \n2.dequeue \n3.display \n4.exit\n");
while(true){
p("Enter your choice: ");
int choice = sc.nextInt();
switch(choice){
case 1:
p("enter element to enqueue: ");
int data = sc.nextInt();
queue.enqueue(data);
break;
case 2:
pl("dequeued element "+queue.dequeue());
break;
case 3:
pl("queue elements:");
queue.display();
break;
case 4:
return;
//System.exit(0);
//break;
default :
pl("invalid input");
}}}}

import java.util.Scanner;
public class Main_2{
int [] queue = new int[5];
int front = 0 , rear = 0;

public void enqueue(int data){
if(rear == queue.length ){
System.out.println("queue is full");}
else{
queue[rear++] = data;}}

public int dequeue(){
if(front == rear){
System.out.println("queue is empty");
return -1;}
else{
return queue[front++];}}

public void display(){


System.out.println("queue elements:");
if(front == rear){
System.out.println("queue is empty");}
else{

for(int i = front ;i< rear;i++){  // changes area 
System.out.print(i == rear-1 ? queue[i] +"\n" : queue[i] + " ");}}}


public static void main(String args[]){
Main_2 queue = new Main_2();
Scanner sc = new Scanner (System.in);
while(true){
System.out.print("1.enqueue \n2.Dequeue \n3.display \n4.exit \nEnter your choice: ");
int choice = sc.nextInt();
switch(choice){
case 1:
System.out.println("enter the value:");
int value = sc.nextInt();
queue.enqueue(value);
break;
case 2:
System.out.println("dequeue element :"+queue.dequeue());
break;
case 3:
queue.display();
break;
case 4:
return;
//System.exit(0);
//break;
default :
System.out.println("Invalid option ");
break;
}}}}










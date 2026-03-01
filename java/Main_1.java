import java.util.Scanner;
public class Main_1 {
int[] stack = new int[5];
int top = -1;

public void push(int value){
if(top< stack.length -1){
stack[++top] = value;}
else{
System.out.println("Stack is full");}}

public int pop(){
if(top>= 0){
return stack[top--];}
else{
System.out.println("stack is empty");
return -1;}}

public void display(){
if(top<0){
System.out.println("stack is empty");}
else{
System.out.println("stack elements :");
for(int i = 0 ; i<=top;i++){
System.out.print( i== top ?  stack[i] + "\n" : stack[i] + " "  );}}}
public static void main(String[] args){
Main_1 stack = new Main_1();
Scanner sc = new Scanner(System.in);
while(true){
System.out.print("1.push \n2.pop \n3.display \n4.exit \nEnter your choice: ");
int choice = sc.nextInt();
switch(choice){
case 1:
System.out.print("enter value to push :");
int value = sc.nextInt();
stack.push(value);
break;
case 2:
System.out.println("popped value :"+ stack.pop());
break;
case 3:
stack.display();
break;
case 4:
return;
//System.exit(0);
//break;
default :
System.out.println("invalid choice. try again..");
}}}}








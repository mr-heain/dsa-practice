import java.util.Scanner;
public class Main_5{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Infix Expression: ");
String infix = sc.nextLine();
//sc.close();
String postfix = infixToPostfix(infix);
System.out.println("postfix Expression : "+ postfix);
}
public static String infixToPostfix(String infix){
String postfix = "";
char[] stack = new char[infix.length()];
int top = -1;
for(char c: infix.toCharArray()){
if(c == '('){
stack[++top] = c;}
else if(c == ')'){
while (stack[top] != '('){
postfix += stack[top--];} top --;}
else if(c == '+' || c == '-' || c == '*' || c == '/'){
while(top >= 0 && stack[top] != '(' && pre(c)<= pre(stack[top])){
postfix += stack[top--];}
stack[++ top] = c;}
else{
postfix += c;}}
while(top >= 0){
postfix += stack[top--];}
return postfix;}
public static int pre(char op){
return op == '+' ? 1 : op == '-' ? 1 : op == '*' ? 2 : op == '/' ? 2 : 0 ;}}



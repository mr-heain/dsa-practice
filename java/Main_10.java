import java.util.*;
public class Main_10{
public static void p(Object p){
System.out.print(p);}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
p("Enter the numver of vertices: ");
int numVer= sc.nextInt();
int [][] graph = new int [numVer][numVer];
for (int i =0;i<numVer;i++){
for (int j = 0;j<numVer;j++){
if(i==j){
graph[i][j] = 0;}
else{
p("Enter the weight for edge from "+i+" to " +j+" :");
graph[i][j] = sc.nextInt();}}}
p("Enter the starting vertex: ");
int startVertex = sc.nextInt();
dijkstra(graph,startVertex);
}

public static void dijkstra(int [][] graph,int sv){
int numVer = graph.length;
int distance [] = new int[numVer];
boolean [] visited = new boolean [numVer];
Arrays.fill(distance,Integer.MAX_VALUE);
distance[sv] = 0;
for(int i = 0;i<numVer;i++){
int minDistance = Integer.MAX_VALUE;
int minIndex=-1;
for(int j = 0;j<numVer;j++){
if(!visited[j] && distance[j] <minDistance){
minDistance =distance[j];
minIndex =j;
}}
visited[minIndex] = true;
for(int j = 0;j<numVer;j++){
if(!visited[j] && graph[minIndex][j] != 0 && distance[minIndex] +graph[minIndex][j] < distance[j]){
distance [j] = distance[minIndex] + graph[minIndex][j];}}}
p("\nvertex\tDistance");
for(int i = 0;i<numVer;i++){
p("\n"+i+"\t"+distance[i]);}}}

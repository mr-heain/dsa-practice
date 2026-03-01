import java.util.*;
class Graph_9B{
private final int numVertices;
private final List<List<Integer>>adjacencyList;

public Graph_9B(int numVertices){
this.numVertices = numVertices;
this.adjacencyList = new ArrayList<List<Integer>>(); // changed area 

for(int i = 0;i< numVertices;i++){

adjacencyList.add(new LinkedList<Integer>());}} // changed area 

public void addEdge(int source,int destination){
adjacencyList.get(source).add(destination);
adjacencyList.get(destination).add(source);}
public void bfs(int startVertex){
boolean[] visited = new boolean[numVertices];

java.util.Queue<Integer> queue = new LinkedList<Integer>(); /* Error caused by name conflic due to have Queue class IX_2_ in same dirctory*/

queue.add(startVertex);
visited[startVertex] = true;
while(!queue.isEmpty()){
int vertex = queue.poll();
System.out.print(vertex+ " ");
for(int n:adjacencyList.get(vertex)){
if(!visited[n]){
queue.add(n);
visited[n] = true;}}}}}

public class Main_9B{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of vertices: ");
int numVertices = sc.nextInt();
Graph_9B graph = new Graph_9B(numVertices);
System.out.print("Enter the number of edges: ");
int numEdges = sc.nextInt();
for(int i = 0; i< numEdges;i++){
System.out.print("Enter Edge " +(i+1)+"(source destination): ");
int source = sc.nextInt();
int destination = sc.nextInt();
graph.addEdge(source,destination);}
System.out.print("Enter the starting vertex for bfs: ");
int startVertex = sc.nextInt();
System.out.println("breadth first search : ");
graph.bfs(startVertex);}}






//Queue<Integer> queue = new LinkedList<Integer>();
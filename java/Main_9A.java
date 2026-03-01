import java.util.*;
class Graph_9A{
private final int numVertices;
private final List<List<Integer>>adjacencyList;
public Graph_9A(int numVertices){
this.numVertices = numVertices;
this.adjacencyList = new ArrayList<List<Integer>>(); //changed area line 7
for(int i = 0;i<numVertices ; i++){
adjacencyList.add(new LinkedList<Integer>());}}  // changed area line 9

public void addEdges(int source , int destination){
adjacencyList.get(source).add(destination);
adjacencyList.get(destination).add(source);}

public void dfs(int startVertex){
boolean[] visited = new boolean[numVertices];
dfsHelper(startVertex,visited);}

private void dfsHelper(int vertex,boolean[] visited){
visited[vertex] = true;
System.out.print(vertex+" ");
for(int neighbor : adjacencyList.get(vertex)){
if(!visited[neighbor]){
dfsHelper(neighbor,visited);}}}}

public class Main_9A{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("enter the number of vertices: ");
int numVertices = sc.nextInt();
Graph_9A graph = new Graph_9A(numVertices);
System.out.print("enter the number of edges: ");
int numEdges = sc.nextInt();
for(int i = 0;i<numEdges;i++){
System.out.print("enter egde " + (i+1)+" (source destination): ");
int source = sc.nextInt();
int destination = sc.nextInt();
graph.addEdges(source,destination);}
System.out.print("Enter the starting vertex for DFS : ");
int startVertex = sc.nextInt();
System.out.println("Depth First Search (DFS):");
graph.dfs(startVertex);}}
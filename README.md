# 🧠 DSA Practice

A collection of 15 Data Structures & Algorithms programs written in Java — built as part of my Sem 4 lab work. Comes with a menu-driven CLI launcher that uses Java Reflection to dynamically load and run any program by number.

---

## 🚀 How to Run

**Requirements:** Java (JDK 8 or above)

```bash
# Clone the repo
git clone https://github.com/mr-heain/dsa-practice.git
cd dsa-practice/java

# Compile everything
javac *.java

# Launch the menu
java Index
```

Then just type the program number (e.g. `1`, `7A`, `8C`) or `exit` to quit.

---

## 📋 Program Index

| No. | Topic |
|-----|-------|
| 1 | Stack — Array implementation |
| 2 | Queue — Array implementation |
| 3 | Stack — LinkedList implementation |
| 4 | Queue — LinkedList implementation |
| 5 | Infix to Postfix Conversion |
| 6 | Binary Tree Traversal |
| 7A | Linear Search |
| 7B | Binary Search |
| 8A | Insertion Sort |
| 8B | Quick Sort |
| 8C | Merge Sort |
| 9A | Depth First Search (DFS) |
| 9B | Breadth First Search (BFS) |
| 10 | Single Source Shortest Path (Dijkstra) |

---

## ⚙️ How the Launcher Works

`Index.java` uses **Java Reflection** to dynamically load and invoke any `Main_X` class at runtime — no hardcoded switch cases. Type a number, it finds the matching class and runs it.

```java
Class.forName("Main_" + choice)
     .getMethod("main", String[].class)
     .invoke(null, (Object) null);
```

Type `exit` anytime to quit cleanly.

---

## 📁 Structure

```
dsa-practice/java/
├── Index.java        ← menu launcher
├── Main_1.java       ← Stack (Array)
├── Main_2.java       ← Queue (Array)
├── ...
├── Main_10.java      ← Shortest Path
└── .gitignore        ← ignores *.class files
```

---

*Part of my CS lab work — Semester 4*

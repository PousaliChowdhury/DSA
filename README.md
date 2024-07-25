# DSA

### A detailed overview of time and space complexities for various data structures and algorithms commonly encountered in Data Structures and Algorithms (DSA):

#### 1. Arrays:
- Access: O(1)
- Search: O(n)
- Insertion: O(n)
- Deletion: O(n)
- Space Complexity: O(n)

#### 2. Linked Lists:
##### Singly Linked List:
- Access: O(n)
- Search: O(n)
- Insertion: O(1)
- Deletion: O(1)
- Space Complexity: O(n)

##### Doubly Linked List:
- Access: O(n)
- Search: O(n)
- Insertion: O(1)
- Deletion: O(1)
- Space Complexity: O(n)

#### 3. Stacks:
- Access: O(n)
- Search: O(n)
- Insertion (push): O(1)
- Deletion (pop): O(1)
- Space Complexity: O(n)

#### 4. Queues:
- Access: O(n)
- Search: O(n)
- Insertion (enqueue): O(1)
- Deletion (dequeue): O(1)
- Space Complexity: O(n)

#### 5. Hash Tables:
- Access: N/A
- Search: O(1) on average, O(n) in worst-case
- Insertion: O(1) on average, O(n) in worst-case
- Deletion: O(1) on average, O(n) in worst-case
- Space Complexity: O(n)

#### 6. Binary Search Trees (BST):
- Access: O(log n) on average, O(n) in worst-case
- Search: O(log n) on average, O(n) in worst-case
- Insertion: O(log n) on average, O(n) in worst-case
- Deletion: O(log n) on average, O(n) in worst-case
- Space Complexity: O(n)

#### 7. Balanced Binary Search Trees (e.g., AVL Trees, Red-Black Trees):
- Access: O(log n)
- Search: O(log n)
- Insertion: O(log n)
- Deletion: O(log n)
- Space Complexity: O(n)

#### 8. Heaps:
- Access: O(n)
- Search: O(n)
- Insertion: O(log n)
- Deletion: O(log n)
- Space Complexity: O(n)

#### 9. Graphs:
##### Adjacency Matrix:
- Space Complexity: O(V^2)
- Add Vertex: O(V^2)
- Add Edge: O(1)
- Remove Vertex: O(V^2)
- Remove Edge: O(1)
- Search: O(V^2)

##### Adjacency List:
- Space Complexity: O(V + E)
- Add Vertex: O(1)
- Add Edge: O(1)
- Remove Vertex: O(V + E)
- Remove Edge: O(E)
- Search: O(V + E)

#### 10. Sorting Algorithms:
##### Bubble Sort:
- Time Complexity: O(n^2)
- Space Complexity: O(1)

##### Selection Sort:
- Time Complexity: O(n^2)
- Space Complexity: O(1)

##### Insertion Sort:
- Time Complexity: O(n^2)
- Space Complexity: O(1)

##### Merge Sort:
- Time Complexity: O(n log n)
- Space Complexity: O(n)

##### Quick Sort:
- Time Complexity: O(n log n) on average, O(n^2) in worst-case
- Space Complexity: O(log n) on average, O(n) in worst-case

##### Heap Sort:
- Time Complexity: O(n log n)
- Space Complexity: O(1)

##### Radix Sort:
- Time Complexity: O(nk)
- Space Complexity: O(n + k)

##### Counting Sort:
- Time Complexity: O(n + k)
- Space Complexity: O(k)

#### 11. Graph Algorithms:
##### Depth-First Search (DFS):
- Time Complexity: O(V + E)
- Space Complexity: O(V)

##### Breadth-First Search (BFS):
- Time Complexity: O(V + E)
- Space Complexity: O(V)

##### Dijkstra’s Algorithm:
- Time Complexity: O(V^2) with adjacency matrix, O((V + E) log V) with priority queue
- Space Complexity: O(V)

##### Floyd-Warshall Algorithm:
- Time Complexity: O(V^3)
- Space Complexity: O(V^2)

##### Bellman-Ford Algorithm:
- Time Complexity: O(VE)
- Space Complexity: O(V)

##### Kruskal’s Algorithm:
- Time Complexity: O(E log E)
- Space Complexity: O(E + V)

##### Prim’s Algorithm:
- Time Complexity: O(V^2) with adjacency matrix, O((V + E) log V) with priority queue
- Space Complexity: O(V)

### Understanding these complexities helps in choosing the appropriate data structure or algorithm for a given problem based on its time and space efficiency requirements.

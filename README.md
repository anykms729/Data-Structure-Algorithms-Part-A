<b>< Searching Algorithms ></b><br>
- Linear Search 
- Binary Search 
- Interpolation Search 

<b>< Linear Search Algorithm ></b><br>
- Iterate through a collection one element at a time<br>
- Runtime complexity: O(n)<br>
- Slow for large data sets<br>
- No need to be sorted when declare array itself<br>
- Useful for data structures that don't have random access (Linked List)<br>

<b>< Binary  Search Algorithm ></b><br>
- Works well with sorted Data Structures<br>
- Fast for large data sets<br>
- Runtime complexity: O(logn)<br>

<b>< Interpolation Search Algorithm ></b><br>
- Improvement over binary search best used for "uniformly" distributed data<br>
- "Gussess" where a value might be based on calculated probe results<br>
- If probe is incorrect, search area is narrowed, and a new probe is calculated<br>
- Average case: O(log(log(n)))<br>
- Worst Case O(n)  [ When values increase exponentially ]<br>

<b>< Sotring Algorithms ></b><br>
- Definition : used to rearrange a given array or list of elements according to a comparison operator on the elements<br>
- Selection Sort<br>
- Bubble Sort <br>
- Insertion Sort <br>
- Merge Sort <br>
- Quick Sort <br>
- Heap Sort <br>
- Counting Sort<br>
- Radix Sort<br>

<b>< Bubble Sort Algorithm ></b><br>
- Pairs of adjacent elements are compared, and the elements swapped if they're not in order<br>
- Runtime: Quadratic time: O(n^2)<br>
- Not efficient for Large data set<br>

<b>< Selection Sort Algorithm ></b><br>
- Search through an array and keep track of the minimum value during each iteration. At the end of each iteration, variables are swapped <br>

<b>< Insertion Sort Algorithm ></b><br>
- After comparing elements to the left shift elements to the right to make room to insert a value<br>
- Runtime: Quadratic time: O(n^2)<br>
- Not efficient for Large data set<br>
- Less steps than Bubble sort<br>
- Best case is O(n) compared to Selection Sort O(n^2)<br>

<b>< Recursion ></b><br>
- Apply the result of a proceedure to a procedure<br>
- A recursive method calls itself, and can be a substitute for iteration <br>
- Devide a problem into sub-problems of the same type as the original<br>
- Commonly used with advanced sorting Algorithms and navigating trees<br>
- Advantage: Easier to read/write and debug<br>
- Disadvantage: Uses more memory<br>
- It has "Stack" Data structure (FILO)<br>

<b>< Quick  Sort Algorithm ></b><br>
- Moves smaller elements to left of a pivot <br>
- Recursively divide array in 2 partiotions<br>
- Runtime Complexity: <br>
<ol>
<li>Best case O(n log(n))</li>
<li>Average case O(n log(n))</li>
<li>Worst case O(n^2) if already sorted</li>
</ol><br>

<b>< Hashtable ></b><br>
- Definition: Data Structure that stores unique keys to values  (the pair is called as "Entry")<br>
- Fast insertion, look up, deletion of key/value pairs<br>
- Great with large data sets<br>
- Hashing:  Takes a key and computes an integer<br> 
<em>Ex) key.hashCode() % capacity of the Hashtable = Stored in the Hashtable (But formula will vary based on key & data type)</em><br>
- Bucket: Each partition (an indexed storage location for one or more entries) of the Hashtable <br>
- If any collision when storing the pair (entry) in the Hashtable, each Bucket turns into "Linked-list" to store multiple entries <br>
- Runtime complexity<br>
<ol>
<li>Best case:  O(1)</li> 
<li>Worst case: O(n)</li> 
</ol><br>

<b>< Time & Space effeiciency ></b><br>
- O(n log n) = Quasilinear Time<br>
<ol>
<li>Quick sort</li> 
<li>Merge sort</li> 
<li>Heap sort</li> 
</ol>

- O(n^2) = Quadratic Time<br>
<ol>
<li>Insertion sort</li> 
<li>Selection sort</li> 
<li>Bubble sort</li> 
</ol>

- O(n) = Linear space<br>
<ol>
<li> Merge sort</li>
</ol>

- O(1) = Constant space<br>
<ol>
<li>Bubble sort</li> 
<li>Selection sort</li> 
<li>Insertion sort</li> 
</ol>

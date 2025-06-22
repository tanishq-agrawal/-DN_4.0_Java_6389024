# Asymptotic Notation

1. **Explain Big O notation and how it helps in analyzing algorithms.**

    Big O Notation is used to describe how the time or space needed by an algorithm grows as the input size increases.

    **Purpose**
    - Shows the **worst-case** performance.
    - Helps compare the **efficiency** of algorithms.
    - Focuses on how an algorithm **scales** with input size.

    **Key Points**
    - Describes the **upper limit** of an algorithm.
    - Ignores constants and small inputs.
    - Only looks at the part that grows the fastest.

    **Example:**

    | Big O     | Meaning             | Example                |
    |-----------|---------------------|------------------------|
    | O(1)      | Constant time        | Accessing an array item |
    | O(n)      | Linear time          | Looping through an array |
    | O(log n)  | Logarithmic time     | Binary search            |
    | O(n²)     | Quadratic time       | Nested loops             |


<br>
<br>

2. **Compare the time complexity of linear and binary search algorithms.**

    Linear Search:
    - Goes through each element one by one.
    - Works on both sorted and unsorted data.

    Binary Search:
    - Divides the sorted list into halves repeatedly.
    - Only works on **sorted** data.

    **Time Complexity:**

    | Algorithm      | Best Case | Average Case | Worst Case |
    |----------------|-----------|--------------|------------|
    | Linear Search  | O(1)      | O(n)         | O(n)       |
    | Binary Search  | O(1)      | O(log n)     | O(log n)   |

<br>
<br>

3. **Discuss which algorithm is more suitable for your platform and why.**

    For an **e-commerce platform**:

    - **Binary Search** is more suitable:
    - Product data (like IDs or names) can be sorted.
    - Offers faster searching in large product lists.
    - Efficient for platforms with many user queries.

    - **Linear Search** can still be useful when:
    - The product list is small.
    - The data is unsorted or changing too often to sort.

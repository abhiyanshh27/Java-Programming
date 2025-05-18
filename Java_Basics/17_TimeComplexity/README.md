# ⏳ Time Complexity (Basic Se)

### 🔍 Kya hoti hai Time Complexity?

Jab hum koi code likhte hain, toh humein yeh samajhna hota hai ki uska performance input size badhne par kaisa rahega.  
Time Complexity batata hai:  
- Code **kitni baar chalega**
- **Input size ke badhne par** code **slow hoga ya fast**

---

## 🧠 Real-Life Example

Maan lo tumhe ek daftar me kisi ka naam dhoondhna hai:

- Agar tum 1 by 1 check kar rahe ho → **O(n)**  
- Agar tum middle se start karke half kar rahe ho (Binary Search) → **O(log n)**

---

## ⚙️ Common Complexities Table

| Notation   | Meaning           | Example                            |
|------------|-------------------|------------------------------------|
| O(1)       | Constant Time      | `System.out.println("Hi");`        |
| O(n)       | Linear Time        | `for(int i=0; i<n; i++)`           |
| O(n²)      | Quadratic Time     | Nested Loops                       |
| O(log n)   | Logarithmic Time   | Binary Search                      |
| O(n log n) | Merge Sort, etc.   | Efficient Sorting Algorithms       |
| O(2^n)     | Exponential        | Recursive Fibonacci                |

---

## 📂 Java Files Explanation

### `TimeComplexity_Concept.java`
Sabhi common complexities ko ek hi file me explain kiya gaya hai.

### `Q1_PrintN_O_N.java`
Print numbers from 1 to N – Linear time.

### `Q2_NestedLoop_O_N2.java`
Nested loops to print all pairs – Quadratic time.

### `Q3_BinarySearch_O_LogN.java`
Binary search on sorted array – Logarithmic time.

### `Run_Example_1.java`
User input se n number print karna, aur batana ki time complexity kya hui.

### `Run_Example_2.java`
User se array input lo, aur binary search karke result do + time complexity explain karo.

---

## 🧠 Summary

> Time Complexity helps us write faster, more optimized code.

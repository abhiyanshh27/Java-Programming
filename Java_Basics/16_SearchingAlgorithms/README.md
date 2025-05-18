# 📂 16_SearchingAlgorithms

## 🔍 Introduction (Parichay)

Searching algorithms ka use kisi data structure (jaise array, list, etc.) ke andar kisi specific element ko dhoondhne ke liye hota hai. Searching kaafi important concept hai programming mein, especially jab large data ke saath kaam karna ho.

Searching algorithms do types ke ho sakte hain:

1. **Linear Search (Sequential Search)**
2. **Binary Search (Only on sorted data)**

---

## 1️⃣ Linear Search

### 🧠 Concept (Hinglish):
Linear search ek simple technique hai jisme hum har element ko ek-ek karke check karte hain jab tak target element mil na jaaye ya list khatam na ho jaaye.

### 💬 Concept (English):
Linear Search checks each element one by one from the beginning until it finds the target or reaches the end of the array.

### ⏱️ Time Complexity:
- Best Case: O(1) – If the element is found at the first position.
- Average Case: O(n)
- Worst Case: O(n)

---

## 2️⃣ Binary Search

### 🧠 Concept (Hinglish):
Binary Search sirf sorted arrays pe kaam karta hai. Ye algorithm middle element check karta hai aur decide karta hai ki search left half mein kare ya right half mein, aur aise recursively divide karta rehta hai.

### 💬 Concept (English):
Binary Search works only on sorted arrays. It checks the middle element and based on comparison, it eliminates half of the elements in each step.

### ⏱️ Time Complexity:
- Best Case: O(1) – If the middle element is the target.
- Average Case: O(log n)
- Worst Case: O(log n)

---

## 📌 Linear vs Binary Search

| Feature               | Linear Search   | Binary Search   |
|-----------------------|-----------------|-----------------|
| Works on Sorted Data? | ❌ No            | ✅ Yes           |
| Time Complexity       | O(n)            | O(log n)        |
| Technique             | Sequential      | Divide & Conquer|

---

## ✅ Summary (Hinglish)

- Linear Search simple hota hai, but slow.
- Binary Search fast hota hai, lekin array sorted hona chahiye.
- Binary Search ka time complexity kaafi optimized hota hai large input ke liye.

---

## 📚 Coming Up:
- Interpolation Search
- Exponential Search (Advanced topics)

# 📘 Sorting Algorithms (Java Basics)

Sorting algorithms ka use data ko kisi specific order (jaise ascending ya descending) mein arrange karne ke liye hota hai. Ye algorithms programming mein bahut important role play karte hain, especially jab large datasets ke sath kaam karna ho.

---

## 🔹 Bubble Sort

- Ye algorithm bar-bar adjacent elements ko compare karta hai aur agar wo galat order mein hote hain to unhe swap karta hai.
- Har pass ke baad sabse bada element last mein chala jata hai — isi liye isse "bubble" sort kehte hain.

### ⚙️ Key Points:
- **Time Complexity**: O(n²)
- **Stable Sort**: Yes
- Easy to understand, lekin large data ke liye slow hota hai.

---

## 🔹 Selection Sort

- Ye algorithm har bar unsorted part se minimum (ya maximum) element dhundta hai aur usse correct position par rakh deta hai.
- Process repeat hota hai jab tak sab elements sort nahi ho jate.

### ⚙️ Key Points:
- **Time Complexity**: O(n²)
- **Stable Sort**: Nahin (in general)
- Swaps kam karta hai bubble sort ke comparison mein.

---

## 🔹 Insertion Sort

- Ye sorted array ko one by one build karta hai.
- Har element ko uthata hai aur correct position mein insert karta hai sorted part mein.

### ⚙️ Key Points:
- **Time Complexity**: O(n²)
- **Best Case (already sorted)**: O(n)
- Small ya nearly sorted data ke liye fast and efficient hota hai.

---

## ✅ Sorting Algorithms Kab Use Hote Hain?

- Jab data ko fast search karna ho (Binary Search se pehle sort karna padta hai)
- Rank ya score board banane mein
- Visualization tools mein
- Files ya database organize karne mein

---

Sorting algorithms ka strong base hona zaroori hai kyunki ye programming logic ko enhance karta hai aur competitive programming mein bhi helpful hota hai.

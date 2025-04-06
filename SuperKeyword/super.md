## 🧠 What is `super` in Java?

The **`super` keyword** is a reference that points to the **immediate parent class** of a subclass.

> It allows a subclass to **access methods, variables, and constructors of its parent**.

---

## 📌 Why Do We Use `super`?

In **inheritance**, a subclass automatically gets the properties and behaviors of a parent class. But sometimes:

- We want to access or **use the original behavior** from the parent.
- We want to **initialize the parent’s variables** or constructor.
- We want to **avoid confusion** between subclass and parent class members.

In all these situations, `super` is used.

---

## 📚 Where Is `super` Used?

### 1. **To Call the Parent Class Constructor**
- Used to initialize the parent part of the object.
- Must be the **first line** in a constructor if used.

### 2. **To Access Parent Class Variables**
- When the subclass has a variable with the **same name** as in the parent class, `super` helps access the **parent’s version**.

### 3. **To Call Parent Class Methods**
- When a method is **overridden** in the subclass, but you still want to use the **original method from the parent**, `super` allows you to do so.

---

## 🔁 How `super` Works (Internally)

1. When an object of the subclass is created:
   - Java **first calls the constructor of the parent class** (even if not visible).
   - Then the subclass’s constructor runs.

2. Java uses `super` to connect the child class to its **inherited structure**.

3. If you **don't explicitly use `super`**, Java will **automatically call the no-argument constructor** of the parent class (if it exists).

---

## 🤖 What Happens If We Don’t Use `super`?

- If there’s **no conflict**, Java handles most inheritance behind the scenes.
- But if:
  - You **override methods** and want to use the parent’s version — you **must use `super`**.
  - You want to **initialize parent properties** with specific values — `super` is required.
  - The parent class has **no default constructor** — Java won’t compile unless `super(...)` is used properly.

---

## 🌍 Real-World Analogy

Imagine you inherit a shop from your parents.

- `super` is like saying:
  > “I’ll run the shop my way, but sometimes I’ll follow my parent’s original method.”

If your version of running the shop (subclass method) isn’t enough, and you need to use a part of their strategy (parent method), you’ll refer to it using **`super`**.

---

## 🏢 Real-World Use Cases of `super`

| Scenario                           | Real-World Example                                             |
|------------------------------------|----------------------------------------------------------------|
| Overriding a method but still want to reuse the original logic | A custom print format that adds more details but still uses the basic format from the parent class |
| Initializing shared/common fields  | A company employee class where every manager also has employee attributes |
| Conflict in names (shadowing)      | If both parent and child have `name`, `super.name` ensures the parent’s `name` is accessed |
| Reusing base logic                 | A billing system that builds on top of standard bill generation from a base class |

---

## 📌 Summary of Everything About `super`

| Feature               | Explanation                                                |
|-----------------------|------------------------------------------------------------|
| What it is            | A reference to the **parent class**                        |
| Why we use it         | To access **parent class members** when overridden/hidden  |
| When we use it        | In **constructors**, **overridden methods**, or **variable access** |
| What if we don’t?     | Can lead to errors, especially if parent has **no default constructor** |
| Type of keyword       | Reserved keyword, **not an object**, but a reference       |
| Works with            | Inheritance (extends) only                                 |

---


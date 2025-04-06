# Memory Management in Java

When a Java program runs, memory is divided mainly into two areas:

## 1. Stack Memory
- **Stores**: Local variables, method calls, and reference variables.
- **Characteristics**:
  - Follows **LIFO** (Last-In-First-Out).
  - Fast and short-lived.

## 2. Heap Memory
- **Stores**: Objects, instance variables, and arrays.
- **Characteristics**:
  - Managed by the **Garbage Collector (GC)**.
  - Slower but objects live longer.

---

### Memory Breakdown (Example)
1. **Car c1** — stored in the stack (it's a reference variable).
2. **new Car()** — creates a `Car` object in the heap.
3. **speed = 100** — instance variable stored inside that heap object.
4. **c1** holds the memory address (reference) to that `Car` object.

---

# Classes vs Objects

- **Classes**: Blueprints for objects. Their bytecode is loaded once into the **Method Area** (part of JVM memory).
- **Objects**: Created at runtime in the **heap** using the `new` keyword.

---

## Summary Table

| **Item**             | **Memory Location** | **Notes**                        |
|-----------------------|---------------------|-----------------------------------|
| Local Variables       | Stack              | Temporary, fast access           |
| Object Instances      | Heap               | Shared, managed by GC            |
| Reference Variables   | Stack              | Points to heap objects           |
| Static Variables      | Method Area        | Loaded once per class            |
| Class Definitions     | Method Area        | JVM loads them once              |
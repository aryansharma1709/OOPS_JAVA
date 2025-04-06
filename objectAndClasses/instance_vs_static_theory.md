# Instance vs Static — The Core Difference

| **Feature**          | **Instance**                     | **Static**                          |
|-----------------------|-----------------------------------|--------------------------------------|
| **Belongs to**        | An object                        | The class itself                    |
| **Memory stored in**  | Heap memory (inside object)      | Method Area (once per class)        |
| **Accessed by**       | `objectName.member`              | `ClassName.member`                  |
| **Memory**            | Each object gets its own copy    | One shared copy for all objects     |
| **Example**           | `car.speed`                     | `Car.totalCars`                     |

---

### Think of it like this:
- **Instance**: Each person has their own backpack.
- **Static**: All people share one big common bag.

---

### Important Note:
- You can’t use `this` in a static context, because `this` refers to an object, and static doesn’t belong to any specific object.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        int length;

        int[] intarr = new int[10]; //This is how u created an array
        //This is a primitive array of type int

        ArrayList<Integer> arrayList = new ArrayList<>(); //This is how u create an ArrayList
        //initial default capacity of an ArrayList is 10
        //ArrayList internally uses an array.


        Integer[] integerArr = new Integer[10]; //This is an Integer array of type Integer, which is a
        // wrapper class which is an object in JAVA

        length = intarr.length; //array gives u a variable named as 'length'
        length = arrayList.size();//arraylist gives u a method named as size
        /*REMEMBER, One is a variable, One is a method.*/

        //adding elements to array
        intarr[0] = 1; //u can do the assignment operation

        //In arraylist there is a method for adding elements
        arrayList.add(1); // Although u pass 1 (a primitive type data), internally it is converted
        // to Integer and is moved from int to wrapper class becuz arraylist is of wrapper type.

        Vector<Integer> vector = new Vector<>();

        LinkedList<Integer> linkedList = new LinkedList<>();

    }
}


//NOTES

/*
In Java, `int` and `Integer` are both used to represent integer values, but they have some differences in how they are used. Here are some instances where you would typically use `int` and `Integer`:

1. Use `int` when you need a primitive data type:
   - `int` is a primitive data type in Java, which means it is a basic building block of data and has no additional methods or properties.
   - You would use `int` when you want to store integer values and perform basic arithmetic operations on them.
   - For example: `int age = 25;`

2. Use `Integer` when you need an object wrapper for an int:
   - `Integer` is a wrapper class that allows an `int` value to be treated as an object.
   - It provides useful methods and allows you to perform operations that are not available with the `int` primitive type.
   - You would use `Integer` when you need to pass an integer value to a method that expects an object, such as collections, or when you need to use methods like `toString()` or `parseInt()`.
   - For example: `Integer result = Integer.valueOf(42);`

Here are some specific scenarios where you may use `int` or `Integer`:

- Method parameters and return types:
  - If a method needs to accept or return an integer, you can use `int` as the parameter or return type.
  - If you need to pass the integer value as an object or utilize additional methods, you can use `Integer` instead.

- Collections and Generics:
  - Collections, such as `List` or `Set`, require objects as elements, so you would use `Integer` to store integer values in these collections.
  - Generics allow you to specify the type of objects stored in a collection, so you can use `List<Integer>` to create a list that stores `Integer` objects.

- Nullable values or APIs that require an object:
  - If you need to represent nullable integer values, you can use `Integer` and assign `null` to indicate the absence of a value.
  - Some APIs or frameworks may require an object rather than a primitive type, so you would use `Integer` in such cases.

Overall, the choice between `int` and `Integer` depends on your specific requirements. If you need the simplicity and performance benefits of a primitive type, use `int`. If you need additional methods, nullability, or compatibility with certain APIs, use `Integer`.
==========================================================================================
In Java, a generic type allows you to create classes, interfaces, or methods that can work with different types. It provides a way to parameterize types so that they can be used with different actual types at compile time.

By using generics, you can write code that is more reusable, type-safe, and flexible. It allows you to define classes or methods that can operate on a variety of types without sacrificing type safety.

The syntax for defining a generic type involves using angle brackets (`<>`) and a type parameter. For example, `List<T>` is a generic interface where `T` is a type parameter representing a placeholder for the actual type. When you create an instance of `List`, you can specify the actual type to be used, such as `List<Integer>`, `List<String>`, etc.

Generics enable you to write more generic algorithms and data structures that can be used with different types without the need for explicit type casting. It helps in writing type-safe code and provides compile-time type checking.

Example:

```java
public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
```

In the above example, `Box<T>` is a generic class with a type parameter `T`. It can be used to create a box of any type.



 */
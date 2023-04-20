# SingletonEvolution_10TypesOf_FromEagerlyToBestPractice

Singleton is a Creational Design Pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.<br/>

To view the website 👉🏻 [please CLICK HERE](http://singleton-evolution.s3-website-eu-west-1.amazonaws.com/).

## 🤔 What is the purpose of this application?

There are several ways to implement a Singleton, whether it's eager or lazy... 
<br/><br/>
I thought it would be nice to create a project that unifies all these implementations.

This project contains a design mostly done by Bootstrap 5, does not contain server side but includes links to my github profile where there are 9 different implementations of Singleton Design Pattern written by Java language.

## 🤔 How it works?
I have created 9 implementations for Singleton Pattern.
<br/>
Each implementation has it’s own GitHub link.

# Extra Details

## Lazy Singleton 👉 Not a Thread Safe
Compared to Eager Singleton, instead of generating a "new object" in the field, we will initialize the field value to null.
This way, "new object" will be created only by demand.
The instance will be created within the "getter" method only once, at the first time an external entity outside of this specific class requires it.

## Lazy Singleton 👉 Thread Safe But Not Efficient
In order to avoid situations when multiple threads in a single program try to access the same resource at the same time we can use synchronized static method.
This approach isn't the best practice since the performance of the system can degrade due to the slow working of the synchronized keyword.

## More Efficient, BUT Not Thread Safe 👉 The Double Lock Problem
In attempt to make the previous implementation efficient, we will add a synchronized block inside the getter method, i.e. only in the critical section - where the "new" object is created.
Which supposedly improves the performance because the synchronization is only on the critical part, but this Singleton isn't thread safe and known as The Double Lock Problem.

## Lazy Singleton 👉 Thread Safe With Double Lock Solve
To solve the double lock problem, we encountered in the previous implementation, and to ensure our Singleton is a thread safe, we will perform another check to make sure the instance is null - inside the block we created.
This way we will get a Singleton which is both, more efficient and a thread safe.

## Thread Safe With Double Lock Solve And Volatile
Another way to implement Multithreaded Singleton, is by using Volatile modifier that provides a way to control memory order.
By using Volatile, we ensure a couple of rules for consistent behavior:
Mutual Exclusion – only one thread executes a critical section at a time.
Visibility – changes made by one thread to the shared data are visible to other threads to maintain data consistency.

## Eager Singleton, Ultimate Efficient, Thread Safe, with Final Attribute, Immutable
The fact that the field is "static" and initialized as a "new object" means that he will be loaded in the very first steps of the program loading - what makes him eager.
Constructor must be private.
Getter must be public because that's the only way to get the instance outside of that particular class.

## Nice Lazy And Thread Safe With Holder Design Pattern
The JVM defers initializing the MySingleton class until it is actually used, and because the Singleton is initialized with a static initializer, no additional synchronization is needed.

## Singleton Enum
Since enums are inherently serializable, we don't need to implement it with a serializable interface. Therefore, it is 100% guaranteed that only one instance of the singleton is present within a JVM.

## Singleton By Default 👉 Spring Framework
In Spring, we can create singleton by making use of Spring's singleton beans or by implementing the singleton design pattern ourselves.
Just use Spring Framework project, by default, all Spring beans are Singletons.

<br/>
Thanks for reading,
<br/>
Chelly 👩🏻‍💻

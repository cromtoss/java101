# Exercises: Decorator Pattern:

1. Examine the three classes that reside here (`com.java101.hdfp.ch03.lovecraft`). These objects are used in all subsequent questions.

2. Examine the classes that reside in `com.java101.hdfp.ch03.lovecraft.composition`:
    * Examine how these classes implement the decorator pattern to add behavior to the `speakFromBeyond()` method.
    * Add a decorator yourself using a similar implementation pattern.


3. Examine the class that resides in `com.java101.hdfp.ch03.lovecraft.composition.haiku`. 
    * Enhance the `main` method to get one of the `ElderOne` static objects to output a new haiku using the decorator you created in Step 3. (You may need to change your `speakFromBeyond()` implementation to a sentence consisting of 5 or 7 syllables!)


4. Examine the classes that reside in `com.java101.hdfp.ch03.lovecraft.inheritance`.
    * What are the advantages and disadvantages of the `OtherworldlySpeakerDecorator` class?
    * How does this change the decorators in this package? Do you have any ideas why `Gelatinous` is incorrect?

5. Examine the class that resides in `com.java101.hdfp.ch03.lovecraft.inheritance.haiku`. 
    * As stated in the code comments, assume you have an enhancement request to output the name of the poet (aka the `ElderOne`) who is providing the haiku. What do you have to change about this implementation to accomplish this in terms of variable types?
    * Why does `Gelatinous` cause us problems here?

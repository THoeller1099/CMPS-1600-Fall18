/* Created: Bob Roos, 3 October 2013
Edited: Anastasia Kurdia, 11 January 2016
This program models the work of an octopus in the kitchen 
and tests the work of Octopus and Utensil class functions

*/
 
/* This lab was peer programed by Ted Hoeller and Tom Roginsky*/
public class Lab0
{
    public static void main(String[] args)
    {
        // Variable dictionary:
        Octopus ocky;           // an octopus
        Octopus fred;           // an octopus
        Utensil spat;           // a kitchen utensil
        Utensil fork;           // a kitchen utensil

        spat = new Utensil("spatula"); // create a spatula
        spat.setColor("green");        // set spatula properties--color...
        spat.setCost(10.59);           // ... and price

        fork = new Utensil("fork"); //create a fork
        fork.setColor("blue");
        fork.setCost(9.99);

        ocky = new Octopus("Ocky", 10);    // create and name the octopus
        ocky.setWeight(100);           // ... weight,...
        ocky.setUtensil(spat);         // ... and favorite utensil.

        fred = new Octopus("Fred",40);
        fred.setWeight(200);
        fred.setUtensil(fork);

        System.out.println("Testing 'get' methods:");
        System.out.println(ocky.getName() + " weighs " +ocky.getWeight() 
            + " pounds\n" + "and is " + ocky.getAge() 
            + " years old. His favorite utensil is a "
            + ocky.getUtensil());

        System.out.println(ocky.getName() + "'s " + ocky.getUtensil() + " costs $"
            + ocky.getUtensil().getCost());
        System.out.println("Utensil's color: " + spat.getColor());

        System.out.println("");

        System.out.println(fred.getName() + " weighs " + fred.getWeight()
            + " pounds\n" + "and is " + fred.getAge()
            + " years old. His favorite utensil is a "
            + fred.getUtensil());

        System.out.println(fred.getName() + "'s " + fred.getUtensil() + " costs $" + fred.getUtensil().getCost());
        System.out.println("Utensil's color: " + fork.getColor());
        // Use methods to change some values:

        ocky.setAge(20);
        ocky.setWeight(125);
        spat.setCost(15.99);
        spat.setColor("blue");

        System.out.println("\nTesting 'set' methods:");
        System.out.println(ocky.getName() + "'s new age: " + ocky.getAge());
        System.out.println(ocky.getName() + "'s new weight: " + ocky.getWeight());
        System.out.println("Utensil's new cost: $" + spat.getCost());
        System.out.println("Utensil's new color: " + spat.getColor());
    }
}

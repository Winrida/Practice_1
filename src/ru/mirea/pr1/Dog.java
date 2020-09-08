package ru.mirea.pr1;

public class Dog
{
    public String name;
    public int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void HumanAge(){
        System.out.println(name + "'s age in human years is " + age * 7 +" years.");
    }
    public String toString(){
        return this.name + ", age " + this.age;
    }

}

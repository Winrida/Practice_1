//Winrida
package ru.mirea.pr1;

public class main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rick", 4);
        Dog d2 = new Dog("Chelsea", 2);
        d1.HumanAge();
        d2.HumanAge();

        Ball b1 = new Ball("Volleyball", "Blue");
        Ball b2 = new Ball("Football" , "White");
        b1.BallInfo();
        b2.BallInfo();

        Book bo1 = new Book("Fantasy", "Leonard");
        Book bo2 = new Book("Horror", "Stanley");
        bo1.BookInfo();
        bo2.BookInfo();
    }
}
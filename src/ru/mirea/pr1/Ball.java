package ru.mirea.pr1;

public class Ball {
    public String sport;
    public String color;

    public Ball(String sport, String color)
    {
        this.sport = sport;
        this.color = color;
    }

    public void BallInfo(){
        System.out.println(color + ' ' + sport + " ball.");
    }
}

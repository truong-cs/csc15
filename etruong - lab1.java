/*
Name: Eric Truong
Class: CSC15-01
Instructor: Professor Faroughi
Date: 10 September 2020

Program Title: Lab 1: Star Figure
Program Description: This program uses variables to store strings of each line of stars. Then the program outputs the
                     stars in a clean figure. It using proper naming, indentation, and comments.

*/
class Lab1 {
    public static void main(String[] args)
    {
        //These are the variables I put string functions in so I would not have to write out each star
        String star1 = "    *****    ";
        String star2 = "  *********  ";
        String star3 = "*************";
        String star4 = "* | | | | | *";

        //Prints out the top 1/3 of the image.
        System.out.println(star1);
        System.out.println(star2);
        System.out.println(star3);

        System.out.println();

        //Prints out the middle 1/3 of the image.
        System.out.println(star1);
        System.out.println(star2);
        System.out.println(star3);
        System.out.println(star4);
        System.out.println(star3);
        System.out.println(star1);
        System.out.println(star2);
        System.out.println(star3);

        System.out.println();

        //Prints out the last 1/3 of the image.
        System.out.println(star1);
        System.out.println(star2);
        System.out.println(star3);
        System.out.println(star1);
        System.out.println(star4);
        System.out.println(star4);
        System.out.println(star1);
        System.out.println(star1);


    }
}

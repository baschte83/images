/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 20. December 2016
 * Purpose: solution to lab Images
 */
public class Main {

    /**
     * Main method to test my whole image program.
     * @param args - variable number of values from the terminal.
     */
    public static void main(String[] args) {

        // Tests for a TextImage
        TextImage tImg = new TextImage("", "im", "Winter");
        tImg.setLine(0, "Christmas");
        System.out.println("Should be:\nChristmas\nin\nWinter\n\nIs:\n" + tImg);

        System.out.print("-----------------------------\n\n");

        // Tests for a ModernImage
        ModernImage mImg = new ModernImage('*', 7, 3);
        System.out.println("Should be:\n*******\n*******\n*******\n\nIs:\n" + mImg);

        System.out.print("-----------------------------\n\n");

        // Tests for a FramedImage
        FramedImage fImg = new FramedImage(tImg);
        System.out.println("Should be:\n+---------+\n|Christmas|\n|in       |\n|Winter   |\n+---------+\n\nIs:\n" + fImg);

        System.out.print("-----------------------------\n\n");

        // Tests for a RotateImage
        RotateImage rImg = new RotateImage(tImg);
        System.out.println("Should be:\nWiC\nimh\nn r\nt i\ne s\nr t\n  m\n  a\n  s\n\nIs:\n" + rImg);

        System.out.print("-----------------------------\n\n");

        // Tests for FlipImage
        FlipImage flImg = new FlipImage(tImg);
        System.out.println("Should be:\nsamtsirhC\n       mi\n   retniW\n\nIs:\n" + flImg);

        System.out.print("-----------------------------\n\n");

        // Tests for a DoubleImageBeside
        DoubleImageBeside dbImg = new DoubleImageBeside(tImg, mImg);
        System.out.println("Should be:\nChristmas*******\nim       *******\nWinter   *******\n\nIs:\n" + dbImg);

        System.out.print("-----------------------------\n\n");

        // Tests for a DoubleImageAbove
        DoubleImageAbove daImg = new DoubleImageAbove(tImg, mImg);
        System.out.println("Should be:\nChristmas\nin\nWinter\n*******\n*******\n*******\n\nIs:\n" + daImg);
    }

}
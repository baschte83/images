/**
 * Organisation: Hochschule Muenchen, Fakultaet 07<br>
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017<br>
 * Study group: IF3A<br>
 * Date: 20. Dezember 2016<br>
 * Purpose: Loesung Praktikumseinheit 07: AbstractImage<br>
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64<br>
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM<br>
 *
 * @author Sebastian Baumann
 * @version 1.0
 */

public abstract class AbstractImage implements Image {

    /**
     * Method to print an image to the screen.
     * Method uses the methods getHeight() and getLine() of the interface Image.
     * It adds line after line to the local string-variable imageRepresentation
     * and returns this string.
     * @see Image
     * @return an image as an array of strings.
     */
    public String toString() {

        String imageRepresentation = "";

        for (int i = 0; i < getHeight(); i++) {

            imageRepresentation += getLine(i) + "\n";

        }

        return imageRepresentation;

    }

    /**
     * Private assistance method to fill up short lines with blanks.
     * If lines are not filled up with characters till the width given
     * by getWidth, than the line has to be filled up with blanks.
     * @param str string that has to be filled up with blanks.
     * @return returns the filled up line as a string.
     */
    protected String fillItUp(String str) {

        String line = str;
        // If length of str is shorter than getWidth(), than str should be filled up with blanks.
        if (str.length() < getWidth()) {

            // newWidth is an assistance variable to store the difference between the length of str and the given length width.
            int newWidth = getWidth() - str.length();
            // loop fills up the string line with blanks
            for (int j = 0; j < newWidth; j++) {

                line += " ";

            }
        }

        return line;

    }

}
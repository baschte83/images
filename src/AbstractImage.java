/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 20. December 2016
 * Purpose: solution to lab Images
 */
abstract class AbstractImage implements Image {

    /**
     * Method to print an image to the screen.
     * Method uses the methods getHeight() and getLine() of the interface Image.
     * It adds line after line to the local string-variable imageRepresentation
     * and returns this string.
     * @see Image
     * @return - returns an image as an array of strings.
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
     * @param str - string that has to be filled up with blanks.
     * @return - returns the filled up line as a string.
     */
    String fillItUp(String str) {

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
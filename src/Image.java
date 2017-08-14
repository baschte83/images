/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 20. December 2016
 * Purpose: solution to lab Images
 */

interface Image {

    /**
     * Gets the number of lines of an image.
     * Method must be implemented in any class that inherits from Image.
     * @return - returns number of lines as an integer value.
     */
    int getHeight();

    /**
     * Gets the length of the widest line.
     * Method must be implemented in any class that inherits from Image.
     * @return - returns length of the widest line as an integer value.
     */
    int getWidth();

    /**
     * Gets the line to the given index.
     * Method must be implemented in any class that inherits from Image.
     * @param index - an integer-value of the line, that ist required.
     * @return - returns the required line as a string.
     */
    String getLine(int index);

}
/**
 * Organisation: Hochschule Muenchen, Fakultaet 07<br>
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017<br>
 * Study group: IF3A<br>
 * Date: 20. Dezember 2016<br>
 * Purpose: Loesung Praktikumseinheit 07: Interface Image<br>
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64<br>
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM<br>
 *
 * @author Sebastian Baumann
 * @version 1.0
 */


public interface Image {

    /**
     * Gets the number of lines of an image.
     * Method must be implemented in any class that inherits from Image.
     * @return number of lines as an integer.
     */
    int getHeight();

    /**
     * Gets the length of the widest line.
     * Method must be implemented in any class that inherits from Image.
     * @return length of the widest line as an integer.
     */
    int getWidth();

    /**
     * Gets the line to the given index.
     * Method must be implemented in any class that inherits from Image.
     * @param index an integer-value of the line, that ist required.
     * @return the required line as a string.
     */
    String getLine(int index);

}
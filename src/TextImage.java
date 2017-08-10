/**
 * Organisation: Hochschule Muenchen, Fakultaet 07<br>
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017<br>
 * Study group: IF3A<br>
 * Date: 20. Dezember 2016<br>
 * Purpose: Loesung Praktikumseinheit 07: TextImage<br>
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64<br>
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM<br>
 *
 * @author Sebastian Baumann
 * @version 1.0
 */

public class TextImage extends AbstractImage {

    /**
     * Private object-variable that stores an image as an array of strings.
     */
    private String[] image;

    /**
     * Constructor of a TextImage-object.
     * @param args is a variable amount of strings, which represent an image.
     */
    TextImage(String... args) {

        this.image = args;

    }

    /**
     * Gets the number of lines of this image.
     * Method uses the string-method length to get the
     * number of strings saved in the image-array.
     * @return the number of lines of this image as an integer.
     */
    @Override
    public int getHeight() {

        return this.image.length;

    }

    /**
     * Gets the length of the widest line of this image.
     * Method walks through the image-array and counts the length of
     * every single string in the array. The found width is saved in
     * currentWidth. If the local variable width is less than the found
     * currentWidth, than the current width is saved in local variable
     * width, which will be returned at the end of the method.
     * @return length of the widest line as an integer.
     */
    @Override
    public int getWidth() {

        int width = 0;
        for (String anImage : this.image) {

            int currentWidth = anImage.length();
            if (width < currentWidth) {

                width = currentWidth;

            }
        }

        return width;

    }

    /**
     * Gets the line to a given index.
     * Method gets the string on position index of this image-array.
     * @param index an integer-value of the line, that is required.
     * @return the required line as a string.
     */
    @Override
    public String getLine(int index) {

        return fillItUp(this.image[index]);

    }

    /**
     * Setter for a specific line in this image.
     * Method sets a string on position index in this image-array.
     * @param index position of the line, in which a new string should replace the old one.
     * @param s represents a string, that should be set on position index.
     */
    public void setLine(int index, String s) {

        this.image[index] = s;

    }

}
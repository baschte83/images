/**
 * Organisation: Hochschule Muenchen, Fakultaet 07<br>
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017<br>
 * Study group: IF3A<br>
 * Date: 20. Dezember 2016<br>
 * Purpose: Loesung Praktikumseinheit 07: FlipImage<br>
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64<br>
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM<br>
 *
 * @author Sebastian Baumann
 * @version 1.0
 */

public class FlipImage extends AbstractImage {

    /**
     * Private object-variable that stores an image as an array of strings.
     */
    private final Image oldImage;

    /**
     * Constructor of a FlipImage object.
     * @param img - is a variable amount of strings, which represent an image.
     */
    FlipImage(Image img) {

        this.oldImage = img;

    }

    /**
     * Gets the number of lines of this image.
     * @return the number of lines of this image as an integer
     */
    @Override
    public int getHeight() {

        return this.oldImage.getHeight();

    }

    /**
     * Gets the width of one line of this image.
     * @return length of the widest line as an integer.
     */
    @Override
    public int getWidth() {

        return this.oldImage.getWidth();

    }

    /**
     * Gets the line to the given index.
     * Method gets the string on position index of this image-array and reverses it
     * with the StringBuilder-method reverse().
     * @param index an integer-value of the line, that ist required.
     * @return the required line as a string.
     */
    @Override
    public String getLine(int index) {

        StringBuilder sb = new StringBuilder(this.oldImage.getLine(index));
        return sb.reverse().toString();

    }
}
/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 20. December 2016
 * Purpose: solution to lab Images
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
     * @return - returns the number of lines of this image as an integer
     */
    @Override
    public int getHeight() {

        return this.oldImage.getHeight();

    }

    /**
     * Gets the width of one line of this image.
     * @return - returns length of the widest line as an integer.
     */
    @Override
    public int getWidth() {

        return this.oldImage.getWidth();

    }

    /**
     * Gets the line to the given index.
     * Method gets the string on position index of this image-array and reverses it
     * with the StringBuilder-method reverse().
     * @param index - an integer-value of the line, that ist required.
     * @return - returns the required line as a string.
     */
    @Override
    public String getLine(int index) {

        StringBuilder sb = new StringBuilder(this.oldImage.getLine(index));
        return sb.reverse().toString();

    }
}
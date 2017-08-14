/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 20. December 2016
 * Purpose: solution to lab Images
 */
public class FramedImage extends AbstractImage {

    /**
     * Private object-variable that stores an image as an array of strings.
     */
    private final Image oldImage;

    /**
     * Constructor of an TextImage object.
     * @param img - is a variable amount of strings, which represent an image.
     */
    FramedImage(Image img) {

        this.oldImage = img;

    }

    /**
     * Private assistance method to create the first/last line of a framed image.
     * @param width - the width of the required line as an integer.
     * @return - returns the required line as a string.
     */
    private String createFirstLastLine(int width) {

        String line = "+";
        for (int i = 0; i < width; i++) {

            line += "-";

        }

        return line + "+";

    }

    /**
     * Gets the number of lines of this image.
     * @return - returns the number of lines of this image as an integer.
     */
    @Override
    public int getHeight() {

        return this.oldImage.getHeight() + 2;

    }

    /**
     * Gets the length of a line of this image.
     * Because every line of this image has exact the same width this
     * method returns the length of the first line of this image representative
     * for every other line. The width must be incremented by two, because every
     * line of this image has the har | at the beginning and at the end.
     * @return - returns the length of the first line of this image as an integer.
     */
    @Override
    public int getWidth() {

        return this.oldImage.getWidth() + 2;

    }

    /**
     * Gets the line to the given index.
     * Method gets the string on position index of this image-array.
     * @param index - an integer-value of the line, that ist required.
     * @return - returns the line as a string
     */
    @Override
    public String getLine(int index) {

        if (index == 0 || index == (this.oldImage.getHeight() + 1)) {

            return createFirstLastLine(this.oldImage.getWidth());

        }

        return "|" + this.oldImage.getLine(index - 1) + "|";

    }

}
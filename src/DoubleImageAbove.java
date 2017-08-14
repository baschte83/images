/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 20. December 2016
 * Purpose: solution to lab Images
 */
public class DoubleImageAbove extends AbstractImage {

    /**
     * Private variable to store an image as an array of strings.
     */
    private final Image oldImageFirst;
    private final Image oldImageSecond;

    /**
     * Constructor of an DoubleImageAbove image.
     * This constructor gets two objects of an AbstractImage or a class,
     * that inherits from AbstractImage class.
     * @param imgOne - AbstractImage object or an object of a class, that inherits from AbstractImage
     * @param imgTwo - AbstractImage object or an object of a class, that inherits from AbstractImage
     */
    DoubleImageAbove(Image imgOne, Image imgTwo) {

        this.oldImageFirst = imgOne;
        this.oldImageSecond = imgTwo;

    }

    /**
     * Gets the number of lines of this image.
     * This method sums up the amount of lines of both stored images
     * oldImageFirst and oldImageSecond and returns their sum as an integer.
     * @return - returns the number of lines of this image as an integer.
     */
    @Override
    public int getHeight() {

        return this.oldImageFirst.getHeight() + this.oldImageSecond.getHeight();

    }

    /**
     * Gets the length of the widest line of this image.
     * The method finds out which of the two stored images oldImageFirst and oldImageSecond
     * is the widest one and returns that width as an integer.
     * @return - returns the length as an integer.
     */
    @Override
    public int getWidth() {

        if (this.oldImageFirst.getWidth() >= this.oldImageSecond.getWidth()) {

            return this.oldImageFirst.getWidth();

        }

        return this.oldImageSecond.getWidth();

    }

    /**
     * Gets the line to the given index.
     * Method gets the string on position index of the image-array.
     * @param index - an integer-value of the line, that ist required.
     * @return - returns the line as a string.
     */
    @Override
    public String getLine(int index) {

        /*
         * If the value of the index is within the value of the height of the first image,
         * then a line of the first image is required. But before it is returned it has to
         * be filled up with blanks.
         */
        if (index < this.oldImageFirst.getHeight()) {

            return fillItUp(this.oldImageFirst.getLine(index));

        }

        /*
         * The index value is greater than the height of the first image, so the required line
         * must be a line of the second image. But before it is returned it has to be filled
         * up with blanks.
         */
        return fillItUp(this.oldImageSecond.getLine(index - this.oldImageFirst.getHeight()));

    }
}
/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 20. December 2016
 * Purpose: solution to lab Images
 */
public class DoubleImageBeside extends AbstractImage {

    /**
     * Private object-variable that stores an image as an array of strings.
     */
    private final Image oldImageFirst;
    private final Image oldImageSecond;

    /**
     * Constructor of an DoubleImageBeside image.
     * This constructor gets two objects of an AbstractImage or a class,
     * that inherits from AbstractImage class.
     * @param absFirst - AbstractImage object or an object of a class, that inherits from AbstractImage
     * @param absSecond - AbstractImage object or an object of a class, that inherits from AbstractImage
     */
    DoubleImageBeside(Image absFirst, Image absSecond) {

        this.oldImageFirst = absFirst;
        this.oldImageSecond = absSecond;

    }

    /**
     * Private assistance method to create a line of this image.
     * @param width - the width to which the lines should be filled up with blanks as an integer.
     * @param strOne - the line of the first image (the left one) as a string.
     * @param strTwo - the line of the second image (the right one) as a string.
     * @return - returns one line of the new image as a string.
     */
    private String createLine(int width, String strOne, String strTwo) {

        // Stores the first String strOne in the new String line
        String line = strOne;
        /*
         * If the line strOne is empty it has to be filled up with
         * blanks, so that every line has the exact same width.
         * This is important in case the first image (the left one) is
         * shorter than the right image.
         */
        if (strOne.length() < width) {

            for (int i = 0; i < (width - strOne.length()); i++) {

                line += " ";

            }
        }

        return line + strTwo;

    }

    /**
     * Private assistance method to get the greater value out of two.
     * @param i - first of two values as an integer.
     * @param j - second of two values as an integer.
     * @return - returns the greater of the two values as an integer.
     */
    private int getGreater(int i, int j) {

        if (i <= j) {

            return j;

        }

        return i;

    }

    /**
     * Gets the number of lines of this image.
     * This Method compares the height of the two stored images and returns
     * the greater one, because this is the height of this image.
     * @return - returns the number of lines of this image as an integer.
     */
    @Override
    public int getHeight() {

        return getGreater(this.oldImageFirst.getHeight(), this.oldImageSecond.getHeight());

    }

    /**
     * Gets the length of the widest line of this image.
     * Method sums up the width of the two stored images and returns the sum.
     * @return - returns the length of the widest line as an integer
     */
    @Override
    public int getWidth() {

        return this.oldImageFirst.getWidth() + this.oldImageSecond.getWidth();

    }

    /**
     * Gets the line to this given index.
     * Method gets the string on position index of this image-array and uses the private method
     * createLine() to generate the required line to the given index.
     * @param index - an integer-value of the line, that ist required.
     * @return - returns the line as a string.
     */
    @Override
    public String getLine(int index) {

        String line = "";
        /*
         * If the given index is greater than the height of the first image (the left one), than
         * the first image is shorter than the second one. In this case the first part of the required
         * line is empty.
         */
        if (index > (this.oldImageFirst.getHeight() - 1)) {

            return fillItUp(createLine(oldImageFirst.getWidth(), line, oldImageSecond.getLine(index)));
        }

        /*
         * If the given index is greater than the height of the second image (the right one) the second
         * image is shorter than the left one. In this case the second part of the required line is empty.
         */
        else if (index > (this.oldImageSecond.getHeight() - 1)) {

            return fillItUp(createLine(oldImageFirst.getWidth(), oldImageFirst.getLine(index), line));

        }

        // If none of the cases above are true, both pictures have the same height and the lines can easily be combined.
        return fillItUp(createLine(oldImageFirst.getWidth(), oldImageFirst.getLine(index), oldImageSecond.getLine(index)));

    }
}
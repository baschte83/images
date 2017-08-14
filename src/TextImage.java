/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 20. December 2016
 * Purpose: solution to lab Images
 */
class TextImage extends AbstractImage {

    /**
     * Private object-variable that stores an image as an array of strings.
     */
    private String[] image;

    /**
     * Constructor of a TextImage-object.
     * @param args - is a variable amount of strings, which represent an image.
     */
    TextImage(String... args) {

        this.image = args;

    }

    /**
     * Gets the number of lines of this image.
     * Method uses the string-method length to get the
     * number of strings saved in the image-array.
     * @return - returns the number of lines of this image as an integer value.
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
     * @return - returns length of the widest line as an integer value.
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
     * @param index - an integer-value of the line, that is required.
     * @return - returns the required line as a string.
     */
    @Override
    public String getLine(int index) {

        return fillItUp(this.image[index]);

    }

    /**
     * Setter for a specific line in this image.
     * Method sets a string on position index in this image-array.
     * @param index - position of the line, in which a new string should replace the old one.
     * @param s - represents a string, that should be set on position index.
     */
    public void setLine(int index, String s) {

        this.image[index] = s;

    }

}
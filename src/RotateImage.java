/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 20. December 2016
 * Purpose: solution to lab Images
 */
public class RotateImage extends AbstractImage {

    /**
     * Private object-variable that stores an image as an array of strings.
     */
    private final Image oldImage;

    /**
     * Constructor of an RotateImage-object.
     * This constructor stores the given Image-object and stores it
     * to the object-variable oldImage.
     * @param img - an image to store as an Image object.
     */
    RotateImage(Image img) {

        this.oldImage = img;

    }

    /**
     * Gets the number of lines of this image.
     * Because this image rotates the image stored in oldImage when the method getLine() is called,
     * the height of the rotated image is the width of oldImage.
     * @return - returns the number of lines of this image as an integer.
     */
    @Override
    public int getHeight() {

        return this.oldImage.getWidth();

    }

    /**
     * Gets the length of a line of this image.
     * Because this image rotates the image stored in oldImage when the method getLine() is called,
     * the width of the rotated image is the height of oldImage.
     * @return - returns the length as an integer.
     */
    @Override
    public int getWidth() {

        return this.oldImage.getHeight();

    }

    /**
     * Gets the line to this given index.
     * Method gets the string on position index of this image-array. Only this method
     * rotates the image stored in oldImage. So this image builds the required line in the way,
     * that it gets the chars of the corresponding lines of oldImage and rearranges them to the
     * new required line of the rotated image.
     * @param index - an integer-value of the line, that ist required.
     * @return - returns the line as a string.
     */
    @Override
    public String getLine(int index) {

        String line = "";

        for (int i = this.oldImage.getHeight() - 1; i >= 0; i--) {

            line += this.oldImage.getLine(i).charAt(index);

        }

        return line;

    }
}
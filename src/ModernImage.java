/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 20. December 2016
 * Purpose: solution to lab Images
 */
class ModernImage extends AbstractImage {

    /**
     * Stores the character a ModernImage object should consist of as a char.
     */
    private char characterOfModernImage;

    /**
     * Stores the width of a ModernImage as an integer.
     */
    private int width;

    /**
     * Stores the height of a ModernImage as an integer.
     */
    private int height;

    /**
     * Constructor of a ModernImage-object.
     * Method sets object variables characterOfModernImage, width and height
     * and needs three parameters.
     * @param c - character as a char the ModernImage should consist of.
     * @param width - width of the ModernImage as an integer.
     * @param height - height of the ModernImage as an integer.
     */
    ModernImage(char c, int width, int height) {

        setCharacterOfModernImage(c);
        setWidth(width);
        setHeight(height);

    }

    /**
     * Setter to override the existing character with a new character.
     * Method resets the existing character with the new character c.
     * @param c - new character as a char.
     */
    public void setCharacterOfModernImage(char c) {

        this.characterOfModernImage = c;

    }

    /**
     * Setter to override the existing width with a new width.
     * Method resets the existing width with the new width w.
     * @param w - new width as an integer.
     */
    public void setWidth(int w) {

        this.width = w;

    }

    /**
     * Setter to override the existing height with a new height.
     * @param h - new height as an integer.
     */
    public void setHeight(int h) {

        this.height = h;

    }

    /**
     * Private assistance method to get the char stored in variable characterOfModernImage.
     * @return - returns the used character of this modern image as a char.
     */
    private char getCharacterOfModernImage() {

        return this.characterOfModernImage;

    }

    /**
     * Gets the number of lines of this image.
     * @return - returns the value stored in variable height as an integer value.
     */
    @Override
    public int getHeight() {

        return this.height;

    }

    /**
     * Gets the length of a line of this image.
     * @return - returns the value stored in variable width as an integer value.
     */
    @Override
    public int getWidth() {

        return this.width;

    }

    /**
     * Gets the line to the given index.
     * Method gets the string on position index of the image-array.
     * @param index - an integer-value of the line, that ist required
     * @return - returns the line as a string.
     */
    @Override
    public String getLine(int index) {

        String line = "";
        // loop builds a line of this image consisting of the chars characterOfModernImage
        for (int i = 0; i < getWidth(); i++) {

            line += getCharacterOfModernImage();

        }

        return line;

    }
}
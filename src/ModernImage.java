/**
 * Organisation: Hochschule Muenchen, Fakultaet 07<br>
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017<br>
 * Study group: IF3A<br>
 * Date: 20. Dezember 2016<br>
 * Purpose: Loesung Praktikumseinheit 07: ModernImage<br>
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64<br>
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM<br>
 *
 * @author Sebastian Baumann
 * @version 1.0
 */

public class ModernImage extends AbstractImage {

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
     * @param c character as a char the ModernImage should consist of.
     * @param width width of the ModernImage as an integer.
     * @param height height of the ModernImage as an integer.
     */
    ModernImage(char c, int width, int height) {

        setCharacterOfModernImage(c);
        setWidth(width);
        setHeight(height);

    }

    /**
     * Setter to override the existing character with a new character.
     * Method resets the existing character with the new character c.
     * @param c new character as a char.
     */
    public void setCharacterOfModernImage(char c) {

        this.characterOfModernImage = c;

    }

    /**
     * Setter to override the existing width with a new width.
     * Method resets the existing width with the new width w.
     * @param w new width as an integer.
     */
    public void setWidth(int w) {

        this.width = w;

    }

    /**
     * Setter to override the existing height with a new height.
     * @param h new height as an integer.
     */
    public void setHeight(int h) {

        this.height = h;

    }

    /**
     * Private assistance method to get the char stored in variable characterOfModernImage.
     * @return character as a char.
     */
    private char getCharacterOfModernImage() {

        return this.characterOfModernImage;

    }

    /**
     * Gets the number of lines of this image.
     * @return the value stored in variable height as an integer.
     */
    @Override
    public int getHeight() {

        return this.height;

    }

    /**
     * Gets the length of a line of this image.
     * @return the value stored in variable width as an integer.
     */
    @Override
    public int getWidth() {

        return this.width;

    }

    /**
     * Gets the line to the given index.
     * Method gets the string on position index of the image-array.
     * @param index an integer-value of the line, that ist required
     * @return the line as a string
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
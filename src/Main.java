/**
 * Klasse, die nur zum testen der einzelnen Klassen da ist.
 */

public class Main {

    public static void main(String[] args) {

        //ModernImage winter = new ModernImage('*', 7, 3);
        /*TextImage winter = new TextImage("", "im", "Winter");
        System.out.println(winter);
        winter.setLine(0, "Christmas");
        System.out.println(winter);*/
        ModernImage mImg = new ModernImage('$', 4, 5);

        //DoubleImageBeside dbImg = new DoubleImageBeside(mImg, winter);
        System.out.println(mImg);

        /*FramedImage framedImage = new FramedImage(dbImg);
        System.out.println(new FramedImage(framedImage));*/
    }

}
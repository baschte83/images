# Images

### Assignment, class and language
This is my solution to the assignment **Images** of class **software developement 1,** written in Java.

### Requirements
This assignment required "drawing" images with text. So every "picture" only consists of Strings or characters, which represent, what will be visible on the image. For example:

>Berlin
>in
>Winter

represents an image of Berlin covered in snow. My task was, to write a program, consisting of classes which represent different kinds of images. This program consists of the following classes:
* Interface **Image**
* Abstract class **AbstractImage**
* Class **TextImage**
* Class **ModernImage**
* Class **FramedImage**
* Class **DoubleImageBeside**
* Class **DoubleImageAbove**
* Class **RotateImage**
* Class **FlipImage**

#### Interface Image
This interface should consist of getters for the height (number of lines), the width (number of characters of the longest line of an image) and a certain line of an image. 

#### Abstract class AbstractImage
This class implements just a toString method, to print any kind of text image to screen. This method is implemented in no other class.

#### Class TextImage
Objects of this class represent a simple text image, all lines are arranged left to right and top to bottom. The lines are left-justified. For example:
>Berlin
>in
>Winter
All methods from the interface should be implemented. Furthermore should it be possible to modify the content of every single line of a **TextImage** object, but the number of lines a text image consists of is fixed and cannot be modified. 

#### Class ModernImage
An object of this class only consists of one type of character. This single character could be any possible character. This class also needs values for height and width of a modern image, so a modern image is made out of a single character, which multiplies **width** times in width and **height** times in height. For example:
>********
>********
>********
This is the only type of image, that could be changed in height and width.

#### Class FramedImage
This class wraps a frame round any existing image object. A frame consists of `+` characters for the corners, `-` characters for the upper and lower and `|` characters for the left and right parts of the frame. It should be possible to wrap a frame round an already framed image as often as you like it. An object of this class is an image object itself and could be treated like any other image object. This class modifies the given image in no way. A framed image looks like this:
>+------+
>|Berlin|
>|in    |
>|Winter|
>+------+

#### Class DoubleImageBeside
This class puts two image objects together in the way, that both images are aligned with their most upper line. This class modifies the given image in no way. An object of this class could look like this:
>Berlin*********
>in    *********
>Winter*********
>      *********
>      *********

#### Class DoubleImageAbove
This class puts two image objects together in the way, that both images are put one on top of the other, left-justified. This class modifies the given image in no way. An object of this class could look like this:
>Berlin
>in    
>Winter
>*********
>*********
>*********
>*********
>*********

#### Class RotateImage
This class rotates a given image object by 90 degrees clockwise. This class modifies the given image in no way. A rotated image looks like this:
###### Original image:
>Berlin
>in
>Winter

###### Rotated:
>WiB
>ine
>n r
>t l
>e i
>r n

#### Class FlipImage
This class flips a given image by 180 degree. This class modifies the given image in no way. A flipped image looks like this:
###### Original image:
>Berlin
>in
>Winter

###### Flipped:
>nilreB
>    ni
>retniW

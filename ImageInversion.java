//Duke University Java Assignment: Image Inversion

//Write a program to create new images that are photographic negatives (or inverted images) of selected images
//and save these new images with filenames that are related to the original images, such as adding “inverted-” 
//in front of the old filename. In inverting an image, a pixel’s red, blue, and green components are modified to be the
//exact opposite within the 0 to 255 range. That is, if a pixel’s red, blue, and green values are (34, 198, 240),
//then that same pixel in the inverted image would have the red, blue and green values of (221, 57, 15). 
//Note that 255 - 34 is 221, 255 - 198 is 57, and 255 - 240 is 15.

import edu.duke.*;
import java.io.File;

public class BatchInversions {
    public ImageResource makeInversion(ImageResource inImage) {
        ImageResource outImage = new ImageResource(inImage);
        for (Pixel pixel: outImage.pixels()) {
            
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            
            int invRed = 255 - inPixel.getRed();
            int invGreen = 255 - inPixel.getGreen();
            int invBlue = 255 - inPixel.getBlue();
            
            pixel.setRed(invRed);
            pixel.setGreen(invGreen);
            pixel.setBlue(invBlue);
        }  
        return outImage;
    }
    
    public void selectAndConvert() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            ImageResource inImage = new ImageResource(f);
            ImageResource imageInv = makeInversion(inImage);
            imageInv.setFileName("inverted-" + inImage.getFileName());
            imageInv.draw();
            imageInv.save();
        }
    }   
}


import edu.duke.*;
import java.io.*;

public class GrayScaleConverter {
    //I started with the image I wanted (inImage)
    public ImageResource makeGray(ImageResource inImage) {
        //I made a blank image of the same size
        ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
        //for each pixel in outImage
        for (Pixel pixel: outImage.pixels()) {
            //look at the corresponding pixel in inImage
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            //compute inPixel's red + inPixel's blue + inPixel's green
            //divide that sum by 3 (call it average)
            int average = (inPixel.getRed() + inPixel.getBlue() + inPixel.getGreen())/3;
            //set pixel's red to average
            pixel.setRed(average);
            //set pixel's green to average
            pixel.setGreen(average);
            //set pixel's blue to average
            pixel.setBlue(average);
        }
        //outImage is your answer
        return outImage;
    }
    //Able to select multi-images and convert and create a copy of gray-scale image
    public void selectAndConvertAndCopy() {
        DirectoryResource dr = new DirectoryResource();
        //For each file in the selected files
        for (File f: dr.selectedFiles()){
            //Create a new image
            ImageResource image = new ImageResource(f);
            //Turn image into Gray-Scale
            ImageResource grayImage = makeGray(image);
            //Get the image file name
            String fileName = image.getFileName();
            //Add gray- in front of file name
            String newFileName = "gray-" + fileName;
            //Set new file name
            grayImage.setFileName(newFileName);
            //Draw and save the image
            grayImage.draw();
            grayImage.save();
          }
    }
}

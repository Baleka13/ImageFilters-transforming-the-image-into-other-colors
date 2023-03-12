package Utils;

import Utils.Functions.ImageFiltres;

import java.awt.image.BufferedImage;

public class Main1 {
    public static void main(String[] args) throws Exception {
        final BufferedImage image = ImageUtils.getImage("Images2/java.png");
         final RgbMaster rgbMaster= new RgbMaster(image);
         rgbMaster.changeImage(ImageFiltres::sepia);
        ImageUtils.saveImage(rgbMaster.getImage(), "Images2/clon2java.png");

    }
}

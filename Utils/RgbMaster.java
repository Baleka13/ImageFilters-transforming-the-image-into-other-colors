package Utils;

import Utils.Functions.ImageOperation;

import java.awt.image.BufferedImage;

public class RgbMaster {


    private BufferedImage image;

    private int width;
    private int height;
    private  boolean hasAlphachanel;

    private int[] pixels;

    public RgbMaster(BufferedImage image) {
        this.image = image;
        width=image.getWidth();
        height=image.getHeight();
        hasAlphachanel=image.getAlphaRaster()!=null;
        pixels=image.getRGB(0,0,width,height,null,0,width);

    }
    public BufferedImage getImage(){
        return image;
    }

public void changeImage(ImageOperation operation) throws Exception {
    for (int i = 0; i < pixels.length; i++) {
        float[] pixel=ImageUtils.rgbIntToArray(pixels[i]);
        float[] newpixel= operation.execute(pixel);
        pixels[i]=ImageUtils.arratToRgbInt(newpixel);
    }
    final int type=hasAlphachanel ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB;
    image.setRGB(0,0, width, height, pixels,0,width);
}

}

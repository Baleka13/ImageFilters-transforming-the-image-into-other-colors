package Utils.Functions;

import java.util.Random;

public class ImageFiltres {

   public static float[] greyCale(float[] rgb){
        final float mean= ( rgb[0] + rgb[0] + rgb[0]) / 3;
        rgb[0] = mean;
        rgb[1] = mean;
        rgb[2] = mean;
        return rgb;
    }
    public static float[] onlyRed(float[] rgb){
        rgb[1] = 0;
        rgb[2] = 0;
        return rgb;
    }
    public static float[] onlyGreen(float[] rgb){
        rgb[0] = 0;
        rgb[2] = 0;
        return rgb;
    }
    public static float[] onlyBlue(float[] rgb){
        rgb[0] = 0;
        rgb[1] = 0;
        return rgb;
    }
    public static float[] sepia(float[] rgb){
        Random random = new Random();
        rgb[0] += random.nextFloat() * 50 / 255;
        rgb[1] +=  random.nextFloat() * 50 / 255;
        rgb[2] +=  random.nextFloat() * 50 / 255;
        for (int i = 0; i < rgb.length; i++) {
            if (rgb[i]>1){
                rgb[i]=1;
            }

        }

        return rgb;
    }

}

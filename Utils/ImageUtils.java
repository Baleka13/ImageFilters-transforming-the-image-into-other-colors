package Utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageUtils {
    static public BufferedImage getImage(String path) throws IOException {
        final File file = new File(path);
        return ImageIO.read(file);

    }
    static public void saveImage(BufferedImage image, String path) throws IOException {
        ImageIO.write(image, "png", new File(path));

    }
    static float[] rgbIntToArray(int pixels) {
        Color color = new Color(pixels);
        return color.getRGBColorComponents(null);
    }
    static int arratToRgbInt(float[] pixels) throws Exception {
        Color color = null;
        if (pixels.length == 3) {
            color = new Color(pixels[0], pixels[1], pixels[2]);
        } else if (pixels.length == 4) {
            color = new Color(pixels[0], pixels[1], pixels[2], pixels[3]);

        }
        if (color != null) {
            return color.getRGB();
        }
        throw new Exception("Invalide color");
    }

}

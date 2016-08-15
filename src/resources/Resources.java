package resources;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Resources {

    public static BufferedImage welcome, iconImage;

    public static void load() {
        welcome = loadImage("welcome.png");
        iconImage = loadImage("iconimage.png");
    }

    private static AudioClip loadSound(String fileName) {
        URL fileUrl = Resources.class.getClassLoader().getResource("resources/wav/" + fileName);
        return Applet.newAudioClip(fileUrl);
    }

    private static BufferedImage loadImage(String fileName) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(Resources.class.getClassLoader()
                    .getResourceAsStream("resources/img/" + fileName));
        } catch (IOException e) {
            System.err.println("Error reading " + fileName);
            e.printStackTrace();
        }
        return img;
    }

}

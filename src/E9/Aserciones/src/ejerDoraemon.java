import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class ejerDoraemon {
    public static void main(String[] args) {
        String rutaEntrada = "doraemon.jpg";
        String rutaSalida = "doraemon_marco.jpg";

        try{
            BufferedImage imagenOriginal = ImageIO.read(new File (rutaEntrada));
            int ancho = imagenOriginal.getWidth();
            int alto = imagenOriginal.getHeight();
            int marco = 100;

            BufferedImage imagenConMarco = new BufferedImage(ancho, alto + marco*2,BufferedImage.TYPE_INT_RGB);

            int negro = 0x000000;

            for (int y=0; y< alto + marco*2; y++){
                for(int x=0; x < ancho; x++){
                    imagenConMarco.setRGB (x, y, negro);
                }
            }
            for (int y=0; y<alto; y++){
                for (int x=0; x< ancho; x++){
                    int rgb = imagenOriginal.getRGB(x,y);
                    imagenConMarco.setRGB(x, y + marco, rgb);
                }
            }
            ImageIO.write(imagenConMarco,"jpg", new File(rutaSalida));
            System.out.println("Imagen guardada como: "+ rutaSalida);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

import java.util.Random;
import javafx.scene.paint.Color;

/**
 * Algorithmen zur Anwendung von Filtern auf ein Picture
 * z.B. drehen, spiegeln usw.
 *
 * @author S. Gebert
 * @version 06.2021
 */
public class Mehrpixeloperationen  implements Operation
{
    /**
     * Erstellt eine mit der aktuell aktiven Operation veränderte Kopie eines Bildes.
     *
     * @param originalBild Das zu verändernde Bild
     * @return Das geänderte Bild
     */
    @Override
    public Picture apply(Picture originalBild)
    {
        return originalBild.copy();   
    }

    public Picture faltung (Picture originalbild,
    double[][] filter) {
        // Kodeen
        des
        Matrix - Stokrut des Origaalbilds -> teer
        color [][] pixel = originalBild.getPixelsTableColor();
        Color[][] pixelNeu
        = new Color [breite][hoehe];
        //
        int laenge = filter. length;
        int halb
        =
            laenge / 2;
        //
        for (int x = halb; x < originalbild.getwidth()
        halb; X++) {
            //
            for (int y = halb; y < originalbild.getHeight()
            -
            halb; y++) {
                /1
                int XX = x
                halb;
                int yy = y
                halb;
                double rot
                =
                    0.0;
                double gruen = 0.0;
                double blau
                =
                    0.0;
                //
                for (int i = 0; i < laenge; i++) {
                    //
                    for (int j = 0; j < laenge; j++) {
                        //
                        rot
                        += filter[i][j] * pixel[xx+i][yy+j] .getRed();
                        gruen += filter[i, j] * blau
    +=
                        filter[i][j];
                        pixel[xx+i][yy+j].getGreen();
                        pixel[xX+i][yy+j].getBlue();
                        //
                        if (rot < 0.0)
                            if (rot > 1.0)
                                rot
                                = 0.0;
                        if (gruen < 0.0)
                            rot
                            = 1.0;
                        gruen = 0.0;
                        (if (gruen > 1.0) gruen
                        if (blau <
                        0.0)
                            = 1.0;
                        if (blau › 1.0)
                        blau
                        blau
                        = 0.0;
                        = 1.0;
                        //
                        pixelNeu[x][y] =
                        new Color ( rot, gruen, blau,
                            1.0);
                        u
                        Raccusideuetpillels,oricinaleild,copp0;
                        return neuesBild;
                        m

                    }
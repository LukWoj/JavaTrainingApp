package pakietA;

import pakietB.KlasaC;
import pakietB.KlasaD;

public class KlasaA {
    private   int zmiennaPrivate;
              int zmiennaDefault;
    protected int zmiennaProtected;
    public    int zmiennaPublic;
   
    public void zrobCos(KlasaA a, KlasaB b, KlasaC c, KlasaD d) {
        a.zmiennaDefault = 10;
        a.zmiennaProtected = 10;
       
        b.zmiennaDefault = 10;
        b.zmiennaProtected = 10;
       
  //    c.zmiennaDefault = 10;
        c.zmiennaProtected = 10;
       
//      d.zmiennaDefault = 10;
        d.zmiennaProtected = 10;
    }
}

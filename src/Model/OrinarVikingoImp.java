package Model;

import Interfaces.Orinar;
import java.util.Random;

public class OrinarVikingoImp implements Orinar {

    @Override
    public int Orinar() {
        int orina = new Random().nextInt(3);
        return orina;
    }
}

package Model;

import Interfaces.Orinar;
import java.util.Random;

public class OrinarEspartanoImp implements Orinar {

    @Override
    public int Orinar() {
        int orina = new Random().nextInt(7);
        return orina;
    }
}

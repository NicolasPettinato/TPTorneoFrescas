package Model;

import Interfaces.Beber;
import java.util.Random;

public class BeberEspartanoImp implements Beber {
    @Override
    public int Beber() {
        int birra = new Random().nextInt(3);
        return birra;
    }
}

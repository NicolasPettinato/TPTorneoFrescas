package Model;

import Interfaces.Beber;
import java.util.Random;

public class BeberVikingoImp implements Beber {
    @Override
    public int Beber() {
        int birra = new Random().nextInt(7);
        return birra;
    }
}

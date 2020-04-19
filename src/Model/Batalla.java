package Model;

import java.util.List;
import java.util.Objects;

public class Batalla {
    private List<Vikingo> vikingos;
    private List<Espartano> espartanos;
    private Enfrentamiento enfrentamiento;
    private Integer rondas = 5;
    int i = 1;

    public Batalla(List<Vikingo> vikingos, List<Espartano> espartanos) {
        this.vikingos = vikingos;
        this.espartanos = espartanos;
    }

    public void inicio() {
        while(vikingos.size() > 0 && espartanos.size() > 0){


            Humano vikingoComp = vikingos.remove(0);
            Humano espartanoComp = espartanos.remove(0);

            System.out.print("\n");
            System.out.print("----------- ENFRENTAMIENTO ------------- \n");
            System.out.print("          "+vikingoComp.getNombre()+ " vs. "+espartanoComp.getNombre()+"\n");
            enfrentamiento = new Enfrentamiento(vikingoComp,espartanoComp,rondas);
            Humano ganador = enfrentamiento.desafio();


            if (Objects.nonNull(ganador)) {
                if (ganador instanceof Vikingo) {

                    //TODO
                    // guardar ganador : nombre, cantidad de cerveza, tipo

                } else if (ganador instanceof Espartano) {

                    //TODO
                    // guardar ganador : nombre, cantidad de cerveza, tipo
                }
            }
        }
    }


}

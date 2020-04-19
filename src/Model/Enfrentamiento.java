package Model;

public class Enfrentamiento {

    private Humano humano1;
    private Humano humano2;
    private Integer rondas;

    public Enfrentamiento(Humano humano1, Humano humano2, Integer rondas) {
        this.humano1 = humano1;
        this.humano2 = humano2;
        this.rondas = rondas;
    }

    public Humano getHumano1() {
        return humano1;
    }

    public void setHumano1(Humano humano1) {
        this.humano1 = humano1;
    }

    public Humano getHumano2() {
        return humano2;
    }

    public void setHumano2(Humano humano2) {
        this.humano2 = humano2;
    }

    public Integer getRondas() {
        return rondas;
    }

    public void setRondas(Integer rondas) {
        this.rondas = rondas;
    }

    public Humano desafio() {
        int nroRonda = 1;
        boolean ganador = false;

        while(nroRonda <= rondas && !ganador){

            //TODO
            // ver como usar metodos de Interfaces para que el primero en "orinar" sea el perdedor

            nroRonda++;
        }

        return null;
    }
}

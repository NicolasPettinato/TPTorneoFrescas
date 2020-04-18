import Model.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        List<Vikingo> vikingos = new ArrayList<Vikingo>();
        List<Espartano> espartanos = new ArrayList<Espartano>();

        vikingos.add(new Vikingo("Ragnar",30,75, new OrinarVikingoImp(),new BeberVikingoImp(),5));
        vikingos.add(new Vikingo("Rolo",34,90, new OrinarVikingoImp(),new BeberVikingoImp(),3));
        vikingos.add(new Vikingo("Floki",32,65, new OrinarVikingoImp(),new BeberVikingoImp(),2));

        espartanos.add(new Espartano("Leonidas",38,80, new OrinarEspartanoImp(),new BeberEspartanoImp(),3));
        espartanos.add(new Espartano("Icarus",27,68, new OrinarEspartanoImp(),new BeberEspartanoImp(),5));
        espartanos.add(new Espartano("Thanos",36,70, new OrinarEspartanoImp(),new BeberEspartanoImp(),2));

        List<Vikingo> listOrdVikingos = vikingos.stream().sorted(Comparator.comparing(Vikingo::getPeso)).collect(Collectors.toList());
        List<Espartano> listOrdEspartanos = espartanos.stream().sorted(Comparator.comparing(Espartano::getPeso)).collect(Collectors.toList());

        System.out.println(" Equipo Vikingos: ");
        for(int i = 0 ; i < listOrdVikingos.size(); i++){ ;
            Vikingo vik = listOrdVikingos.get(i);
            System.out.print("      Nombre: " + vik.getNombre() + " Peso: " + vik.getPeso() + " Edad: " + vik.getEdad()+ "\n");
        }
        System.out.print("\n");
        System.out.println(" Equipo Espartanos: ");
        for(int i = 0 ; i < listOrdEspartanos.size(); i++){ ;
            Espartano esp = listOrdEspartanos.get(i);
            System.out.print("      Nombre: " + esp.getNombre() + " Peso: " + esp.getPeso() + " Edad: " + esp.getEdad()+ "\n");
        }

    }
}

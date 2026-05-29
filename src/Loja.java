import java.util.LinkedList;
import java.util.List;

public class Loja {

    private List<Camiseta> camisetas = new LinkedList<Camiseta>();

    public void cadastrarCamiseta(Camiseta camiseta) {
        camisetas.add(camiseta);
    }
     //
    public List<Camiseta> buscarMarcaCamiseta(String marca) {

        List<Camiseta> encontrados = new LinkedList<Camiseta>();

        for (Camiseta camiseta : camisetas) {

            if (camiseta.getMarca().equals(marca)) {
                encontrados.add(camiseta);
            }

        }

        return encontrados;
    }

    public List<Camiseta> getCamisetas() {
        return camisetas;
    }
}
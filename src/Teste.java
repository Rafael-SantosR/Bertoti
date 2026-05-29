import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Teste{

    @Test
    void test() {

        Loja loja = new Loja();

        loja.cadastrarCamiseta(
                new Camiseta("StreetAparrel", "Branca", "M"));

        assertEquals(loja.getCamisetas().size(), 1);

        List<Camiseta> encontrados =
                loja.buscarMarcaCamiseta("StreetAparrel");

        //
        assertEquals(encontrados.get(0).getCor(), "Branca");
    }
}
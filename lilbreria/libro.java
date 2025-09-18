package lilbreria;

import java.util.ArrayList;

public class libro extends articulo{
    public libro(String autor, double precio, int paginas, String resumen, ArrayList<String> generos) {
        super(autor, precio, paginas, resumen, generos);
    }
}

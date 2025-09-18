package lilbreria;

public class clienteExigente extends cliente {

    public clienteExigente(String nombre, String apellido, String dni, String direccion, TipoCliente tipo) {
        super(nombre, apellido, dni, direccion, tipo);
    }

    @Override
    public boolean leGusta(articulo articulo) {
        boolean autorFav = getAutoresFavoritos().contains(articulo.getAutor());
        boolean generoFav = articulo.getGeneros().stream().anyMatch(g -> getGenerosFavoritos().contains(g));
        return autorFav && generoFav;
    }

}

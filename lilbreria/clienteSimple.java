package lilbreria;

public class clienteSimple extends cliente {

    public clienteSimple(String nombre, String apellido, String dni, String direccion, TipoCliente tipo) {
        super(nombre, apellido, dni, direccion, tipo);
    }

    @Override
    public boolean leGusta(articulo articulo) {
        return getAutoresFavoritos().contains(articulo.getAutor());
    }

}

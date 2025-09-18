package lilbreria;

import java.util.ArrayList;

public abstract class cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private TipoCliente tipo;
    private ArrayList<String> autoresFavoritos;
    private ArrayList<String> generosFavoritos;
    private ArrayList<articulo> compras;

    public cliente(String nombre, String apellido, String dni, String direccion, TipoCliente tipo,
            ArrayList<String> autoresFavoritos, ArrayList<String> generosFavoritos, ArrayList<articulo> compras) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.tipo = tipo;
        this.autoresFavoritos = autoresFavoritos;
        this.generosFavoritos = generosFavoritos;
        this.compras = compras;
    }

    // getters

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public ArrayList<String> getAutoresFavoritos() {
        return autoresFavoritos;
    }

    public ArrayList<String> getGenerosFavoritos() {
        return generosFavoritos;
    }

    public ArrayList<articulo> getCompras() {
        return compras;
    }

    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public void setAutoresFavoritos(ArrayList<String> autoresFavoritos) {
        this.autoresFavoritos= autoresFavoritos;
    }

    public void setGenerosFavoritos(ArrayList<String> generosFavoritos) {
        this.generosFavoritos = generosFavoritos;
    }

    public void setCompras(ArrayList<articulo> compras) {
        this.compras = compras;
    }

    // metodos

    public void agregarAutorFavorito(String autor) {
        this.autoresFavoritos.add(autor);
    }

    public void agregarGeneroFavorito(String genero) {
        this.generosFavoritos.add(genero);
    }

    public void agregarCompra(articulo articulo) {
        this.compras.add(articulo);
    }

    public double precioParaCliente(articulo articulo) {
        return articulo.getPrecio() * (1 - this.tipo.getDescuento());
    }

    public boolean yaCompro(articulo articulo) {
        return this.compras.contains(articulo);
    }

    // metodo abstracto para determinar si le gusta un articulo dependiendo del tipo
    // de cliente

    public abstract boolean leGusta(articulo articulo);
}

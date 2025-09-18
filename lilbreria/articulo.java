package lilbreria;

import java.util.ArrayList;
import java.util.List;

public abstract class articulo {
    private String autor;
    private String titulo;
    private int paginas;
    private String resumen;
    private double precio;
    private ArrayList<String> generos;

    public articulo(String autor, double precio, int paginas, String resumen, List<String> generos) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.paginas = paginas;
        this.resumen = resumen;
        this.generos = new ArrayList<>(generos);
    }

    // setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public void setGenero(String genero) {
        this.generos.add(genero);
    }
    public void deleteGenero(String genero) {
        this.generos.remove(genero);
    }
    

    // getters

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public double getPrecio() {
        return precio;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getResumen() {
        return resumen;
    }

}

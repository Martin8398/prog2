package agroquimicos;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos;


    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<>(estadosPatologicos);
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public void addEstadoPatologico(String estadoPatologico) {
        if (!this.estadosPatologicos.contains(estadoPatologico)) {
            this.estadosPatologicos.add(estadoPatologico);
        }
    }

    //Creo una copia de la lista para no exponer la original

    public ArrayList<String> getEstadosPatologicos() {
        ArrayList<String> copia = new ArrayList<>();
        for (String estado : this.estadosPatologicos) {
            copia.add(estado);
        }
        return copia;
    }

    
}



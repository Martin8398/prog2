package agroquimicos;

import java.util.ArrayList;

public abstract class Cultivo {
    private String nombre;
    private ArrayList <Enfermedad> efermedadesFrecuentes;


    public Cultivo(String nombre) {
        this.nombre = nombre;
        this.efermedadesFrecuentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEnfermedadFrecuente(Enfermedad enfermedad) {
        if (!this.efermedadesFrecuentes.contains(enfermedad)) {
            this.efermedadesFrecuentes.add(enfermedad);
        }
    }

    //Creo una copia de la lista para no exponer la original

    public ArrayList<Enfermedad> getEfermedadesFrecuentes() {
        ArrayList<Enfermedad> copia = new ArrayList<>();
        for (Enfermedad enfermedad : this.efermedadesFrecuentes) {
            copia.add(enfermedad);
        }
        return copia;
    }
    
    //  paso como parametro un cultivo y una enfermedad 
    //y me devuelve el listado de agroquimicos
    // tengo que consultar que el agroquimico sea aprto para el cultivo
    // y que trate la enfermedad


    public boolean sirveAgroquimico(Agroquimico agroquimico, Enfermedad enfermedad){
        boolean sirve=false;
        if (agroquimico.trataEnfermedad(enfermedad) && agroquimico.esAptoCultivo(this)) {
            sirve = true;
            return sirve;
        }
        return sirve;
    }

    public ArrayList<Agroquimico> AgroquimicosUtiles(){
        ArrayList<Agroquimico> utiles = new ArrayList<>();
        for (Agroquimico a : a.trataEnfermedad) {
            if (cultivo.sirveAgroquimico())
                utiles.add(agroquimico);
            }
        }

    }


}

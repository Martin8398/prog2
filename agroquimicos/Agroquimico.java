package agroquimicos;

import java.util.ArrayList;

public class Agroquimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosNo;
    private ArrayList<String> estadosPatologicos;

    public Agroquimico(String nombre) {
        this.nombre = nombre;
        this.cultivosNo = new ArrayList<>();
        this.estadosPatologicos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void addCultivoNo(Cultivo cultivo) {
        if (!this.cultivosNo.contains(cultivo)) {
            this.cultivosNo.add(cultivo);
        }
    }

    public void addEstadoPatologico(String estadoPatologico) {
        if (!this.estadosPatologicos.contains(estadoPatologico)) {
            this.estadosPatologicos.add(estadoPatologico);
        }
    }

    // Creo una copia de la lista para no exponer la original

    public ArrayList<Cultivo> getCultivosNo() {
        ArrayList<Cultivo> copia = new ArrayList<>();
        for (Cultivo cultivo : this.cultivosNo) {
            copia.add(cultivo);
        }
        return copia;
    }

    public ArrayList<String> getEstadosPatologicos() {
        ArrayList<String> copia = new ArrayList<>();
        for (String estado : this.estadosPatologicos) {
            copia.add(estado);
        }
        return copia;
    }

    public boolean esAptoCultivo(Cultivo cultivo) {
        boolean apto = true;
        for (Cultivo c : this.cultivosNo) {
            if (c.getNombre().equals(cultivo.getNombre())) {
                apto = false;
                return apto;
            }
        }
        return apto;
    }

    public boolean trataEnfermedad(Enfermedad enfermedad) {
        for (String estado : enfermedad.getEstadosPatologicos()) {
            if (!this.estadosPatologicos.contains(estado)) {
                return false;
            }
        }
        return true;
    }
    
    @Override    

    public boolean equals(Object obj) {
        try {
            Cultivo cultivo = (Cultivo) obj;
            return this.getNombre().equals(cultivo.getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}

package co.edu.javeriana.fdb.parcialdb.model.dto;

public class PaisDTO {
    
    String nombre;
    float iva;
    float impcon;
    float inTur;

    public PaisDTO(String nombre, float iva, float ic, float inTur) {
        this.nombre = nombre;
        this.iva = iva;
        this.impcon = ic;
        this.inTur = inTur;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getImpcon() {
        return impcon;
    }

    public void setIc(float impcon) {
        this.impcon = impcon;
    }

    public float getInTur() {
        return inTur;
    }

    public void setInTur(float inTur) {
        this.inTur = inTur;
    }

    @Override
    public String toString() {
        return "PaisDTO{" + "nombre=" + nombre + ", iva=" + iva + ", impcon=" + impcon + ", inTur=" + inTur + '}';
    }
    
}
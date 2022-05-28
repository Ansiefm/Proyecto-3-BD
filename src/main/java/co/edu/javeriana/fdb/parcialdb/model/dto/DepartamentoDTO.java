package co.edu.javeriana.fdb.parcialdb.model.dto;

public class DepartamentoDTO {
    
    String codedep;
    String nombredep;
    float presupuesto;

    public DepartamentoDTO(String codedep, String nombredep,float presupuesto) {
        this.codedep = codedep;
        this.nombredep = nombredep;
        this.presupuesto = presupuesto;
    }
    
    public String getCodedep() {
        return codedep;
    }

    public void setCodedep(String codedep) {
        this.codedep = codedep;
    }

    public String getNombredep() {
        return nombredep;
    }

    public void setNombredep(String nombredep) {
        this.nombredep = nombredep;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }


    @Override
    public String toString() {
        return "DepartamentoDTO{" + "Codedep=" + codedep + ", Nombredep=" + nombredep + ", Presupuesto=" + presupuesto + '}';
    }
    
}
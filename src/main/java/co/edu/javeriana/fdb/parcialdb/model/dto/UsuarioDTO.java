package co.edu.javeriana.fdb.parcialdb.model.dto;

public class UsuarioDTO {
    
    String usuario;
    String contra;

    public UsuarioDTO (String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }


    @Override
    public String toString() {
        return "CuentaDTO{" + "usuario=" + usuario + ", contra=" + contra  + '}';
    }
        
}
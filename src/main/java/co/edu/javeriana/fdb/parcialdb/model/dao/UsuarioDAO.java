package co.edu.javeriana.fdb.parcialdb.model.dao;

import co.edu.javeriana.fdb.parcialdb.model.dto.UsuarioDTO;
import java.util.List;

public interface UsuarioDAO {
	
    public UsuarioDTO create(UsuarioDTO cuenta);
    
    public UsuarioDTO editContra(UsuarioDTO cuenta, String nuevacontra);
    
    public Boolean delete(String usuario);
    
    public UsuarioDTO findById(String usuario);
  
}
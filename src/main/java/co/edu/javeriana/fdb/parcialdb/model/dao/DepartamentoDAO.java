package co.edu.javeriana.fdb.parcialdb.model.dao;

import co.edu.javeriana.fdb.parcialdb.model.dto.DepartamentoDTO;
import java.util.List;

public interface DepartamentoDAO {
    
    public DepartamentoDTO create(DepartamentoDTO dep);
    
    public Boolean delete(String codedep);
    
    public DepartamentoDTO findById(String codedep);
    
    public List<DepartamentoDTO> findAll();
    
    public DepartamentoDTO edit(String code, DepartamentoDTO Dep);

}
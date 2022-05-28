package co.edu.javeriana.fdb.parcialdb.controller.logic;

import co.edu.javeriana.fdb.parcialdb.model.dao.PaisDAO;
import co.edu.javeriana.fdb.parcialdb.model.dao.impl.PaisDAOimpl;
import co.edu.javeriana.fdb.parcialdb.model.dto.PaisDTO;

import java.util.List;

public class PaisBO {
    private PaisDAO pdao;

    public List<PaisDTO> findAll(){
        this.pdao = new PaisDAOimpl();
        return this.pdao.findAll();
    }

    public boolean Create(PaisDTO Pais){
        boolean Go;
        this.pdao = new PaisDAOimpl();
        PaisDTO Exist = pdao.findById(Pais.getNombre());
        if(Exist != null){
            return false;
        }else{
            return this.pdao.create(Pais) != null;
        }
    }

    public PaisDTO findById(String T){
        this.pdao = new PaisDAOimpl();
        return this.pdao.findById(T);
    }

    public boolean Delete(String T){
        boolean Go;
        this.pdao = new PaisDAOimpl();
        if(this.pdao.delete(T)){
            Go = true;
        }else{
            Go = false;
        }
        return Go;
    }

    public boolean Edit(PaisDTO Pais){
        this.pdao = new PaisDAOimpl();
        PaisDTO Existente = this.pdao.findById(Pais.getNombre());
        if(Existente == null ){
            return false;
        }else{
            return this.pdao.edit(Pais.getNombre(),Pais) != null;
        }
    }
}

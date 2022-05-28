package co.edu.javeriana.fdb.parcialdb.controller.logic;

import co.edu.javeriana.fdb.parcialdb.model.dao.DepartamentoDAO;
import co.edu.javeriana.fdb.parcialdb.model.dao.impl.DepartamentoDAOimpl;
import co.edu.javeriana.fdb.parcialdb.model.dto.DepartamentoDTO;

import java.util.List;

public class DepartamentoBO {
    DepartamentoDAO pdao;

    public DepartamentoDTO findById(String Code){
        this.pdao = new DepartamentoDAOimpl();
        return this.pdao.findById(Code);
    }

    public boolean Create (DepartamentoDTO Depa){
        this.pdao = new DepartamentoDAOimpl();
        return this.pdao.create(Depa) != null;
    }

    public boolean Delete (String De){
        boolean Go;
        this.pdao = new DepartamentoDAOimpl();
        return this.pdao.delete(De);
    }

    public List<DepartamentoDTO> findByAll(){
        this.pdao = new DepartamentoDAOimpl();
        return this.pdao.findAll();
    }

    public boolean Edit(DepartamentoDTO Dep){
        this.pdao = new DepartamentoDAOimpl();
        DepartamentoDTO Exist = this.pdao.findById(Dep.getCodedep());
        if(Exist == null){
            return false;
        }else{
            return this.pdao.edit(Dep.getCodedep(),Dep) != null;
        }
    }
}

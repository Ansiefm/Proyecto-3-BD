package co.edu.javeriana.fdb.parcialdb.controller.logic;

import co.edu.javeriana.fdb.parcialdb.model.dao.UsuarioDAO;
import co.edu.javeriana.fdb.parcialdb.model.dao.impl.UsuarioDAOimpl;
import co.edu.javeriana.fdb.parcialdb.model.dto.UsuarioDTO;

public class UsuarioBO {
    UsuarioDAO pdao;

    public UsuarioDTO findById(String Usu){
        this.pdao = new UsuarioDAOimpl();
        return this.pdao.findById(Usu);
    }

    public boolean Create (UsuarioDTO Usu){
        boolean Go;
        this.pdao = new UsuarioDAOimpl();
        UsuarioDTO Exist = pdao.findById(Usu.getUsuario());
        if(Exist != null){
            return false;
        }else{
            return this.pdao.create(Usu) != null;
        }
    }

    public boolean Delete (String Usu){
        boolean Go;
        this.pdao = new UsuarioDAOimpl();
        if(this.pdao.delete(Usu) != null){
            Go=true;
        }else{
            Go=false;
        }
        return Go;
    }

    public boolean EditCont(UsuarioDTO cuenta, String nuevacontra){
        this.pdao = new UsuarioDAOimpl();
        UsuarioDTO Exist = this.pdao.findById(cuenta.getUsuario());
        if(Exist == null){
            return false;
        }else{
            return this.pdao.editContra(cuenta,nuevacontra) != null;
        }
    }
}

package co.edu.javeriana.fdb.parcialdb.model.dao.impl;


import co.edu.javeriana.fdb.parcialdb.model.dao.UsuarioDAO;
import co.edu.javeriana.fdb.parcialdb.model.dto.UsuarioDTO;
import co.edu.javeriana.fdb.parcialdb.util.Oracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAOimpl implements UsuarioDAO {
    
    private final Oracle oracle;
    
    public UsuarioDAOimpl() {
        this.oracle = new Oracle();
    }

    
    public UsuarioDTO create (UsuarioDTO usuario) {
        try{
            this.oracle.conectar();
            String query = "INSERT INTO PRO2_USUARIO (usuario, contra) VALUES("+
                    "'" + usuario.getUsuario()+ "'," +
                    "'" + usuario.getContra() + "'" +
                    ")";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se creo la cuenta");
                    return findById(usuario.getUsuario());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(UsuarioDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    
    public Boolean delete(String usuario) {
        try{
            String query = "DELETE FROM PRO2_USUARIO WHERE usuario = '" + usuario + "'";
            System.out.println(query);
            
            UsuarioDTO usuarioo = findById(usuario);
            System.out.println("Eliminando: " + usuarioo);
            
            this.oracle.conectar();
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se elimino la cuenta");
                    return true;
                default:
                    return false;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(UsuarioDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    
    public UsuarioDTO findById(String usuario) {
        try{
            this.oracle.conectar();
            String query = "SELECT * FROM PRO2_USUARIO WHERE usuario = '"+ usuario +"'";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(rs.first())
            {
            	UsuarioDTO usuarioo = new UsuarioDTO(rs.getString("usuario"), rs.getString("contra"));
                System.out.println("Cuenta encontrada: " + usuarioo.toString());
                rs.close();
                stmt.close();
                this.oracle.desconectar();
                return usuarioo;
            } 
            else 
            {
                System.out.println("No se encontro ninguna cuenta");
                rs.close();
                stmt.close();
                this.oracle.desconectar();
                
                return null;
            }        
            
        } catch (SQLException ex){
            Logger.getLogger(UsuarioDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    
    public UsuarioDTO editPass(UsuarioDTO cuenta, String nueva) {
        try{
            this.oracle.conectar();
            String query = "UPDATE PRO2_USUARIO SET "+ 
                    "contra = '" + nueva + "' " +
                    " WHERE usuario = '" + cuenta.getUsuario() + "'";
            System.out.println(query);
        
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se edito la Contrase�a");
                    return findById(cuenta.getUsuario());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(UsuarioDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }


	public UsuarioDTO editContra(UsuarioDTO cuenta, String nuevacontra) {
		// TODO Auto-generated method stub
		return null;
	}
}
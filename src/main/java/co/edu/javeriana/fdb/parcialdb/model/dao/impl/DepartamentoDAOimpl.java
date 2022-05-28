package co.edu.javeriana.fdb.parcialdb.model.dao.impl;

import co.edu.javeriana.fdb.parcialdb.model.dao.DepartamentoDAO;
import co.edu.javeriana.fdb.parcialdb.model.dto.DepartamentoDTO;
import co.edu.javeriana.fdb.parcialdb.util.Oracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DepartamentoDAOimpl implements DepartamentoDAO {
    private final Oracle oracle;

    public DepartamentoDAOimpl() {
        this.oracle = new Oracle();
    }
    
    public DepartamentoDTO create(DepartamentoDTO dep) {
        try{
            this.oracle.conectar();
            String query = "INSERT INTO PRO2_DEPARTAMENTO(codedep, nombre, presupuesto) VALUES("+ 
                    "'" + dep.getCodedep()+ "'," +
                    "'" + dep.getNombredep()+ "'," +
                    "'" + dep.getPresupuesto()+ "'," +
                    ")";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se creo la persona");
                    return findById(dep.getCodedep());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(DepartamentoDTO.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    
    public Boolean delete(float codedep) {
        try{
            String query = "DELETE FROM PRO2_DEPARTAMENTO WHERE codedep = '" + codedep + "'";
            System.out.println(query);
            
            DepartamentoDTO dep = findById(codedep);
            System.out.println("Eliminando: " + dep.toString());
            
            this.oracle.conectar();
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se elimino la persona");
                    return true;
                default:
                    return false;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(DepartamentoDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    
    public DepartamentoDTO findById(float codedep) {
        try{
            this.oracle.conectar();
            String query = "SELECT * FROM PRO2_DEPARTAMENTO WHERE codedep = '"+ codedep +"'";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(rs.first())
            {
            	DepartamentoDTO dep = new DepartamentoDTO(rs.getString("codedep"), rs.getString("nombre"), rs.getFloat("presupuesto"));
                System.out.println("Persona encontrada: " + dep.toString());
                rs.close();
                stmt.close();
                this.oracle.desconectar();
                
                return dep;
            } 
            else 
            {
                rs.close();
                stmt.close();
                this.oracle.desconectar();
                
                return null;
            }        
            
        } catch (SQLException ex){
            Logger.getLogger(DepartamentoDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    //////////
    public List<DepartamentoDTO> findAll() {
        try{
            
            List<DepartamentoDTO> deps = new ArrayList<DepartamentoDTO>();
            
            this.oracle.conectar();
            String query = "SELECT * FROM PRO2_DEPARTAMENTO";
            System.out.println(query);
            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(!rs.next()) return null;
            rs.previous();
            do
            {
                rs.next();
                DepartamentoDTO dep = new DepartamentoDTO(rs.getString("codedep"), rs.getString("nombre"), rs.getFloat("presupuesto"));
                deps.add(dep);
            }
            while(!rs.isLast());
            
            rs.close();
            stmt.close();
            this.oracle.desconectar();
            
            return deps;
            
        } catch (SQLException ex){
            Logger.getLogger(DepartamentoDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

	public DepartamentoDTO edit(String nombre, DepartamentoDTO pais) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean delete(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	public DepartamentoDTO findById(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
}

package co.edu.javeriana.fdb.parcialdb.model.dao.impl;

import co.edu.javeriana.fdb.parcialdb.model.dao.PaisDAO;
import co.edu.javeriana.fdb.parcialdb.model.dto.PaisDTO;
import co.edu.javeriana.fdb.parcialdb.util.Oracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaisDAOimpl implements PaisDAO {
    
    private final Oracle oracle;

    public PaisDAOimpl() {
        this.oracle = new Oracle();
    }  
    
    @Override
    public PaisDTO create (PaisDTO pais) {
        try{
            this.oracle.conectar();
            String query = "INSERT INTO PRO2_PAIS(nombre, iva, impconsumo, impnalturismo) VALUES("+ 
                    "'" + pais.getNombre()+ "'," +
                    pais.getIva()+ ", " +
                    pais.getImpcon()+ "," +
                    pais.getInTur()+ "" +
                    ")";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se ha creodo el pais");
                    return findById(pais.getNombre());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(PaisDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public PaisDTO edit(String nombre, PaisDTO pais) {
        try{
            this.oracle.conectar();
            String query = "UPDATE PRO2_PAIS SET "+
                    "iva = " + pais.getIva()+ "," +
                    "impconsumo = " + pais.getImpcon()+ "," +
                    "impnalturismo = " + pais.getInTur() +
                    " WHERE nombre = '" + nombre + "'";
            System.out.println(query);
            
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se edito el pais");
                    return findById(pais.getNombre());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(PaisDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    
    @Override
    public Boolean delete(String nombre) {
        try{
            String query = "DELETE FROM PRO2_PAIS WHERE nombre = '" + nombre + "'";
            System.out.println(query);
            
            PaisDTO pais = findById(nombre);
            System.out.println("Eliminando: " + pais);
            
            this.oracle.conectar();
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se elimino el pais");
                    return true;
                default:
                    return false;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(PaisDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    
    @Override
    public PaisDTO findById(String nombre) {
        try{
            this.oracle.conectar();
            String query = "SELECT * FROM PRO2_PAIS WHERE nombre = '"+ nombre +"'";
            System.out.println(query);

            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(rs.first())
            {
                PaisDTO pais = new PaisDTO(rs.getString("nombre"), rs.getFloat("iva"), rs.getFloat("impconsumo"), rs.getFloat("impnalturismo"));
                System.out.println("Pais encontrado: " + pais.toString());
                rs.close();
                stmt.close();
                this.oracle.desconectar();
                
                return pais;
            } 
            else 
            {
                rs.close();
                stmt.close();
                this.oracle.desconectar();
                
                return null;
            }        
            
        } catch (SQLException ex){
            Logger.getLogger(PaisDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    
    @Override
    public List<PaisDTO> findAll() {
        try{
            
            List<PaisDTO> paises = new ArrayList<PaisDTO>();
            this.oracle.conectar();
            String query = "SELECT * FROM PRO2_PAIS";
            System.out.println(query);
            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(!rs.next()) return null;
            rs.previous();
            do
            {
                rs.next();
                PaisDTO pais = new PaisDTO(rs.getString("nombre"), rs.getFloat("iva"), rs.getFloat("impconsumo"), rs.getFloat("impturismo"));
                paises.add(pais);
            }
            while(!rs.isLast());
            
            rs.close();
            stmt.close();
            this.oracle.desconectar();
            
            return paises;
            
        } catch (SQLException ex){
            Logger.getLogger(PaisDAOimpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }    
}
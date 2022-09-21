
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrearSolicitudes extends Conexion {
     
   
    
    public boolean registrar(Solicitudes sol) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO  solicitudes (codigo_maquina, nombre_maquina, area, falla ) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, sol.getCodigo());
            ps.setString(2, sol.getNombre());
            ps.setString(3, sol.getArea());
            ps.setString(4, sol.getFalla());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public boolean modificar(Solicitudes sol) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE solicitudes SET codigo_maquina=?, nombre_maquina=?, area=?, falla=? WHERE id=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, sol.getCodigo());
            ps.setString(2, sol.getNombre());
            ps.setString(3, sol.getArea());
            ps.setString(4, sol.getFalla());
           
            ps.setInt(5, sol.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public boolean eliminar(Solicitudes sol) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM solicitudes  WHERE id=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, sol.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public boolean buscar(Solicitudes sol) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM solicitudes  WHERE codigo_maquina=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, sol.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                sol.setId(Integer.parseInt(rs.getString("id")));
                sol.setCodigo(rs.getString("codigo"));
                sol.setNombre(rs.getString("nombre"));
                sol.setArea(rs.getString("color"));
                sol.setFalla(rs.getString("falla"));
               
                return true;

            }

            return false;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    
   

    
}

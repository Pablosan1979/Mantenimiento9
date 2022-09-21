package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasMaquina extends Conexion {

    public boolean registrar(Maquina maq) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO  maquinas (codigo, nombre,color ) VALUES (?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maq.getCodigo());
            ps.setString(2, maq.getNombre());
            ps.setString(3, maq.getColor());
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

    public boolean modificar(Maquina maq) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE maquinas SET codigo=?, nombre=?, color=?  WHERE id=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, maq.getCodigo());
            ps.setString(2, maq.getNombre());
            ps.setString(3, maq.getColor());
            ps.setInt(4, maq.getId());
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

    public boolean eliminar(Maquina maq) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM maquinas  WHERE id=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, maq.getId());
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

    public boolean buscar(Maquina maq) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM maquinas  WHERE codigo=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, maq.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                maq.setId(Integer.parseInt(rs.getString("id")));
                maq.setCodigo(rs.getString("codigo"));
                maq.setNombre(rs.getString("nombre"));
                maq.setColor(rs.getString("color"));
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

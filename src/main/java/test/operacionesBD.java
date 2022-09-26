package test;
import beans.Servicio;
import connection.DBConnection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class operacionesBD {
    public static void main(String[] args) {
        listarServicio();
    }
    public static void actualizarServicio(String ruta, String placa){
        DBConnection con = new DBConnection();
        String sql = "UPDATE servicio SET placa = "
                + "'" + placa + "WHERE ruta = " +ruta;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            con.desconectar();
        }
    }
    public static void listarServicio(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM servicio";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String ruta = rs.getString("ruta");
                String placa = rs.getString("placa");
                Date fecha = rs.getDate("fecha");
                Date hora = rs.getDate("hora");
                double valor = rs.getDouble("valor");
                int puestos = rs.getInt("puestos");
                Servicio servicio = new Servicio(ruta, placa, fecha, hora, valor, puestos);
                System.out.println(servicio.toString());
            }
            st.executeQuery(sql);
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            con.desconectar();
        }
    }
}

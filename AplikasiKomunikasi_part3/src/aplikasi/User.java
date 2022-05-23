/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;
import java.sql.*;
/**
 *
 * @author Aysia
 */
public class User {
    int id;
    String nama,username,password;
    
    public int cekLogin(){
        int nilaiBalik = 0;
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "SELECT * FROM users WHERE username='" + this.username +
                    "' AND password='" + this.password + "'";
            ResultSet r = s.executeQuery(sql);
            
            if(r.next()){
                if(this.username.equals("admin")){
                    nilaiBalik = 2;
                } else { 
                    nilaiBalik = 1;
                }
                
                this.id = r.getInt("id");
                this.nama = r.getString("nama");
            }
        } catch(SQLException e){
            System.out.println("Error");
        }
        return nilaiBalik;
    }
    
    public int cekDaftar(){
        int nilaiBalik = 0;
        try{
            Connection c = Koneksi.getKoneksi();
            
            Statement s = c.createStatement();
          
            String sql = "SELECT * FROM users WHERE username='" + this.username + "'";
            ResultSet r = s.executeQuery(sql);
            if(!r.next()){
                sql = "INSERT INTO users VALUES (?,?,?,?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, null);
                p.setString(2, this.nama);
                p.setString(3, this.username);
                p.setString(4, this.password);

                p.executeUpdate();
                p.close();
                
                nilaiBalik = 1;
            } 
          
        }catch(SQLException e){
            System.out.println("Error");
        }
        return nilaiBalik;
    }
    
    public int kirimPesan(String penerima, String isiPesan){
        try{
            Connection c = Koneksi.getKoneksi();
            
            String sql = "INSERT INTO pesan VALUES (?,?,?,?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, null);
            p.setString(2, this.username);
            p.setString(3, penerima);
            p.setString(4, isiPesan);
            
            p.executeUpdate();
            p.close();
        } catch (SQLException e){
            System.out.println("Error");
        }
        return 1;
    }
}

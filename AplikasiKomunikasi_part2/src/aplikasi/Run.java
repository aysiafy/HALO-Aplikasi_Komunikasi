/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

/**
 *
 * @author Aysia
 */
public class Run {
    public static void main(String[] args) {
        Login frm = new Login();
        frm.setVisible(true);
        frm.pack();
        frm.setLocationRelativeTo(null);
        frm.setLocation(500,150);
        frm.setSize(376,450);
        frm.setResizable(false);
        frm.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }
}

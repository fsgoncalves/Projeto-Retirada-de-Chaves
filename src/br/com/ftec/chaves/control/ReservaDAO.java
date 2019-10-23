/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.control;

import br.com.ftec.chaves.model.Colaborador;
import br.com.ftec.chaves.model.Reserva;
import br.com.ftec.chaves.model.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando.goncalves
 */
public class ReservaDAO {
    
    public void salvar(Reserva reserva) throws Exception {

        String sql = "insert into reservas (id_sala,id_colaborador, turno, dia)" +
       "VALUES (?,?,?,?)"; 

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
                       pstm = conn.prepareStatement(sql);
            pstm.setInt(1, reserva.getSala().getId()); // cada pstm.set coloca valor em um dos ?
            pstm.setInt(2, reserva.getColaborador().getId());
            pstm.setString(3, reserva.getTurno());
            pstm.setString(4, reserva.getDia());
            pstm.execute(); // executar comando SQL

        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public List<Reserva> listaReservas() throws Exception {
        
       String sqli =  "SELECT * FROM RESERVAS";
        
       Connection conn = null;
       PreparedStatement pstm = null;
        // Classe que vai recuperar os dados do BD
       ResultSet rset = null;
       
        ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();
        
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sqli);
        rset = pstm.executeQuery();
        
        while(rset.next()) {
            
            Reserva reserva = new Reserva();
            Colaborador c = new Colaborador();
            Sala s = new Sala();
            
            c.setId(rset.getInt("id_colaborador"));
            reserva.setColaborador(c);
            s.setId(rset.getInt("id_sala"));
            reserva.setSala(s);
            reserva.setDia(rset.getString("dia"));
            reserva.setTurno(rset.getString("turno"));
            listaReservas.add(reserva);
        }
       
        return listaReservas;
    }
    
    public void excluirReserva(int id) throws Exception {
        String sql = "delete from salas where id = "+id;
        
        Connection conn = null;
       PreparedStatement pstm = null;
        // Classe que vai recuperar os dados do BD
       ResultSet rset = null;
       
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sql);
        try{
        pstm.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Existe uma reserva cadastrada"
                                         + " para esta sala!");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.control;

import br.com.ftec.chaves.model.Reserva;
import br.com.ftec.chaves.model.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando.goncalves
 */
public class ReservaDAO {
    
    public void salvar(Reserva reserva) throws Exception {

        String sql = "insert into reserva (id_sala,id_colaborador, turno, dia)" +
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
    
}

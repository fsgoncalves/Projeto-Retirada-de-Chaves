/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.control;

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
public class SalaDAO {

    public void salvar(Sala sala) throws Exception {

        String sql = "INSERT INTO sala(sala, descricao, capacidade, tipo) "
                + "VALUES (?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
                       pstm = conn.prepareStatement(sql);
            pstm.setString(1, sala.getSala()); // cada pstm.set coloca valor em um dos ?
            pstm.setString(2, sala.getDescricao());
            pstm.setString(3, sala.getCapacidade());
            pstm.setString(4, sala.getTipo());
            pstm.execute(); // executar comando SQL

        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

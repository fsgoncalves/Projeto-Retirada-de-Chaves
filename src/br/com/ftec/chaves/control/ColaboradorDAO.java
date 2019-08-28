/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.control;


import br.com.ftec.chaves.model.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando.goncalves
 */
public class ColaboradorDAO {
    
    public void Salvar(Colaborador colaborador) throws Exception{
        
        String sql = "INSERT INTO colaborador(nome, cpf, senha, telefone, email)" +
                "VALUES(?,?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sql);
        try{
        pstm.setString(1, colaborador.getNome());
        pstm.setString(2, colaborador.getCpf());
        pstm.setString(3, colaborador.getSenha());
        pstm.setString(4, colaborador.getTelefone());
        pstm.setString(5, colaborador.getEmail());
        pstm.execute();
      } catch (SQLException ex) {
            Logger.getLogger(ColaboradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

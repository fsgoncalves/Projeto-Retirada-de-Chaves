/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.control;

import br.com.ftec.chaves.model.Colaborador;
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
public class ColaboradorDAO {

    public void Salvar(Colaborador colaborador) throws Exception {

        String sql = "INSERT INTO colaboradores(nome, cpf, senha, telefone, email)"
                + "VALUES(?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sql);
        try {
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

    public Colaborador buscaColaboradorCpf(String cpf) throws Exception {

        String sql = "SELECT * FROM COLABORADORES WHERE CPF = " + cpf;

        Connection conn = null;
        PreparedStatement pstm = null;
        // Classe que vai recuperar os dados do BD
        ResultSet rset = null;

        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sql);
        rset = pstm.executeQuery();
        Colaborador colaborador = new Colaborador();

        while (rset.next()) {
            colaborador.setId(rset.getInt("id"));
            colaborador.setEmail(rset.getString("email"));
            colaborador.setNome(rset.getString("nome"));
            colaborador.setSenha(rset.getString("senha"));
            colaborador.setTelefone(rset.getString("telefone"));
            colaborador.setCpf(rset.getString("cpf"));
        }

        return colaborador;
    }
    
    public List<Colaborador> listaColaboradores() throws Exception {
        
       String sqli =  "SELECT * FROM COLABORADORES";
        
       Connection conn = null;
       PreparedStatement pstm = null;
        // Classe que vai recuperar os dados do BD
       ResultSet rset = null;
       
        ArrayList<Colaborador> listaColaboradores = new ArrayList<Colaborador>();
        
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sqli);
        rset = pstm.executeQuery();
        
        while(rset.next()) {
            
            Colaborador c = new Colaborador();
            c.setId(rset.getInt("id"));
            c.setEmail(rset.getString("email"));
            c.setNome(rset.getString("nome"));
            c.setSenha(rset.getString("senha"));
            c.setTelefone(rset.getString("telefone"));
            c.setCpf(rset.getString("cpf"));
            listaColaboradores.add(c);
        }
       
        return listaColaboradores;
    }
    
    public void excluirColaborador(int id) throws Exception {
        String sql = "delete from colaboradores where id = "+id;
        
        Connection conn = null;
       PreparedStatement pstm = null;
        // Classe que vai recuperar os dados do BD
       ResultSet rset = null;
       
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sql);
        try{
        pstm.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Este colaborador esta vinculado"
                                         + " a uma reserva!");
        }
    }

}

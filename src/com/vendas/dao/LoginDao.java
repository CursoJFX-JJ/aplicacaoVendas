/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vendas.dao;

import com.vendas.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class LoginDao {
    
    Connection conn = new Conexao().getConnection();
    
    public void login(String email) throws SQLException {
        
        String query = "select emailfuncionario from funcionario where email funcionario like ?";
        
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        boolean login = false;
        
        try {
           stmt = conn.prepareStatement(query);
           stmt.setString(1, email);
           
           rs = stmt.executeQuery();
           
           while(rs.next()) {
               login = true;
           }
           
           rs.close();
           stmt.close();
        } catch (Exception e) {
        } finally {
            conn.close();
        }
        
    }
    
}

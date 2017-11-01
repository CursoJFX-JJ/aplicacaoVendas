/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vendas.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author aluno
 */
public class PainelDeControleController implements Initializable {

    
    @FXML
    private Button btnInsereFuncionario;

    @FXML
    private Button btnInsereProduto;

    @FXML
    void insereFuncionario(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("InsereFuncionario.fxml"));
        
        PainelControle painelControle = new PainelControle();
        
        InsereFuncionario insereFuncionario = new InsereFuncionario();
        
        
    }

    @FXML
    void insereProduto(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

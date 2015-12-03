/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld_interfaces;

import javax.ejb.EJB;
import javax.ejb.Remote;
/**
 *
 * @author RODOLFO ROCHA
 */
@Remote
public interface HelloWorld_Interface {
    
    public abstract String exibirMensagem(String nome);

}

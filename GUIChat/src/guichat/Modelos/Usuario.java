/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichat.Modelos;

import java.io.Serializable;

/**
 *
 * @author vanya
 */
public class Usuario implements Serializable {
    
    private int id;
    private String username;
    private String password;
    
    public Usuario() {
        id = 0;
        username = "";
        password = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
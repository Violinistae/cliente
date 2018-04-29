/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichat.Modelos;

import java.io.Serializable;

/**
 *
 * @author Kevin Alan Martinez Virgen 14300260 8B1
 */
public class Comunicacion implements Serializable{
    
    public static enum MTypes{
        RQ_LOGIN,RQ_REG, RQ_LOGOUT,
        RQ_ACTUALIZAR,RQ_MENSAJE,
        RQ_NAMIGO, RQ_DAMIGO, RQ_AAMIGO, RQ_AMIGOS,
        RQ_APODO, RQ_GRUPO, RQ_CGRUPO,
        RQ_NMIEMBRO, RQ_DMIEMBRO,
        RQ_CONECTADOS, RQ_DESCONECTADOS,
        ACK, ACK_LOGIN,
        SEND_MENSAJE, SEND_GRUPO, SEND_CONECTADOS, SEND_DESCONECTADOS
    };

    private MTypes tipo;
    private Object contenido;
    
    public Comunicacion() {
        tipo = MTypes.ACK;
        contenido = " ";
    }

    /**
     *
     * @return
     */
    public MTypes getTipo() {
        return tipo;
    }

    public void setTipo(MTypes type) {
        this.tipo = type;
    }

    public Object getContenido() {
        return contenido;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }
    
    
    
    
}


package com.supermarket.models.domain;

/**
 *
 * @author Marvin Moises Mazariegos Toyom
 * @date 7/09/2022
 * @time 01:18:21
 */
public class Cliente {
    
    private String nit;
    private int personaId;
    private String usuarioId;

   
    public Cliente() {
        
    }

    public Cliente(String nit) {
        this.nit = nit;
    }

    public Cliente(int personaId, String usuarioId) {
        this.personaId = personaId;
        this.usuarioId = usuarioId;
    }

    public Cliente(String nit, int personaId, String usuarioId) {
        this.nit = nit;
        this.personaId = personaId;
        this.usuarioId = usuarioId;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nit=" + nit + ", personaId=" + personaId + ", usuarioId=" + usuarioId + '}';
    }
    
}

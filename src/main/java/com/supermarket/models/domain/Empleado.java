package com.supermarket.models.domain;

/**
 *
 * @author Marvin Moises Mazariegos Toyom
 * @date 6/09/2022
 * @time 22:29:00
 */


public class Empleado {
    private String dpi;
    private int personaId;
    private String usuarioId;
    private int rolId;

    public Empleado() {
        
    }
    
    public Empleado(String dpi) {
        this.dpi = dpi;
    }

    public Empleado(int personaId, String usuarioId, int rolId) {
        this.personaId = personaId;
        this.usuarioId = usuarioId;
        this.rolId = rolId;
    }

    public Empleado(String dpi, int personaId, String usuarioId, int rolId) {
        this.dpi = dpi;
        this.personaId = personaId;
        this.usuarioId = usuarioId;
        this.rolId = rolId;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
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

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    @Override
    public String toString() {
        return "Empleados{" + "dpi=" + dpi + ", personaId=" + personaId + ", usuarioId=" + usuarioId + ", rolId=" + rolId + '}';
    }
    
}
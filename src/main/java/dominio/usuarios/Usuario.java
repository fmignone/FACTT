package dominio.usuarios;

import java.util.List;

public class Usuario {

    private String username;
    private String password;
    private Perfil perfil;

    public Usuario(String username, String password, Perfil perfil){

        //TODO: Agregar validaciones de seguridad.

        this.username = username;
        this.password = password;
        this.perfil = perfil;
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

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

}

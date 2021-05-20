package dominio.usuarios.validadores;

import dominio.usuarios.Usuario;

public class LongitudMinina implements Validador{

    public LongitudMinina(){
    }

    public void validar(Usuario usuario){
        if(usuario.getPassword().length()<8){
            throw new RuntimeException("La contraseña contiene menos de 8 caracteres.");
        }
    }
}

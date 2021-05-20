package dominio.usuarios.validadores;

import dominio.usuarios.Usuario;

import java.util.List;

public class ValidadoresDeContrasenas {

    List<Validador> validadores;

    public ValidadoresDeContrasenas (List<Validador> validadores){

        this.validadores = validadores;
    }

    public void validar(Usuario usuario){
        validadores.forEach(validador -> validador.validar(usuario));
    }
}

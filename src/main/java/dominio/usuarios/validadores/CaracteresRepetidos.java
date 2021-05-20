package dominio.usuarios.validadores;

import dominio.usuarios.Usuario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaracteresRepetidos implements Validador{

    public void validar(Usuario usuario){
        Pattern regex = Pattern.compile("(.)\\1");
        Matcher matcher = regex.matcher(usuario.getPassword());
        if(matcher.find()){
            throw new RuntimeException("La contraseña no debe contener caracteres repetidos.");
        }
    }
}

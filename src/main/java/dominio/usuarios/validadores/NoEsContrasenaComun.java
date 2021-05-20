package dominio.usuarios.validadores;


import dominio.usuarios.Usuario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class NoEsContrasenaComun implements Validador {

    List<String> peoresContrasenas = new ArrayList<>();

    public void validar(Usuario usuario) {
        try {
            InputStream inputStream = NoEsContrasenaComun.class.getResourceAsStream("/peores_contrasenas.txt");
            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(streamReader);

            String line;
            while ((line = reader.readLine()) != null) {
                peoresContrasenas.add(line);
            }
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException("Ocurrio un error al leer el archivo de contraseñas");
        }
    }
}

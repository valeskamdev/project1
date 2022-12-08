package coursejava;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import coursejava.arquivoTexto.Usuario;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscreveJSON {
    public static void main(String[] args) throws IOException {

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario1.setNome("Vinicius Vicente");
        usuario1.setCpf("123456788");
        usuario1.setLogin("vini");
        usuario1.setSenha("1234567");

        usuario2.setNome("Lúcia Daniela");
        usuario2.setCpf("231564532");
        usuario2.setLogin("lucia");
        usuario2.setSenha("32341433");

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // convertendo a lista de usuários em uma string JSON
        String jsonUser = gson.toJson(usuarios);
        System.out.println(jsonUser);

        FileWriter fileWriter = new FileWriter("/Users/valeskamarques/IdeaProjects/project1/src/coursejava/arquivoTexto/filejson.json");
        fileWriter.write(jsonUser);
        fileWriter.flush();
        fileWriter.close();
    }
}

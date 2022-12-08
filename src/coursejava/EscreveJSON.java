package coursejava;

import com.google.gson.*;
import coursejava.arquivoTexto.Usuario;

import java.io.FileReader;
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


        System.out.println("\n--------Lendo arquivo JSON--------\n");

        FileReader fileReader = new FileReader("/Users/valeskamarques/IdeaProjects/project1/src/coursejava/arquivoTexto/filejson.json");
        JsonArray jsonArray = (JsonArray)  JsonParser.parseReader(fileReader);

        List<Usuario> liUsuarios = new ArrayList<Usuario>();

        // convertendo o jsonElement em um objeto Usuario e adicionando-o à lista
        for (JsonElement jsonElement : jsonArray) {

            Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
            liUsuarios.add(usuario);
        }
        System.out.println(liUsuarios);
    }
}

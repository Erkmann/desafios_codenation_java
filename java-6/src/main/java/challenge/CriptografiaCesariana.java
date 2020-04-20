package challenge;

import java.util.ArrayList;
import java.util.List;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        if(!texto.isEmpty()) {
            List<Character> alfabeto = alfabeto();
            char[] charsTexto = texto.toLowerCase().toCharArray();
            int index, indexCriptografado;
            StringBuilder textoCriptografado = new StringBuilder();

            for (char letra : charsTexto) {
                index = alfabeto.indexOf(letra);
                if (index != -1) {
                    if (index + 3 > alfabeto.size() - 1) {
                        indexCriptografado = (index + 3) - (alfabeto.size() - 1);
                    } else indexCriptografado = index + 3;

                    textoCriptografado.append(alfabeto.get(indexCriptografado));
                } else textoCriptografado.append(letra);
            }

            return textoCriptografado.toString();
        }
        else throw new IllegalArgumentException("Cannot be null!");
    }

    @Override
    public String descriptografar(String texto) {
        if(!texto.isEmpty()) {
            List<Character> alfabeto = alfabeto();
            char[] charsTexto = texto.toLowerCase().toCharArray();
            int index, indexDescriptografado;
            StringBuilder textoDescriptografado = new StringBuilder();

            for (char letra : charsTexto) {
                index = alfabeto.indexOf(letra);
                if (index != -1) {
                    if (index - 3 < 0) {
                        indexDescriptografado = (index - 3) + (alfabeto.size() - 1);
                    } else indexDescriptografado = index - 3;

                    textoDescriptografado.append(alfabeto.get(indexDescriptografado));
                } else textoDescriptografado.append(letra);
            }

            return textoDescriptografado.toString();
        }
        else throw new IllegalArgumentException("Cannot be null!");
    }

    private List<Character> alfabeto(){
        List<Character> alfabeto = new ArrayList<>();

        // Gera o alfabeto pela tabela ASCII
        for(char ch = 'a'; ch <= 'z'; ch++){
            alfabeto.add(Character.valueOf(ch));
        }

        return alfabeto;
    }

}

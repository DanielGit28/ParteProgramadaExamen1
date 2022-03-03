package Encripta;

public class EncriptadoCesar implements ENCRIPTA{
    @Override
    public String encripta(String texto) {
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String textoCodificado = "";

        texto = texto.toUpperCase();

        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            int pos = letras.indexOf(caracter);

            if(pos == -1){
                textoCodificado += caracter;
            }else{
                textoCodificado += letras.charAt( (pos + 3) % letras.length() );
            }

        }

        return textoCodificado;
    }

    @Override
    public String desencripta(String texto) {
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String textoDescodificado = "";

        texto = texto.toUpperCase();

        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            int pos = letras.indexOf(caracter);

            if(pos == -1){
                textoDescodificado += caracter;
            }else{
                if(pos - 3 < 0){
                    textoDescodificado += letras.charAt( letras.length() + (pos - 3) );
                }else{
                    textoDescodificado += letras.charAt( (pos - 3) % letras.length() );
                }
            }

        }

        return textoDescodificado;
    }
}

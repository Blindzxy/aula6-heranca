package br.com.digitalhouse;

public class Cachorro extends Animal{
    private String nome
    public Cachorro(String novoNome, String novoTamanho, String novaRaça){
        super(novoTamanho, novaRaça);
        nome = novoNome;
    }

    @Override
    public boolean ehMamifero(){
        return true;
    }
}

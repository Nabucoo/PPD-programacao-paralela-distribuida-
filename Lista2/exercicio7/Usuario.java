package Lista2.exercicio7;

public class Usuario implements Autenticavel{
    String nome;
    String senha;


    Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        if (senha == this.senha) {
            return true;
        } else {
            return false;
        }
    }
}

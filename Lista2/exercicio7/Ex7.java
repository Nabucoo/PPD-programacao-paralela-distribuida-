package Lista2.exercicio7;

public class Ex7 {
    public static void main(String[] args){
        Usuario u1 = new Usuario("Ranny Fabela", "13082006");

        Autenticavel.validarTamanhoSenha(u1.senha);

        if (u1.autenticar("13082006")) {
            u1.exibirBoasVindas();
        } else {
            System.out.println("Senha incorreta!");
        }
        
    }
}

package Lista2.exercicio7;

interface Autenticavel {
    abstract boolean autenticar(String senha); 

    default void exibirBoasVindas() {
        System.out.println("Ben-vindo ao sistema seguro!");
    }

    static boolean validarTamanhoSenha(String senha) {
        if (senha.length() >= 8) {
            return true;
        } else {
            return false;
        }
    };
}

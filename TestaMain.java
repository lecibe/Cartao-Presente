public class TestaMain {

    public static void main(String[] args) {


        CartaoNamorados mensagem = new CartaoNamorados("João", "Maria");
        escreverCartao(mensagem);

        CartaoNatal mensagem2 = new CartaoNatal("Cibele", "Mateus");
        escreverCartao(mensagem2);

        CartaoFelizAniversario mensagem3 = new CartaoFelizAniversario("Pedro", "Rita");
        escreverCartao(mensagem3);
    }
    public static void escreverCartao (CartaoPresente cartaoPresente){
        System.out.println(cartaoPresente.mensagemGenerica());

    }
}

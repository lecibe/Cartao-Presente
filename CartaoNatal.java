public class CartaoNatal extends CartaoPresente {

    CartaoNatal(String remetente, String destinatario){
        super(remetente, destinatario);
    }

    @Override
    public String mensagemGenerica(){
       return  " Feliz Natal e Próspero Ano Novo!!!";

    }

}

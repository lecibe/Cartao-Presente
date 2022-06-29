public class CartaoFelizAniversario extends CartaoPresente {

    CartaoFelizAniversario (String remetente, String destinatario){
        super (remetente, destinatario);
    }

    @Override
    public String mensagemGenerica() {
        return " Feliz Aniversário! Aproveite seu dia!";
    }
}

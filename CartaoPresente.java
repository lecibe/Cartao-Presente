public abstract class CartaoPresente {

    private final String remetente;
    private final String destinatario;

    public CartaoPresente(String remetente, String destinatario){
        System.out.println("De: " + remetente + " Para: " + destinatario);
        this.destinatario = destinatario;
        this.remetente = remetente;
    }
    public abstract String mensagemGenerica();

}

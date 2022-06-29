public class CartaoNamorados extends CartaoPresente {

    CartaoNamorados(String remetente, String destinatario) {
        super(remetente, destinatario);
    }
    @Override
    public String mensagemGenerica(){
     return    " Feliz dia dos Namorados! Te amo.";
    }


}



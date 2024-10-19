public class Email{
    //Definição do atributo privado
    private String mensagem;

    //definição do construtor público
    public Email(String mensagem){
        this.mensagem=mensagem;
    }

    //getters e setters de mensagem
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    

    //Método que retorna o corpo da mensagem
    public String enviarEmail(){
        return getMensagem();
    }
}
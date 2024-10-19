public class Pessoa extends Email {
    //definição dos atributos privados
    private String nome;
    private String funcao;

    //definição da construtores públicos
    
    public Pessoa(String mensagem, String nome, String funcao){
        super(mensagem);
        this.nome=nome;
        this.funcao=funcao;
    }

    //getters e setters dos atributos privados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    //método que retorna o corpo da mensagem junto com as saudações
    @Override
    public String enviarEmail(){
        return "======EMAIL======\nOlá " +getFuncao()+" "+ getNome() +"\n"+ getMensagem();
    }
    
}

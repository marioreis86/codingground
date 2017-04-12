public class Usuario 
{
    private String nome, username, cpf;
    public Usuario(String nome, String username, String cpf)
    {
        setNome(nome);
        setUsername(username);
        setCpf(cpf);
    }
    
    public String getNome() {return nome;}
    public String getUsername() {return username;}
    public String getCpf() {return cpf;}
    
    public void setNome(String nome) {this.nome = nome;}
    public void setUsername(String username) {this.username = username;}
    public void setCpf(String cpf) {this.cpf = cpf;}
}

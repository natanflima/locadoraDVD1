import src.Pessoa;

public class Amigo extends Pessoa{
    private long numTelefone;
    private String email;
    private String endereço;

    public Amigo(long numTelefone, String email, String endereço, String nome) {
        super(nome);
        this.numTelefone = numTelefone;
        this.email = email;
        this.endereço = endereço;
    }

    public long getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(long numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }



    
}

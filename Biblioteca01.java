import java.util.ArrayList;

public class Biblioteca01 {
    private String nome;
    private String endereco;
    private String nomeFuci;
    private ArrayList<String> livros;
    
    
    public void adicionarLivro(String livro) {
        livros.add(livro);
        System.out.println("Livro adicionado à biblioteca: " );
    }

  
    public void removerLivro(String livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro removido da biblioteca: ");
        } else {
            System.out.println("O livro não está na biblioteca.");
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeFuci() {
        return nomeFuci;
    }

    public void setNomeFuci(String nomeFuci) {
        this.nomeFuci = nomeFuci;
    }
    
    
    public Biblioteca01(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new ArrayList<>();
    }
    
    public Biblioteca01(){
        
    }
   
}


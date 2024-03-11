public class Professor extends Biblioteca01 {
    private String nomeProfessor;
    private int idadeProfessor;
    private String departamento;

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public int getIdade() {
        return idadeProfessor;
    }

    public void setIdade(int idade) {
        this.idadeProfessor = idade;
    }


    public String getDepartamento() {
        return departamento;
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

       public Professor(String nome, int idade, String departamento, String nomeBiblioteca, String enderecoBiblioteca) {
        super(nomeBiblioteca, enderecoBiblioteca);
        this.nomeProfessor = nome;
        this.idadeProfessor = idade;
        this.departamento = departamento;
    }
}

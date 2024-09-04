class AlunoTads implements Aluno{

    private String nome;
    private int matricula;

    public AlunoTads(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getMatricula() {
        return this.matricula;
    }

    @Override
    public String toString() {
        return "{nome: "+ this.nome + " matricula = " + this.matricula + " }";
    }
}
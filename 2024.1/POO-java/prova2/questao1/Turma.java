import java.util.ArrayList;

public class Turma {
    static ArrayList<Aluno> Alunos = new ArrayList<>();

    public static void adicionarAluno(Aluno aluno){
        Alunos.add(aluno);
    }
    
    public static String buscarAlunoPorNome(String nome){
        for (Aluno aluno : Alunos) {
            if(nome == aluno.getNome()){
                return aluno.toString();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Aluno jovi = new AlunoTads("Gevirone", 28912);
        Aluno luca = new AlunoTads("Lucas", 292910);

        adicionarAluno(jovi);
        adicionarAluno(luca);

        System.out.println(buscarAlunoPorNome("Lucas"));
        System.out.println(buscarAlunoPorNome("Ygor"));
    }
}

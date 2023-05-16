package POOHeranca;

public class Alunos extends Pessoas{
    //atribustos específicos
    private int matricula;
    private double mediaSemestre;
    private String curso;
    private String turma;

    // métodos
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getMediaSemestre() {
        return mediaSemestre;
    }
    public void setMediaSemestre(double mediaSemestre) {
        this.mediaSemestre = mediaSemestre;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    
}

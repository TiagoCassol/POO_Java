
package escola;

public class Escola {
    public static void main(String[] args) {
        Professor prof1 = new Professor(12, "(51)9494-9595", "Adalto",40,"123.456.789-99");
        System.out.println("Professor: "+ prof1.nome);
        System.out.println("Telefone: "+ prof1.getFone());
        System.out.println("CPF: " + prof1.getCpf());
        System.out.println("-------------------------------------");
        Aluno aluno1 = new Aluno(99877,"ads","manhã","juquinha", 19,"111.222.333-99");
        aluno1.dadosAluno();
    }
}

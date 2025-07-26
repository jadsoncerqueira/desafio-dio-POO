import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Aprenda os conceitos básicos de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Aprenda os conceitos básicos de JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Desenvolvimento de Software"); 
        mentoria.setDescricao("Sessão de mentoria sobre desenvolvimento de software");
        mentoria.setData(java.time.LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de Desenvolvimento Java");
        bootcamp.setDescricao("Aprenda Java do básico ao avançado com este bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Alice");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos concluídos " + dev1.getConteudosConcluidos());

        Dev dev2 = new Dev();
        dev2.setNome("Bob");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos concluídos " + dev2.getConteudosConcluidos());
        System.out.println("XP de Alice: " + dev1.calcularTotalXp());
        System.out.println("XP de Bob: " + dev2.calcularTotalXp());
    }
}

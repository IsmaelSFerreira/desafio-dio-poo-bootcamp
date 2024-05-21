import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {

    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso js");
        curso1.setDescricao("Descrição curso js");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        
        System.out.println("-----------");
        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos dev1"+ dev1.getConteudosInscritos());
        System.out.println("Quantidade de inscrições do dev1: " + dev1.quantidadeInscricoes());
        dev1.progredir();
        System.out.println("------------------------------------");
        System.out.println("Conteúdos Concluídos Dev1:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-----------");
        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos dev2"+ dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Quantidade de inscrições do dev2: " + dev2.quantidadeInscricoes());
        dev2.progredir();
        dev2.progredir();
        System.out.println("------------------------------------");
        System.out.println("Conteúdos Concluídos Dev2:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

        System.out.println("\nConteudo disponível:");
        dev1.conteudosDisponiveis(bootcamp.getConteudos());
        




    }
    
}

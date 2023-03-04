import dio.desafio.dominio.Bootcamp;
import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Dev;
import dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descricao Curso C#");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developers Banco Pan");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developers Banco Pan");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Thailan Ramos");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Thailan: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos Inscritos Thailan: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Thailan: " + dev1.getConteudosConcluidos());
        System.out.println("Total de XP Thailan:" + dev1.calcularTotalXp());

        System.out.println("----------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Thiago");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Thiago: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos Inscritos Thiago: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Thiago: " + dev2.getConteudosConcluidos());
        System.out.println("Total de XP Thiago:" + dev2.calcularTotalXp());
    }
}
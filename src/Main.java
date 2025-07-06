import br.com.dio.desafio.dominio.*;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Projeto projeto = new Projeto();
        projeto.setTitulo("Projeto API Java DIO");
        projeto.setDescricao("Construir uma API REST");
        projeto.setDificuldade(4);
        projeto.setPrazoEntrega(LocalDate.now().plusDays(10));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(projeto);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        mostrarMensagem("Conteúdos Inscritos Camila:\n" + formatarConteudos(devCamila.getConteudosInscritos()));
        devCamila.progredir();
        devCamila.progredir();
        mostrarMensagem("Após progresso Camila:\n" +
                "Conteúdos Inscritos:\n" + formatarConteudos(devCamila.getConteudosInscritos()) +
                "\nConteúdos Concluídos:\n" + formatarConteudos(devCamila.getConteudosConcluidos()) +
                "\nXP: " + devCamila.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        mostrarMensagem("Conteúdos Inscritos João:\n" + formatarConteudos(devJoao.getConteudosInscritos()));
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        mostrarMensagem("Após progresso João:\n" +
                "Conteúdos Inscritos:\n" + formatarConteudos(devJoao.getConteudosInscritos()) +
                "\nConteúdos Concluídos:\n" + formatarConteudos(devJoao.getConteudosConcluidos()) +
                "\nXP: " + devJoao.calcularTotalXp());
    }

    private static void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    private static String formatarConteudos(java.util.Set<Conteudo> conteudos) {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (Conteudo c : conteudos) {
            double xp = c.calcularXp();

            if (c instanceof Projeto projeto) {
                sb.append("- Projeto: ")
                        .append(projeto.getTitulo())
                        .append(" | Dificuldade: ").append(projeto.getDificuldade())
                        .append(" | Prazo: ").append(projeto.getPrazoEntrega().format(formatter))
                        .append(" | XP: ").append(xp)
                        .append("\n");

            } else if (c instanceof Curso curso) {
                sb.append("- Curso: ")
                        .append(curso.getTitulo())
                        .append(" | Carga Horária: ").append(curso.getCargaHoraria())
                        .append(" | XP: ").append(xp)
                        .append("\n");

            } else if (c instanceof Mentoria mentoria) {
                sb.append("- Mentoria: ")
                        .append(mentoria.getTitulo())
                        .append(" | XP: ").append(xp)
                        .append("\n");

            } else {
                sb.append("- Conteúdo: ")
                        .append(c.getTitulo())
                        .append(" | XP: ").append(xp)
                        .append("\n");
            }
        }
        return sb.toString();
    }

    /*
    import br.com.dio.desafio.dominio.*;

    import java.time.LocalDate;

    public class Main {
        public static void main(String[] args) {
            Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Descrição curso Java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("Curso JavaScript");
            curso2.setDescricao("Descrição curso JavaScript");
            curso2.setCargaHoraria(4);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria de Java");
            mentoria.setDescricao("Descrição mentoria Java");
            mentoria.setData(LocalDate.now());

            Projeto projeto = new Projeto();
            projeto.setTitulo("Projeto API Java DIO");
            projeto.setDescricao("Construir uma API REST");
            projeto.setDificuldade(4);
            projeto.setPrazoEntrega(LocalDate.now().plusDays(10));

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);
            bootcamp.getConteudos().add(projeto);

            Dev devCamila = new Dev();
            devCamila.setNome("Camila");
            devCamila.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
            devCamila.progredir();
            devCamila.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
            System.out.println("XP: " + devCamila.calcularTotalXp());

            System.out.println("-------");

            Dev devJoao = new Dev();
            devJoao.setNome("João");
            devJoao.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
            devJoao.progredir();
            devJoao.progredir();
            devJoao.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
            System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}


     */
}

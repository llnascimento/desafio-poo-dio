🛠️ Melhorias e Evoluções&#x20;

Com base na proposta original do projeto, foram implementadas as seguintes melhorias para aprofundar o uso da Programação Orientada a Objetos:



✅ Novas Funcionalidades



📌 Classe Projeto Nova classe criada para representar projetos práticos no bootcamp. Inclui os atributos:

- dificuldade (nível de 1 a 5)
- prazoEntrega (tipo LocalDate, formatado em dd/MM/yyyy)



📚 Integração da classe Projeto ao sistema

- Projeto implementa a interface Conteudo, assim como Curso e Mentoria.
- Incluído no método calcularXp(), utilizando um multiplicador baseado na dificuldade.



🧠 Exibição das informações com JOptionPane Todas as saídas do console foram substituídas por janelas gráficas interativas (JOptionPane), tornando a experiência mais amigável para o usuário.



📅 Formatação de datas no padrão brasileiro (dd/MM/yyyy) Melhor legibilidade das datas de entrega das mentorias e projetos.



🔄 Simulação de progresso do Dev O sistema simula a inscrição dos Devs no Bootcamp, o progresso com progredir() e a exibição dos conteúdos inscritos, concluídos e a XP final.



🧪 Exemplo de Execução:

```
Conteúdos Inscritos: [Mentoria, Projeto]
Conteúdos Concluídos: [Curso Java, Curso JavaScript]
XP Total: 120.0
```

💻 Tecnologias Utilizadas

- Java 11
- IDE IntelliJ
- Git e GitHub
- Bibliotecas padrão (java.time, javax.swing.JOptionPane)

---

Disponibilizado por Lucas Nascimento.


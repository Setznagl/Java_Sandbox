# Bootcamp Orientado a Objetos

Este repositório contém um projeto de estudo que simula um bootcamp utilizando conceitos de orientação a objetos em Java. O objetivo é fornecer uma base prática para entender e aplicar esses conceitos em um contexto de desenvolvimento de software.

## Estrutura do Projeto

O projeto está organizado em pacotes e classes que representam os principais componentes de um bootcamp:

### Pacote `com.personal.setznagl.Models`

- **Dev**: Representa um desenvolvedor inscrito no bootcamp.
    - Atributos: `nome`, `conteudosInscritos`, `conteudosConcluidos`
    - Métodos: `inscreverBootcamp(Bootcamp bootcampParametro)`, `progredir()`, `calcularXp()`

- **Bootcamp**: Representa um bootcamp com uma lista de conteúdos e desenvolvedores inscritos.
    - Atributos: `nome`, `descricao`, `dataInicial`, `dataFinal`, `inscritos`, `conteudos`
    - Construtor: `Bootcamp(String nome, String descricao)`

- **Curso**: Representa um curso dentro do bootcamp.
    - Atributos: `titulo`, `descricao`, `cargaHoraria`
    - Métodos: `calcularXP()`, `toString()`

- **Mentoria**: Representa uma mentoria dentro do bootcamp.
    - Atributos: `titulo`, `descricao`, `data`
    - Métodos: `calcularXP()`, `toString()`

- **Conteudo**: Classe abstrata que serve como base para `Curso` e `Mentoria`.
    - Atributos: `titulo`, `descricao`, `XP_Padrao`
    - Métodos abstratos: `calcularXP()`

## Como Utilizar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/bootcamp-orientado-a-objetos.git

# Simulação de Funcionalidades do iPhone

Este projeto Java simula as funcionalidades básicas de um iPhone, incluindo um reprodutor musical, um aparelho telefônico e um navegador de internet. Ele utiliza interfaces para definir essas funcionalidades e uma classe concreta (`Iphone`) que as implementa. O programa principal (`App`) permite ao usuário interagir com essas funcionalidades através de um menu no console.

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- **Reprodutor.java**: Interface que define métodos para um reprodutor musical.
- **Phone.java**: Interface que define métodos para um aparelho telefônico.
- **Navegador.java**: Interface que define métodos para um navegador de internet.
- **Iphone.java**: Classe que implementa todas as três interfaces acima.
- **App.java**: Classe principal que usa `Scanner` para interagir com o usuário e permitir a seleção das funcionalidades do `Iphone`.

## Classes
- **Reprodutor**: Define três métodos para o reprodutor musical: `play`, `pause` e `selecionarMusica`.
- **Navegador**: Define três métodos para o navegador de internet: `exibirPagina`, `adicionarNovaAba` e `atualizarPagina`.
- **Phone**: Define três métodos para o aparelho telefônico: `ligar`, `atender` e `correioVoz`.
- **iPhone**: A classe Iphone implementa `todas` as interfaces (Reprodutor, Phone, Navegador). Cada método exibe uma mensagem simples no console para simular a ação correspondente.
- **App**: A classe App é o `ponto de entrada` do programa. Ele fornece um menu interativo para o usuário escolher qual funcionalidade do Iphone deseja testar. Com base na escolha do usuário, o programa chama os métodos correspondentes e exibe mensagens no console.

## Funcionalidades
### Reprodutor Musical:
- `play():` Exibe "Reproduzindo música..."
- `pause():` Exibe "Pausando música..."
- `selecionarMusica():` Exibe "Selecionando uma música..."

### Aparelho Telefônico:
- `ligar():` Exibe "Ligando..."
- `atender():` Exibe "Atendendo chamada..."
- `correioVoz():` Exibe "Iniciando correio de voz..."

### Navegador de Internet:
- `exibirPagina():` Exibe "Exibindo página..."
- `adicionarNovaAba():` Exibe "Abrindo nova aba..."
- `atualizarPagina():` Exibe "Atualizando página..."

## Como executar

Para executar a aplicação, siga estas etapas:

1. Clone o repositório para sua máquina local.
2. Certifique-se de ter o Java Development Kit (JDK) 8 ou superior instalado em seu sistema.
3. Navegue até o diretório raiz do projeto no terminal.
4. Compile os arquivos Java executando o comando `javac application/*.java entities/*.java`.
5. Execute a aplicação com o comando `java application.Program`.

## Autor
Guustavoghp
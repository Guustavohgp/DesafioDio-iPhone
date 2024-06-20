package entities;

public class Iphone implements Reprodutor, Phone, Navegador {

        // Metodos do Reprodutor
        @Override
        public void play() {
            System.out.println("Reproduzindo música...");
        }
    
        @Override
        public void pause() {
            System.out.println("Pausando música...");
        }
    
        @Override
        public void selecionarMusica() {
            System.out.println("Selecionando uma música...");
        }
    
        // Metodos do celular (Phone)
        @Override
        public void ligar() {
            System.out.println("Ligando...");
        }
    
        @Override
        public void atender() {
            System.out.println("Atendendo chamada...");
        }
    
        @Override
        public void correioVoz() {
            System.out.println("Iniciando correio de voz...");
        }
    
        // Metodos do Navegador

        @Override
        public void exibirPagina () {
            System.out.println("Exibindo página...");
        }
        @Override
        public void adicionarNovaAba () {
            System.out.println("Abrindo nova aba...");
        }
    
        @Override
        public void atualizarPagina () {
            System.out.println("Atualizando página...");
        }
    }

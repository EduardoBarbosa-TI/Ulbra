package atividade02;

import java.util.Scanner;

public class GerenciadorMusicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();

        while (true) {
            System.out.println("\n=== GERENCIADOR DE MÚSICAS ===");
            System.out.println("1. Próxima música");
            System.out.println("2. Música anterior");
            System.out.println("3. Tocar música atual");
            System.out.println("4. Adicionar música");
            System.out.println("5. Listar músicas");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> playlist.proxima();
                case 2 -> playlist.anterior();
                case 3 -> playlist.tocarMusicaAtual();
                case 4 -> {
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Álbum: ");
                    String album = sc.nextLine();
                    System.out.print("Duração (s): ");
                    int duracao = sc.nextInt();
                    sc.nextLine();
                    playlist.adicionarNoFim(new Musica(titulo, artista, album, duracao));
                    System.out.println("Música adicionada!");
                }
                case 5 -> playlist.listarMusicas();
                case 6 -> {
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}


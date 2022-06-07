/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzaria.util;

import br.com.pizzaria.entidade.Endereco;

/**
 *
 * @author silvio.junior
 */
public class GeradorUtil {
    
    public  static  Endereco gerarEndereco(){
        Endereco endereco = new Endereco(gerarLogradouro() + gerarSobrenome(), gerarBairro(), gerarNumero(3), gerarCidade(), gerarEstado(), "Casa 1", gerarCep(), gerarObservacao());
        return endereco;
    }

    public static String gerarNumero(int qtde) {
        String numeroGerado = "";
        int indice;
        for (int i = 0; i < qtde; i++) {
            indice = (int) (Math.random() * 10);
            numeroGerado += indice;
            //numeroGerado = numeroGerado + indice;
        }
        return numeroGerado;
    }

    public static String gerarCpf() {
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "-" + gerarNumero(2);
    }

    public static String gerarCnpj() {
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3) + "/" + gerarNumero(4)
                + "-" + gerarNumero(2);
    }

    public static String gerarTelefoneFixo() {
        return "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);
    }

    public static String gerarCelular() {
        return "(48)9" + gerarNumero(4) + "-" + gerarNumero(4);
    }

    public static String gerarCep() {
        return gerarNumero(5) + "-" + gerarNumero(3);
    }
    public static String gerarValidadeAno() {
        return gerarNumero(2) + "/" + gerarNumero(2);
    }
    public static String gerarEmail() {
        String[] emails = {"sonhinha@gmail.com", "filo@hotmail", "farinha@gmail", "fejao@gmails", "rocinha@gmail", "minha@gmail", "curio@gmail", "papagaio@gamil",
                          "sonhador@gmail", "pinha@gmail", "pescador@gmail", "sonhodeval@gmail"};
        int indice = (int) (Math.random() * emails.length);
        return emails[indice];
    }   
    public static String gerarProfissao() {
        String[] profissoes = {"Administrador", "Programador", "Costureira", "Analista de Sistemas", "Pedreiro", "Vendedor", "Professor", "Pintador",
                          "Eletricista", "Testador", "Pescador", "Consultor"};
        int indice = (int) (Math.random() * profissoes.length);
        return profissoes[indice];
    }   
        public static String gerarBandeira() {
        String[] bandeiras = {"Visa", "Mastercard", "ELO", "", "American Express", "Hipercard", "Carcard", "Unixcard",
                          "Vuoncard", "Compcard", "Maestro", "Redeshop"};
        int indice = (int) (Math.random() * bandeiras.length);
        return bandeiras[indice];
    }   
    public static String gerarNome() {
        String[] nomes = {"Junior", "Marcos", "Ana", "Maria", "Silvio", "Suelen", "Joana", "Mateus",
                          "Lúcio", "João", "Leandro", "Soeli"};
        int indice = (int) (Math.random() * nomes.length);
        return nomes[indice] + " " + gerarSobrenome();
    }
    
    private static String gerarSobrenome() {
        String[] sobrenomes = {"Pereira", "Oliveira", "Antunes", "da Silva", "Santos", "Rocha", "Moura", 
            "Dias", "Mendes", "Albino", "Dutra", "Mendonça"};
        int indice = (int) (Math.random() * sobrenomes.length);
        return sobrenomes[indice];
    }
    private static String gerarObservacao() {
        String[] sobrenomes = {"Prox. Posto de Saúde", "Prox. Mercado Stefany", "Prox. Lanchenete Souza", "Prox Mercado Estrela Azul", "Prox.marmita Nona", "Prox. Escola Antonieta", "Rua Fábio Moura", 
            "prox. Ricardo Peças", "Prox. Rua Feijão com Leite ", "Prox. Suiane Batista Modas", "Prox. Loja Multicoisas", "prox. Bananas com Café"};
        int indice = (int) (Math.random() * sobrenomes.length);
        return sobrenomes[indice];
    }
    
    private static String gerarLogradouro() {
        String[] sobrenomes = {"Rua Olívia Pereira", "Rua Faniana Oliveira", "Rua Cristina Antunes", "Rua Felisbina da Silva", "SRua Santiago dos Santos", "Rua Rira da Rocha", "Rua Fábio Moura", 
            "Rua Fátima Dias", "Rua Fafá Mendes", "Rua Sonha Albino", "Rua Alice Dutra", "Rua larissa Mendonça"};
        int indice = (int) (Math.random() * sobrenomes.length);
        return sobrenomes[indice];
    }
    private static String gerarComplemento() {
        String[] sobrenomes = {"Casa 1", "Casa 2", "Bloco A, Apto 201", "Bloco B, Apto 202", "Apto 203", "Apto 204", "Apto 205", 
            "Rua Fátima Dias", "Rua Fafá Mendes", "Rua Sonha Albino", "Rua Alice Dutra", "Rua larissa Mendonça"};
        int indice = (int) (Math.random() * sobrenomes.length);
        return sobrenomes[indice];
    }
    
    public static String gerarCidade() {
        String[] cidades = {"São José", "Palhoça", "Florianópolis", "Criciuma", "Chapecó", "Curitiba",
            "Porto Alegre", "São Paulo", "Maceió", "Biguaçú", "Belo Horizonte", "Pinhais"};
        int indice = (int) (Math.random() * cidades.length);
        return cidades[indice];
    }   
    public static String gerarBairro() {
        String[] cidades = {"Centro", "Bela Vista", "Guarda do Cubatão", "Pacheco", "Barra do Aririú", "Aririú",
            "Jardim Eldourado", "São Mateus", "São José", "Aririú da Formiga", "Nova Palhoça", "Brejarú"};
        int indice = (int) (Math.random() * cidades.length);
        return cidades[indice];
    }
        public static String gerarEstado() {
        String[] cidades = {"Amazonas", "Pará", "Amapá", "Ceará", "Pernambuco", "Alagoas",
            "Bahia", "Espírito Santo", "Maceó", "Sergipe", "Maranhão", "Mato Grosso", "Piauí","Mato Grosso do Sul", "Paraná","Santa Catarina","Rio Grande do Sul"};
        int indice = (int) (Math.random() * cidades.length);
        return cidades[indice];
    }
    
    public static String gerarLogin(){
        String nome = gerarNome();        
        return nome.toLowerCase() + "@";
    }

    public static String gerarSenha(int qtde) {
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E",
            "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0",
            "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int indice;
        String senha = "";
        for (int i = 0; i < qtde; i++) {
            indice = (int) (Math.random() * letras.length);
            senha += letras[indice];
        }
        return senha;
    }

    public static void main(String[] args) {
        System.out.println("Cidade: " + gerarCidade());
    }
}

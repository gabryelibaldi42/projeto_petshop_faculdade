public class Main {
    public static void main(String[] args) {
        // criar instâncias de produtos
        Produto prod1 = new Produto("Ração", 50.0, "Ração Seca Nutrilus Pro+ Frango & Carne");
        Produto prod2 = new Produto("Brinquedo", 70.0, "Brinquedo Arranhador Furacão");
        Produto prod3 = new Produto("Caixa de Transporte", 90.0, "Caixa de Transporte Furacão Pet Luxo - Preto com Rosa");

        // criar instâncias de clientes
        Cliente cliente1 = new Cliente("José", "Av. Dr. Nilo Peçanha, 1600 - Boa Vista, Porto Alegre - RS, 91330-002");
        cliente1.adicionarPet(new Mamifero("Bulldog", "Zeus", 2));

        Cliente cliente2 = new Cliente("Pedro", "Av. Dr. Nilo Peçanha, 1600 - Boa Vista, Porto Alegre - RS, 91330-002");
        cliente2.adicionarPet(new Peixe("Peixe-palhaço", "Nemo", 1));

        Cliente cliente3 = new Cliente("Gabriel", "Av. Dr. Nilo Peçanha, 1600 - Boa Vista, Porto Alegre - RS, 91330-002");
        cliente3.adicionarPet(new Ave("Periquito-australiano", "Pipilo", 3));

        // adicionar pets aos clientes
        cliente1.adicionarPet(new Mamifero("Bulldog", "Zeus", 2));
        cliente2.adicionarPet(new Peixe("Peixe-palhaço", "Nemo", 1));
        cliente3.adicionarPet(new Ave("Periquito-australiano", "Pipilo", 3));

        // imprimir preço por produto de cada pet dos clientes
        System.out.println("O cliente " + cliente1.getNome() + " está com o produto " + prod1.getNome() + ", e o preço por este produto é R$" + (prod1.getValor() / prod1.getDescricao().length()));
        System.out.println("O cliente " + cliente2.getNome() + " está com o produto " + prod2.getNome() + ", e o preço por este produto é R$" + (prod2.getValor() / prod2.getDescricao().length()));
        System.out.println("O cliente " + cliente3.getNome() + " está com o produto " + prod3.getNome() + ", e o preço por este produto é R$" + (prod3.getValor() / prod3.getDescricao().length()));

        // imprimir informações de todos os clientes
        cliente1.imprimeInformacoes();
        cliente2.imprimeInformacoes();
        cliente3.imprimeInformacoes();
    }
}
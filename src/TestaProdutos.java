public class TestaProdutos {

    public static void main(String[] args) {

        Produto produtos[] = new Produto[5];
        produtos[0] = new Produto("Lamborghini", 1000000);
        produtos[1] = new Produto("Jipe", 46000);
        produtos[2] = new Produto("Brasília", 16000);
        produtos[3] = new Produto("Smart", 46000);
        produtos[4] = new Produto("Fusca", 17000);

//        Produto[] produtos = {
//                new Produto("Fusca", 13.000), new Produto("Jipe", 45.000),
//                new Produto("Lamborghini", 1000000), new Produto("Brasília", 16000),
//                new Produto("Smart", 46000);
//        };

        int maisBarato = 0;
        for (int atual=0; atual<=4; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }

        System.out.println(maisBarato);
        System.out.println("O carro " + produtos[maisBarato].getNome()
                + " é o mais barato e custa " + produtos[maisBarato].getPreco());
    }
}

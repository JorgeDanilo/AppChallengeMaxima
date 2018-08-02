package jdsistemas.me.maximachallenge.data.mock;

import jdsistemas.me.maximachallenge.model.Product;

/**
 * Created on data 02/08/18.
 */
public class MockDataBase {

    public void populateDataBase() {

        Product product1 = new Product(1l, "Câmera Digital GoPro Hero 5 Black", "https://img.stpu.com.br/?img=https://s3.amazonaws.com/pu-mgr/default/a0R0f00000uDmuQEAS/59fa27aee4b070f33395d7af.jpg&w=620&h=400", "Go Pro");
        Product produtc2 = new Product(2l, "iPhone 6S 64GB Tela 4,7”", "https://img.stpu.com.br/?img=https://s3.amazonaws.com/pu-mgr/default/a0RG000000sLkC7MAK/5aff37f1e4b0ba37a63eb819.jpg&w=620&h=400", "Apple");
        Product produtc3 = new Product(3l, "Google Chromecast 2", "https://img.stpu.com.br/?img=https://s3.amazonaws.com/pu-mgr/default/a0R0f00000uDmuQEAS/59f9e72ae4b070f333299e05.jpg&w=620&h=400", "Google Chrome");
        Product produtc4 = new Product(4l, "Paint Pistola de Pintura com Compressor de Tinta", "https://img.stpu.com.br/?img=https://s3.amazonaws.com/pu-mgr/default/a0RG000000sOxQDMA0/582ee5eae4b036d9a9297817.jpg&w=620&h=400", "Rrister Imports");
        Product produtc5 = new Product(5l, "Mangueira Mágica Expansível Woow", "https://img.stpu.com.br/?img=https://s3.amazonaws.com/pu-mgr/default/a0RG000000sNrF9MAK/59f38de8e4b03042f86d3f20.jpg&w=620&h=400", "D3 Serviços");
        Product produtc6 = new Product(6l, "Panquequeira de Silicone Flippin Fantastic", "https://img.stpu.com.br/?img=https://s3.amazonaws.com/pu-mgr/default/a0RG000000sNrF9MAK/59776129e4b00ce12c245e7b.jpg&w=620&h=400", "D3 Serviços");
        Product produtc7 = new Product(7l, "Tanquinho Suggar Lavamax Eco 10Kg Branco", "https://www.imgeletro.com.br/370x370/produto/683701_5044816_20170103110227.jpg", "D3 Serviços");
        Product produtc8 = new Product(8l, "Cadeira Gamer Giratória Racer Vermelha Rx10 Pro Cdg-01 Trevalla", "https://www.imgeletro.com.br/140x140/produto/marketplace_5a947393530349.31091447.jpg", "Trevalla");
        Product produtc9 = new Product(9l, "Controle Joypad Dual Shock - Sem Fio - Para Playstation 3, Playstation 2 e PC", "https://www.imgeletro.com.br/140x140/produto/440093_2819694_20140411162703.jpg", "Multilaser");
        Product produtc10 = new Product(10l, "Bicicleta Onix Violeta, Aro 26, Quadro Utilitário, Freios V-Brake, Com Cesta e Bagageiro Traseiro", "https://www.imgeletro.com.br/370x370/produto/669913_4879733_20160406134201.jpg", "Houston");

        deleteAll();

        product1.save();
        produtc2.save();
        produtc3.save();
        produtc4.save();
        produtc5.save();
        produtc6.save();
        produtc7.save();
        produtc8.save();
        produtc9.save();
        produtc10.save();

    }

    public void deleteAll() {
        Product.deleteAll(Product.class);
    }

}

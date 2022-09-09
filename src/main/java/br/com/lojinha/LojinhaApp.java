package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {

        Produto meuProduto = new Produto("Nestle", Tamanho.PEQUENO);
        meuProduto.setNome("Play Station 4");

        meuProduto.setValor(30);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItem = new ItemIncluso("Controles", 2);
        itensInclusos.add(primeiroItem);

        ItemIncluso segundoItem = new ItemIncluso("Cabos", 3);
        itensInclusos.add(segundoItem);

        ItemIncluso terceiroItem = new ItemIncluso("Memory card", 1);
        itensInclusos.add(terceiroItem);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());
        System.out.println(itensInclusos.size());

        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());


        System.out.println(" Iniciando o FOR ");

        for(ItemIncluso itemAtual: meuProduto.getItensInclusos()){

            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());

        }

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.PEQUENO);
        meuProdutoNacional.getMarca();
        meuProdutoNacional.setImpostoNacional(0.55);
        System.out.println(meuProdutoNacional.getMarca() + meuProdutoNacional.getImpostoNacional());
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Samsung",Tamanho.PEQUENO);
        meuProdutoInternacional.getMarca();
        meuProdutoInternacional.setTaxaInternacional(0.30);
        System.out.println(meuProdutoInternacional.getMarca());
        System.out.println(meuProdutoInternacional.getTaxaInternacional());



    }
}

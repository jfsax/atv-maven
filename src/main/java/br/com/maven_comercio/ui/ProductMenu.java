package br.com.maven_comercio.ui;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.maven_comercio.model.Product;

public class ProductMenu {
    public static void productMenu() {
        ArrayList<Product> products = new ArrayList<Product>();
        Scanner scan = new Scanner(System.in);
        int productId = 0;
        boolean exit = true;

        do {
            System.out.println("\n|   |----------------------------------------------------|   |");
            System.out.println(
                    "|   | Escolha uma opção para prosseguir:\n| 1 | Cadastrar um novo produto\n| 2 | Listar produtos cadastrados\n| 0 | Sair");
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("|   |----------------------------------------------------|   |");
                    System.out.println("Quantos produtos deseja cadastrar?");
                    int numProducts = Integer.parseInt(scan.nextLine());

                    for (int i = 0; i < numProducts; i++) {
                        productId++;

                        System.out.println("|   |----------------------------------------------------|   |");
                        System.out.println("|   | Digite o nome do produto:");
                        String name = scan.nextLine();

                        System.out.println("|   | Digite o preço do produto:");
                        String price = scan.nextLine();

                        System.out.println("|   | Digite a quantidade do produto:");
                        String quantity = scan.nextLine();

                        Product product = new Product();
                        product.setId(productId);
                        product.setName(name);
                        product.setUnitPrice(Double.parseDouble(price));
                        product.setQuantity(Integer.parseInt(quantity));

                        products.add(product);
                    }

                    break;
                case 2:
                    double total = 0;
                    System.out.println("|   |----------------------------------------------------|   |");
                    String message = "\n|   | Produtos cadastrados\n";

                    for (Product p : products) {
                        total += p.getUnitPrice() * p.getQuantity();

                        message += "|   |\n"
                                + "|   | Código: " + p.getId()
                                + "\n|   | Nome: " + p.getName()
                                + "\n|   | Preço: R$" + String.format("%.2f", p.getUnitPrice())
                                + "\n|   | Quantidade: " + p.getQuantity() + "\n";
                    }

                    System.out.println(message);
                    System.out.println("|   |----------------------------------------------------|   |");
                    System.out.printf("|   | Total: R$" + String.format("%.2f", total));
                    break;
                case 0:
                    break;
            }
        } while (true);
    }
}

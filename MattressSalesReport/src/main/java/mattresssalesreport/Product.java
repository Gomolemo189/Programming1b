/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mattresssalesreport;

/**
 *
 * ST10535061 GOMOLEMO
 */

public class Product implements IProduct {

    private String[] productNames;
    private int[][] productSales;

    // Constructor
    public Product(String[] productNames, int[][] productSales) {
        this.productNames = productNames;
        this.productSales = productSales;
    }

    // Calculate total products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                total += productSales[i][j];
            }
        }

        return total;
    }

    // Calculate average products sold
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();

        int numberOfSales = 0;

        for (int i = 0; i < productSales.length; i++) {
            numberOfSales += productSales[i].length;
        }

        return (double) total / numberOfSales;
    }

    // Find the most popular product
    @Override
    public String GetMostPopularProduct() {

        int highestSales = 0;
        String popularProduct = "";

        for (int i = 0; i < productSales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < productSales[i].length; j++) {
                productTotal += productSales[i][j];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
                popularProduct = productNames[i];
            }
        }

        return popularProduct;
    }
}


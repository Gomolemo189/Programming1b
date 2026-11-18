/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mattresssalesreport;

/**
 *
 * ST10535061 GOMOLEMO
 */

public class PrintProduct {

    // Print total product sales
    public void PrintTotalSales(Product product) {

        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }

    // Print average product sales
    public void PrintAverageSales(Product product) {

        System.out.println("AVERAGE PRODUCT SALES: "
                + product.GetAverageProductSold());
    }

    // Print most popular product
    public void PrintMostPopularProduct(Product product) {

        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }

}


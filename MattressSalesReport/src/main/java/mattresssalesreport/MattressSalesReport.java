/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mattresssalesreport;

/**
 *
 * ST10535061 GOMOLEMO
 */
import java.util.Scanner;

public class MattressSalesReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // One-dimensional array
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Two-dimensional array
        int[][] sales = new int[3][3];

        // Enter monthly sales
        for (int i = 0; i < products.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + products[i]
                        + " mattress: ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Create Product object
        Product product = new Product(products, sales);

        // Create PrintProduct object
        PrintProduct report = new PrintProduct();

        // Display report
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("************************************");

        report.PrintTotalSales(product);

        report.PrintAverageSales(product);

        report.PrintMostPopularProduct(product);

        input.close();
    }
}


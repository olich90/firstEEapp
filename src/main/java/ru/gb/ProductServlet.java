package ru.gb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Product[] products = {
                new Product(1, "Notebook Lenovo", 1000),
                new Product(2, "Notebook Dell", 900),
                new Product(3, "Notebook Acer", 1100),
                new Product(4, "Notebook HP", 800),
                new Product(5, "Notebook Asus", 600),
                new Product(6, "Notebook Xiaomi", 700),
                new Product(7, "Notebook Huawei", 800),
                new Product(8, "Notebook Honor", 650),
                new Product(9, "Notebook Apple", 750),
                new Product(10, "Notebook MSI", 850),
        };

        for (Product product : products) {
            resp.getWriter().println("id = " + product.getId() + ", " +
                    "title = " + product.getTitle() + ", " +
                    "cost = " + product.getCost());
        }
    }
}

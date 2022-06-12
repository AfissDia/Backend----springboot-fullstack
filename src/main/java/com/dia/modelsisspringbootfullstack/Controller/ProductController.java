package com.dia.modelsisspringbootfullstack.Controller;

import com.dia.modelsisspringbootfullstack.model.Product;
import com.dia.modelsisspringbootfullstack.model.TypeProduct;
import com.dia.modelsisspringbootfullstack.service.ProductService;
import com.dia.modelsisspringbootfullstack.service.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired private ProductService productService;
    @Autowired private TypeProductService typeProductService;

    @GetMapping("/products")
    public String getAllProduct(Model model) {
        List<Product> listProduct = productService.getAllProduct();
        model.addAttribute("products", listProduct);

        List<TypeProduct> listTypeProduct = typeProductService.getAllTypeProduct();
        model.addAttribute("typeProducts", listTypeProduct);
        return "product";
    }

    @PostMapping("/products/addNew")
    public String saveProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @RequestMapping("/products/findById")
    @ResponseBody
    public Optional<Product> findById(int id) {
        return productService.findById(id);
    }

    @RequestMapping(value = "/products/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }
    @RequestMapping(value = "products/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}

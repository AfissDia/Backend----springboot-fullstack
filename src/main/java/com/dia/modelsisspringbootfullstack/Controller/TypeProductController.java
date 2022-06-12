package com.dia.modelsisspringbootfullstack.Controller;

import com.dia.modelsisspringbootfullstack.model.TypeProduct;
import com.dia.modelsisspringbootfullstack.service.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class TypeProductController {
    @Autowired private TypeProductService typeProductService;

    @GetMapping("/typeProducts")
    public String getAllTypeProduct(Model model) {
        List<TypeProduct> listTypeProduct = typeProductService.getAllTypeProduct();
        model.addAttribute("typeProducts", listTypeProduct);
        return "typeProduct";
    }

    @PostMapping("/typeProducts/addNew")
    public String saveTypeProduct(TypeProduct typeProduct) {
        typeProductService.save(typeProduct);
        return "redirect:/typeProducts";
    }

    @RequestMapping("typeProducts/findById")
    @ResponseBody
    public Optional<TypeProduct> findById(int id) {
        return typeProductService.findById(id);
    }

    @RequestMapping(value = "typeProducts/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(TypeProduct typeProduct) {
        typeProductService.save(typeProduct);
        return "redirect:/typeProducts";
    }
    @RequestMapping(value = "typeProducts/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        typeProductService.deleteTypeProduct(id);
        return "redirect:/typeProducts";
    }
}

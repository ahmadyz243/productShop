package com.yazdi.products.controller.admin;

import com.yazdi.products.domain.Product;
import com.yazdi.products.exception.ProductNameNotValidException;
import com.yazdi.products.service.ProductService;
import com.yazdi.products.util.FileUploadUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/admin")
@PropertySource("classpath:application.properties")
public class AdminController {

    @Value("${upload.dir}")
    String uploadDir;
    @Autowired
    ApplicationContext context;
    @Autowired
    private ProductService productService;


    @RequestMapping
    public String adminPage(){
        return "admin";
    }

    @GetMapping("/editProductPage")
    public String editProductPage(){
        return "editProduct";
    }

    @PostMapping("/edit-product")
    public String editProduct(HttpServletRequest req, String name, int price, int inventory, int propertiesCount, MultipartFile image){

        String fileName = StringUtils.cleanPath(Objects.requireNonNull(image.getOriginalFilename()));

        Product product = context.getBean(Product.class);
        Map<String, String> productProperties = new HashMap<>();
        product.setName(name);
        product.setPrice(price);
        product.setInventory(inventory);
        product.setImage(fileName);
        for (int i = 1; i <= propertiesCount; i++) {
            productProperties.put(req.getParameter("prop" + i), req.getParameter("val" + i));
        }
        product.setOtherProperties(productProperties);
        productService.SaveEntity(product);

        try{
            FileUploadUtil.saveFile(uploadDir, fileName, image);
        }catch (IOException e){
            e.printStackTrace();
        }

        return "";

    }

}

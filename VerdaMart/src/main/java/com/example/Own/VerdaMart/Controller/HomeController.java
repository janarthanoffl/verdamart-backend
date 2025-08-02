package com.example.Own.VerdaMart.Controller;

//import org.springframework.ui.ModelMap;
import com.example.Own.VerdaMart.Service.ProductService;
import com.example.Own.VerdaMart.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;

    @GetMapping("/home")
    public String homePage(@AuthenticationPrincipal UserDetails userDetails, Model model) {
        List<product> products = productService.availableitems();
        model.addAttribute("products", products);
        model.addAttribute("username", userDetails.getUsername());
        return "home";
    }
}
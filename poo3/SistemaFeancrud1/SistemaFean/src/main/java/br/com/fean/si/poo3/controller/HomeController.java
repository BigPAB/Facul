package br.com.fean.si.poo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by johnatan on 25/10/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView view () {
        ModelAndView view = new ModelAndView("index");
        return view;
    }

}

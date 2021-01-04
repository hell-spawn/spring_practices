package com.spawn.spring.mvc;

import com.spawn.spring.mvc.model.Book;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/bookcatalog")
public class BookController {


    // Clean inputs... delete white spaces.

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping(value = "/showForm")
    public String showForm(Model model){
        System.out.println(">> BoolController.showForm()");
        Book book = new Book();
        model.addAttribute("currentBook", book);
        return "book-catalog";
    }

    @RequestMapping(value = "/processForm")
    public String processFrom(@Valid @ModelAttribute("currentBook") Book book, BindingResult bindingResult){

        //see message errors:

        System.out.println(">> BindingResult: " + bindingResult);

        if(bindingResult.hasErrors()){
            return "book-catalog";
        }
        System.out.println(book.toString());
        return "book-confirmation";
    }

}

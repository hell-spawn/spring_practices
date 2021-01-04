package com.spawn.spring.mvc;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Controller spring and requests
 */
@Controller
public class SubscribeController {


    /**
     *  Get parameter from HttpServeltRequest
     * @param httpServletRequest
     * @param model
     * @return
    @RequestMapping(value = "subscribe" , method = RequestMethod.GET)
    public String actionSubscribe(HttpServletRequest httpServletRequest, Model model){

        String email = (String) httpServletRequest.getParameter("email");
        email = email.split("@")[0];
        model.addAttribute("user", email);

        return "subscribe-resume";
    }*/

    /**
     * Get parameter from annotation spring @RequestParam
     * @param email
     * @param model
     * @return page navigation
     */
    @RequestMapping(value="subscribe")
    public String actionSubscribe(@RequestParam("email") String email, Model model){
        System.out.println(">> Get parameter from annotation spring.");
        String tmpEmail = email.split("@")[0];
        model.addAttribute("user", tmpEmail);
        return "subscribe-resume";
    }

}

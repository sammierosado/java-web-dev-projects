package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String homePage() {

        return "<html>" +
                "<body>  " +
                "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "<h2>" +
                "This is header 2" +
                "</h2>" +
                "<ol>" +
                "<li> Kotlin </li>" +
                "<li> Java </li>" +
                "<li> Javascript </li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String displayForm() {
        return "<html>" +
                "<body>  " +
                "<h1>" +
                "Form Page" +
                "</h1>" +



                "<br/>" +
                "<br/>" +


                "<form action='/form' method='POST'>" +

                "<label>" +
                "Name:" +
                "</label>" +
                "<br/>" +

                "<input name='name' type='text'/>" +
                "<br/>" +
                "<br/>" +

                "<label>" +
                "My first favorite programming language:" +
                "</label>" +
                "<br/>" +

                "<select name='firstFav'>" +
                "<option value='Kotlin'> Kotlin </option>" +
                "<option value='Java'> Java </option>" +
                "<option value='Javascript'> Javascript </option>" +
                "</select>" +
                "<br/>" +
                "<br/>" +

                "<label>" +
                "My second favorite programming language:" +
                "</label>" +
                "<br/>" +

                "<select name='secondFav'>" +
                "<option value='kotlin'> Kotlin </option>" +
                "<option value='java'> Java </option>" +
                "<option value='javascript'> Javascript </option>" +
                "</select>" +
                "<br/>" +
                "<br/>" +

                "<label>" +
                "My third favorite programming language:" +
                "</label>" +
                "<br/>" +

                "<select name='thirdFav'>" +
                "<option value='kotlin'> Kotlin </option>" +
                "<option value='java'> Java </option>" +
                "<option value='javascript'> Javascript </option>" +
                "</select>" +
                "<br/>" +
                "<br/>" +

                "<button type='submit'>" +
                "Submit" +
                "</button>" +

                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    public String formResults(@RequestParam String name,
                              @RequestParam String firstFav,
                              @RequestParam String secondFav,
                              @RequestParam String thirdFav) {
        return "<html>" +
                "<body>  " +
                "<h1>" +
                name +
                "</h1>" +
                "<ol>" +
                "<li>" +
                firstFav +
                "</li>" +
                "<li>" +
                secondFav +
                "</li>" +
                "<li>" +
                thirdFav +
                "</li>" +
                "</ol>" +

                "</body>" +
                "</html>";
    }
}

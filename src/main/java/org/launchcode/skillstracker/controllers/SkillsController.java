package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String listSkills() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='rankings' method='post'>" +
                "<label for='name'>Name:</label><br>" +
                "<input type='text' name='name'><br>" +
                "<label for='first'>My favorite language:</label><br>" +
                "<select name='first' id='first'>" +
                "  <option value='Java'>Java</option>" +
                "  <option value='Javascript'>JavaScript</option>" +
                "  <option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='second'>My second favorite language:</label><br>" +
                "<select name='second' id='second'>" +
                "  <option value='Java'>Java</option>" +
                "  <option value='Javascript'>JavaScript</option>" +
                "  <option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='third'>My third favorite language:</label><br>" +
                "<select name='third' id='third'>" +
                "  <option value='Java'>Java</option>" +
                "  <option value='Javascript'>JavaScript</option>" +
                "  <option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "<html>";
    }

    @PostMapping("/rankings")
    public String listRankedSkills(@RequestParam String name,
                                   @RequestParam String first,
                                   @RequestParam String second,
                                   @RequestParam String third) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr>" +
                "<th>Rank</th>" +
                "<th>Language</th>" +
                "</tr>" +
                "<tr>" +
                "<td>1</td>" +
                "<td>" + first + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>2</td>" +
                "<td>" + second + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>3</td>" +
                "<td>" + third + "</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "<html>";
    }
}

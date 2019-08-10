/**
 * 
 */
package com.sapient.interview.assessment.footballleague.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Hiring
 *
 */
@Controller
public class LeagueListingController {

	@RequestMapping(value="/leaguelisting", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "leaguelisting";
    }

}

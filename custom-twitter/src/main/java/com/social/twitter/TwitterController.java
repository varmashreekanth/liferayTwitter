package com.social.twitter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class TwitterController {
	
	@RenderMapping
	public String showTweets(Model model) {
		//model.addAttribute("releaseInfo", ReleaseInfo.getReleaseInfo());

		return "custom-twitter/view";
	}
}

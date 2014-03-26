package com.bhajansangrah.controllers;

import info.bliki.api.Page;
import info.bliki.api.User;
import info.bliki.wiki.model.WikiModel;

import java.util.List;

import com.bhajansangrah.helpers.BSHelper;
import com.bhajansangrah.helpers.LANGUAGE_TYPE;
import com.bhajansangrah.helpers.SectionHelper;

public class SongController {

	public String fetchSong(LANGUAGE_TYPE langType, int songNumber) {
		User user = new User(BSHelper.user, BSHelper.pass, BSHelper.apiURL);
		user.login();
		
		List<Page> pages = user.queryContent(new String[] {"9"});
		
		String htmlContent = null;
		if ( pages != null && pages.size() > 0 ){
			Page page = pages.get(0);
			htmlContent = WikiModel.toHtml(page.getCurrentContent());
			SectionHelper.getSections(page);
		}
		
		return htmlContent;
	}

}

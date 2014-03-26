package com.bhajansangrah.helpers;

import info.bliki.api.Page;
import info.bliki.wiki.model.WikiModel;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SectionHelper {

	public static List<String> getSections(Page page){
		String content = page.getCurrentContent();
		Document htmlContent = Jsoup.parse(WikiModel.toHtml(content));

		int idxNative = 0, idxPhonetic = -1, idxTranslation = -1;
		Elements h2 = htmlContent.getElementsByTag("h2");

		for (int i = 0; i < h2.size(); i++){
			Element section = h2.get(i);
			if (section.attr("id").equals("Phonetic_English")) {
				idxPhonetic = i;
			} else if (section.attr("id").equals("Translation")){
				idxTranslation = i;
			}
		}
		
		Elements table = htmlContent.getElementsByTag("table");

		// grab native section
		table.get(0);
		
		if (idxPhonetic > 0) {
			table.get(idxPhonetic);
		}
		
		if (idxTranslation > 0) {
			table.get(idxTranslation);
		}
		
		
		return null;
		
	}
	
	public void parseSection(Element table){
		String title = table.getElementsByTag("caption").get(0).text();
		
	}
}

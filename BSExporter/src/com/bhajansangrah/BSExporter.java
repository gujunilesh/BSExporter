package com.bhajansangrah;

import com.bhajansangrah.controllers.SongController;
import com.bhajansangrah.helpers.LANGUAGE_TYPE;

public class BSExporter {

	public static void main(String[] args) {
		// Get song #9
		SongController sc = new SongController();
		sc.fetchSong(LANGUAGE_TYPE.GUJARATI, 9);
		

	}

}

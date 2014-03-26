package com.bhajansangrah.model;

public abstract class Bhajan implements BhajanIfc{

	protected int songNumber;
	protected String language;
	protected LyricsContainer nativeLyrics;
	protected LyricsContainer phoneticLyrics;
	protected LyricsContainer translatedLyrics;
	
}

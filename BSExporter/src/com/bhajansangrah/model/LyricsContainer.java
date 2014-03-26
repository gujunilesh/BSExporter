package com.bhajansangrah.model;

import java.util.LinkedList;
import java.util.Queue;

import com.bhajansangrah.helpers.LINE_TYPE;

public class LyricsContainer {

	private Queue<LINE_TYPE> _order = new LinkedList<LINE_TYPE>();
	private Queue<String> _choruses = new LinkedList<String>();
	private Queue<String> _verses = new LinkedList<String>();
	
	public void addChorus(String chorus){
		_choruses.add(chorus);
	}
	
	public void addVerse(String verse){
		_verses.add(verse);
	}
	
	public void addOrder(LINE_TYPE order){
		_order.add(order);
	}
	
	public Queue<String> getVerses(){
		return _verses;
	}
	
	public Queue<String> getChoruses(){
		return _choruses;
	}
	
	public Queue<LINE_TYPE> getOrder(){
		return _order;
	}
}

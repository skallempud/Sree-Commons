package com.sree.commons.sreecommons;

import java.util.TreeSet;

import com.sree.commons.pojo.HDTV;

public class ComparatorImpl {

	public static void main(String[] args){
		TreeSet<HDTV> hdtvSet = new TreeSet<HDTV>(new HDTVComparator());
		hdtvSet.add(new HDTV("SONY", 50));
		hdtvSet.add(new HDTV("SAMSUNG", 40));
		hdtvSet.add(new HDTV("SHARP", 55));
			
		for(HDTV tv: hdtvSet){
			System.out.println("TV-->" + tv.getProductName() + " size-->" + tv.getTvSizeInInches());
		}
		
	}
}

package com.sree.commons.sreecommons;

import java.util.Comparator;

import com.sree.commons.pojo.HDTV;

public class HDTVComparator implements Comparator<HDTV>{

	public int compare(HDTV tv1, HDTV tv2) {
		return tv1.getTvSizeInInches() - tv2.getTvSizeInInches();
	}

	
}

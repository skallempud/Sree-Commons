/**
 * 
 */
package com.sree.commons.sreecommons;

import java.util.TreeSet;

import com.sree.commons.pojo.HDTVImplComparable;

/**
 * @author skallem
 *
 *Tree set prevails natural order. It is not sorted by default.
 */
public class ComparableImpl {

	public static void main(String[] args){
		TreeSet<HDTVImplComparable> hdtvSet = new TreeSet<HDTVImplComparable>();
		hdtvSet.add(new HDTVImplComparable("SONY", 50));
		hdtvSet.add(new HDTVImplComparable("SAMSUNG", 40));
		hdtvSet.add(new HDTVImplComparable("SHARP", 55));
			
		for(HDTVImplComparable tv: hdtvSet){
			System.out.println("TV-->" + tv.getProductName() + " size-->" + tv.getTvSizeInInches());
		}
	}
}

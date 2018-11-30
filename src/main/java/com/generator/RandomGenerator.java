package com.generator;
import java.util.*;
//Class for normally distributed random variables
public class RandomGenerator {
	public static List<Double> generate(){
		List<Double> rnd = new ArrayList<>();
		Random rand = new Random();
		//Arraylist should hold Integer.MAX_VALUE doubles
		for(int i = 0; i < 100000; i++) {
			rnd.add(rand.nextGaussian());
		}
		return rnd;
	}
}

package com.iu.main.file;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.iu.main.Mytest;

public class FileTest extends Mytest {

	@Test
	public void test() {
		//File 
		File file = new File("C:\\study\\study1.txt");
		
		System.out.println(file.exists());
		
	}

}

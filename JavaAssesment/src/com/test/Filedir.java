package com.test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Filedir {

	public static void main(String[] args) {

		String dirPath = "C:\\Users\\user\\Desktop\\WF";

		File dir = new File(dirPath);

		/*String[] files = dir.list();

		if (files.length == 0) {
			System.out.println("The directory is empty");
		} else {
			for (String aFile : files) {
				System.out.println(aFile);
			}
		}
	}

}*/

 /*File[] files = dir.listFiles(); if (files.length == 0) {
 System.out.println("The directory is empty"); 
 } else { 
 for (File aFile :files) { 
 System.out.println(aFile.getName() + " - " + aFile.length());
  }
   }
    }}
 */


		FileFilter sizeFilter = new FileFilter() {
			public boolean accept(File file) {
				if (file.isFile() && file.length() > 1 * 1024 * 1024) { // filters
																		// files
																		// whosesize
			             													// greater
																		// than
																		// 3MB
					return true;
				} else {
					return false;
				}
			}
		};

		File[] files = dir.listFiles(sizeFilter);
		if (files.length == 0) {
			System.out.println("There is no files bigger than 1MB");
		} else {
			for (File aFile : files) {
				System.out.println(aFile.getName() + " - " + aFile.length());
			}
		}
	}
}

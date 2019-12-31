package com.algorithms.simple;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DirectoryListing {
	private String path;
	private static List<File[]> directory = new ArrayList<>();
	
	public DirectoryListing(String path) {
		this.path = path;
	}

	public static void main(String[] args) {
		DirectoryListing directoryListing = new DirectoryListing(".");
		try {
			directoryListing.getAllFilesFromDirectory(directoryListing.getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=0; i<directory.size(); i++) {
			for(int j=0; j<directory.get(i).length; j++) {
				System.out.println(directory.get(i)[j].getName());
			}
			System.out.println("------------------");
		}
	}
	
	public File[] getAllFilesFromDirectory(String path) throws IOException {
		File directory = new File(path);
		File[] filesInDirectory = directory.listFiles();
		if( filesInDirectory.length == 0 ) {
			return null;
		} else {
			DirectoryListing.directory.add(filesInDirectory);
			for(File file : filesInDirectory) {
				if( file.isDirectory() ) {
					getAllFilesFromDirectory(file.getCanonicalPath());
				}
			}
		}
		return null;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}

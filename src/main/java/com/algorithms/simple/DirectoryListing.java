package com.algorithms.simple;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectoryListing {
	private String path;
	private static Map<String, List<File>> directory = new HashMap<>();
	
	public DirectoryListing(String path) {
		this.path = path;
	}

	public static void main(String[] args) {
		DirectoryListing directoryListing = new DirectoryListing(".");
		try {
			directoryListing.getAllFilesFromDirectory(directoryListing.getPath());
			for(Map.Entry<String, List<File>> entry : directory.entrySet()) {
				System.out.println(entry.getKey() + " -> ");
				entry.getValue()
					.stream()
					.map(x -> "    " + x.getName())
					.forEach(System.out::println);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Collects all files in directory beginning from the path.
	 * If file is directory, then new iteration begins.
	 * @param path
	 * @return File[] - array of files in the given directory
	 * @throws IOException
	 */
	public File[] getAllFilesFromDirectory(String path) throws IOException {
		File directory = new File(path);
		File[] filesInDirectory = directory.listFiles();
		if( filesInDirectory.length == 0 ) {
			return null;
		} else {
			DirectoryListing.directory.put(directory.getAbsolutePath(), Arrays.asList(filesInDirectory));
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

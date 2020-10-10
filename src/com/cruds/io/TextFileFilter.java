package com.cruds.io;

import java.io.File;
import java.io.FilenameFilter;

public class TextFileFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".txt");
	}

}

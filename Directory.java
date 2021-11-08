class Directory{
	String path = "";
	Directory(String path){
		this.path = path;
	}

	File[] searchDirectory(String path){
		File f = new File(path);
		return f.listFile();
	}
	
	boolean isFile(String path){
		File f = new File(path);
		return !f.isDirectory();
	}
}

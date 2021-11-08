class Directory{
	String path = "";
	Directory(String path){
		this.path = path;
	}
	
	Boolean isFile(String path){
		File f = new File(path);
		return !f.isDirectory();
	}
}

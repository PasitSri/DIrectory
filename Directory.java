import java.io.*;
import java.util.*;

class Directory{
	String path = "";


	public static void main(String[] args){
		Directory d = new Directory("test");
		d.showDirectory();
	}


	Directory(String path){
		this.path = path;
	}

	void showDirectory(){
		File f = new File(path);
		File[] child = searchDirectory(path);
		System.out.println(f.getName());
		for(File c: child){
			if(!isFile(c)){
				System.out.println("+"+c.getName());
			}else{
				System.out.println("-"+c.getName());
			}
		}
	}

	File[] searchDirectory(String path){
		File f = new File(path);
		return f.listFiles();
	}
	
	boolean isFile(File f){
		return !f.isDirectory();
	}
}

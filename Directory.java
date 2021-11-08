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
		File p = new File(path);
		File[] child = searchDirectory(path);
		ArrayList<File> file = new ArrayList<>();
		ArrayList<File> directory = new ArrayList<>();
		System.out.println(p.getName());
		for(File c:child){
			if(isFile(c)){
				file.add(c);
			}else{
				directory.add(c);
			}
		}
		for(File d:directory){
			System.out.println("+"+d.getName());
		}
		for(File f:file){
			System.out.println("-"+f.getName());
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

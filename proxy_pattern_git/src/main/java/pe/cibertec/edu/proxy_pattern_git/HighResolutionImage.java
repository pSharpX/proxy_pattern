package pe.cibertec.edu.proxy_pattern_git;

public class HighResolutionImage implements Image {

	public HighResolutionImage(String imageFilePath) {
		super();
		this.loadImage(imageFilePath);
		// TODO Auto-generated constructor stub
	}
	
	public void loadImage(String imageFilePath) {
		// load Image from disk into memory
		// this is heavy and costly operation
		System.out.println("loading image into memory");
	}

	public void showImage() {
		// TODO Auto-generated method stub
		// Actual Image rendering logic
		System.out.println("rendering and showing image");
	}

}

package pe.cibertec.edu.proxy_pattern_git;

public class ProxyImage implements Image {
	private String imagePath;
	private Image proxifiedImage;
	
	public ProxyImage(String imagePath) {
		super();
		this.imagePath = imagePath;
	}

	public void showImage() {
		this.proxifiedImage = new HighResolutionImage(this.imagePath);
		this.proxifiedImage.showImage();
	}
}

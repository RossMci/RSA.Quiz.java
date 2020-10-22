package io.github.rossmci.rsaquiz;

public class RsaSignQuestion {
    
    private String imageName;
    private String category;
    private String path;

    public RsaSignQuestion() {
    }

    public RsaSignQuestion(String imageName, String category, String path) {
        this.imageName = imageName;
        this.category = category;
        this.path = path;
    }

	/**
	 * @return the imageName
	 */
    public String getImageName() {
        return imageName;
    }

    /**
     * @param imageName the imageName to set
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "RSAImage{" + "imageName=" + imageName + ", category=" + category + ", path=" + path + '}';
    }
    
    
}

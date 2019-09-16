package main;

public class Photo {
    int pixelDensity;
    int imageSize;

    public Photo(){
        this.pixelDensity = 0;
        this.imageSize = 0;
    }

    public Photo(int pixelDensity, int imageSize) {
        this.pixelDensity = pixelDensity;
        this.imageSize = imageSize;
    }

    public int getPixelDensity() {
        return pixelDensity;
    }

    public void setPixelDensity(int pixelDensity) {
        this.pixelDensity = pixelDensity;
    }

    public int getImageSize() {
        return imageSize;
    }

    public void setImageSize(int imageSize) {
        this.imageSize = imageSize;
    }
}

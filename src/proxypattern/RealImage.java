package proxypattern;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);

    }

    @Override
    public void display() {
        System.out.println("Displaying: " + filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Load from disk: " + filename);
    }

}

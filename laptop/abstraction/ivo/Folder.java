package laptop.abstraction.ivo;

public class Folder {
    private String path;

    public Folder() {
        path = "";
    }

    public Folder(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Folder " +
                "path " + path + "\n";
    }
}

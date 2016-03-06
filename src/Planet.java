/**
 * Created by mark on 27/02/16.
 */
public class Planet implements Describable{

    private String name;
    private String biome;
    private String size;
    private String minerals;
    private String gravity;
    private String special;

    Planet(
            String name,
            String biome,
            String size,
            String minerals,
            String gravity,
            String special
          ){
        this.name = name;
        this.biome = biome;
        this.size = size;
        this.minerals = minerals;
        this.gravity = gravity;
        this.special = special;
    }

    @Override
    public String describe() {
        StringBuilder builder = new StringBuilder();

        builder.append(name + ":\n");
        builder.append("    Biome: " + biome + "\n");
        builder.append("    Size: " + size + "\n");
        builder.append("    Minerals: " + minerals + "\n");
        builder.append("    Gravity: " + gravity + "\n");
        builder.append("    Special: " + special + "\n");
        builder.append("");

        return builder.toString();
    }

    public String getName() {
        return name;
    }
}

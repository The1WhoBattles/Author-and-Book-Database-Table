package models;

import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author c0704435
 */
public class Author {

    private int id;
    private String name;
    private String nationality;

    /**
     *
     */
    public Author() {
    }

    /**
     *
     * @param id
     * @param name
     * @param nationality
     */
    public Author(int id, String name, String nationality) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
    }

    /**
     *
     * @param json
     */
    public Author(JsonObject json) {
        this.id = json.getInt("id", 0);
        this.name = json.getString("name", "");
        this.nationality = json.getString("nationality", "");
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getNationality() {
        return nationality;
    }

    /**
     *
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     *
     * @return
     */
    public JsonObject toJson() {
        return Json.createObjectBuilder()
                .add("id", id)
                .add("name", name)
                .add("nationality", nationality)
                .build();
    }

}

package package1.e_commerce.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "collection")
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensDressImage;
    private String mensDressName;

    private String womensDressImage;
    private String womensDressName;

    private String babysDressImage;
    private String babysDressName;

    // Constructors
    public Collection() {}

    public Collection(Long id, String mensDressImage, String mensDressName,
                      String womensDressImage, String womensDressName,
                      String babysDressImage, String babysDressName) {
        this.id = id;
        this.mensDressImage = mensDressImage;
        this.mensDressName = mensDressName;
        this.womensDressImage = womensDressImage;
        this.womensDressName = womensDressName;
        this.babysDressImage = babysDressImage;
        this.babysDressName = babysDressName;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMensDressImage() {
        return mensDressImage;
    }
    public void setMensDressImage(String mensDressImage) {
        this.mensDressImage = mensDressImage;
    }

    public String getMensDressName() {
        return mensDressName;
    }
    public void setMensDressName(String mensDressName) {
        this.mensDressName = mensDressName;
    }

    public String getWomensDressImage() {
        return womensDressImage;
    }
    public void setWomensDressImage(String womensDressImage) {
        this.womensDressImage = womensDressImage;
    }

    public String getWomensDressName() {
        return womensDressName;
    }
    public void setWomensDressName(String womensDressName) {
        this.womensDressName = womensDressName;
    }

    public String getBabysDressImage() {
        return babysDressImage;
    }
    public void setBabysDressImage(String babysDressImage) {
        this.babysDressImage = babysDressImage;
    }

    public String getBabysDressName() {
        return babysDressName;
    }
    public void setBabysDressName(String babysDressName) {
        this.babysDressName = babysDressName;
    }
}

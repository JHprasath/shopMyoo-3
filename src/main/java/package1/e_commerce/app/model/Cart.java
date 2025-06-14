package package1.e_commerce.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;
    private String imageName;
    private Float rating;
    private String title;

    @Column(name = "description")
    private String description;

    private Double rate;
    private Double MRP;
    private Double offer;

    // No-argument constructor
    public Cart() {
    }

    // All-argument constructor
    public Cart(Long id, String image, String imageName, Float rating, String title,
                String description, Double rate, Double MRP, Double offer) {
        this.id = id;
        this.image = image;
        this.imageName = imageName;
        this.rating = rating;
        this.title = title;
        this.description = description;
        this.rate = rate;
        this.MRP = MRP;
        this.offer = offer;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getMRP() {
        return MRP;
    }

    public void setMRP(Double MRP) {
        this.MRP = MRP;
    }

    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }
}

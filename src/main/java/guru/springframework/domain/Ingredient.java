package guru.springframework.domain;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Class: Ingredient
 * <p>
 * Created by: aarconada on 9/12/22
 * <p>
 */
@Entity
public class Ingredient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  private BigDecimal amount;
  @OneToOne(fetch = FetchType.EAGER)
  private UnitOfMeasure oum;
  @ManyToOne
  private Recipe recipe;

  public Ingredient() {
  }

  public Ingredient(String description, BigDecimal amount, UnitOfMeasure oum, Recipe recipe) {
    this.description = description;
    this.amount = amount;
    this.oum = oum;
    this.recipe = recipe;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public UnitOfMeasure getOum() {
    return oum;
  }

  public void setOum(UnitOfMeasure oum) {
    this.oum = oum;
  }

  public Recipe getRecipe() {
    return recipe;
  }

  public void setRecipe(Recipe recipe) {
    this.recipe = recipe;
  }
}

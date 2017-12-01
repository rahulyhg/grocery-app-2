package groceryapp;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tag {

	@Id
	private Long id;
	private String tag;

	@OneToMany(mappedBy = "tag")
	private Set<Ingredient> ingredients;

	@OneToMany(mappedBy = "tag")
	private Set<StoreItem> storeItems;

	protected Tag() {

	}

	public Tag(Long id, String tag) {
		this.tag = tag;
	}

	public Long getId() {
		return id;
	}

	public String getTag() {
		return tag;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public Set<StoreItem> getStoreItems() {
		return storeItems;
	}

}
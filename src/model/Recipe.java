package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private List<Ingredient> ingredients;
	
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(String n, double w) {
		
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(n)) {
				searched = current;
			}
		}
		
		if(searched!=null) {
			searched.addWeight(w);
		}else {
			Ingredient newIngredient = new Ingredient(n, w);
			ingredients.add(newIngredient);
		}		
	}

	public void removeIngredient(String n){
		for (int i = 0; i < ingredients.size()-1; i++) {
			if (ingredients.get(i).getName().equals(n)){
				ingredients.remove(i);
				break;
			}
		}
	}
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
}

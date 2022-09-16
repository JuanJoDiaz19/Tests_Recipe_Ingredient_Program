package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {
    private Recipe recipe;

    public void setupStage1() {
        recipe = new Recipe();
    }

    public void setupStage2() {
        recipe = new Recipe();
        recipe.addIngredient("Cebolla", 315);
        recipe.addIngredient("Ajo", 58);
        recipe.addIngredient("Arroz", 520);
    }

    @Test
    public void verifyAddIngredient1IngredientTest() {
        setupStage1();
        recipe.addIngredient("Sal", 12);
        assertEquals(1, recipe.getIngredients().size());
        assertEquals("Sal", recipe.getIngredients().get(0).getName());
        assertEquals(12, recipe.getIngredients().get(0).getWeight());
    }

    @Test
    public void verifyAddIngredient4IngredientsTest() {
        setupStage2();
        recipe.addIngredient("Pimienta", 6);
        assertEquals(4, recipe.getIngredients().size());
        assertEquals("Pimienta", recipe.getIngredients().get(recipe.getIngredients().size()-1).getName());
        assertEquals(6, recipe.getIngredients().get(recipe.getIngredients().size()-1).getWeight());
    }

    @Test
    public void verifyAddIngredient3IngredientsTest() {
        setupStage2();
        recipe.addIngredient("Ajo", 21);
        assertEquals(79, recipe.getIngredients().get(1).getWeight());
    }

    @Test
    public void verifyRemoveIngredientTest() {
        setupStage2();
        recipe.removeIngredient("Ajo");
        assertEquals(2, recipe.getIngredients().size());
        assertEquals("Cebolla", recipe.getIngredients().get(0).getName());
        assertEquals("Arroz",recipe.getIngredients().get(1).getName() );
    }


}
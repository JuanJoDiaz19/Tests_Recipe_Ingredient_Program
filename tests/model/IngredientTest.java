package model;

import exception.NegativeNumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {
    private Ingredient ingredient;
    public void setupStage1() {
        ingredient = new Ingredient("Tomate", 245);
    }

    @Test
    public void verifyAddWeightPositiveValueTest() {
        setupStage1();
        ingredient.addWeight(54);
        assertEquals(299, ingredient.getWeight());
    }

    @Test
    public void verifyAddWeightNegativeValueTest() {
        setupStage1();
        boolean flag = false;
        try {
            ingredient.addWeight(-100);
        }catch (NegativeNumberException ex) {
            ex.printStackTrace();
            flag = true;
        }
        assertEquals(245, ingredient.getWeight());
        assertTrue(flag);
    }

    @Test
    public void verifyRemoveWeightPositiveValue() {
        setupStage1();
        ingredient.removeWeight(45);
        assertEquals(200, ingredient.getWeight());
    }

    @Test
    public void verifyRemoveWeightNegativeValueTest() {
        setupStage1();
        boolean flag = false;
        try {
            ingredient.removeWeight(-100);
        }catch (NegativeNumberException ex) {
            ex.printStackTrace();
            flag = true;
        }
        assertEquals(245, ingredient.getWeight());
        assertTrue(flag);
    }



}
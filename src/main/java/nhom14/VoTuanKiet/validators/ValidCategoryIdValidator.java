package nhom14.VoTuanKiet.validators;

import nhom14.VoTuanKiet.entities.Category;
import nhom14.VoTuanKiet.validators.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator; 
import jakarta.validation.ConstraintValidatorContext; 

public class ValidCategoryIdValidator implements 
    ConstraintValidator<ValidCategoryId, Category> { 
    @Override 
    public boolean isValid(Category category, 
        ConstraintValidatorContext context) { 
        return category != null && category.getId() != null; 
    } 
} 

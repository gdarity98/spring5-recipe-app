package guru.springframework.spring5recipeapp.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

/**
 * Created by gd on 9/6/2023
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}

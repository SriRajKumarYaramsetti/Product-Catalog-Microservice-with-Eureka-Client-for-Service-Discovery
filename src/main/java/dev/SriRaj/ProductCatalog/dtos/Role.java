package dev.SriRaj.ProductCatalog.dtos;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Role{
    private String name;
}

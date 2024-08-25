package com.uade.tpo.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class ShopCartLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idShopCartLine;

    //cambie el nombre del atributo ya que hace conflicto con el anotacion de la clase ShopCart
    private Long cartIdentifier;

    @Column
    private Long quantity;
    @Column
    private Long linePrice;

    
    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private ShopCart shopCart;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Cars car;
    
}

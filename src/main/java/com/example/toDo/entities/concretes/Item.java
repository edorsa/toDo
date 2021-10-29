package com.example.toDo.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")
    private  int itemId;
    @Column(name="item_name")
    private String itemName;
    @Column(name="item_status")
    private boolean itemStatus;

    @ManyToOne()
    @JoinColumn(name="user_id")
    private User userID;


}

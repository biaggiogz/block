package com.block.projectblock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "pool")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Pool {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    String seudonimo;
    String name;
    String link;
    boolean activeDominio;
}

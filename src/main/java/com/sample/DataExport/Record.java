package com.sample.DataExport;
import jakarta.persistence.*;


@Entity
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String value;

    // Getters and Setters
}

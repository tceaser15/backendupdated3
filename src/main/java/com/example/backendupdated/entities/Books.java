package com.example.backendupdated.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor

public class Books {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    // getters and setters
    @Getter
    private String title;
    @Getter
    private String genre;
    @Getter
    private String summary;
    @Getter
    private String author;

    @Override

    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", summary='" + summary + '}';
    }
}

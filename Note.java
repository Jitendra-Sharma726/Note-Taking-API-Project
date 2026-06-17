package com.example.demo.model;

// Note model class
public class Note {
    private Long id;
    private String title;
    private String content;

    // Default constructor needed for JSON parsing
    public Note() {}

    // Parameterized constructor
    public Note(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}



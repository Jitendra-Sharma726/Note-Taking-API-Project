package com.example.demo.repository;

import com.example.demo.model.Note;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NoteRepository {
    private final List<Note> noteList = new ArrayList<>();
    private long idCounter = 1;

    // METHOD: Save a new note
    public Note save(Note note) {
        note.setId(idCounter++);
        noteList.add(note);
        return note;
    }

    // METHOD: Retrieve all notes
    public List<Note> findAll() {
        return new ArrayList<>(noteList);
    }

    // METHOD: Update an existing note
    public Note update(Long id, String title, String content) {
        for (Note note : noteList) {
            if (note.getId().equals(id)) {
                note.setTitle(title);
                note.setContent(content);
                return note;
            }
        }
        
        // Return null if note not found
        return null;
    }

    // METHOD: Delete a note by ID
    public boolean deleteById(Long id) {
        return noteList.removeIf(
                note -> note.getId().equals(id));
    }
}



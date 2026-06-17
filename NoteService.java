package com.example.demo.service;

import com.example.demo.model.Note;
import com.example.demo.repository.NoteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    // Constructor injection
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    // METHOD: Create a new note
    public Note createNote(String title, String content) {
        return noteRepository.save(new Note(null, title, content));
    }

    // METHOD: Retrieve all notes
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    // METHOD: Update an existing note
    public Note updateNote(Long id, String title, String content) {
        return noteRepository.update(id, title, content);
    }

    // METHOD: Delete a note by ID
    public boolean deleteNote(Long id) {
        return noteRepository.deleteById(id);
    }
}



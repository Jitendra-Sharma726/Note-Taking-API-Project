package com.example.demo.controller;

import com.example.demo.model.Note;
import com.example.demo.service.NoteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    // NoteService injection
    private final NoteService noteService;

    // Constructor injection
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    // POST mapping to create a new note
    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note.getTitle(), note.getContent());
    }

    // GET mapping to retrieve all notes
    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    // PUT mapping to update an existing note
    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note note) {
        return noteService.updateNote(id, note.getTitle(), note.getContent());
    }

    // DELETE mapping to delete a note by ID
    @DeleteMapping("/{id}")
    public String deleteNote(@PathVariable Long id) {
        if (noteService.deleteNote(id)) {
            return "Note deleted successfully.";
        } else {
            return "Note not found.";
        }
    }
}



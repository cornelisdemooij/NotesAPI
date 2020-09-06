package com.cornelisdemooij.NotesAPI.repositories;

import com.cornelisdemooij.NotesAPI.entities.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {}

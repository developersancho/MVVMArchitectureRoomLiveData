package developersancho.mvvmarchitectureroomlivedata.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

import developersancho.mvvmarchitectureroomlivedata.data.entity.Note;
import developersancho.mvvmarchitectureroomlivedata.data.repository.NoteRepository;

public class NoteViewModel extends AndroidViewModel implements INoteViewModel {

    private NoteRepository noteRepository;
    private LiveData<List<Note>> allNotes;

    public NoteViewModel(@NonNull Application application) {
        super(application);
        noteRepository = new NoteRepository(application);
        allNotes = noteRepository.getAllNotes();
    }

    @Override
    public void insert(Note note) {
        noteRepository.insert(note);
    }

    @Override
    public void update(Note note) {
        noteRepository.update(note);
    }

    @Override
    public void delete(Note note) {
        noteRepository.delete(note);
    }

    @Override
    public void deleteAllNotes() {
        noteRepository.deleteAllNotes();
    }

    public LiveData<List<Note>> getAllNotes() {
        return allNotes;
    }
}

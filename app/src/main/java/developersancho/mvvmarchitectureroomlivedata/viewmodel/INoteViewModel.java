package developersancho.mvvmarchitectureroomlivedata.viewmodel;

import developersancho.mvvmarchitectureroomlivedata.data.entity.Note;

public interface INoteViewModel {
    void insert(Note note);
    void update(Note note);
    void delete(Note note);
    void deleteAllNotes();
}

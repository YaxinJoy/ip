package DukeTask;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description){
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon(){
        return (isDone ? "X": " ");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(){
        this.isDone = true;
    }

    public void setUndone(){
        this.isDone = false;
    }

    @Override
    public String toString(){
        return ("[" + getStatusIcon() + "] " + description);
    }
}

package me.whiteship.java8to11;

import java.util.Optional;

public class OnlineClass {

    private Integer id;

    private String title;

    private boolean closed;

    public Progress progress;

    public OnlineClass(Integer id, String title, boolean closed){
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public boolean isClosed(){
        return closed;
    }

    public void setClosed(boolean closed){
        this.closed = closed;
    }

    public Optional<Progress> getProgress(){
//        if(this.progress == null){
//            throw new IllegalStateException();
//        }
        return Optional.ofNullable(progress);
//        return null; //이러지말자
//        return Optional.empty();
    }

//    public void setProgress(Optional<Progress> progress){
//        if(progress != null) {
//            progress.ifPresent(p -> this.progress = p);//null 도출할 수 있어서 위험
//        }
//    }

    public void setProgress(Progress progress){
        this.progress = progress;
    }
}

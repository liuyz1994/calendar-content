package dev.mojojo.content_calendar.repository;

import dev.mojojo.content_calendar.model.Content;
import dev.mojojo.content_calendar.model.Status;
import dev.mojojo.content_calendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void create(Content c){
        contentList.add(c);
    }

    public boolean existsById(Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void update(Content newC, Integer id){
       contentList.replaceAll(c -> c.id().equals(id)? newC : c);
    }

    public void delete(Integer id){
        contentList.removeIf(c -> c.id().equals(id));
    }

    @PostConstruct //init dummy data
    private void init(){
        Content c = new Content(1,
                 "My first",
                "ee",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                 null,
                ""
                );
        contentList.add(c);
    }
}

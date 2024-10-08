package introse.group20.hms.application.services.interfaces;

import introse.group20.hms.core.entities.Post;

import java.util.List;
import java.util.UUID;

public interface IPostService {
    List<Post> getAll();
    List<Post> getPostOfDoctor(UUID doctorId);
    List<Post> getPostByCategory(UUID categoryId);
    Post getPostById(UUID postId);
    Post createPost(UUID doctorId, UUID categoryId, Post post);

    void updatePost(Post post);
    void deletePost(UUID postId);
}

package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.Post;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IPostAdapter {
    List<Post> getAllAdapter();
    List<Post> getPostOfDoctorAdapter(UUID doctorId);
    List<Post> getPostByCategoryAdapter(UUID categoryId);
    Optional<Post> getPostByIdAdapter(UUID postId);
    Post createPostAdapter(UUID doctorId, Post post);
    void updatePostAdapter(Post post);
    void deletePostAdapter(UUID postId);
}

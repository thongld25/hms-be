package introse.group20.hms.application.services;

import introse.group20.hms.application.services.interfaces.IPostService;
import introse.group20.hms.core.entities.Post;

import java.util.List;
import java.util.UUID;

public class PostService implements IPostService {
    @Override
    public List<Post> getAll() {
        return null;
    }

    @Override
    public List<Post> getPostOfDoctor(UUID doctorId) {
        return null;
    }

    @Override
    public List<Post> getPostByCategory(UUID categoryId) {
        return null;
    }

    @Override
    public Post getPostById(UUID postId) {
        return null;
    }

    @Override
    public Post createPost(UUID doctorId, UUID categoryId, Post post) {
        return null;
    }


    @Override
    public void updatePost(Post post) {

    }

    @Override
    public void deletePost(UUID postId) {

    }
}
